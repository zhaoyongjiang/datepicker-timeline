package com.github.badoualy.datepicker.sample;

import android.os.Bundle;

import com.github.badoualy.datepicker.DatePickerTimeline;

import java.util.Calendar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

        DatePickerTimeline timeline = findViewById(R.id.timeline);
//        timeline.setDateLabelAdapter(new MonthView.DateLabelAdapter() {
//            @Override
//            public CharSequence getLabel(Calendar calendar, int index) {
//                return Integer.toString(calendar.get(Calendar.MONTH) + 1) + "/" + (calendar.get(Calendar.YEAR) % 2000);
//            }
//        });

        timeline.setOnDateSelectedListener(new DatePickerTimeline.OnDateSelectedListener() {
            @Override
            public void onDateSelected(int year, int month, int day, int index) {

            }
        });

        timeline.setFirstVisibleDate(2016, Calendar.JULY, 19);
        timeline.setLastVisibleDate(2020, Calendar.JULY, 19);
        //timeline.setFollowScroll(false);
    }

}
