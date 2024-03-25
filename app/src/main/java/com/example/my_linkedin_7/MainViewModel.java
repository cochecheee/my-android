package com.example.my_linkedin_7;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Integer> info = new MutableLiveData<Integer>();
    public LiveData<Integer> pInfo = info;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count = 0;
    //tạo 1 default constructor để xem khi nào thì viewmodel dc khoi tao
    public MainViewModel(){
        Log.i("MainViewModel","created");
        info.setValue(0);
    }

    //su dung function
    void loadData() {

        info.setValue(info.getValue()+1);
        setCount(getCount()+1);
        Log.i("MainViewModel", String.format("current value: %s", info.getValue()));
        Log.i("MainViewModel", String.format("current value: %s",getCount()));
    }
}
