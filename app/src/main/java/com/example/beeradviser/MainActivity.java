package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import com.hfad.beeradviser.BeerExpert;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        //Get txt view
        TextView brands = findViewById(R.id.beerTxtView);
        //Get Spinner
        Spinner listBeerType = findViewById(R.id.beerSpinner);
        //Convert spinner text to string
        String beerType = String.valueOf(listBeerType.getSelectedItem());
        //Create new Beer Expert class
        BeerExpert beerExpert = new BeerExpert();
        //Find recommended beers by type of beer
        List<String> recommendedBeers = beerExpert.getBrands(beerType);
        //Set list in text view
        brands.setText("");
        for (String beer : recommendedBeers) {
            System.out.println(beer);
            brands.append("- " + beer + "\n");
        }

    }
}