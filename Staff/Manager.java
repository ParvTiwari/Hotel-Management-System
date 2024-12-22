package Staff;
import java.util.*;
public class Manager implements Staff{
    private String name;
    private int age;
    private String department;
    private Timing timing;

    public Manager() {
        this.timing = new Timing();
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager's Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Manager's Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Manager's Department: ");
        this.department = sc.nextLine();
        timing.inputTiming();
    }

    public void showDetails() {
        System.out.println("Manager Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        timing.showTiming();
    }

    public String toFileFormat() {
        return "Manager," + name + "," + age + "," + department + "," + timing.toFileFormat();
    }

    public void fromFileFormat(String line) {
        String[] parts = line.split(",");
        this.name = parts[1];
        this.age = Integer.parseInt(parts[2]);
        this.department = parts[3];
        this.timing.fromFileFormat(parts[4] + "," + parts[5]);
    }
}
