package Staff;
import java.util.*;
public class Timing {
    private String shift;
    private String hours;

    public void inputTiming() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Shift (Morning/Night): ");
        this.shift = sc.nextLine();
        System.out.print("Enter Working Hours: ");
        this.hours = sc.nextLine();
    }

    public void showTiming() {
        System.out.println("Shift: " + shift);
        System.out.println("Working Hours: " + hours);
    }

    public String toFileFormat() {
        return shift + "," + hours;
    }

    public void fromFileFormat(String line) {
        String[] parts = line.split(",");
        this.shift = parts[0];
        this.hours = parts[1];
    }
}
