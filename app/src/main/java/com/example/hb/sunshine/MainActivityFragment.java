package com.example.hb.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, true);

        String [] forecastArray = {
                "Today - Sunny - 22C",
                "Today - Sunny - 22C",
                "Today - Sunny - 22C",
                "Today - Sunny - 22C",
                "Today - Sunny - 22C",
                "Today - Sunny - 22C",
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

        mForecastAdapter =
                new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        weekForecast);

        ListView listView = (ListView) rootView.findViewById(
                R.id.listview_forecast
        );
        listView.setAdapter(mForecastAdapter);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
































