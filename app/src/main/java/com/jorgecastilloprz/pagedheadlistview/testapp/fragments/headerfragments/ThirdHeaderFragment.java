package com.jorgecastilloprz.pagedheadlistview.testapp.fragments.headerfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jorgecastilloprz.pagedheadlistview.testapp.R;

/**
 * Created by jorge on 31/07/14.
 */
public class ThirdHeaderFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_header_third, container, false);

        return rootView;
    }
}
