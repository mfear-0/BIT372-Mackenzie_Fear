package com.example.unitcoverter;
import androidx.lifecycle.MutableLiveData;

public class LiveData {
    public MutableLiveData<String> ldata;

    public LiveData(String v1){
        this.ldata = new MutableLiveData<>();
        this.ldata.setValue(v1);
    }
}
