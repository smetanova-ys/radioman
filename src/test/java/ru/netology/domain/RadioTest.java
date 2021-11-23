package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNextRadioStationCurrent9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStationCurrent7() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStationCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.nextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckRadioStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStationCurrent9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prevRadioStation();
        assertEquals(8, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStationCurrent6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.prevRadioStation();
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStationCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckRadioStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolumeCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeCurrent9() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeCurrent10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void shouldIReduceVolumeCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIReduceVolumeCurrent10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void shouldIReduceVolumeCurrent1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}