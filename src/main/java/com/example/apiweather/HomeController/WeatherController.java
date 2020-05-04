package com.example.apiweather.HomeController;
import com.example.apiweather.Model.Weather;
import com.example.apiweather.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Hashtable;

@RestController
@RequestMapping("/weather")
public class WeatherController
{

    @Autowired
    WeatherService ws;

    @RequestMapping("/all")
    public Hashtable<String, Weather> getAll()

    {
        return ws.getAll();
    }

    @RequestMapping("{id}")
    public Weather getCity(@PathVariable("id") String id)
    {
        return ws.getCity(id);
    }




}
