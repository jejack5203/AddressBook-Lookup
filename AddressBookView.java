import java.util.List;
import java.util.Scanner;

// View class for displaying and interacting with the user
public class AddressBookView {
    private Scanner scanner;

    public AddressBookView() {
        this.scanner = new Scanner(System.in);
    }

    // Prompt the user to enter a last name
    public String promptUser() {
        System.out.print("Enter partial or full last name to search: ");
        return scanner.nextLine();
    }

    // Display the search result
    public void displayResult(List<String> results) {
        if (results.isEmpty()) {
            System.out.println("No matching records found.");
        } else {
            System.out.println("Matching records:");
            for (String result : results) {
                System.out.println(result);
            }
        }
    }
}
