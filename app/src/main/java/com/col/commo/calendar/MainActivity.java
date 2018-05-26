package com.col.commo.calendar;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

//    private Spinner year , month;
//    private List<String> month_list;
//    private ArrayAdapter<String> month_adapter;
    private TextView year,month;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        test();

    }

    private void test(){
//        month_list = new ArrayList<String>();
//        month_list.add("1");
//        month_list.add("2");
//        month_list.add("3");
//        month_list.add("4");
//        month_list.add("5");
//        month_list.add("6");
//        month_list.add("7");
//        month_list.add("8");
//        month_list.add("9");
//        month_list.add("10");
//        month_list.add("11");
//        month_list.add("12");
//
//        month_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,month_list);
//        month_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        month.setAdapter(month_adapter );
        year.setText("2017");
        month.setText("9");

        month.setOnClickListener(this);
    }

    private void initView(){
//        month = (Spinner) findViewById(R.id.month_num);
        year = (TextView) findViewById(R.id.year_num);
        month = (TextView) findViewById(R.id.month_num);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.month_num :{
                /*获取自定义布局*/
                LayoutInflater inflater = LayoutInflater.from(this);
                View view1 = inflater.inflate(R.layout.month,null);
                /*设置弹出框样式*/
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("月份");
                builder.setView(view1);
                /*创建弹出框*/
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

                break;
            }
            case R.id.year_num :{
                break;
            }
            default: break;

        }
    }
}
