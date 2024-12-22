package Staff;
import java.util.*;
public class Receptionist implements Staff{
    private String name;
    private int age;
    private Timing timing;

    public Receptionist() {
        this.timing = new Timing();
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Receptionist's Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Receptionist's Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        timing.inputTiming();
    }

    public void showDetails() {
        System.out.println("Receptionist Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        timing.showTiming();
    }

    public String toFileFormat() {
        return "Receptionist," + name + "," + age + "," + timing.toFileFormat();
    }

    public void fromFileFormat(String line) {
        String[] parts = line.split(",");
        this.name = parts[1];
        this.age = Integer.parseInt(parts[2]);
        this.timing.fromFileFormat(parts[3] + "," + parts[4]);
    }
}
