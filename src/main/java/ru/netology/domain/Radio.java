package ru.netology.domain;

public class Radio {
    private int currentChannel;
    private final int minChannel = 0;
    private int channelCount = 10;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    public Radio(int channelCount) {
        this.channelCount = channelCount;
    }

    public Radio() {
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > channelCount - 1) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public void firstChannel() {
        currentChannel = minChannel;
    }

    public void lastChannel() {
        currentChannel = channelCount - 1;
    }

    public void nextChannel() {
        if (currentChannel < channelCount - 1) {
            currentChannel = currentChannel + 1;
        }
        else {
            this.currentChannel = minChannel;
        }
    }

    public void prevChannel() {
        if (currentChannel > minChannel) {
            currentChannel = currentChannel - 1;
        }
        else {
            this.currentChannel = channelCount - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void minVolume() {
        currentVolume = minVolume;
    }

    public void maxVolume() {
        currentVolume = maxVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

}