package com.example.user.piechart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    PieChart piechart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piechart = (PieChart) findViewById(R.id.piechart);
        piechart.setUsePercentValues(true);
        ArrayList<PieEntry> entries = new ArrayList<PieEntry>();
        entries.add(new PieEntry(20));
        entries.add(new PieEntry(60));
        entries.add(new PieEntry(70));
        entries.add(new PieEntry(80));
        entries.add(new PieEntry(50));

        PieDataSet dataSet = new PieDataSet(entries, "Election Results");
        ArrayList<Integer> colors = new ArrayList<Integer>();
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);

        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        dataSet.setColors(colors);
        PieData data = new PieData(dataSet);
        piechart.setData(data);
        piechart.getDescription().setEnabled(false);
        // enable rotation of the chart by touch
        piechart.setRotationEnabled(false);
        piechart.setHighlightPerTapEnabled(true);







    }
}
