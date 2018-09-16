package com.test.testonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton;
    private Button button_qr;
    private Button button_jk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        初始化当前控件
        通过findViewByID查到对应view的id
        设置监听器 通过监听器实现我们点击button后操作的事情
         */

        loginButton = findViewById(R.id.button_dl);
        button_qr = findViewById(R.id.button_qr);
        button_jk = findViewById(R.id.button_jk);


        /*
        通过匿名内部类实现 setOnClickListener
         */
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("我的按钮被点击了");
            }
        });


        /*
        外部类实现

        如果所有按钮都需要实现某种效果 可以通过外部类实现
         */
        button_qr.setOnClickListener(new MyOnClickListener(){
            @Override
            public void onClick(View v) {
                super.onClick(v);
                Toast.makeText(MainActivity.this,"按钮本身事件执行了",1).show();

                //Toast是一种简易的消息提示框
            }
        });


        /*
        接口实现
        implements View.OnClickListener
         */
        button_jk.setOnClickListener(this);
        //this是可以访问当前接口的对象



    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this,"通过接口实现",1).show();
    }


}

//OnClickListener是一个接口
class MyOnClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        Log.i("Tag", "父类的onclick事件执行了");
        v.setAlpha(0.5f);

        /*
        setAlpha控制透明度 0不显示1完全显示
         */
    }
}