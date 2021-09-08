package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @ParameterizedTest
    @CsvSource(
            value = {"-1, 0",
                    "0, 0",
                    "5, 5",
                    "10, 0",
                    "9, 9"
            }
    )
    void shouldSetAndGetCurrentRadioWave(int currentRadioWave, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioWave(currentRadioWave);
        assertEquals(expected, radio.getCurrentRadioWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"10, 0",
                    "0, 1",
                    "9, 0"
            }
    )
    void shouldPressPrev(int currentRadioWave, int expected) {
        Radio radio = new Radio();
        assertEquals(expected, radio.prev(currentRadioWave));
    }

    @ParameterizedTest
    @CsvSource(
            value = {"-1, 9",
                    "0, 9",
                    "4, 5"
            }
    )
    void shouldPressNext(int currentRadioWave, int expected) {
        Radio radio = new Radio();
        assertEquals(expected, radio.next(currentRadioWave));
    }

    @ParameterizedTest
    @CsvSource(
            value = {"-1, 0",
                    "0, 0",
                    "5, 5",
                    "11, 0",
                    "10, 10"}
    )
    void shouldSetAndGetCurrentSoundValue(int currentSoundValue, int expected) {
        Radio radio = new Radio();
        radio.setCurrentSoundValue(currentSoundValue);
        assertEquals(expected, radio.getCurrentSoundValue());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"-1, 0",
                    "0, 1",
                    "5, 6"}
    )
    public void shouldSwitchCurrentSoundMinWave(int currentSoundValue, int expected) {
        Radio radio = new Radio();
        assertEquals(expected, radio.minus(currentSoundValue));
    }

    @ParameterizedTest
    @CsvSource(
            value = {"11, 10",
                    "10, 10",
                    "5, 6"}
    )
    public void shouldSwitchCurrentSoundMaxWave(int currentSoundValue, int expected) {
        Radio radio = new Radio();
        assertEquals(expected, radio.plus(currentSoundValue));
    }

}