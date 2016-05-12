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
public class NotificationAdapter extends BaseAdapter {

    Context activity;
    List<NotificationItem> notificationItemList;

    public NotificationAdapter(Context activity, List<NotificationItem> notificationItemList) {
        this.activity = activity;
        this.notificationItemList = notificationItemList;

    }

    @Override
    public int getCount() {
        return notificationItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return notificationItemList.get(position);
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
        convertView = inflater.inflate(R.layout.notification, null);
        holder.placeImage = (ImageView) convertView.findViewById(R.id.place_img);
        holder.notifyContent = (TextView) convertView.findViewById(R.id.notifycontent);
        holder.companyName = (TextView) convertView.findViewById(R.id.notification_companyname);
        convertView.setTag(holder);
        } else
        holder = (ViewHolder) convertView.getTag();

//        holder.placeImage.setImageResource(R.drawable.r);
//        holder.placeName.setText(tripsList.get(position).tripName);
//        holder.companyName.setText(tripsList.get(position).companyName);
//        holder.tripDate.setText(tripsList.get(position).tripDate);

        return convertView;
        }

private class ViewHolder {
    ImageView placeImage;
    TextView notifyContent, companyName;
}
}
