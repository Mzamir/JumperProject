package com.example.mahmoud.jumperupdate.viewcontroler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mahmoud.jumperupdate.R;

/**
 * Created by Mahmoud on 12/4/2015.
 */
public class Home extends Fragment {
    Fragment f1, f2;
    Fragment advancedSearch;
    ActionBar actionBar ;
    ActionBar advancedActionBar ;
    ActionBar.Tab tab ;

    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    int Numboftabs =2;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.home,null);
        CharSequence Titles[]={getString(R.string.trips),getString(R.string.offers)};
        adapter =  new ViewPagerAdapter(getActivity().getSupportFragmentManager(),Titles,Numboftabs);
        pager = (ViewPager) v.findViewById(R.id.pager);
        pager.setAdapter(adapter);
        tabs = (SlidingTabLayout) v.findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.primaryColor);
            }
        });
        tabs.setViewPager(pager);
        return v;
    }
    public static Home newInstance() {
        Home fragment = new Home();
        Bundle args = new Bundle();

        return fragment;
    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.home);
//        CharSequence Titles[]={"Nearby","Top Rated"};
////     //   createTabAdapter();
//    }
////
//    private void createTabAdapter() {
//        f1 = new TripsFragment();
//        f2 = new OffersFragment();
//        Fragment[] fragments = {f1, f2};
//        actionBar = getSupportActionBar();
//        //actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//        actionBar.setDisplayUseLogoEnabled(true);
//        actionBar.setLogo(R.drawable.logoicon_navbar);
//        actionBar.setTitle(getString(R.string.home));
//        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.redpink));
//        actionBar.setStackedBackgroundDrawable(getResources().getDrawable(R.drawable.lighgrey));
//
//        actionBar.addTab(actionBar.newTab().setText("Trips").setTabListener(new ActionBar.TabListener() {
//            @Override
//            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                    fragmentTransaction.replace(R.id.fragment_placeholder, f1);
//            }
//
//            @Override
//            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                fragmentTransaction.remove(f1);
//            }
//
//            @Override
//            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//
//            }
//        }));
//        actionBar.addTab(actionBar.newTab().setText("Offers").setTabListener(new ActionBar.TabListener() {
//            @Override
//            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                fragmentTransaction.replace(R.id.fragment_placeholder, f2);
//            }
//
//            @Override
//            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                fragmentTransaction.remove(f2);
//            }
//
//            @Override
//            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//
//            }
//        }));
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.home_action_bar, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        switch (item.getItemId()) {
//            case R.id.search_icon:
//                searchIconListener();
//                return true;
//            case R.id.notification_icon:
//                notificationIconListener();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }
//
//    private void notificationIconListener() {
//        Intent intent = new Intent(Home.this, Notification.class);
//        startActivity(intent);
//    }
//    private void searchIconListener() {
//        advancedSearch=new AdvancedSearch();
//        advancedActionBar = getSupportActionBar();
//        //actionBar.setDisplayShowTitleEnabled(false);
//        advancedActionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
//        advancedActionBar.addTab(advancedActionBar.newTab().setText("Advanced Search").setTabListener(new ActionBar.TabListener() {
//            @Override
//            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                //fragmentTransaction.replace(R.id.fragment_placeholder, advancedSearch);
//            }
//
//            @Override
//            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//                //fragmentTransaction.remove(advancedSearch);
//            }
//
//            @Override
//            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
//
//            }
//        }));
//    }

}