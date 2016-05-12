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
 * Created by Mahmoud on 12/5/2015.
 */
public class InvitaionAdapter extends BaseAdapter {

    Context activity;
    List<UserItem> invitationList;
    public InvitaionAdapter(Context activity, List<UserItem> invitationList) {
        this.activity = activity;
        this.invitationList = invitationList;

    }

    @Override
    public int getCount() {
        return invitationList.size();
    }

    @Override
    public Object getItem(int position) {
        return invitationList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.invite_screen, null);
            holder.userImage = (ImageView) convertView.findViewById(R.id.user_img);
            holder.inviteFriendImg = (ImageView) convertView.findViewById(R.id.invite_ic);
            holder.friendName = (TextView) convertView.findViewById(R.id.username);

            convertView.setTag(holder);
        }else
            holder = (ViewHolder)convertView.getTag();

        holder.userImage.setImageResource(R.drawable.r);
        holder.friendName.setText(invitationList.get(position).getUserName());

        return convertView;
    }

    private class ViewHolder {
        ImageView userImage ,inviteFriendImg;
        TextView  friendName;
    }
}
