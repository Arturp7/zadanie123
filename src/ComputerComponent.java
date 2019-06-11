abstract public class ComputerComponent {
    private String name;
    private String producer;
    private String serialNumber;
    private int clock;
    private int nominalTemperature;
    private int maxTemperture;

    public ComputerComponent() {

    }

    public ComputerComponent(String name, String producer, String serialNumber) {
        this.name = name;
        this.producer = producer;
        this.serialNumber = serialNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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


