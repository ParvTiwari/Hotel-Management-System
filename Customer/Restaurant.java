package Customer;

public class Restaurant {
    private double Total;
    public Restaurant(){
        System.out.println("Crafted to nourish the body, mind, and palate, our dynamic restaurants and nightlife venues spotlight the freshest seasonal ingredients, sustainably sourced from local farmers, ranchers, and fishers" + "\n" + "as well as our own on-site organic gardens and apiaries. Every bite tells a story of nature as nourishment, serving as a gentle reminder of our cherished responsibility to honor nature in return." + "\n");
    }
    public void Menu(){
        System.out.println("Salad" + "\n" +
                "1. Green Salad" + "\t" + "Rs. 110" + "\n" +
                "2. Tossed Salad" + "\t" + "Rs. 150" + "\n" +
                "3. Sprouted Salad" + "\t" + "Rs. 150" + "\n" +
                "4. Caesar Salad(Veg/Non-veg)" + "\t" + "Rs. 275/375");
        System.out.print("Select your choice: ");
    }
    // public void Bill(){
    //     double tax = rate*0.23;
    //     System.out.println("Invoice");
    //     System.out.println(s + "\t" + rate);
    //     System.out.println("Taxes" + "\t" + tax);
    //     Total = rate + tax;
    //     System.out.println("Total = " + Total);
    // }
}
