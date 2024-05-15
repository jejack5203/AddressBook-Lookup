import java.util.ArrayList;
import java.util.List;

class AddressBookModel {
    private final String[] addrbook;

    public AddressBookModel(String[] addrbook) {
        this.addrbook = addrbook;
    }

    // Method to search for a given partial last name in the address book
    public List<String> search(String partialLastName) {
        List<String> results = new ArrayList<>();
        for (String record : addrbook) {
            String[] parts = record.split(",");
            String lastNameInBook = parts[0].trim();
            if (lastNameInBook.toLowerCase().contains(partialLastName.toLowerCase())) {
                results.add(record); // Add the entire record to the results
            }
        }
        return results;
    }
}
