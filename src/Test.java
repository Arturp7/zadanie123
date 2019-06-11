public class Test {
    public static void main(String[] args) {
        Processor proc1 = new Processor("I7", "Intel", "123456", 2800, 50, 100);
        Memory mem1 = new Memory("Quantum", "Wilk Electronics", "9876543", 2800, 50, 100);
        HDD hdd1 = new HDD("Flash", "Seagate", "56789", 128);

        proc1.boost();

        proc1.boost();
        proc1.boost();
        proc1.boost();
        proc1.boost();
        proc1.boost();

        mem1.boost();
        mem1.boost();
        mem1.boost();
        mem1.boost();
        mem1.boost();
        mem1.boost();




    }
}
