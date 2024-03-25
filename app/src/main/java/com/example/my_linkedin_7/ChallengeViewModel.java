package com.example.my_linkedin_7;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChallengeViewModel extends ViewModel {
    private MutableLiveData<Integer> totalAmount = new MutableLiveData<Integer>();
    private MutableLiveData<Integer> quantity = new MutableLiveData<Integer>();
    public LiveData<Integer> Pquantity = quantity;
    public LiveData<Integer> PtotalAmount = totalAmount;
    //default constructor khởi tạo giá trị ban đầu cho các bến livadata
    public ChallengeViewModel(){
        quantity.setValue(0);
        totalAmount.setValue(0);
    }
    void increaseQuantity() {
        //noinspection DataFlowIssue
        quantity.setValue(quantity.getValue()+1);
    }
    void decreaseQuantity() {
        //noinspection DataFlowIssue
        quantity.setValue(quantity.getValue()-1);
    }
    void checkout() {
        totalAmount.setValue(quantity.getValue());
    }


}
