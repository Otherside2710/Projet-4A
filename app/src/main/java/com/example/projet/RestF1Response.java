package com.example.projet;

import java.util.List;

public class RestF1Response {

    private List<F1> races;

    public List<F1> getResults() {
        return races;
    }

    public void setResults(List<F1> results) {
        this.races = results;
    }
}
