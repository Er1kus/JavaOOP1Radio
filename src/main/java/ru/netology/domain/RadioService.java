package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RadioService {

    private int currentWave;
    private int currentVolume;
    private int amountWave = 10;
    private int maxWave = amountWave - 1;
    private int minWave = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


//    public int getMaxWave() {
//        return maxWave;
//    }
//
//    public int getMinWave() {
//        return minWave;
//    }
//
//    public int getMaxVolume() {
//        return maxVolume;
//    }
//
//    public int getMinVolume() {
//        return minVolume;
//    }
//
//
//    public RadioService() {
//    }

    public RadioService(int amountWave) {
        this.amountWave = amountWave;
        this.maxWave = amountWave - 1;
    }

    public int setCurrentWave(int currentWave) {
        if (currentWave < minWave) {
            return currentWave;
        }
        if (currentWave > maxWave) {
            return this.currentWave = maxWave;
        }
        this.currentWave = currentWave;
        return currentWave;
    }

    //
//    public int getCurrentWave() {
//        return currentWave;
//    }
//
    public int nextWave() {
        if (currentWave < amountWave - 1) {
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
            return currentWave = maxWave;
        }
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return currentVolume;
        }
        if (currentVolume > maxVolume) {
            return this.currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
        return currentVolume;
    }

    //
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
            return currentVolume;
        } else {
            return maxVolume;
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
