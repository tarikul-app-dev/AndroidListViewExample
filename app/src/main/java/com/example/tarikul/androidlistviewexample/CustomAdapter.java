package com.example.tarikul.androidlistviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by interspeed.com.bd on 27-Oct-16.
 */
public class CustomAdapter extends BaseAdapter {
    Context ctx;
    List<RowItem> rowItems;

    CustomAdapter(Context ctx, List<RowItem> rowItems){
    this.ctx =ctx;
        this.rowItems=rowItems;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        LayoutInflater mlayoutInfalter= (LayoutInflater)ctx.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView=mlayoutInfalter.inflate(R.layout.list_item,null);
            holder = new ViewHolder();
            holder.profilePics =(ImageView)convertView.findViewById(R.id.profile_pic);
            holder.description =(TextView)convertView.findViewById(R.id.tv_description);
            RowItem rowPos = rowItems.get(position);

            holder.profilePics.setImageResource(rowPos.getProfilePics());
            holder.description.setText(rowPos.getDescription());

        }

        return convertView;
    }

    private class ViewHolder{
        ImageView profilePics;
        TextView description;
    }
}
