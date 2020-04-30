package com.example.toy_joy_01_01;

import java.util.List;
import java.util.Vector;

import android.content.res.Resources;
import android.os.Build;

import androidx.annotation.RequiresApi;

class ShoppingCartHelper {

    static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Dead or Alive", res
                    .getDrawable(R.drawable.d1),
                    "Sweet droalliy", 29.99));
            catalog.add(new Product("Switch", res
                    .getDrawable(R.drawable.d2),
                    "Sisy", 24.99));
            catalog.add(new Product("Watchmen", res
                    .getDrawable(R.drawable.d3),
                    "Sisy", 24.99));
        }

        return catalog;
    }

    static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }

}
