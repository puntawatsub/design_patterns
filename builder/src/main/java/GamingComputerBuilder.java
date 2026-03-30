public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;

    public GamingComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("AMD Ryzen 7 9800X3D");
    }

    @Override
    public void buildRAM() {
        computer.setRam(32);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("Samsung 990 Pro 4TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicCard("NVIDIA GeForce RTX 5090");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Pro");
    }

    public Computer getComputer() {
        return computer;
    }
}
