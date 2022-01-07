package ru.netology;

public class Radio {
    private String name;
    int maxVolume = 10;
    int minVolume = 0;
    int currentVolume;
    int maxStation = 9;
    int minStation = 0;
    int currentRadioStation;
    boolean on;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxRadioStation() {
        return maxStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation) {
            return;
        }
        if (currentRadioStation < minStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }


    public void pressNextStation() {
        if (currentRadioStation >= maxStation) {
            setCurrentRadioStation(minStation);
        } else {
            setCurrentRadioStation(currentRadioStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentRadioStation <= minStation) {
            setCurrentRadioStation(maxStation);
        } else {
            setCurrentRadioStation(currentRadioStation - 1);
        }
    }

    public void pressPlusVolume() {

        setCurrentVolume(currentVolume + 1);
    }

    public void pressMinusVolume() {

        setCurrentVolume(currentVolume - 1);
    }

}
