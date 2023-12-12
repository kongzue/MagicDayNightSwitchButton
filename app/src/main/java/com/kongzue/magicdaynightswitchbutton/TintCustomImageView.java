package com.kongzue.magicdaynightswitchbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.ImageView;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TintCustomImageView extends androidx.appcompat.widget.AppCompatImageView {
    public TintCustomImageView(@NonNull Context context) {
        super(context);
    }

    public TintCustomImageView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TintCustomImageView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    int color;

    public void setColor(@ColorInt int color){
        this.color = color;
        setImageTintList(ColorStateList.valueOf(color));
        setBackgroundTintList(ColorStateList.valueOf(color));
    }

    public int getColor() {
        return color;
    }
}
