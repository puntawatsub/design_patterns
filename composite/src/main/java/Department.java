import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> children;

    public Department(String name) {
        super(name);
        this.children = new ArrayList<>();
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

    @Override
    public String getXML(String indent) {
        String i = indent + "\t\t";
        String result = indent + "<department>\n" + indent + "\t<name>" + getName() + "</name>\n" + indent + "\t<children>\n";
        for (var component : children) {
            result = result.concat(component.getXML(i));
        }
        return result + indent + "\t</children>\n" + indent + "</department>\n";
    }
}
