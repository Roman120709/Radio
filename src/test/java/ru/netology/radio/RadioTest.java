package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio radio = new Radio();
        int expected = 2;
        int actual = radio.nextRadioStation(1);
        assertEquals(expected, actual);
    }


    @Test
    public void prevRadioStation() {
        Radio radio = new Radio();
        int expected = 2;
        int actual = radio.prevRadioStation(3);
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        int expected = 2;
        int actual = radio.increaseVolume(1);
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.decreaseVolume(10);
        assertEquals(expected, actual);
    }
}