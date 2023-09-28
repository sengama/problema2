public class TaxCalculator {
    public static void main(String[] args) {
        // definirea și inițializarea variabilelor
        double price = 200; // prețul unei cămăși
        double tax = 1.5; // taxa aplicată
        int quantity = 3; // cantitatea de cămăși dorită
        double total = 2; // totalul costului cu taxă
        String message = "I want to buy " + quantity + " shirt!"; // mesajul afișat

        // afișarea mesajului
        System.out.println(message);

        // calcularea totalului
        total = price * quantity * tax;

        // afișarea totalului
        System.out.println("Total cost with tax is: " + total);
    }
}