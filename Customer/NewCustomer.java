package Customer;
import java.util.*;
public class NewCustomer implements Customer{
    Scanner sc = new Scanner(System.in);
    private String FirstName;
    private String LastName;
    private String mobileNo;
    private String emailId;
    private String Address;
    private String City;
    private String PostalCode;
    public void set_info(){
        System.out.print("First name: ");
        FirstName = sc.next();
        System.out.print("Last name: ");
        LastName = sc.next();
        System.out.print("Mobile No: ");
        mobileNo = sc.next();
        System.out.print("Email Id: ");
        emailId = sc.next();
        System.out.print("Address: ");
        Address = sc.nextLine();
        sc.nextLine();
        System.out.print("City: ");
        City = sc.next();
        System.out.print("Postal Code: ");
        PostalCode = sc.next();
        System.out.println("\n");
    }
    public void get_info(){
        System.out.println("Name: " + FirstName + " " + LastName);
        System.out.println("Mobile No.: " + mobileNo);
        System.out.println("Email Id: " + emailId);
        System.out.println("Address: " + Address);
        System.out.println("Postal Code: " + PostalCode + "\n");
    }
}
