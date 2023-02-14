import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentRadioStationInLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.next();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationUpLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setCurrentRadioStationZero() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationNine() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStationLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.prev();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeCurrentRadioVolumeLimit() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(6);
        volume.increaseVolume();

        int expected = 7;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeCurrentRadioVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(10);
        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseVolumeCurrentRadioVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(0);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setReductionVolumeCurrentRadioVolumeLimit() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(3);
        volume.reductionVolume();

        int expected = 2;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setReductionVolumeCurrentRadioVolumeMin() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(0);
        volume.reductionVolume();

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setReductionVolumeCurrentRadioVolumeMax() {
        Radio volume = new Radio();
        volume.setCurrentRadioVolume(10);
        volume.reductionVolume();

        int expected = 9;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationUpMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentRadioStationInLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStationMinus() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-5);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioVolumeInLimit() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(5);

        int expected = 5;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioVolumeMax() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(10);

        int expected = 10;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioVolumeMin() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(0);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioVolumeUpLimit() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(11);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioVolumeMinus() {
        Radio volume = new Radio();

        volume.setCurrentRadioVolume(-11);

        int expected = 0;
        int actual = volume.getCurrentRadioVolume();

        Assertions.assertEquals(expected, actual);
    }

}
