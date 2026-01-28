import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private List<OrganizationComponent> children;

    public Organization(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationComponent[] getChildren() {
        return children.toArray(new OrganizationComponent[0]);
    }

    public boolean addChildren(OrganizationComponent o) {
        return children.add(o);
    }

    public boolean removeChildren(OrganizationComponent o) {
        return children.remove(o);
    }

    public void printXML() {
        System.out.println("<organization>");
        for (var component: children) {
            System.out.print(component.getXML("\t"));
        }
        System.out.println("</organization>");
    }

    public void printTotalSalary() {
        int salary = 0;
        for (var component: children) {
            if (component instanceof Employee) {
                salary += ((Employee) component).getSalary();
            }
        }
        System.out.printf("Salary: %d\n", salary);
    }
}
