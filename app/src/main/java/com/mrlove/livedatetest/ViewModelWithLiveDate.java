package com.mrlove.livedatetest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelWithLiveDate extends ViewModel {

    private MutableLiveData<Integer> mutableLiveData ;

    public MutableLiveData<Integer> getMutableLiveData() {
        if(mutableLiveData == null){
            mutableLiveData = new MutableLiveData<>();
            mutableLiveData.setValue(0);
        }

        return mutableLiveData;
    }

    public void addMutablelivedata(int n ){
        mutableLiveData.setValue(mutableLiveData.getValue()+n );
    }

}
