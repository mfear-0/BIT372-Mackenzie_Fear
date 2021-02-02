package com.example.eventlistmvvm;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.eventlistmvvm.roomdb.Event;
import java.util.List;

public class EventListViewModel extends ViewModel {

    private MutableLiveData<List<Event>> data;
    private EventRepository repo;

    public void init(Context context) {
        if (data == null) {
            data = new MutableLiveData<>();
        }
        repo = EventRepository.getInstance(context);
        data.setValue(repo.getEvents());
    }

    public MutableLiveData<List<Event>> getEvents() {
        data.setValue(repo.getEvents());
        return data;
    }
}
