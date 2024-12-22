package Customer;
import java.util.*;
import java.io.*;
public class HotelC extends Home{
    private double Total;
    private final int[] rooms = new int[45];
    public HotelC(){
        System.out.println("Unbutton yourself at our 45 air-conditioned Wi-Fi rooms crafted with the taste of elegance, comfort and tranquillity. Cease your busy lives with our mastered services and amenities like concierge," + "\n" + "exclusive pool, private Jacuzzis, independent shower cubicles with furnished cabinets fabricated for an overall enriching experience.");
        System.out.println("Whether you are here to explore the rich cultural heritage of Indore or to attend a business conference, Fortune Indore ensures a seamless and delightful stay with its world-class amenities and" + "\n" + "hospitable staff." + "\n");
    }
    public void Tariff(){
        System.out.println("1. Deluxe Room" + "\n" + "Step into a world of regal elegance at Fortune, where intricate latticework and rich textures define these luxury rooms. Adorned with peacock-themed accents, each space celebrates your presence with a " + "\n" + "touch of royalty. Modern amenities seamlessly blend with heritage charm, ensuring utmost comfort. Bask in mesmerising views of the city, staying digitally connected with a 50-inch flat TV and " + "\n" + "complimentary Wi-Fi for up to four devices. Indulge in the perfect fusion of old-world charm and contemporary luxury. " + "\n" + "Rate: Rs. 4100"+ "\n");

        System.out.println("2. Executive Deluxe Room" + "\n" + "Take your time off away from the city lights with the view of the lush lawns facing the pool, a perfect mix of tranquillity and leisure. Doze off your fatigue on the double size beds with amenities " + "\n" + "like mini fridge, tea-coffee maker, satellite TV, Digital safe. Spend quality time in our elegantly crafted cloakroom and Jacuzzi with all the free toiletries." + "\n" + "Rate: Rs. 6400"+ "\n");

        System.out.println("3. Presidential Suite Room" + "\n" + "The Suite rooms offer more than a glimpse of world class design. Spacious in its 560 Square feet, the suite showcases its signature style worked with humor and color. A large bathroom indulges with its" + "\n" + "Rain Shower. A sure extension of the other rooms, the Suites are decorated in contemporary style and elegance which is certainly reflected in the detailing and well-laid-out amenities. Each corner " + "\n" + "exudes opulence and refinement, offering a sanctuary of luxury. Modern amenities and seamless digital connectivity ensure a comfortable stay." + "\n" + "Rate: Rs. 12000"+ "\n");

        System.out.print("Select room type: ");
    }
    public void displayAvailableRoom(){
        int Deluxe = 0;
        int Executive_Deluxe = 0;
        int Presidential_Suite = 0;
        for(int i=0; i<45; i++){
            if((i>=0 && i<=19) && (rooms[i]==0)){
                Deluxe++;
            }
            else if((i>=20 && i<=39) && (rooms[i]==0)){
                Executive_Deluxe++;
            }
            else if((i>=40 && i<=44) && (rooms[i]==0)){
                Presidential_Suite++;
            }
        }
        System.out.println("Available Rooms:" + "\n");
        System.out.println("Deluxe Room: " + Deluxe);
        System.out.println("Executive Deluxe Room: " + Executive_Deluxe);
        System.out.println("Presidential Suite Room: " + Presidential_Suite);
    }
    public void checkOut(int n){
        rooms[n-1]=0;
        setRooms();
        System.out.println("Checkout Successful");
    }
    public void setRooms(){
        try{
            File myObj = new File("Room Occupancy.txt");
            Scanner myReader = new Scanner(myObj);
            int i=0;
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                rooms[i] = Integer.parseInt(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void BookRoom(int n){
        for(int i=0; i<45; i++){
            if((n==1) && (i>=0 && i<=19) && (rooms[i]!=1)){
                rooms[i]=1;
                break;
            }
            else if((n==2) && (i>=20 && i<=39) && (rooms[i]!=1)){
                rooms[i]=1;
                break;
            }
            else if((n==3) && (i>=40 && i<=44) && (rooms[i]!=1)){
                rooms[i]=1;
                break;
            }
        }
        try{
            FileWriter myWriter = new FileWriter("Room Occupancy.txt");
            for(int i=0; i<45; i++){
                myWriter.write(rooms[i] + "\n");
            }
            myWriter.close();
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void Bill(String s, int rate){
        double tax = rate*0.12;
        System.out.format("\n" + "Invoice" + "\n\n");
        System.out.format("%-10s %8s", s , "Rs." + rate + "\n");
        System.out.format("%-10s %8s", "Taxes" , "Rs. " + tax + "\n");
        Total = rate + tax;
        System.out.format("%-10s %8s", "Total" , "Rs. " + Total + "\n\n");
        // System.out.println(s + "\t\t Rs. " + rate);
        // System.out.println("Taxes" + "\t\t Rs. " + tax);
        // Total = rate + tax;
        // System.out.println("Total" + "\t\t Rs. " + Total);
    }
    static void clearRooms(){
        try{
            // File myObj = new File("Room Occupancy.txt");
            // if(myObj.createNewFile()) {
            //     System.out.println("File created: " + myObj.getName());
            // }
            // else{
            //     System.out.println("File already exists.");
            // }
            FileWriter myWriter = new FileWriter("Room Occupancy.txt");
            for(int i=0; i<45; i++){
                myWriter.write("0" + "\n");
            }
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
