package com.example.mahmoud.jumperupdate.viewcontroler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mahmoud.jumperupdate.R;

import java.util.List;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class DrawerAdapter extends BaseAdapter {
    Context context ;
    List<DrawerItem> Items;
    public DrawerAdapter(Context context ,List<DrawerItem> Items){
        this.context = context;
        this.Items = Items;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return this.Items.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return this.Items.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int arg0, View arg1, ViewGroup arg2) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.drawer_item, null);
        TextView Itemname = (TextView) v.findViewById(R.id.itemname);
        ImageView ImageID = (ImageView) v.findViewById(R.id.itemid);
        Itemname.setText(Items.get(arg0).getItemName());
        ImageID.setImageResource(Items.get(arg0).getItemID());
        return v;
    }

}
