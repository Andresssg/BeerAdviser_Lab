package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> recommendedBeers = new ArrayList<>();
        switch (color) {
            case "Light":
                recommendedBeers.add("Beer light 1");
                recommendedBeers.add("Beer light 2");
                recommendedBeers.add("Beer light 3");
                recommendedBeers.add("Beer light 4");
                recommendedBeers.add("Beer light 5");
                break;
            case "Amber":
                recommendedBeers.add("Beer mber 1");
                recommendedBeers.add("Beer amber 2");
                break;
            case "Brown":
                recommendedBeers.add("Beer brown 1");
                recommendedBeers.add("Beer brown 2");
                recommendedBeers.add("Beer brown 3");
                break;
            case "Dark":
                recommendedBeers.add("Beer dark 1");
                break;

        }
        return recommendedBeers;
    }
}
