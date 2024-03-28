package com.example.my_linkedin_8;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> info = new MutableLiveData<Integer>(0);
    public LiveData<Integer> Pinfo = info;

    public void loadData(){
        Integer currentValue = info.getValue();
        if (currentValue != null) {
            info.setValue(currentValue + 1);
        } else {
            info.setValue(1); // hoặc một giá trị mặc định khác nếu thích
        }
    }
}
