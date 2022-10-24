package com.example.focus_on_1.ui.timer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.focus_on_1.databinding.FragmentTimer2Binding;



public class Timer2Fragment extends Fragment{

    private FragmentTimer2Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        Timer2ViewModel Timer2ViewModel =
                new ViewModelProvider(this).get(Timer2ViewModel.class);

        binding = FragmentTimer2Binding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTimer;
        Timer2ViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}