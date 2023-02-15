public class Radio {
    protected int currentRadioStation;
    protected int currentRadioStationMax;
    protected int currentRadioVolume;

    protected int currentRadioVolumeMax = 100;
    protected int currentRadioVolumeMin = 0;

    public Radio() {
        this.currentRadioStationMax = 9;
    }

    public Radio(int current) {
        this.currentRadioStationMax = current - 1;
    }


    public void next() {
        if (currentRadioStation < currentRadioStationMax) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = currentRadioStationMax;
        }
    }

    public void increaseVolume() {
        if (currentRadioVolume < currentRadioVolumeMax) {
            currentRadioVolume++;
        } else {
            currentRadioVolume = currentRadioVolume;
        }
    }

    public void reductionVolume() {
        if (currentRadioVolume > currentRadioVolumeMin) {
            currentRadioVolume--;
        } else {
            currentRadioVolume = currentRadioVolume;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > currentRadioStationMax) {
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < currentRadioVolumeMin) {
            return;
        }
        if (newCurrentRadioVolume > currentRadioVolumeMax) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

}

