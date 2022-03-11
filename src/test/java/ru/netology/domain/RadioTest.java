package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNewCurrentChannel0() {
        Radio service = new Radio();
        service.setCurrentChannel(0);

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetNewCurrentChannelMinus9is0() {
        Radio service = new Radio();
        service.setCurrentChannel(-9);

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetNewCurrentChannelCount101to100() {
        Radio service = new Radio(101);
        service.setCurrentChannel(100);

        assertEquals(100, service.getCurrentChannel());
    }

    @Test
    public void shouldSetNewCurrentChannelCount101from101to0() {
        Radio service = new Radio(101);
        service.setCurrentChannel(101);

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetToFirstChannel() {
        Radio service = new Radio();
        service.firstChannel();

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetToLastChannel() {
        Radio service = new Radio();
        service.lastChannel();

        assertEquals(9, service.getCurrentChannel());
    }

    @Test
    public void shouldSetToLastChannelCount100() {
        Radio service = new Radio(100);
        service.lastChannel();

        assertEquals(99, service.getCurrentChannel());
    }

    @Test
    public void shouldSetNextChannel9to0() {
        Radio service = new Radio();
        service.setCurrentChannel(9);
        service.nextChannel();

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetNextChannel8to9() {
        Radio service = new Radio();
        service.setCurrentChannel(8);
        service.nextChannel();

        assertEquals(9, service.getCurrentChannel());
    }


    @Test
    public void shouldSetNextChannel0to1() {
        Radio service = new Radio();
        service.setCurrentChannel(0);
        service.nextChannel();

        assertEquals(1, service.getCurrentChannel());
    }

    @Test
    public void shouldSetNextChannel99to0() {
        Radio service = new Radio(100);
        service.setCurrentChannel(99);
        service.nextChannel();

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannel0to9() {
        Radio service = new Radio();
        service.setCurrentChannel(0);
        service.prevChannel();

        assertEquals(9, service.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannel9to8() {
        Radio service = new Radio();
        service.setCurrentChannel(9);
        service.prevChannel();

        assertEquals(8, service.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannel1to0() {
        Radio service = new Radio();
        service.setCurrentChannel(1);
        service.prevChannel();

        assertEquals(0, service.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannel0to49() {
        Radio service = new Radio(50);
        service.setCurrentChannel(0);
        service.prevChannel();

        assertEquals(49, service.getCurrentChannel());
    }

    @Test
    public void shouldSetPrevChannelMinus9to9() {
        Radio service = new Radio();
        service.setCurrentChannel(-9);
        service.prevChannel();

        assertEquals(9, service.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentVolume100() {
        Radio service = new Radio();
        service.setCurrentVolume(100);

        assertEquals(100, service.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume0() {
        Radio service = new Radio();
        service.setCurrentVolume(0);

        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume10() {
        Radio service = new Radio();
        service.setCurrentVolume(10);

        assertEquals(10, service.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume101to0() {
        Radio service = new Radio();
        service.setCurrentVolume(101);

        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolumeMinus999to0() {
        Radio service = new Radio();
        service.setCurrentVolume(-999);

        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    public void shouldSetMinVolume() {
        Radio service = new Radio();
        service.minVolume();

        assertEquals(0, service.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio service = new Radio();
        service.maxVolume();

        assertEquals(100, service.getCurrentVolume());
    }


    @Test
    public void shouldIncreaseVolume100to100() {
        Radio service = new Radio();
        service.setCurrentVolume(100);
        service.increaseVolume();

        assertEquals(100, service.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume0to1() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.increaseVolume();

        assertEquals(1, service.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume100to99() {
        Radio service = new Radio();
        service.setCurrentVolume(100);
        service.reduceVolume();

        assertEquals(99, service.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume0to0() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.reduceVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

}