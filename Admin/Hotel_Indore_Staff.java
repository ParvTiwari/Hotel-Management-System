package Admin;
import java.io.*;
public class Hotel_Indore_Staff extends Hotel_Indore{
    void type()
    {
        System.out.println("You are in Staff Management Section");
    }
    private int Position_Salary(String position) {
        switch (position) {
            case "Manager":
                return 50000;
            case "Receptionist":
                return 30000;
            default:
                return 20000;
        }
    }

    public void add_staff(String name, String position) {
        type();
        if (staff_count >= 50) {
            System.out.println("Staff limit reached");
            return;
        } else {
            Staffname[staff_count] = name;
            Position[staff_count] = position;
            total_staff_expense += Position_Salary(position);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("staff.txt", true))) {
                writer.write(staff_count + "," + name + "," + position + "," + Position_Salary(position) + "\n");
            } catch (IOException e) {

            }

            staff_count += 1;
        }
    }

    public void update_staff_details(String name, String new_post) {
        for (int i = 0; i < 50; i++) {
            if (name.equals(Staffname[i])) {
                total_staff_expense -= Position_Salary(Position[i]);
                Position[i] = new_post;
                total_staff_expense += Position_Salary(Position[i]);

                update_staff_file(i + 1, Staffname[i], new_post);
                break;
            }
        }
    }

    public void delete_staff(String name) {
        for (int i = 0; i < staff_count; i++) {
            if (name.equals(Staffname[i])) {
                total_staff_expense -= Position_Salary(Position[i]);
                for (int j = i; j < staff_count - 1; j++) {
                    Staffname[j] = Staffname[j + 1];
                    Position[j] = Position[j + 1];
                }
                staff_count--;
                update_staff_file_on_delete();
                break;
            }
        }
    }

    private void update_staff_file(int staff_no, String name, String position) {
        File inputFile = new File("staff.txt");
        File tempFile = new File("staff_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int currentStaffNo = Integer.parseInt(data[0]);

                if (currentStaffNo == staff_no) {
                    writer.write(staff_no + "," + name + "," + position + "," + Position_Salary(position));
                } else {
                    writer.write(line);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Work accomplished");
        }
    }


    private void update_staff_file_on_delete() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("staff.txt"))) {
            for (int i = 1; i < staff_count; i++) {
                writer.write(i + "," + Staffname[i] + "," + Position[i] + "," + Position_Salary(Position[i]) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
