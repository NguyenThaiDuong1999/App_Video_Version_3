package com.example.a38_nguyenthaiduong_appvideo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.a38_nguyenthaiduong_appvideo.databinding.TrendingBinding;

public class TrendingFragment extends Fragment {

    TrendingBinding binding;

    public static TrendingFragment newInstance() {

        Bundle args = new Bundle();

        TrendingFragment fragment = new TrendingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.trending, container, false);

        return binding.getRoot();
    }
}
