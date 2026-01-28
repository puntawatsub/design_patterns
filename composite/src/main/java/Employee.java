public class Employee extends OrganizationComponent {
    private int salary;

    public Employee(String name,int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getXML(String indent) {
        return indent + "<employee>\n" + indent +
                "\t<name>" + getName() + "</name>\n" + indent + "\t<salary>" + getSalary() + "</salary>\n" +
                indent + "</employee>\n";
    }
}
