package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.hfad.ehealth.PossibleMeasure;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        //Get txt view
        TextView measuresTxtView = findViewById(R.id.illnessTxtView);
        //Get Spinner
        Spinner listIllnesses = findViewById(R.id.illnessSpinner);
        //Convert spinner text to string
        String illnessType = String.valueOf(listIllnesses.getSelectedItem());
        //Create new Possible Measure class
        PossibleMeasure possibleMeasure = new PossibleMeasure();
        //Find measures by illness
        List<String> measures = possibleMeasure.getMeasures(illnessType);
        //Set list in text view
        measuresTxtView.setText("");
        for (String measure : measures) {
            measuresTxtView.append("- " + measure + "\n");
        }

    }
}