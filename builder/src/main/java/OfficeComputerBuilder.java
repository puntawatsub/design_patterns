public class OfficeComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel Core Ultra 5");
    }

    @Override
    public void buildRAM() {
        computer.setRam(16);
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("WD Black SN850X 1TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicCard("Nvidia RTX 5070");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Pro");
    }

    public Computer getComputer() {
        return computer;
    }
}
