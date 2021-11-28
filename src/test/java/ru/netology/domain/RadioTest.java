package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInspectNumberRadioStation25() {
        Radio radio = new Radio(25);
        assertEquals(25, radio.getNumberRadioStation());
    }

    @Test
    public void shouldInspectRadioStationMax() {
        Radio radio = new Radio(0);
        assertEquals(0, radio.getRadioStationMax());
    }

    @Test
    public void shouldInspectRadioStationMax1() {
        Radio radio = new Radio(25);
        assertEquals(24, radio.getRadioStationMax());
    }

    @Test
    public void shouldInspectRadioStationMax2() {
        Radio radio = new Radio(1);
        assertEquals(0, radio.getRadioStationMax());
    }

    @Test
    public void shouldInspectRadioStationMax3() {
        Radio radio = new Radio();
        assertEquals(9, radio.getRadioStationMax());
    }

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
    public void shouldNextRadioStationCurrentNumber26() {
        Radio radio = new Radio(26);
        radio.setCurrentRadioStation(15);
        radio.nextRadioStation();
        assertEquals(16, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextRadioStationCurrentNumber25() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckRadioStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldCheckRadioStationMoreMax1() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(20);
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
    public void shouldPrevRadioStationCurrent0Number25() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(24, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldPrevRadioStationCurrent24Number25() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(24);
        radio.prevRadioStation();
        assertEquals(23, radio.getCurrentRadioStation());
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
    public void shouldIncreaseVolumeCurrent99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolumeCurrent100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldIReduceVolumeCurrent0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldIReduceVolumeCurrent100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void shouldIReduceVolumeCurrent1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}