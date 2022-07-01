package com.example.assginment.model;

public class Wheather {
    private  String DateTime;
    private  int WeatherIcon;
    private  String IconPhrase;
    private Teamperature Teamperature;

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }

    public Teamperature getTeamperature() {
        return Teamperature;
    }

    public void setTeamperature(Teamperature teamperature) {
        Teamperature = teamperature;
    }
}
