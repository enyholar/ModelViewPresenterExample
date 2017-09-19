package com.gideondev.mvpsimpleexample.main.presenter.presenterImpl;

import com.gideondev.mvpsimpleexample.main.presenter.view.MainPresenter;
import com.gideondev.mvpsimpleexample.main.presenter.view.MainView;
import com.gideondev.mvpsimpleexample.model.NameModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${ENNY} on 9/19/2017.
 */

public class MainPresenterImpl implements MainPresenter {
    private MainView mView;
    private List<NameModel>mNameList;
    @Override
    public void setView(MainView view) {
        this.mView = view;
    }

    @Override
    public void Start() {
       mNameList = new ArrayList<>();
        mNameList.add(new NameModel("Ashraf", "India"));
        mNameList.add(new NameModel("Gideon", "Nigeria"));
        mNameList.add(new NameModel("Trump", "USA"));
        mNameList.add(new NameModel("ElonMusk", "USA"));
    }

    @Override
    public void ShowAdapterView() {
        mView.SetUpAdapter(mNameList);
    }
}
