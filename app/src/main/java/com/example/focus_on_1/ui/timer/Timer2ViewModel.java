package com.example.focus_on_1.ui.timer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class Timer2ViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public Timer2ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is timer2 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}