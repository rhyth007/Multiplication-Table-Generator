package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 TextView textView;TextView textView1;
//    TextView textView2;TextView textView3;TextView textView4;TextView textView5;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);
//        textView2=findViewById(R.id.textView2);
//        textView3=findViewById(R.id.textView3);
//        textView4=findViewById(R.id.textView4);
//        textView5=findViewById(R.id.textView5);
        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);
        //textView2=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editText.getText().toString();
                int n1 = Integer.parseInt(s);
                int mul;
                textView1.setText("");
                Toast.makeText(MainActivity.this, "Button Working!!!", Toast.LENGTH_SHORT).show();
                //int i=1;

                for(int i=1;i<11;i++) {
                    mul=n1*i;
                    textView1.append("\n "+n1+"x "+i+" = "+mul+"\n");
                }



            }
        });

    }
}