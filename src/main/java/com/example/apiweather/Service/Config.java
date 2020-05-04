package com.example.apiweather.Service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
        return restTemplateBuilder.build();
    }
}

   /* public APIService(RestTemplate restTemplate, VejrRepository vejrRepository, CloudsRepository cloudsRepository,
                      CoordRepository coordRepository, MainRepository mainRepository, SysRepository sysRepository,
                      WeatherRepository weatherRepository, WindRepository windRepository) {

    */
