
var api = "https://api.openweathermap.org/data/2.5/weather?q=";
var apiKey = '&appid=995ed24c01fa3b3c8392df267717f937';
var units = '&units=metric';
var city = "London";
var input;
/*
function setup() {
        createCanvas(400, 200);

        var botton = select('#submit');
        botton.mousePressed(weatherAsk());

        input = select('#city');
}

function weatherAsk() {
        var url = api + input.value() + units + apiKey;
        //loadJSON(url, gotData);

}

function gotData(data) {
        weather = data;
}

        var icon =
            "https://api.openweathermap.org/img/w/" + data.weather[0].icon + ".png";
        var temp = Math.floor(data.main.temp);
        var weather = data.weather[0].main;
        var city = city;

        $(".city").attr('src', city);
        $('.icon').attr('src', icon);
        $('.temp').append(temp);
        $(".weather").append(weather);





*/
$.getJSON("https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&appid=995ed24c01fa3b3c8392df267717f937",
    function(data) {
            console.log(data);

            var icon =
                "https://api.openweathermap.org/img/w/" + data.weather[0].icon + ".png";
            var temp = Math.floor(data.main.temp);
            var weather = data.weather[0].main;

            $(".city").attr('src', city);
            $('.icon').attr('src', icon);
            $('.temp').append(temp);
            $(".weather").append(weather);
    });


/*

$.getJSON("https://api.openweathermap.org/data/2.5/weather?q=" + London + "&units=metric&appid=995ed24c01fa3b3c8392df267717f937",
    function(data) {
            var url = api + input.value() + apiKey + units;
        console.log(data);

        var icon =
            "https://api.openweathermap.org/img/w/" + data.weather[0].icon + ".png";
        var temp = Math.floor(data.main.temp);
        var weather = data.weather[0].main;
        var city = city;

        $(".city").attr('src', city);
        $('.icon').attr('src', icon);
        $('.temp').append(temp);
        $(".weather").append(weather);
    });
*/
