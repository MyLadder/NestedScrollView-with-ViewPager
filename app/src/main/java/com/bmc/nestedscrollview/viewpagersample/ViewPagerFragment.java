package com.bmc.nestedscrollview.viewpagersample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by bmcansh on 6/4/16.
 */
public class ViewPagerFragment extends Fragment {

    public static ViewPagerFragment newInstance() {
        return new ViewPagerFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View view = inflater.inflate(R.layout.viewpager_fragment, container, false);

        return view;
    }
}
