public class Radio {
    private int stationNumber;
    private int currentVolume;
    private int lastStation;

    public Radio() {
        this.lastStation = 9;
    }

    public Radio(int stationAmount) {
        this.lastStation = stationAmount - 1;

    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > lastStation) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public void next() {
        if (stationNumber < lastStation) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = lastStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }


        this.currentVolume = currentVolume;

    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
