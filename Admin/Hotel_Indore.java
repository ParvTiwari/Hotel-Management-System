package Admin;
import java.io.*;
public class Hotel_Indore extends Hotel {
    int staff_count = 1;
    int total_staff_expense = 0;
    String Staffname[] = new String[50];
    String Position[] = new String[50];

    public void update_room_details(String room_typeis, float price, int room_number) {
        type();
        room_type[room_number] = room_typeis;
        room_no_price[room_number] = price;
        update_room_file(room_number, room_typeis, price);
    }

    public void update_room_details(String room_typeis, int room_number) {
        room_type[room_number] = room_typeis;

        if (room_typeis.equals("Suite")) {
            room_no_price[room_number] = 12000;
        } else if (room_typeis.equals("Club_Grande")) {
            room_no_price[room_number] = 6400;
        } else {
            room_no_price[room_number] = 4100;
        }

        update_room_file(room_number, room_typeis, room_no_price[room_number]);
    }

    public void view_room_details(int room_number) {
        System.out.println("Details of room number: " + room_number);
        System.out.println("Type: " + room_type[room_number]);
        System.out.println("Price:" + room_no_price[room_number]);
    }

    private void update_room_file(int room_number, String room_type, float price) {
        File inputFile = new File("rooms.txt");
        File tempFile = new File("rooms_temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int currentRoomNumber = Integer.parseInt(data[0]);

                if (currentRoomNumber == room_number) {
                    writer.write(room_number + "," + room_type + "," + price);
                } else {

                    writer.write(line);
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Work Done");
        }


        // if (tempFile.renameTo(inputFile)) {
        //     System.out.println("Room details updated successfully!");
        // } else {
        //     System.out.println("Error occurred while saving the updated room details.");
        // }
    }
}