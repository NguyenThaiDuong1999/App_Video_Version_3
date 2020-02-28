package com.example.a38_nguyenthaiduong_appvideo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.a38_nguyenthaiduong_appvideo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity{

    private static final String TAG = "MainActivity";

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        getFragment(new HotVideo());
        binding.imvaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new AccountFragment());
            }
        });

        binding.imvsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new SearchFragment());
            }
        });

        binding.lltrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new TrendingFragment());
            }
        });

        binding.llhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(new HotVideo());
            }
        });
    }

    public void getFragment(Fragment fragment){
        try {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
        }catch (Exception e){
            e.printStackTrace();
            Log.d(TAG, "getFragment: " + e.getMessage());
        }
    }
}
