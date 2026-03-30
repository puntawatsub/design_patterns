public class Main {
    public static void main(String[] args) {
        GamingComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gamingComputerBuilder);
        director.constructComputer();
        System.out.println(gamingComputerBuilder.getComputer());

        OfficeComputerBuilder officeComputerBuilder = new OfficeComputerBuilder();
        director = new ComputerDirector(officeComputerBuilder);
        director.constructComputer();
        System.out.println(officeComputerBuilder.getComputer());
    }
}
