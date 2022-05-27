package ru.netology.domain;

public class RadioService {


    private int currentWave;
    private int currentVolume;
//    int[] waves = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    int[] volumeLevels = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void setCurrentWave(int CurrentWave) {
        if (CurrentWave < 0) {
            return;
        }
        if (CurrentWave > 9) {
            return;
        }
        this.currentWave = CurrentWave;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public int nextWave() {
        if (currentWave < 9 && currentWave >= 0) {
            currentWave = currentWave + 1;
            return currentWave;
        }
        if (currentWave >= 9) {
            currentWave = 0;
            return currentWave;
        }
        return 0;
    }

    public int pervWave() {
        if (currentWave <= 9 && currentWave >= 1) {
            currentWave = currentWave - 1;
            return currentWave;
        }
        if (currentWave == 0) {
            currentWave = 9;
            return currentWave;
        }
        return 0;
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
        }
        if (currentVolume == 10) {
            currentVolume = 10;
            return currentVolume;
        }
        return 0;
    }

    public int decreaseVolume() {
        if (currentVolume <= 10 && currentVolume >= 1) {
            currentVolume = currentVolume - 1;
            return currentVolume;
        }
        if (currentVolume == 0) {
            currentVolume = 0;
            return currentVolume;
        }
        return 0;
    }
}
