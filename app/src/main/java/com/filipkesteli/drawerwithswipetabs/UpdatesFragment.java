package com.filipkesteli.drawerwithswipetabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdatesFragment extends Fragment {


    public UpdatesFragment() {
        // Required empty public constructor
    }

    private CardView cvMorningFeel;
    private CardView cvMorningMotivated;
    private CardView cvMorningPlans;
    private CardView cvMorningHappy;
    private CardView cvMorningAdventure;

    private SwitchCompat swMorningFeel;
    private SwitchCompat swMorningMotivated;
    private SwitchCompat swMorningPlans;
    private SwitchCompat swMorningHappy;
    private SwitchCompat swMorningAdventure;

    private TextView tvMorningFeel;
    private TextView tvMorningMotivated;
    private TextView tvMorningPlans;
    private TextView tvMorningHappy;
    private TextView tvMorningAdventure;

    private AppCompatSeekBar sbMorningFeel;
    private AppCompatSeekBar sbMorningMotivated;
    private AppCompatSeekBar sbMorningPlans;
    private AppCompatSeekBar sbMorningHappy;
    private AppCompatSeekBar sbMorningAdventure;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_evening_ask, container, false);

        initWidgets(v);
        setupListeners();

        return v;
    }

    private void initWidgets(View v) {

    }

    private void setupListeners() {

    }

}
