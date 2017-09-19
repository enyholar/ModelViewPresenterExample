package com.gideondev.mvpsimpleexample.main.presenter.view;

import android.content.Context;
import com.gideondev.mvpsimpleexample.model.NameModel;
import java.util.List;

/**
 * Created by ${ENNY} on 9/19/2017.
 */

public interface MainView {
   void initView();
    void initModel();
    Context getContext();
    void SetUpAdapter(List<NameModel> mNameList);
}
