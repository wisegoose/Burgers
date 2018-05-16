package com.example.user.burgers.cart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.burgers.R;
import com.example.user.burgers.product.Product;

import java.util.ArrayList;
import java.util.List;


public class CartAdapter extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    private static List<Product> objects = new ArrayList<>();


    public CartAdapter(Context context, List<Product> products) {
        ctx = context;
        objects = products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.cart_item, parent, false);
        }

        final Product p = getProduct(position);

        // заполняем View в пункте списка данными из товаров: наименование, цена
        ((TextView) view.findViewById(R.id.tvName)).setText(p.getName());
        ((TextView) view.findViewById(R.id.tvPrice)).setText(String.valueOf(p.getPrice()));

        Button removeItem = view.findViewById(R.id.btnRemove);

        removeItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objects.remove(p);
                updateProducts(objects);

            }});

        return view;
    }
    // товар по позиции
    Product getProduct(int position) {
        return ((Product) getItem(position));
    }

    public static List<Product> getObjects() {
        return objects;
    }

    public void updateProducts(List<Product> products) {
        this.objects = products;
        notifyDataSetChanged();
    }

}


