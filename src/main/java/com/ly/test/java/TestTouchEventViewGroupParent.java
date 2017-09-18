package com.ly.test.java;

public class TestTouchEventViewGroupParent
{
    private TestTouchEventView mTestTouchEventView;

    public TestTouchEventViewGroupParent()
    {
        this.mTestTouchEventView = new TestTouchEventView();
    }

    public boolean onInterceptTouchEvent()
    {
        System.out.println("TestTouchEventViewGroupParent --- onInterceptTouchEvent --- execute");
        boolean b = false;
        System.out.println(
                "TestTouchEventViewGroupParent --- onInterceptTouchEvent：" + b);
        return b;
    }

    public boolean onTouchEvent()
    {
        System.out.println("TestTouchEventViewGroupParent --- onTouchEvent --- execute");
        boolean b = false;
        System.out
                .println("TestTouchEventViewGroupParent --- onTouchEvent：" + b);
        return b;
    }

    public boolean dispatchTouchEvent()
    {
        System.out.println("TestTouchEventViewGroupParent --- dispatchTouchEvent --- execute");
        boolean viewGroupParentInTouch = onInterceptTouchEvent();
        if (viewGroupParentInTouch)
        {
            return false;
        }
        boolean b = mTestTouchEventView.dispatchTouchEvent();
        if (b)
        {
            System.out.println(
                    "TestTouchEventViewGroupParent --- dispatchTouchEvent："
                            + b);
            return b;
        }
        else
        {
            boolean viewGroupParentOnTouchEvent = onTouchEvent();
            System.out.println(
                    "TestTouchEventViewGroupParent --- dispatchTouchEvent："
                            + viewGroupParentOnTouchEvent);
            return viewGroupParentOnTouchEvent;
        }
    }
}