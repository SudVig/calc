package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    float f1,f2,f;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        Button b3=findViewById(R.id.b3);
        Button b4=findViewById(R.id.b4);
        Button b5=findViewById(R.id.b5);
        Button b6=findViewById(R.id.b6);
        Button b7=findViewById(R.id.b7);
        Button b8=findViewById(R.id.b8);
        Button b9=findViewById(R.id.b9);
        Button b0=findViewById(R.id.b0);
        Button bmul=findViewById(R.id.bmul);
        Button bplus=findViewById(R.id.bplus);
        Button bsub=findViewById(R.id.bsub);
        Button bdiv=findViewById(R.id.bdiv);

        Button bdot=findViewById(R.id.bdot);
        Button bac=findViewById(R.id.bac);
        Button bc=findViewById(R.id.bc);
        Button bequals=findViewById(R.id.bequals);
        EditText et1=findViewById(R.id.et1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"1");
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"3");
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"4");
            }
        });


        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"0");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+"0");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText(et1.getText()+".");
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
            }
        });

        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setText("");
            }
        });

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                add = true;

            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                sub = true;

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                mul = true;

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f1=Float.parseFloat(et1.getText().toString());
                et1.setText("");
                div = true;

            }
        });

        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add==true){
                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1+f2;
                    String mybad = String.valueOf(f);
                    et1.setText(mybad);
                    add=false;

                }
                else if(sub==true){

                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1-f2;
                    String mybad = String.valueOf(f);
                    et1.setText(mybad);
                    sub=false;

                }
                else if(mul==true){

                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1*f2;
                    String mybad = String.valueOf(f);
                    et1.setText(mybad);
                    mul=false;
                }
                else if(div==true){

                    f2=Float.parseFloat(et1.getText().toString());
                    f=f1/f2;
                    String mybad = String.valueOf(f);
                    et1.setText(mybad);
                    div=false;
                }

            }
        });



    }
}