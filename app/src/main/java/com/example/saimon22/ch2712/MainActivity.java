package com.example.saimon22.ch2712;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView input, output;
    Button newSet,button;
    Set<Integer> mySet= new HashSet<Integer>();
    public static int newRam(){
        return ((int)(Math.random()*100+1));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=(TextView)findViewById(R.id.input);
        output=(TextView)findViewById(R.id.output);
        button=(Button)findViewById(R.id.button);
        newSet=(Button)findViewById(R.id.newSet);
        button.setOnClickListener(this);
        newSet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:

                ArrayList<Integer> list = method.setToList(mySet);
                output.setText("Array is : "+ list.toString());

                break;
            case R.id.newSet:
                mySet.clear();
                for(int i=0; i<7;i++){
                    mySet.add(newRam());
                }
                input.setText(" set is : "+mySet.toString());
            }

        }

    }

