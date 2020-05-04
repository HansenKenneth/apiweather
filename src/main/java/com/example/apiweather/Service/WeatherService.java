package com.example.apiweather.Service;

import com.example.apiweather.Model.Weather;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class WeatherService
{
    Hashtable<String, Weather> city = new Hashtable<String, Weather>();
    public WeatherService()
    {
        Weather w = new Weather();
        w.setId(1);
        w.setCity("Copenhagen");
        w.setLocation("Denmark");
        w.setTemp(70);
        city.put("1", w);

        w = new Weather();
        w.setId(2);
        w.setCity("London");
        w.setLocation("England");
        w.setTemp(50);
        city.put("2", w);

    }
    public Weather getCity(String id)
    {
        if (city.containsKey(id))
            return city.get(id);
        else
            return null;
    }
    public  Hashtable<String, Weather> getAll()
    {
        return city;
    }


}
