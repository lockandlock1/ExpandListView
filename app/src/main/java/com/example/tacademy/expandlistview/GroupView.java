package com.example.tacademy.expandlistview;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-01-18.
 */
public class GroupView extends FrameLayout {
    public GroupView(Context context) {
        super(context);
    }

    TextView nameView;
    GroupItem item;
    private void init(){
       inflate(getContext(),R.layout.view_group,this);
        nameView = (TextView)findViewById(R.id.text_name);
    }

    public void setGroupItem(GroupItem item){
        this.item = item;
        nameView.setText(item.groupName);
    }
}
