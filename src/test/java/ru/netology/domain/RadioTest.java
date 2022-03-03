package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetNewCurrentChannel0() {
        Radio service = new Radio();
        service.setCurrentChannel(0);

        int expected = 0;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentChannel10is0() {
        Radio service = new Radio();
        service.setCurrentChannel(10);

        int expected = 0;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNewCurrentChannelMinus9is0() {
        Radio service = new Radio();
        service.setCurrentChannel(-9);

        int expected = 0;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToFirstChannel() {
        Radio service = new Radio();
        service.firstChannel();

        int expected = 0;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToLastChannel() {
        Radio service = new Radio();
        service.lastChannel();

        int expected = 9;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChannel9to0() {
        Radio service = new Radio();
        service.setCurrentChannel(9);
        service.nextChannel();

        int expected = 0;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextChannel0to1() {
        Radio service = new Radio();
        service.setCurrentChannel(0);
        service.nextChannel();

        int expected = 1;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannel0to9() {
        Radio service = new Radio();
        service.setCurrentChannel(0);
        service.prevChannel();

        int expected = 9;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannel9to8() {
        Radio service = new Radio();
        service.setCurrentChannel(9);
        service.prevChannel();

        int expected = 8;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannel1to0() {
        Radio service = new Radio();
        service.setCurrentChannel(1);
        service.prevChannel();

        int expected = 0;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannel5to4() {
        Radio service = new Radio();
        service.setCurrentChannel(5);
        service.prevChannel();

        int expected = 4;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevChannelMinus9to9() {
        Radio service = new Radio();
        service.setCurrentChannel(-9);
        service.prevChannel();

        int expected = 9;
        int actual = service.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume11to0() {
        Radio service = new Radio();
        service.setCurrentVolume(11);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolumeMinus9to0() {
        Radio service = new Radio();
        service.setCurrentVolume(-9);

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio service = new Radio();
        service.minVolume();

        int expected = 0;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio service = new Radio();
        service.maxVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume10to10() {
        Radio service = new Radio();
        service.setCurrentVolume(10);
        service.increaseVolume();

        int expected = 10;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume0to1() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.increaseVolume();

        int expected = 1;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume10to9() {
        Radio service = new Radio();
        service.setCurrentVolume(10);
        service.reduceVolume();

        int expected = 9;
        int actual = service.getCurrentVolume();

        assertEquals(expected, actual);
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