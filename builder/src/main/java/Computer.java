public class Computer {
    private String processor;
    private double ram;
    private String hardDrive;
    private String graphicCard;
    private String operatingSystem;

    public Computer(String processor, double ram, String hardDrive, String graphicCard, String operatingSystem) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
        this.operatingSystem = operatingSystem;
    }

    public Computer() {
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }
}
