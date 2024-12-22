import Admin.*;
import Customer.*;
import Staff.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================================================================================================================================================================");
        System.out.println("*                                                                                                                                                                                                 *");
        System.out.println("*                                                                                   WELCOME to Hotel Fortune                                                                                      *");
        System.out.println("*                                                                                                                                                                                                 *");
        System.out.println("===================================================================================================================================================================================================");
        System.out.println("===================================================================================================================================================================================================");
        System.out.println("*                                                                                                                                                                                                 *");
        System.out.println("*     1. Customer                                                                                                                                                                                 *");
        System.out.println("*     2. Admin                                                                                                                                                                                    *");
        System.out.println("*     3. Staff                                                                                                                                                                                    *");
        System.out.println("*                                                                                                                                                                                                 *");
        System.out.println("===================================================================================================================================================================================================");

        int car = sc.nextInt();
        while(true){
            switch(car){
                case 1:
                    ArrayList<Customer> cus =new ArrayList<>();
                    Customer newMember = null;
                    Home index = new Home();
                    index.Homepage();
                    System.out.print("Enter your choice: ");
                    int n = sc.nextInt();
                    System.out.println("\n");
                    switch (n){
                        case 1:
                            newMember = new NewCustomer();
                            newMember.set_info();
                            cus.add(newMember);
                            newMember.get_info();
                            index.Amenities();
                            index.HotelInfo();
                            // main(args);
                            break;
                        case 2:
                            HotelC Indore = new HotelC();
                            Indore.Amenities();
                            Indore.HotelInfo();
                            Indore.setRooms();
                            System.out.println("===================================================================================================================================================================================================");
                            System.out.println("*                                                                                                                                                                                                 *");
                            System.out.println("*                   1. Book Room                                                 2. Check-out                                                       3. Display Available Rooms                    *");
                            System.out.println("*                                                                                                                                                                                                 *");
                            System.out.println("===================================================================================================================================================================================================");
                            System.out.print("\n" + "Enter your choice: ");
                            int roomCheck = sc.nextInt();
                            System.out.println();
                            switch(roomCheck){
                                case 1:
                                    Indore.Tariff();
                                    int roomType = sc.nextInt();
                                    System.out.println("\n");
                                    // Indore.BookRoom(n);
                                    switch(roomType){
                                        case 1:
                                            Indore.Bill("Deluxe Room", 4100);
                                            break;
                                        case 2:
                                            Indore.Bill("Executive Deluxe Room", 6400);
                                            break;
                                        case 3:
                                            Indore.Bill("Presidential Suite Room", 12000);
                                            break;
                                        default:
                                            System.out.println("Invalid Input");
                                            // main(args);
                                            break;
                                    }
                                    System.out.println("Enter Your Information: " + "\n");
                                    newMember = new NewCustomer();
                                    newMember.set_info();
                                    cus.add(newMember);
                                    newMember.get_info();
                                    Indore.BookRoom(n);
                                    System.out.println("Room Successfully Booked" + "\n");
                                    break;
                                case 2:
                                    System.out.print("Enter your room number: ");
                                    int roomNo = sc.nextInt();
                                    Indore.checkOut(roomNo);
                                    break;
                                default:
                                    Indore.displayAvailableRoom();
                                    break;
                            }
                            break;
                        case 3:
                            Restaurant res = new Restaurant();
                            res.Menu();
                            int ch = sc.nextInt();
                            break;
                        case 4:
                            Banquet hall = new Banquet();
                            // main(args);
                            break;
                        case 5:
                            Deals d = new Deals();
                            d.RoomDeals();
                            d.Dining();
                            // main(args);
                            break;
                        case 6:
                            System.out.println("Get answers to your questions or give feedback, however you like to get in touch and wherever you are in the world. Choose from email or phone we'll help you direct your inquiries to the right " + "\n" +
                                    "place, quickly and easily. For hotel reservations, call 92851 21000.");
                            System.out.println("Location: 111, Vijay Nagar, Indore, Madhya Pradesh 452001" + "\n\n" + "Email: parvtiwari@fortune.com" + "\n\n" + "Inn Keeper's Cell: 89894 77720");
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid Input");
                            // main(args);
                            break;
                    }
                    break;
                case 2:
                    Hotel_Indore h = new Hotel_Indore();
                    Hotel_Indore_Staff his = new Hotel_Indore_Staff();
                    System.out.println("**********************************************************");
                    System.out.println("*               WELCOME TO THE DASHBOARD                 *");
                    System.out.println("**********************************************************");
                    System.out.println("*     1.) Room Management                                *");
                    System.out.println("*     2.) Staff Management                               *");
                    System.out.println("*     3.) Finance Management                             *");
                    System.out.println("*     4.) Live Status Section                            *");
                    System.out.println("*     5.) Customer Information                           *");
                    System.out.println("*     6.) Exit                                           *");
                    System.out.println("**********************************************************");

                    int chosenOption = sc.nextInt();
                    switch (chosenOption) {
                        case 1: {
                            System.out.println("\nWelcome to Room Management Section");
                            System.out.println("1.) Add Room");
                            System.out.println("2.) Update Room Details");
                            System.out.println("3.) View Room Information");
                            int roomOption = sc.nextInt();

                            switch (roomOption) {
                                case 1: {
                                    System.out.print("\nEnter your Room Type(Suite,Club_Grande,Other):\n");
                                    String roomType = sc.next();
                                    h.add_room(roomType);
                                    System.out.println("Added Room Successfully");
                                    h.display(h.room_count - 1);
                                    break;
                                }
                                case 2: {
                                    System.out.print("\nEnter the Room Number to update:\n");
                                    int roomNumber =0;
                                    try{roomNumber = sc.nextInt();}
                                    catch(InputMismatchException ie)
                                    {
                                        System.out.println("Entered Invalid Input.Enter Again");
                                    }
                                    System.out.println("\nWant to update price or without price:\n1.)With Price\n2.)Without Price");
                                    int choice = sc.nextInt();
                                    if (choice == 1) {
                                        System.out.println("Enter New Room Type");
                                        String new_room_type = sc.next();
                                        System.out.println("Enter New Room Price");
                                        float price = sc.nextFloat();
                                        h.update_room_details(new_room_type, price, roomNumber);
                                    } else {
                                        System.out.println("Enter New Room Type");
                                        String new_room_type = sc.next();
                                        h.update_room_details(new_room_type, roomNumber);
                                    }
                                    h.display(roomNumber);
                                    System.out.println("Room details updated successfully");
                                    break;
                                }
                                case 3: {
                                    System.out.println("Enter Room Number to view details:");
                                    int roomNumber = sc.nextInt();
                                    h.view_room_details(roomNumber);
                                    break;
                                }
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("\nWelcome to Staff Management Section");
                            System.out.println("1.) Add Staff");
                            System.out.println("2.) Update Staff Details");
                            System.out.println("3.) Remove Staff");
                            int staffOption = sc.nextInt();

                            switch (staffOption) {
                                case 1: {
                                    System.out.print("\nEnter Staff Name:\n");
                                    String name = sc.next();
                                    System.out.print("\nEnter Staff Position:\n");
                                    String position = sc.next();
                                    his.add_staff(name, position);
                                    System.out.println("Added Staff Successfully");
                                    break;
                                }
                                case 2: {
                                    System.out.print("\nEnter the Staff Name to update:\n");
                                    String name = sc.next();
                                    System.out.print("\nEnter new position for the staff:\n");
                                    String newPost = sc.next();
                                    his.update_staff_details(name, newPost);
                                    System.out.println("Staff details updated successfully");
                                    break;
                                }
                                case 3: {
                                    System.out.print("\nEnter the Staff Name to remove:\n");
                                    String name = sc.next();
                                    his.delete_staff(name);
                                    System.out.println("Staff removed successfully");
                                    break;
                                }
                            }
                            break;
                        }
                        case 3:
                        {

                        }
                        case 6: {
                            System.out.println("Thank You For Using Service");
                            sc.close();
                            return;
                        }
                        default:
                            System.out.println("Invalid option.");
                    }
                case 3:
                    ArrayList<Staff> arr = new ArrayList<>();
                    System.out.print("Enter filename for staff records: ");
                    String filename = sc.nextLine();
//                    loadStaffFromFile(arr, filename);
                    System.out.println("Enter Staff Type (1-Manager, 2-Receptionist, 3-Chef, 4-Worker, 5-Show All, 6-Exit ): ");
                    int choice = sc.nextInt();
                    sc.nextLine();

                    if (choice == 6) break;

                    Staff staffMember = null;
                    switch (choice) {
                        case 1:
                            staffMember = new Manager();
                            break;
                        case 2:
                            staffMember = new Receptionist();
                            break;
                        case 3:
                            staffMember = new Chef();
                            break;
                        case 4:
                            staffMember = new Worker();
                            break;
                        case 5:
                            System.out.println("\n   Staff Details   :");
                            for (Staff staff : arr) {
                                staff.showDetails();
                                System.out.println("-------------------------");
                            }
                            continue;
                        default:
                            System.out.println("Invalid choice");
                            continue;
                    }
                    staffMember.inputDetails();
                    arr.add(staffMember);
//                    saveStaffToFile(arr, filename);
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}