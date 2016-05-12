package com.example.mahmoud.jumperupdate.viewcontroler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mahmoud.jumperupdate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class OffersFragment extends Fragment {
    private List<Trips> tripsList;
    private TripsAdapter tripsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listview, container, false);
        init(v);
        return v;
    }

    private void init(View v) {
        ListView trips_lv = (ListView) v.findViewById(R.id.listview);
        tripsList = new ArrayList<Trips>();
        tripsAdapter = new TripsAdapter(getActivity(), tripsList);
        trips_lv.setAdapter(tripsAdapter);
        fillListView();
        trips_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), TripInformation.class);
                getActivity().startActivity(i);
            }
        });
    }

    private void fillListView() {
//        String tripImage, String tripName, String companyName , String tripDate
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
        tripsAdapter.notifyDataSetChanged();

    }
}