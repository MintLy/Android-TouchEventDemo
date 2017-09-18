package com.ly.test.java;

/**
 * Created by 20170117 on 2017/9/17.
 */

public class MainActivity
{
    static TestTouchEventViewGroupParent mTestTouchEventViewGroupParent = new TestTouchEventViewGroupParent();

    public static void main(String[] args)
    {
        dispatchTouchEvent();

    }

    public static boolean dispatchTouchEvent()
    {
        System.out.println("MainActivity --- dispatchTouchEvent --- execute");
        boolean dispatchTouchEvent = mTestTouchEventViewGroupParent
                .dispatchTouchEvent();
        if (!dispatchTouchEvent)
        {
            dispatchTouchEvent = onTouchEvent();
        }
        System.out
                .println("MainActivity --- dispatchTouchEvent：" + dispatchTouchEvent);
        return dispatchTouchEvent;
    }

    public static boolean onTouchEvent()
    {
        System.out.println("MainActivity --- onTouchEvent --- execute");
        boolean b = false;
        System.out
                .println("MainActivity --- onTouchEvent：" + b);
        return b;
    }

}
