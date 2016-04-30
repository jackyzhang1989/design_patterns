package proto_type_lab4_2;

/**
 * Created by 984938 on 4/29/2016.
 */
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(1);
        Employee employee1 = new Employee(2);
        Employee employee2 = new Employee(3);
        Employee employee3 = new Employee(4);

//        employee1
//        |
//        employee
//          |        |
//        employee2  employee3
        employee.setSupervisor(employee1);
        employee1.setStaff(new Employee[]{employee});

        Employee[] staff = new Employee[]{employee2, employee3};
        employee.setStaff(staff);

        System.out.println("employee      = [" + employee + "]");
        System.out.println("employee clone= [" + employee.clone() + "]");

        System.out.println("employee1       = [" + employee1 + "]");
        System.out.println("employee1 clone = [" + employee1.clone() + "]");

        System.out.println("employee supervisor       = [" + employee.supervisor + "]");
        System.out.println("employee supervisor clone = [" + employee.supervisor.clone() + "]");
    }
}
