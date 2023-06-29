package ru.netology.OOP2.Radio;

public class Radio {
    public int currentStation;

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation >= 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }

    }

    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 100) {
            currentVolume = currentVolume - 1;
        }
    }
}
