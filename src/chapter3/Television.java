package chapter3;

public class Television {

    private String tvName;
    private int tvVolume;
    private String tvPowerButton;
    private int tvStations;

    public Television(String tvName, int tvVolume, String tvPowerButton, int tvStations) {
        this.tvName = tvName;
        this.tvVolume = tvVolume;
        this.tvPowerButton = tvPowerButton;
        this.tvStations = tvStations;
    }

    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public int getTvVolume() {
        return tvVolume;
    }

    public void setTvVolume(int tvVolume) {
        this.tvVolume = tvVolume;
    }

    public String getTvPowerButton() {
        return tvPowerButton;
    }

    public void setTvPowerButton(String tvPowerButton) {
        this.tvPowerButton = tvPowerButton;
    }

    public int getTvStations() {
        return tvStations;
    }

    public void setTvStations(int tvStations) {
        this.tvStations = tvStations;
    }
}



