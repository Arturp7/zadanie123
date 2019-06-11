public class HDD extends ComputerComponent {
    int volume ;

    public HDD(String name, String producer, String serialNumber,int volume) {
        super(name, producer, serialNumber );
        this.volume = volume;
    }
}
