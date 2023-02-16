package com.hfad.ehealth;

import java.util.ArrayList;
import java.util.List;

public class PossibleMeasure {

    public List<String> getMeasures(String illness) {
        List<String> measures = new ArrayList<>();
        switch (illness) {
            case "Diabetes":
                measures.add("Glucosa en la sangre");
                measures.add("Agudeza visual");
                break;
            case "Hipertensión":
                measures.add("Presión arterial");
                break;
            case "Insuficiencia cardiaca":
                measures.add("Frecuencia cardiaca");
        }
        return measures;
    }
}
