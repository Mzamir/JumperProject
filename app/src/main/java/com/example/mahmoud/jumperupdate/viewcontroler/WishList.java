package com.example.mahmoud.jumperupdate.viewcontroler;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
public class WishList extends Fragment {
    private List<Trips> tripsList;
    private Toolbar toolbar;
    private WishListAdapter wishListAdapter;

    //    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.listview);
//
//    }
    public static WishList newInstance() {
        WishList fragment = new WishList();
        Bundle args = new Bundle();

        return fragment;
    }

    //@TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listview, null);
        toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("WishList");
            toolbar.setTitleTextColor(Color.WHITE);
            toolbar.setLogo(R.drawable.logoicon_navbar);
//            ((ActionBarActivity)getActivity()).setSupportActionBar(toolbar);
        }
        init(v);
        return v;
    }

    private void init(View v) {
        ListView trips_lv = (ListView) v.findViewById(R.id.listview);
        tripsList = new ArrayList<Trips>();
        wishListAdapter = new WishListAdapter(getActivity(), tripsList);
        trips_lv.setAdapter(wishListAdapter);
        fillListView();
    }

    private void fillListView() {
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agancy", "18 April to 28th April"));
        wishListAdapter.notifyDataSetChanged();

    }
}

