package ru.netology.domain;

public class RadioService {


    private int currentWave;
    private int currentVolume;
//    int[] waves = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    int[] volumeLevels = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void setCurrentWave(int сurrentWave) {
        if (сurrentWave < 0) {
            return;
        }
        if (сurrentWave > 9) {
            return;
        }
        this.currentWave = сurrentWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int nextWave() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
            return currentWave;
        } else {
            return 0;
        }
    }

    public int pervWave() {
        if (currentWave >= 1) {
            currentWave = currentWave - 1;
            return currentWave;
        } else {
            return 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
            return currentVolume;
        } else {
            return 10;
        }
    }

    public int decreaseVolume() {
        if (currentVolume >= 1) {
            currentVolume = currentVolume - 1;
            return currentVolume;
        } else {
            return 0;
        }
    }
}
