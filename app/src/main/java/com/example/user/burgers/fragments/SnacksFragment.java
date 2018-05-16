package com.example.user.burgers.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.user.burgers.R;
import com.example.user.burgers.dataBase.SimpleDB;
import com.example.user.burgers.product.ProductAdapter;


public class SnacksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_snacks, container, false);

        // создаем адаптер
        ProductAdapter productAdapter = new ProductAdapter(this.getContext(), SimpleDB.getSnacks());

        // настраиваем список
        ListView products = rootView.findViewById(R.id.snacksView);
        products.setAdapter(productAdapter);

        // Inflate the layout for this fragment
        return rootView;
    }



}
