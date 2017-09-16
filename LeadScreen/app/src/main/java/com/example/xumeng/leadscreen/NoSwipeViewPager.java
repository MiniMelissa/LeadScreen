package com.example.xumeng.leadscreen;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by xumeng on 9/16/17.
 */
public class NoSwipeViewPager extends ViewPager {
    private boolean enable;

    public NoSwipeViewPager(Context context, AttributeSet attrs) {
        super(context,attrs);
        this.enable=true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (this.enable) {
            return super.onTouchEvent(event);
        }

        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enable) {
            return super.onInterceptTouchEvent(event);
        }

        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.enable = enabled;
    }
}
