public class Main {
    public static void main(String[] args) {
        Department department1 = new Department("D1");
        Department department2 = new Department("D2");
        Department department3 = new Department("D3");

        Employee employee1 = new Employee("e1", 1);
        Employee employee2 = new Employee("e2", 2);
        Employee employee3 = new Employee("e3", 3);
        Employee employee4 = new Employee("e4", 4);

        department1.addChildren(employee1);
        department1.addChildren(employee2);
        department1.addChildren(department2);
        department2.addChildren(employee3);
        department3.addChildren(employee4);

        Organization organization = new Organization("No Name");
        organization.addChildren(department1);
        organization.addChildren(department2);
        organization.addChildren(department3);
        organization.addChildren(employee1);
        organization.addChildren(employee2);
        organization.addChildren(employee3);
        organization.addChildren(employee4);

        organization.printXML();
        organization.printTotalSalary();
    }
}
