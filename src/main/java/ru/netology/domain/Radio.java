package ru.netology.domain;

public class Radio {
    private int radioStationMin = 0;
    private int radioStationMax = 9;
    private int currentRadioStation;
    private int volumeMin = 0;
    private int volumeMax = 10;
    private int currentVolume;

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > radioStationMax || currentRadioStation < radioStationMin) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < radioStationMax) {
            currentRadioStation += 1;
        } else {
            currentRadioStation = radioStationMin;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > radioStationMin) {
            currentRadioStation -= 1;
        } else {
            currentRadioStation = radioStationMax;
        }
    }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume += 1;
        }
        if (currentVolume >= volumeMax) {
            currentVolume = volumeMax;
        }
    }

    public void reduceVolume() {
        if (currentVolume > volumeMin) {
            currentVolume -= 1;
        }
        if (currentVolume <= volumeMin) {
            currentVolume = volumeMin;
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
