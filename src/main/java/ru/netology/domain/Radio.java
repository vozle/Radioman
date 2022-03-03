package ru.netology.domain;

public class Radio {
    private int currentChannel;
    private int currentVolume;

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 9) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void firstChannel() {
        currentChannel = 0;
    }

    public void lastChannel() {
        currentChannel = 9;
    }

    public void nextChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel + 1;
        }
        if (currentChannel >= 9) {
            this.currentChannel = 0;
        }
    }

    public void prevChannel() {
        if (currentChannel < 9) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel == 9) {
            currentChannel = currentChannel - 1;
        }
        if (currentChannel < 0) {
            this.currentChannel = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void minVolume() {
        currentVolume = 0;
    }

    public void maxVolume() {
        currentVolume = 10;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}