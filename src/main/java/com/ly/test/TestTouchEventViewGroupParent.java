package com.ly.test;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by 20170117 on 2017/9/17.
 */

public class TestTouchEventViewGroupParent extends RelativeLayout
{
    public TestTouchEventViewGroupParent(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        System.out.println("TestTouchEventViewGroupParent --- onTouchEvent --- execute");
        boolean b = super.onTouchEvent(event);
        System.out.println("TestTouchEventViewGroupParent --- onTouchEvent：" + b);
        return b;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        System.out.println("TestTouchEventViewGroupParent --- dispatchTouchEvent --- execute");
        boolean b = super.dispatchTouchEvent(ev);
        System.out.println("TestTouchEventViewGroupParent --- dispatchTouchEvent：" + b);
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev)
    {
        System.out.println("TestTouchEventViewGroupParent --- onInterceptTouchEvent --- execute");
        boolean b = super.onInterceptTouchEvent(ev);
        System.out.println("TestTouchEventViewGroupParent --- onInterceptTouchEvent：" + b);
        return b;
    }


}
