package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/data.csv"})
    void setWave(int wave, int expected) {
        RadioService service = new RadioService();
        service.setCurrentWave(wave);
        int actual = service.getCurrentWave();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data1.csv"})
    void goNext(int wave, int expected) {
        RadioService service = new RadioService();
        service.setCurrentWave(wave);
        int actual = service.nextWave();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data2.csv"})
    void goPerv(int wave, int expected) {
        RadioService service = new RadioService();
        service.setCurrentWave(wave);
        int actual = service.pervWave();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data3.csv"})
    void setVolume(int volume, int expected) {
        RadioService service = new RadioService();
        service.setCurrentVolume(volume);
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data4.csv"})
    void getLouder(int volume, int expected) {
        RadioService service = new RadioService();
        service.setCurrentVolume(volume);
        int actual = service.increaseVolume();

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = {"/data5.csv"})
    void getQuieter(int volume, int expected) {
        RadioService service = new RadioService();
        service.setCurrentVolume(volume);
        int actual = service.decreaseVolume();

        assertEquals(expected, actual);
    }
}

