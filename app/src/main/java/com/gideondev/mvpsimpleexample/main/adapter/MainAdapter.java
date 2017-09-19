package com.gideondev.mvpsimpleexample.main.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.gideondev.mvpsimpleexample.R;
import com.gideondev.mvpsimpleexample.model.NameModel;
import java.util.List;

/**
 * Created by ${ENNY} on 9/19/2017.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    // Store a member variable for the contacts
    private List<NameModel> mNamelist;
    private Context mContext;

    public MainAdapter(Context context, List<NameModel> smartLists) {
        this.mNamelist = smartLists;
        this.mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView;
        // Inflate the custom layout
        contactView = inflater.inflate(R.layout.item_name_list, parent, false);

        // Return a new holder instance
        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NameModel model = mNamelist.get(position);
          holder.mTextViewCountry.setText(model.getmCountry());
        holder.mTextViewName.setText(model.getmName());
    }

    @Override
    public int getItemCount() {
        return mNamelist.size();
    }

    class ViewHolder
        extends RecyclerView.ViewHolder {
        AppCompatTextView mTextViewName;
        AppCompatTextView mTextViewCountry;
        View mItemView;

        ViewHolder(View itemView) {
            super(itemView);
            mItemView = itemView;
            mTextViewName = (AppCompatTextView) itemView.findViewById(R.id.name);
            mTextViewCountry = (AppCompatTextView) itemView.findViewById(R.id.country);
        }
    }
}
