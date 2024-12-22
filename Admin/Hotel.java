package Admin;
import java.io.*;
public abstract class Hotel {
    public int room_count = 1;
    int count_available;
    int room_no[] = new int[1000];
    String room_type[] = new String[1000];
    float room_no_price[] = new float[1000];
    int total_revenue_generated = 0;
    int rooms_occupied[] = new int[1000];

    public void add_room(String room_type_given) {
        room_no[room_count] = room_count;
        room_type[room_count] = room_type_given;

        if (room_type_given.equals("Suite")) {
            room_no_price[room_count] = 12000;
        } else if (room_type_given.equals("Club_Grande")) {
            room_no_price[room_count] = 6400;
        } else {
            room_no_price[room_count] = 4100;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("rooms.txt", true))) {
            writer.write(room_count + "," + room_type_given + "," + room_no_price[room_count] + "\n");
        } catch (IOException e) {
            System.out.println("Data Saved");
        }

        room_count += 1;
    }

    public void display(int room_number) {
        System.out.println();
        System.out.println("Room number :" + room_number);
        System.out.println("Price of Room :" + room_no_price[room_number]);
        System.out.println("Type of Room :" + room_type[room_number]);
    }
    void type()
    {
        System.out.println("You are in Room Management Section");
    }

    abstract void update_room_details(String room_type, float price, int room_number);

    abstract void view_room_details(int room_number);
}
