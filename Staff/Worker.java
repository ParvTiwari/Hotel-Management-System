package Staff;
import java.util.*;
public class Worker implements Staff{
    private String name;
    private int age;
    private String jobTitle;
    private Timing timing;

    public Worker() {
        this.timing = new Timing();
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Worker's Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Worker's Age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Worker's Job Title: ");
        this.jobTitle = sc.nextLine();
        timing.inputTiming();
    }

    public void showDetails() {
        System.out.println("Worker Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Job Title: " + jobTitle);
        timing.showTiming();
    }

    public String toFileFormat() {
        return "Worker," + name + "," + age + "," + jobTitle + "," + timing.toFileFormat();
    }

    public void fromFileFormat(String line) {
        String[] parts = line.split(",");
        this.name = parts[1];
        this.age = Integer.parseInt(parts[2]);
        this.jobTitle = parts[3];
        this.timing.fromFileFormat(parts[4] + "," + parts[5]);
    }
}
