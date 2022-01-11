package com.example.fishopee;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.*;

public class MainActivity3 extends AppCompatActivity {
    private TextView text1,text2,text3,text4,text5,text6,text7,text8,text9,text10,texttotal;
    private Button button,btncheck;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);
        text9 = findViewById(R.id.text9);
        text10 = findViewById(R.id.text10);
        texttotal = findViewById(R.id.texttotal);
        button = findViewById(R.id.button);
        btncheck=findViewById(R.id.btncheck);

        Bundle bundle = getIntent().getExtras().getBundle("key");
        int   n1 = bundle.getInt("n1"),n2 = bundle.getInt("n2"),n3 = bundle.getInt("n3")
                ,n4 = bundle.getInt("n4"),n5 = bundle.getInt("n5"),n6 = bundle.getInt("n6")
                ,n7 = bundle.getInt("n7"),n8 = bundle.getInt("n8"),n9 = bundle.getInt("n9")
                ,n10 = bundle.getInt("n10");
        String value2 = bundle.getString("value2");

        text1.setText("小丑魚$1*" + n1+"隻="+(1*n1));
        text2.setText("吳郭魚$2*" + n2+"隻="+(2*n2));
        text3.setText("虱目魚$3*" + n3+"隻="+(3*n3));
        text4.setText("鯊魚 $2*" + n4+"隻="+(2*n4));
        text5.setText("忍者龜$5*" + n5+"隻="+(5*n5));
        text6.setText("海馬 $6*" + n6+"隻="+(6*n6));
        text7.setText("海豚 $5*" + n7+"隻="+(5*n7));
        text8.setText("燈籠魚 $8*" + n8+"隻="+(8*n8));
        text9.setText("鯨魚 $3*" + n9+"隻="+(3*n9));
        text10.setText("蟹老闆$7*" + n10+"隻="+(7*n10));

        texttotal.setText("總金額：" +(1*n1+2*n2+3*n3+2*n4+5*n5+6*n6+5*n7+8*n8+3*n9+7*n10));

         String total = texttotal.getText().toString();
        //mainpage button
        //bundle回去
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent32 = new Intent();

                Bundle bundle32 = new Bundle();
                bundle32.putInt("n1",n1 );
                bundle32.putInt("n2",n2 );
                bundle32.putInt("n3",n3 );
                bundle32.putInt("n4",n4 );
                bundle32.putInt("n5",n5 );
                bundle32.putInt("n6",n6 );
                bundle32.putInt("n7",n7 );
                bundle32.putInt("n8",n8 );
                bundle32.putInt("n9",n9 );
                bundle32.putInt("n10",n10 );
                intent32.putExtras(bundle32);
                setResult(101,intent32);
                finish();

            }

        });
        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder dialog =new AlertDialog.Builder(MainActivity3.this);
                dialog.setTitle("注意!!!");
                dialog.setMessage("確認訂單後無法更改");

                dialog.setNeutralButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //Toast.makeText(MainActivity3.this,"dialog關閉",Toast.LENGTH_SHORT).show();
                    }
                });

                dialog.setNegativeButton("修改訂單", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent32 = new Intent();
                        Bundle bundle32 = new Bundle();
                        bundle32.putInt("n1",n1 );
                        bundle32.putInt("n2",n2 );
                        bundle32.putInt("n3",n3 );
                        bundle32.putInt("n4",n4 );
                        bundle32.putInt("n5",n5 );
                        bundle32.putInt("n6",n6 );
                        bundle32.putInt("n7",n7 );
                        bundle32.putInt("n8",n8 );
                        bundle32.putInt("n9",n9 );
                        bundle32.putInt("n10",n10 );
                        intent32.putExtras(bundle32);
                        setResult(101,intent32);
                        finish();
                    }
                });

                dialog.setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent34 = new Intent(MainActivity3.this, MainActivity4.class);
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("total",total );
                        intent34.putExtra("keey", bundle3);
                        startActivity(intent34);
                    }
                });
                dialog.show();

            }

        });



    }
}