package com.example.fishopee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    private Button btn_back4,btn_buy;

    private RadioButton radioButton1,radioButton2,radioButton3,radioButton4,radioButton5;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_back4 = findViewById(R.id.btn_back4);
        btn_buy = findViewById(R.id.btn_buy);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        textView2 = findViewById(R.id.textView2);

        //拿上一頁的total
        Bundle bundle4 = getIntent().getExtras().getBundle("keey");
        String total = bundle4.getString("total");
        textView2.setText(total+"元" );

        btn_back4.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view) {

            Intent intent43 = new Intent(MainActivity4.this, MainActivity3.class);
            startActivity(intent43);


        }
        });


        btn_buy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast toast =  Toast.makeText(MainActivity4.this, "謝謝惠顧 歡迎再次購物", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                toast.show();
                Intent intent42 = new Intent(MainActivity4.this, MainActivity2.class);
                startActivity(intent42);
            }
        });

    }
}