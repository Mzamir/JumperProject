package com.example.mahmoud.jumperupdate.viewcontroler;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
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
public class  TripsAdapter extends BaseAdapter {

    Context activity;
    List<Trips> tripsList;

    public TripsAdapter(Context activity, List<Trips> tripsList) {
        this.activity = activity;
        this.tripsList = tripsList;

    }

    @Override
    public int getCount() {
        return tripsList.size();
    }

    @Override
    public Object getItem(int position) {
        return tripsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.trips_tab, null);
            holder.placeImage = (ImageView) convertView.findViewById(R.id.place_img);
            holder.favIcon = (ImageView) convertView.findViewById(R.id.favouritebtn);
            holder.placeName = (TextView) convertView.findViewById(R.id.placename);
            holder.companyName = (TextView) convertView.findViewById(R.id.companyname);
            holder.tripDate = (TextView) convertView.findViewById(R.id.tripdate);
            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.placeImage.setImageResource(R.drawable.r);
        holder.placeName.setText(tripsList.get(position).tripName);
        holder.companyName.setText(tripsList.get(position).companyName);
        holder.tripDate.setText(tripsList.get(position).tripDate);

        return convertView;
    }

    private class ViewHolder {
        ImageView placeImage, favIcon;
        TextView placeName, companyName, tripDate;
    }
}

