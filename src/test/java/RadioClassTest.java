import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioClassTest {

    @Test
    public void testsetCurrentStationNormal() {
        RadioClass radio = new RadioClass(17);

        radio.setCurrentStation(14);
        int actual = radio.getCurrentStation();
        int expected = 14;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testsetCurrentStationNormal2() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(7);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testsetCurrentStationMoreThenNine() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(7);
        radio.setCurrentStation(15);
        int actual = radio.getCurrentStation();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testsetCurrentStationLessThanZero() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(4);
        radio.setCurrentStation(-4);
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextNormal() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(4);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextZero() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextZero2() {
        RadioClass radio = new RadioClass(13);

        radio.setCurrentStation(12);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNormal() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(4);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNine() {
        RadioClass radio = new RadioClass();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevNine2() {
        RadioClass radio = new RadioClass(18);

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 17;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetIncreaseVolume() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(68);
        int actual = radio.getSoundVolume();
        int expected = 68;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetIncreaseVolumeBeyondLimit() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(68);
        radio.setSoundVolume(168);
        int actual = radio.getSoundVolume();
        int expected = 68;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetIncreaseVolumeBelowLimit() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(68);
        radio.setSoundVolume(-68);
        int actual = radio.getSoundVolume();
        int expected = 68;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume1() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(68);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 69;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolume2() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(100);
        radio.increaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume1() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(68);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 67;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolume2() {
        RadioClass radio = new RadioClass();


        radio.setSoundVolume(0);
        radio.decreaseVolume();
        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}