abstract public class HeatedComponents extends ComputerComponent implements Boost{
    private int clock;
    private int nominalTemperature;
    private int maxTemperture;

    public HeatedComponents() {

    }

    public HeatedComponents(String name, String producer, String serialNumber, int clock, int nominalTemperature, int maxTemperture) {
        super(name, producer, serialNumber);
        this.clock = clock;
        this.nominalTemperature = nominalTemperature;
        this.maxTemperture = maxTemperture;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public int getNominalTemperature() {
        return nominalTemperature;
    }

    public void setNominalTemperature(int nominalTemperature) {
        this.nominalTemperature = nominalTemperature;
    }

    public int getMaxTemperture() {
        return maxTemperture;
    }

    public void setMaxTemperture(int maxTemperture) {
        this.maxTemperture = maxTemperture;
    }


}
