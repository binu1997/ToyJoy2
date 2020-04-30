package com.example.toyjoy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button button3 = (Button)findViewById(R.id.button3);

        Button button4 = (Button)findViewById(R.id.button4);

        Button button5 = (Button)findViewById(R.id.button5);

        Button button6 = (Button)findViewById(R.id.button6);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(Category.this,BabyItems.class);
                startActivity(int1);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(Category.this,DItems.class);
                startActivity(int2);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(Category.this,ClassicItems.class);
                startActivity(int3);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(Category.this,ElectronicItems.class);
                startActivity(int4);
            }
        });






    }

}
