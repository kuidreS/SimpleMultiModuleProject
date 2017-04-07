
import entity.Employee;
import entity.Project;

/**
 * Created by vserdiuk on 4/7/17.
 */
public class Domain {

    public static void main(String[] args) {
        Project project = new Project();
        project.setId(1L);
        project.setTitle("NewProject");

        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("John");
        employee.setLastName("Doe");

        System.out.println("****************************************************");
        System.out.println("");
        System.out.println(project);
        System.out.println("");

        System.out.println("****************************************************");

        System.out.println("");
        System.out.println(employee);
        System.out.println("");
        System.out.println("****************************************************");
    }

}
