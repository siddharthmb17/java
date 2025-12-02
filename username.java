import java.util.Scanner;

public class username{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read username
            System.out.print("Enter your username: ");
            String username = sc.nextLine();

            // Extract first three characters
            String firstThree = username.substring(0, 3);

            // Convert to integer
            int number = Integer.parseInt(firstThree);

            System.out.println("Converted number: " + number);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Username must contain at least 3 characters.");
        } catch (NumberFormatException e) {
            System.out.println("Error: The first three characters are not valid digits.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred!");
        }

        sc.close();
    }
}