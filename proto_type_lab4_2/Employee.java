package proto_type_lab4_2;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 984938 on 4/29/2016.
 */
public class Employee implements Cloneable, Serializable {
    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    public Employee supervisor;
    public Employee staff[];
    @Override
    public String toString() {
        String staff = "";
        if (this.staff != null) {
            for (Employee e: this.staff) {
                staff += e.id + ", ";
            }
        }

        return " [ id:(" + this.id + ") supervisor:(" + supervisor + ") staff:("+ staff + ") (hash:"+ this.hashCode() + ") ] ";
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state, String zipcode) {
        this.id = id;
        Lastname = lastname;
        Firstname = firstname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    @Override
    protected Employee clone() {
        Employee dummy = new Employee(-1);
        dummy.supervisor = this;

        //find root node
        Employee ceo = this;
        while (ceo.supervisor != null) {
            ceo = ceo.supervisor;
        }
        copy(ceo);

        return mapping.get(dummy.supervisor);
    }

    //cache node mapping relation
    private Map<Employee, Employee> mapping = new HashMap<>();
    private Employee getFromCache(Employee employ) {
        if (employ == null) {
            return employ;
        }
        Employee newNode = null;
        if (mapping.containsKey(employ)) {
            newNode = mapping.get(employ);
        } else {
            newNode = new Employee(employ.id, employ.Lastname, employ.Firstname, employ.streetAddress, employ.city, employ.state, employ.zipcode);
            //update node into cache
            mapping.put(employ, newNode);
        }
        return newNode;
    }
    private Employee copy(Employee employ) {
        //base condition
        if (null == employ) {
            return null;
        }

        //node first,
        Employee newNode = getFromCache(employ);

        //relation later
        newNode.setSupervisor(getFromCache(employ.supervisor));
        newNode.setStaff(copyArray(employ.staff));
        return newNode;
    }
    private Employee[] copyArray(Employee[] employs) {
        if (null == employs) {
            return employs;
        }

        Employee[] newList = new Employee[employs.length];
        for (int i = 0; i < employs.length; i++) {
            Employee employ = employs[i];
            newList[i] = copy(employ);
        }

        return newList;
    }
}
