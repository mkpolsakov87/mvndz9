public class RadioClass {
    private int currentStation;
    private int soundVolume;
    private int radioStations = 10;

    public RadioClass(int radioStations) {
        this.radioStations = radioStations;
    }

    public RadioClass() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < radioStations) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
    }

    public void next() {
        if (currentStation == radioStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = radioStations - 1;
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
