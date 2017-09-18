package com.ly.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 20170117 on 2017/9/17.
 */

public class TestTouchEventView extends View
{
    public TestTouchEventView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        System.out.println("TestTouchEventView --- onTouchEvent --- execute");
        boolean b = super.onTouchEvent(event);
        System.out.println("TestTouchEventView --- onTouchEvent：" + b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event)
    {
        System.out.println("TestTouchEventView --- dispatchTouchEvent --- execute");
        boolean b = super.dispatchTouchEvent(event);
        System.out.println("TestTouchEventView --- dispatchTouchEvent：" + b);
        return b;

    }


}
