

public class Processor extends HeatedComponents {




    public Processor(String name, String producer, String serialNumber, int clock, int nominalTemperature, int maxTemperture) {
        super(name, producer, serialNumber, clock, nominalTemperature, maxTemperture);
    }


    @Override
    public void boost( ) {
       if(getNominalTemperature()<getMaxTemperture()) {
           setClock(getClock() + BOOSTSTEP);
           setNominalTemperature(getNominalTemperature() + 10);
           System.out.println(getClock()+" "+ getNominalTemperature());

       } else {
           System.out.println("Procesor overheated");
           setNominalTemperature(getNominalTemperature() - 10);

       }


    }
}

