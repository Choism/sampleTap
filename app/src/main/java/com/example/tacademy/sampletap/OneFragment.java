package com.example.tacademy.sampletap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class OneFragment extends Fragment {


    public OneFragment() {
        // Required empty public constructor
    }


    FragmentTabHost tabHost;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        tabHost = (FragmentTabHost)view.findViewById(R.id.tabhost);
        tabHost.setup(getContext(), getChildFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("CT1"), OneOneFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("CT2"), OneTwoFragment.class, null);
        return view;
    }

    public void receiveText(String text) {
        ((FragmentTabActivity)getActivity()).receiveText(text);
    }
}

