package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateMedian() {
        List<Double> tempList = new ArrayList<>(temperatures.getTemperatures().size());
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tempList.add(temperature.getValue());
        }
        DoubleComparator comparator = new DoubleComparator();
        tempList.sort(comparator);
        if (tempList.size() % 2 == 0) {
            return (tempList.get(tempList.size() / 2) + tempList.get(tempList.size() / 2 - 1)) / 2;
        } else {
            return tempList.get(tempList.size() / 2);
        }
    }
    public double calculateAverage() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum = sum + (temperature.getValue());
        }
        return sum / temperatures.getTemperatures().size();
    }

    class DoubleComparator implements Comparator<Double> {

        @Override
        public int compare(Double o1, Double o2) {
            return Double.compare(o1, o2);
        }

    }

}
