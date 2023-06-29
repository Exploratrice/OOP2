package ru.netology.OOP2.Radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.currentStation = 9;
        int expected = 0;
        int actual = radio.nextStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.currentStation = 2;
        int expected = 1;
        int actual = radio.prevStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 88;
        int expected = 89;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.currentVolume = 101;
        int expected = 100;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
}
