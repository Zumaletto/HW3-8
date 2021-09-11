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
            value = {"4, 5",
                    "9, 0"
            }
    )
    void shouldPressNext(int currentRadioWave, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioWave(currentRadioWave);
        radio.next();
        assertEquals(expected, radio.getCurrentRadioWave());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"0, 9",
                    "4, 3"
            }
    )
    void shouldPressPrev(int currentRadioWave, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioWave(currentRadioWave);
        radio.prev();
        assertEquals(expected, radio.getCurrentRadioWave());
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
            value = {"10,9",
                    "0, 0",
                    "5, 4"}
    )
    public void shouldSwitchCurrentSoundValue(int currentSoundValue, int expected) {
        Radio radio = new Radio();
        radio.setCurrentSoundValue(currentSoundValue);
        radio.minus();
        int actual = radio.getCurrentSoundValue();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {"10, 10",
                    "5, 6"}
    )
    public void shouldSwitchCurrentSoundMaxValue(int currentSoundValue, int expected) {
        Radio radio = new Radio();
        radio.setCurrentSoundValue(currentSoundValue);
        radio.plus();
        assertEquals(expected, radio.getCurrentSoundValue());
    }
}