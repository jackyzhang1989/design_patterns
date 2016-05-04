package cor_pattern_lab7_1.recordInfo;

/**
 * Created by 984938 on 5/2/2016.
 */
public class Customer{
    private String firstName;
    private String lastName;
    private Address address;
    private String phone;
    private String email;
    @Override
    public String toString() {
//        System.out.println("customer = [" + customer + "]");
        return "firstName = [" + firstName + "]" +
                "lastName = [" + lastName + "]" +
                "address = [" + address + "]" +
                "phone = [" + phone + "]" +
                "email = [" + email + "]";
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}

