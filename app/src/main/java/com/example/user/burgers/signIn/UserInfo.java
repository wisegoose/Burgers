package com.example.user.burgers.signIn;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {

    private static String uName = null;
    private static int uPhone;
    private static String uAddress = null;

    private List<String> orderInfo = new ArrayList<>();

    UserInfo(String uName, int uPhone, String uAddress){
        setName(uName);
        setPhone(uPhone);
        setAddress(uAddress);

    }


    public String getName (){
        return uName;
    }

    public static void setName(String name) {
        uName = name;
    }

    public static int getPhone(){
        return uPhone;
    }

    public static void setPhone(int phone) {
        uPhone = phone;
    }

    public String getAddress (){
        return uAddress;
    }

    public static void setAddress(String address) {
        uAddress = address;
    }

}
