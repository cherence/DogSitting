package com.example.cher.dogsitter.wishlist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cher.dogsitter.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StuffFragment extends Fragment {


    public StuffFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stuff, container, false);
    }

}
