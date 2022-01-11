package com.example.fishopee;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import android.view.ViewGroup;
import android.widget.*;


import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    int nn1,nn2,nn3,nn4,nn5,nn6,nn7,nn8,nn9,nn10;;

    private Button  btn_addtocart;




    class  Data{
        int photo;//PHOTO
        String name;//NAME
    }
    public class MyAdapter extends BaseAdapter{
        int n10,n1,n2,n3,n4,n5,n6,n7,n8,n9;//繼承BaseAdapter
        private MainActivity2.Data[] data;       //保存在myAdapter之中的資料來源
        private int view;                       //保存在myAdapter之中的畫面
        public MyAdapter(MainActivity2.Data[] data,int view){
            this.data = data;
            this.view = view;
        }
        @Override
        public int getCount(){
            return data.length;
        }
        @Override
        public Object getItem(int position){
            return data[position];
        }
        @Override
        public long getItemId(int position){
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            convertView = getLayoutInflater().inflate(view,parent,false);
            TextView name = convertView.findViewById(R.id.name);
            name.setText(data[position].name);
            ImageView imageView = convertView.findViewById(R.id.imageView);
            imageView.setImageResource(data[position].photo);
            EditText editText= convertView.findViewById(R.id.editText);;
            Button btn_sub = convertView.findViewById(R.id.btn_sub);

            switch(position){
                case(0):
                    editText.setText(""+n1);
                    nn1=n1;
                    break;
                case(1):
                    editText.setText(""+n2);
                    nn2=n2;
                    break;
                case(2):
                    editText.setText(""+n3);
                    nn3=n3;
                    break;
                case(3):
                    editText.setText(""+n4);
                    nn4=n4;
                    break;
                case(4):
                    editText.setText(""+n5);
                    nn5=n5;
                    break;
                case(5):
                    editText.setText(""+n6);
                    nn6=n6;
                    break;
                case(6):
                    editText.setText(""+n7);
                    nn7=n7;
                    break;
                case(7):
                    editText.setText(""+n8);
                    nn8=n8;
                    break;
                case(8):
                    editText.setText(""+n9);
                    nn9=n9;
                    break;
                case(9):
                    editText.setText(""+n10);
                    nn10=n10;
                    break;

            }
            btn_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch(position){
                        case(0):
                            n1 = Integer.parseInt(editText.getText().toString());
                            n1--;
                            if(n1<0){
                                n1=0;
                            }
                            editText.setText(""+n1);
                            nn1=n1;
                            break;

                        case(1):
                            n2 = Integer.parseInt(editText.getText().toString());
                            n2--;
                            if(n2<0){
                                n2=0;
                            }
                            editText.setText(""+n2);
                            nn2=n2;
                            break;
                        case(2):
                            n3 = Integer.parseInt(editText.getText().toString());
                            n3--;
                            if(n3<0){
                                n3=0;
                            }
                            editText.setText(""+n3);
                            nn3=n3;
                            break;
                        case(3):
                            n4 = Integer.parseInt(editText.getText().toString());
                            n4--;
                            if(n4<0){
                                n4=0;
                            }
                            editText.setText(""+n4);
                            nn4=n4;
                            break;
                        case(4):
                            n5 = Integer.parseInt(editText.getText().toString());
                            n5--;
                            if(n5<0){
                                n5=0;
                            }
                            editText.setText(""+n5);
                            nn5=n5;
                            break;
                        case(5):
                            n6 = Integer.parseInt(editText.getText().toString());
                            n6--;
                            if(n6<0){
                                n6=0;
                            }
                            editText.setText(""+n6);
                            nn6=n6;
                            break;
                        case(6):
                            n7 = Integer.parseInt(editText.getText().toString());
                            n7--;
                            if(n7<0){
                                n7=0;
                            }
                            editText.setText(""+n7);
                            nn7=n7;
                            break;
                        case(7):
                            n8 = Integer.parseInt(editText.getText().toString());
                            n8--;
                            if(n8<0){
                                n8=0;
                            }
                            editText.setText(""+n8);
                            nn8=n8;
                            break;
                        case(8):
                            n9 = Integer.parseInt(editText.getText().toString());
                            n9--;
                            if(n9<0){
                                n9=0;
                            }
                            editText.setText(""+n9);
                            nn9=n9;
                            break;
                        case(9):
                            n10 = Integer.parseInt(editText.getText().toString());
                            n10--;
                            if(n10<0){
                                n10=0;
                            }
                            editText.setText(""+n10);
                            nn10=n10;
                            break;

                    }
                }
            });

            Button btn_add = convertView.findViewById(R.id.btn_add);
            btn_add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    switch(position){
                        case(0):
                            n1 = Integer.parseInt(editText.getText().toString());
                            n1++;
                            editText.setText(""+n1);
                            nn1=n1;
                            break;
                        case(1):
                            n2 = Integer.parseInt(editText.getText().toString());
                            n2++;
                            editText.setText(""+n2);
                            nn2=n2;
                            break;
                        case(2):
                            n3 = Integer.parseInt(editText.getText().toString());
                            n3++;
                            editText.setText(""+n3);
                            nn3=n3;
                            break;
                        case(3):
                            n4 = Integer.parseInt(editText.getText().toString());
                            n4++;
                            editText.setText(""+n4);
                            nn4=n4;
                            break;
                        case(4):
                            n5 = Integer.parseInt(editText.getText().toString());
                            n5++;
                            editText.setText(""+n5);
                            nn5=n5;
                            break;

                        case(5):
                            n6 = Integer.parseInt(editText.getText().toString());
                            n6++;
                            editText.setText(""+n6);
                            nn6=n6;
                            break;
                        case(6):
                            n7 = Integer.parseInt(editText.getText().toString());
                            n7++;
                            editText.setText(""+n7);
                            nn7=n7;
                            break;
                        case(7):
                            n8 = Integer.parseInt(editText.getText().toString());
                            n8++;
                            editText.setText(""+n8);
                            nn8=n8;
                            break;
                        case(8):
                            n9 = Integer.parseInt(editText.getText().toString());
                            n9++;
                            editText.setText(""+n9);
                            nn9=n9;
                            break;
                        case(9):
                            n10 = Integer.parseInt(editText.getText().toString());
                            n10++;
                            editText.setText(""+n10);
                            nn10=n10;
                            break;
                    }
                }
            });
            return convertView;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        btn_addtocart = findViewById(R.id.btn_addtocart);
        btn_addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int value1 = 123;
                String value2 = "123";




                Intent intent23 = new Intent(MainActivity2.this, MainActivity3.class);


                Bundle bundle = new Bundle();
                bundle.putInt("n1",nn1 );
                bundle.putInt("n2",nn2 );
                bundle.putInt("n3",nn3 );
                bundle.putInt("n4",nn4 );
                bundle.putInt("n5",nn5 );
                bundle.putInt("n6",nn6 );
                bundle.putInt("n7",nn7 );
                bundle.putInt("n8",nn8 );
                bundle.putInt("n9",nn9 );
                bundle.putInt("n10",nn10 );

                intent23.putExtra("key", bundle);

                startActivity(intent23);

                //toast display
                Toast toast =  Toast.makeText(MainActivity2.this, "已加入購物車", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,0,0);   //靠中下
                toast.show();
            }
        });




        String[] cubeeNameArray = new String[]{"小丑魚\n$1","吳郭魚\n$2","虱目魚\n$3","鯊魚\n$2","忍者龜\n$5","海馬\n$6","海豚\n$5","燈籠魚\n$8","鯨魚\n$3","謝老闆\n$7"};
        int[] cubeePhotoIdArray = new int[]{R.drawable.fish1,R.drawable.fish2,R.drawable.fish3,R.drawable.fish4,
                R.drawable.fish5,R.drawable.fish6, R.drawable.fish7,R.drawable.fish8,R.drawable.fish9,R.drawable.fish10};
        MainActivity2.Data[] cubeeData = new MainActivity2.Data[cubeeNameArray.length];
        for(int i=0;i<cubeeData.length;i++){
            cubeeData[i] = new MainActivity2.Data();
            cubeeData[i].name = cubeeNameArray[i];
            cubeeData[i].photo = cubeePhotoIdArray[i];
        }
        MainActivity2.MyAdapter cubeeAdapter =new MainActivity2.MyAdapter(cubeeData,R.layout.cubee_list);
        GridView gridView = findViewById(R.id.gridView);
        gridView.setAdapter(cubeeAdapter);
        gridView.setNumColumns(1);
    }



    // 從第二夜bundle回來
    protected void onActivity(int requestCode, int resultCode, @Nullable Intent data){
        super.onActivityResult(requestCode,  resultCode,data);
        if(data ==null)return;
        if (requestCode == 1) {
            if (resultCode == 101) {
                Bundle bundle1 = data.getExtras();
                int n1 = bundle1.getInt("n1"), n2 = bundle1.getInt("n2"), n3 = bundle1.getInt("n3"), n4 = bundle1.getInt("n4"),
                        n5 = bundle1.getInt("n5"),n6 = bundle1.getInt("n6")
                        ,n7 = bundle1.getInt("n7"),n8 = bundle1.getInt("n8"),n9 = bundle1.getInt("n9")
                        ,n10 = bundle1.getInt("n10");            }
        }
    }


}