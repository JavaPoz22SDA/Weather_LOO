package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class GetWeather {

    public static void main(String[] args) throws IOException {

        String API_KEY = "1a27a7e54cde71a4a6d0f77826427445";

        WeatherService weatherService = new WeatherService(
                "http://api.weatherstack.com/current", API_KEY);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj miasto:");
        String city = scanner.nextLine();
        Weather weather = weatherService.getCityWeather(city);

        System.out.println("Temperatura w " + weather.getLocation().getName() + " wynosi: " +weather.getCurrent().getTemperature());


    }

}

