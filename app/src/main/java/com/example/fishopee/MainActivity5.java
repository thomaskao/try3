package com.example.fishopee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    private Button btn;
    private EditText edittext1,edittext2,edittext3;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        btn = findViewById(R.id.btnenter);
        edittext1 = findViewById(R.id.edittext1);
        edittext2 = findViewById(R.id.edittext2);
        edittext3 = findViewById(R.id.edittext3);
        text = findViewById(R.id.text);

        btn.setOnClickListener(new View.OnClickListener() {
            String name="",password="";
            Intent intent3 = new Intent(MainActivity5.this, MainActivity.class);

            /////////////////////////////////////////////////////////////////////////////////////////////////////登入頁面存num丟過來再丟回去
            //   Bundle bundle = getIntent().getExtras().getBundle("key2");

            //   int num= bundle.getInt("num");


            @Override
            public void onClick(View view) {
                String accout = edittext1.getText().toString();
                //  bundle.putInt("num",num);
                // intent3.putExtras(bundle);
                // setResult(101,intent3);
                // finish();

                //   text.setText("x"+num);
                if(edittext1.getText().toString().length() < 1){
                    Toast toast1 =  Toast.makeText(MainActivity5.this, "請輸入帳號", Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                    toast1.show();
                }else if(edittext2.getText().toString().length() < 1){
                    Toast toast2 =  Toast.makeText(MainActivity5.this, "請輸入密碼", Toast.LENGTH_SHORT);
                    toast2.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                    toast2.show();
                }else{
                    if((edittext2.getText().toString()).equals(edittext3.getText().toString())){

                        int x=1;

/////////////////////////////////////////////////////////////////////////////////////////////////////註冊密碼丟給登入頁面


                        name=edittext1.getText().toString();
                        password=edittext2.getText().toString();

                        Bundle bundle1  = new Bundle();
                        bundle1.putString("name",name);
                        bundle1.putString("password",password);
                        //  bundle.putInt("num",num);
                        intent3.putExtra("key",bundle1);
                        startActivity(intent3);

                        Toast toast3 =  Toast.makeText(MainActivity5.this, "註冊成功", Toast.LENGTH_SHORT);
                        toast3.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                        toast3.show();
/*
                        Intent intent51 = new Intent();
                        Bundle bundle51 = new Bundle();

                        bundle51.putString("name",name);
                        bundle51.putString("password",password);
                        intent51.putExtras(bundle51);
                        setResult(202,intent51);
 */                       finish();

                    }else{
                        Toast toast1 =  Toast.makeText(MainActivity5.this, "確認密碼錯誤", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                        toast1.show();
                    }
                }
            }



        });
    }
}