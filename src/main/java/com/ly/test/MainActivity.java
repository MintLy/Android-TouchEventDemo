package com.ly.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        System.out.println("MainActivity --- dispatchTouchEvent --- execute");
        boolean b = super.dispatchTouchEvent(ev);
        System.out.println("MainActivity --- dispatchTouchEvent：" + b);
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        System.out.println("MainActivity --- onTouchEvent --- execute");
        boolean b = super.onTouchEvent(event);
        System.out.println("MainActivity --- onTouchEvent：" + b);
        return b;
    }

}
