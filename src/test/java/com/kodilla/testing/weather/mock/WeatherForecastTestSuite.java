package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;
    private WeatherForecast forecast;
    @BeforeEach
    void prepareTest() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        forecast = new WeatherForecast(temperaturesMock);
    }

    @Test
    void testCalculateForecastWithMock() {
        int quantityOfSensors = forecast.calculateForecast().size();
        Assertions.assertEquals(5, quantityOfSensors);
    }
    @Test
    void testCalculateMedian() {
        Assertions.assertEquals(25.5, forecast.calculateMedian());
    }
    @Test
    void testCalculateAverage() {
        Assertions.assertEquals(25.56, forecast.calculateAverage());
    }
}