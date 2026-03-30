public class ComputerDirector {
    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructComputer() {
        computerBuilder.buildProcessor();
        computerBuilder.buildOperatingSystem();
        computerBuilder.buildRAM();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
    }
}
