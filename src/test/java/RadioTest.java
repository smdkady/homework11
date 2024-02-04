import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeHigher() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolumeLower() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeHigher() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.decreaseVolume();

        int expected = 99;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeLower() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;

        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation() {
        Radio radio = new Radio();

        radio.setStationNumber(9);

        int expected = 9;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationHigher() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStationLower() {
        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNext() {
        Radio radio = new Radio();

        radio.setStationNumber(8);
        radio.next();

        int expected = 9;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextHigher() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.next();

        int expected = 0;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrev() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.prev();

        int expected = 8;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevLower() {
        Radio radio = new Radio();

        radio.setStationNumber(0);
        radio.prev();

        int expected = 9;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testLastStation() {
        Radio radio = new Radio(30);

        radio.setStationNumber(29);

        int expected = 29;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOldCode() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;

        int actual = radio.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }


}