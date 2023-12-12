package com.kongzue.magicdaynightswitchbutton;

import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;

import androidx.appcompat.app.AppCompatActivity;

import com.kongzue.magicdaynightswitchbutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getWindow().setNavigationBarColor(getResources().getColor(R.color.backgroundColor));
        getWindow().setStatusBarColor(getResources().getColor(R.color.backgroundColor));

        binding.boxDayNightSwitch.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), dip2px(24.5f));
            }
        });
        binding.boxDayNightSwitch.setClipToOutline(true);
    }

    public int dip2px(float dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}