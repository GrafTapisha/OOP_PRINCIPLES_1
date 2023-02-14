public class Radio {
    protected int currentRadioStation;
    protected int currentRadioVolume;

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume++;
        } else {
            currentRadioVolume = currentRadioVolume;
        }
    }

    public void reductionVolume() {
        if (currentRadioVolume > 0) {
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
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (newCurrentRadioVolume < 0) {
            return;
        }
        if (newCurrentRadioVolume > 10) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }


}

