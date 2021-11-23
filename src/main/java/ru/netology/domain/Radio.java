package ru.netology.domain;

public class Radio {
    private int radioStationMin = 0;
    private int radioStationMax = 9;
    private int currentRadioStation;
    private int volumeMin = 0;
    private int volumeMax = 10;
    private int currentVolume;

    public void nextRadioStation() {
        if (currentRadioStation == radioStationMax) {
            currentRadioStation = radioStationMin;
        }
        if (currentRadioStation >= radioStationMin && currentRadioStation < radioStationMax) {
            currentRadioStation += 1;
        }
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > radioStationMax | currentRadioStation < radioStationMin) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void prevRadioStation() {
        if (currentRadioStation == radioStationMin) {
            currentRadioStation = radioStationMax;
        }
        if (currentRadioStation > radioStationMin && currentRadioStation <= radioStationMax) {
            currentRadioStation -= 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= volumeMax) {
            currentVolume = volumeMax;
        }
        if (currentVolume >= volumeMin && currentVolume < volumeMax) {
            currentVolume += 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= volumeMin) {
            currentVolume = volumeMin;
        }
        if (currentVolume > volumeMin && currentVolume <= volumeMax) {
            currentVolume -= 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
