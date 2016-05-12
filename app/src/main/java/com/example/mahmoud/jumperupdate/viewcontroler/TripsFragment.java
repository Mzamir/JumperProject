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
public class TripsFragment extends Fragment {

    private List<Trips> tripsList;
    private TripsAdapter tripsAdapter;
    ListView trips_lv  ;
    private boolean connectingToInternet;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listview, container, false);
        init(v);
        return v;
    }

    private void init(View v) {
        trips_lv = (ListView) v.findViewById(R.id.listview);
        tripsList = new ArrayList<Trips>();
        tripsAdapter = new TripsAdapter(getActivity(), tripsList);
        trips_lv.setAdapter(tripsAdapter);
        fillListView();
        tripsAdapter.notifyDataSetChanged();
        trips_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getActivity(), TripInformation.class));
            }
        });
    }

    /*public void TripListener() {
        trips_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View view, int position,long arg3) {
                int id_To_Search = position + 1;
                Bundle dataBundle = new Bundle();
                dataBundle.putInt("id", id_To_Search);
                Intent intent = new Intent(TripsFragment.this, TripInformation.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
            }
        });
    }*/

    private void fillListView() {
//        String tripImage, String tripName, String companyName , String tripDate
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));
        tripsList.add(new Trips("", "Sharm El-Shekh", "Traveling Agency", "18 April to 28th April"));

        tripsAdapter.notifyDataSetChanged();

    }
    /*public class ItemListener extends Activity{
        trips_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            }
        });
    }*/
}

