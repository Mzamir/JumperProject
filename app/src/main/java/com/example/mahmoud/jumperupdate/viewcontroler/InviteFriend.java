package com.example.mahmoud.jumperupdate.viewcontroler;

import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.mahmoud.jumperupdate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmoud on 12/5/2015.
 */
public class InviteFriend extends Fragment {

    private List<UserItem> friendsList;
    private InvitaionAdapter invitaionAdapter;
    private Toolbar toolbar ;
    public static InviteFriend newInstance() {
        InviteFriend fragment = new InviteFriend();
        Bundle args = new Bundle();

        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listview,null);
        toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar) ;
        if (toolbar!= null){
            toolbar.setTitle("Invite Friend");
            toolbar.setTitleTextColor(Color.WHITE);
            toolbar.setLogo(R.drawable.logoicon_navbar);
            //((ActionBarActivity)getActivity()).setSupportActionBar(toolbar);
        }
        init(v);
        return v;
    }

    private void init(View v){
        ListView trips_lv = (ListView) v.findViewById(R.id.listview);
        friendsList = new ArrayList<UserItem>();
        invitaionAdapter = new InvitaionAdapter(getActivity(), friendsList);
        trips_lv.setAdapter(invitaionAdapter);
        fillListView();
    }
    private void fillListView(){
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));
        friendsList.add(new UserItem("","Alex James"));

        invitaionAdapter.notifyDataSetChanged();

    }
}
