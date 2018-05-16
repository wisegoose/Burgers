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


public class BurgersFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_burgers, container, false);

        // создаем адаптер
        ProductAdapter productAdapter = new ProductAdapter(this.getContext(), SimpleDB.getBurgers());

        // настраиваем список
        ListView products = rootView.findViewById(R.id.burgersView);
        products.setAdapter(productAdapter);


        return rootView;
    }

}
