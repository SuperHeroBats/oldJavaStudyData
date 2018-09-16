package com.test.testapp;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //实例化对象
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //将布局XML文件引入到activity当中
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.button);

        /*
        匿名内部类实现监听按钮点击事件
         */
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                System.out.println("我被点击了");
//            }
//        });

//        loginButton.setOnClickListener(new MyOnClickListener(){
//            @Override
//            public void onClick(View v) {
//                //Toast用于用户点击消息，简易消息提醒框
//                Toast.makeText(MainActivity.this, "登录要执行的逻辑", 1).show();
//                super.onClick(v);
//                /*
//                可以自己写，也可以调用父类
//                 */
//            }
//        });
        loginButton.setOnClickListener(this);
        //this就是访问当前接口

        /*
        监听器实现方法有三种
        1、匿名内部类
        2、外部类
        3、接口方式
         */

    }

    @Override
    public void onClick(View v) {
        Log.i("TAG", "第三种方式实现onClick事件");
    }
}
/*
外部类写法
为了方便对比 写在activity里面 一般都是新建外部类

OnClickListener属于接口 不能继承

实际应用中可能会出现 同类button需要实现同样的功能
可以通过这种方式进行 避免代码的臃肿
 */
class MyOnClickListener implements View.OnClickListener{

    @Override
    public void onClick(View v) {
//        Log.i("TAG", "父类的onClick事件");
        //改变button透明度 1表示完全显示 0表示不显示
        v.setAlpha(0.5f);
    }
}