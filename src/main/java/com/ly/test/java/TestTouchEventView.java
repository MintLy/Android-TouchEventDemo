package com.ly.test.java;

public class TestTouchEventView
{
    public boolean dispatchTouchEvent()
    {
        System.out.println("TestTouchEventView --- dispatchTouchEvent --- execute");
        boolean b = onTouchEvent();
        System.out.println("TestTouchEventView --- dispatchTouchEvent：" + b);
        return b;
    }

    public boolean onTouchEvent()
    {
        System.out.println("TestTouchEventView --- onTouchEvent --- execute");
        boolean b = false;
        System.out.println("TestTouchEventView --- onTouchEvent：" + b);
        return b;
    }
}