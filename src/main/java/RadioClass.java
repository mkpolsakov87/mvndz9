public class RadioClass {
    private int currentStation;
    private int soundVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation <= 9) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
    }

    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setSoundVolume(int newVolume) {
        if (newVolume >= 0) {
            if (newVolume <= 100) {
                soundVolume = newVolume;
            }
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void increaseVolume() {
        if (soundVolume < 100) {
            soundVolume++;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > 0) {
            soundVolume--;
        }
    }
}
