package com.gideondev.mvpsimpleexample.main.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.gideondev.mvpsimpleexample.R;
import com.gideondev.mvpsimpleexample.main.adapter.MainAdapter;
import com.gideondev.mvpsimpleexample.main.presenter.presenterImpl.MainPresenterImpl;
import com.gideondev.mvpsimpleexample.main.presenter.view.MainPresenter;
import com.gideondev.mvpsimpleexample.main.presenter.view.MainView;
import com.gideondev.mvpsimpleexample.model.NameModel;
import java.util.List;

public class MainActivity
    extends AppCompatActivity implements MainView {
    private RecyclerView mRecycler;
    private MainPresenter mPresenter;
    private MainAdapter mAdapter;
    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initModel();
    }

    @Override
    public void initView() {
        mRecycler = (RecyclerView) findViewById(R.id.rec_name_list);
        mLayoutManager = new LinearLayoutManager(this);
    }

    @Override
    public void initModel() {
        mPresenter = new MainPresenterImpl();
        mPresenter.setView(this);
        mPresenter.Start();
        mPresenter.ShowAdapterView();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void SetUpAdapter(List<NameModel> mNameList) {
        mAdapter = new MainAdapter(getContext(),mNameList);
        mRecycler.setLayoutManager(mLayoutManager);
        mRecycler.setAdapter(mAdapter);
    }
}
