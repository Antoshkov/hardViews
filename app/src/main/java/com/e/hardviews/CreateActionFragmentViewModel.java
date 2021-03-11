package com.e.hardviews;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class CreateActionFragmentViewModel extends ViewModel {

    private MainModel model = new MainModel();
    private MutableLiveData<List<DefaultAction>> defaultActionLiveData = new MutableLiveData<>();

    public MutableLiveData<List<DefaultAction>> getDefaultActionLiveData() {
        return defaultActionLiveData;
    }

    void getDefaultActions(){
        defaultActionLiveData.postValue(model.getDefaultActions());
    }
}
