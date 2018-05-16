package com.example.user.burgers.product;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.burgers.R;
import com.example.user.burgers.cart.CartModel;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    private List<Product> listProducts = new ArrayList<>();

    public ProductAdapter(Context context, List<Product> products) {
        ctx = context;
        listProducts = products;
        lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return listProducts.size();
    }

    @Override
    public Product getItem(int position) {
        return listProducts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {

        View view = convertView;
        if (view == null) {
            view = lInflater.inflate(R.layout.product_item, parent, false);
        }

        final Product p = getProduct(position);

        // заполняем View в пункте списка данными из товаров: наименование, цена
        ((TextView) view.findViewById(R.id.productName)).setText(p.getName());
        ((TextView) view.findViewById(R.id.productWeight)).setText(String.valueOf(p.getWeight()));
        ((TextView) view.findViewById(R.id.productPrice)).setText(String.valueOf(p.getPrice()));
        ((TextView) view.findViewById(R.id.productDescription)).setText(p.getDescription());
        ((ImageView) view.findViewById(R.id.productImg)).setImageResource(ctx.getResources().getIdentifier(
                p.getImage(), "drawable", ctx.getPackageName()));

        Button btnBuy = view.findViewById(R.id.btnBuy);

        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CartModel.getCart().add(p);

                Toast.makeText(ctx, "added to order",
                        Toast.LENGTH_SHORT).show();
            }

        });

        return view;
    }
    // товар по позиции
    Product getProduct(int position) {
        return ((Product) getItem(position));
    }



    public void updateProducts(List<Product> products) {
        this.listProducts = products;
        notifyDataSetChanged();
    }
}
