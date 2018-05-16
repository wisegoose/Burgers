package com.example.user.burgers.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.burgers.R;
import com.example.user.burgers.cart.CartAdapter;
import com.example.user.burgers.signIn.UserInfo;

import static com.example.user.burgers.cart.CartAdapter.getObjects;
import static com.example.user.burgers.cart.CartModel.getCart;
import static com.example.user.burgers.cart.Total.getTotal;


public class CartFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_cart, container, false);

        // создаем адаптер
        CartAdapter cartAdapter = new CartAdapter(this.getContext(), getCart());

        // настраиваем список
        ListView cart = rootView.findViewById(R.id.cartView);
        cart.setAdapter(cartAdapter);


        TextView total = rootView.findViewById(R.id.total);
        total.setText(String.valueOf(getTotal(getObjects())));

        final EditText name = rootView.findViewById(R.id.etName);
        final EditText phone = rootView.findViewById(R.id.etTel);
        final EditText address = rootView.findViewById(R.id.etAdress);



        final Button btnDone = rootView.findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UserInfo.getPhone() == 0){
                    UserInfo.setName(name.getText().toString());
                    UserInfo.setPhone(Integer.parseInt(phone.getText().toString()));
                    UserInfo.setAddress(address.getText().toString());
                }

                Toast.makeText(getActivity(), "Order is accepted",
                        Toast.LENGTH_SHORT).show();

            }
        });

        return rootView;
    }

}
