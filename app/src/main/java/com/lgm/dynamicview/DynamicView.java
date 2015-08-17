package com.lgm.dynamicview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lgm on 15/8/17.
 */
public class DynamicView extends ImageView {

    private List<Integer> list = new ArrayList<>();
    private int single_duration = 200;
    private boolean oneshot = true;
    private AnimationDrawable animationDrawable;
    private Context context;

    public DynamicView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.DynameicView);
        single_duration = ta.getInt(R.styleable.DynameicView_single_duration, 200);
        oneshot = ta.getBoolean(R.styleable.DynameicView_oneshot, true);
        ta.recycle();
    }

    public void start(){
        if (list.size() == 0){
            return;
        }else{
            animationDrawable = new AnimationDrawable();
            for (int i=0; i<list.size(); i++){
                animationDrawable.addFrame(context.getResources().getDrawable(list.get(i)), single_duration);
            }
        }
        animationDrawable.setOneShot(oneshot);
        setBackgroundDrawable(animationDrawable);
        animationDrawable.start();
    }

    public void stop(){
        animationDrawable.stop();
        animationDrawable = null;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getSingle_duration() {
        return single_duration;
    }

    public void setSingle_duration(int single_duration) {
        this.single_duration = single_duration;
    }

    public boolean isOneshot() {
        return oneshot;
    }

    public void setOneshot(boolean oneshot) {
        this.oneshot = oneshot;
    }
}
