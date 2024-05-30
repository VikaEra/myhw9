package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    
    
    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
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

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
        currentStation = 0;
    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
            return;
        }
        currentVolume = 0;
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
            return;
        }
        currentVolume = 0;

    }
}

