package ru.netology.domain;

public class Radio {
    private int minRadioWave = 0;
    private int maxRadioWave = 9;
    private int currentRadioWave;
    private int minSoundValue = 0;
    private int maxSoundValue = 10;
    private int currentSoundValue;

    public void setCurrentRadioWave(int currentRadioWave) {
        if (currentRadioWave > maxRadioWave || currentRadioWave < minRadioWave) {
            return;
        }
        this.currentRadioWave = currentRadioWave;
    }

    public int getCurrentRadioWave() {
        return currentRadioWave;
    }

    public int next() {
        if (currentRadioWave < maxRadioWave) {
            currentRadioWave = currentRadioWave + 1;
        } else {
            currentRadioWave = minRadioWave;
        }
        return currentRadioWave;
    }

    public int prev() {
        if (currentRadioWave > minRadioWave) {
            currentRadioWave = currentRadioWave - 1;
        } else {
            currentRadioWave = maxRadioWave;
        }
        return currentRadioWave;
    }

    public void setCurrentSoundValue(int currentSoundValue) {
        if (currentSoundValue < minSoundValue || currentSoundValue > maxSoundValue) {
            return;
        }
        this.currentSoundValue = currentSoundValue;
    }

    public int getCurrentSoundValue() {
        return currentSoundValue;
    }

    public int plus() {
        if (currentSoundValue < maxSoundValue) {
            currentSoundValue = currentSoundValue + 1;
        } else {
            currentSoundValue = maxSoundValue;
        }
        return currentSoundValue;
    }

    public int minus() {
        if (currentSoundValue > minSoundValue) {
            currentSoundValue = currentSoundValue - 1;
        } else{
            currentSoundValue = minSoundValue;
        }
        return currentSoundValue;
    }
}
