package com.example.mohseenmukaddam.levelup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.github.mikephil.charting.charts.PieChart;

/*
 *
 */
public class ProfileUIActivity extends AppCompatActivity {

    private RelativeLayout profileDetails;
    private PieChart mChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_ui);
        profileDetails = (RelativeLayout) findViewById(R.id.ProfileDetails);

    }
}
