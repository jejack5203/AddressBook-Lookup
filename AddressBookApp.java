import java.util.ArrayList;
import java.util.List;

public class AddressBookApp {
    public static void main(String[] args) {
        // Sample address book data
        String[] addrbook = {
            "Anile,Joseph,35 Forest Avenue,Glen Cove,NY,12345,(516)937-4021",
            "Brown,Robert,96 Landing Road,Brooklyn,NY,12345,(718)551-7505",
            "Colin,Albert,64 Lisa Drive,Plainview,NY,12345,(516)101-2445",
            "Li,Mike,35 Forest Avenue,Glen Cove,NY,12345,(516)937-1631",
            "Grey,Anicho,96 Landing Road,Brooklyn,NY,12345,(718)921-7577",
            "Stein,Calvin,64 Brown Drive,Plainview,NY,12345,(516)671-1299",
            "Ray,John,35 Crest Avenue,Glen Cove,NY,12345,(718)944-4141",
            "Steel,Ron,90 Ice Road,Brooklyn,NY,12345,(718)341-7577",
            "David,Daniel,61 Lisa Drive,Plainview,NY,12345,(516)655-9995",
            "Anile,Jo,35 Forest Avenue,Glen Cove,NY,12345,(516)937-4021",
            "Brown,Ron,96 Landing Road,Brooklyn,NY,12345,(718)551-7505",
            "Cobb,Albert,64 Lisa Drive,Plainview,NY,12345,(516)101-2445",
            "Tyler,Mike,35 Forest Avenue,Glen Cove,NY,12345,(516)937-1631",
            "Green,Anicho,96 Landing Road,Brooklyn,NY,12345,(718)921-7577",
            "Minns,Calvin,64 Brown Drive,Plainview,NY,12345,(516)671-1299",
            "Mario,Joseph,35 Forest Avenue,Glen Cove,NY,12345,(516)937-4021",
            "Roger,Robert,96 Landing Road,Brooklyn,NY,12345,(718)551-7505",
            "Case,Ann,64 Lisa Drive,Plainview,NY,12345,(516)101-2445",
            "Lilly,Mike,35 Forest Avenue,Glen Cove,NY,12345,(516)937-1631",
            "Greg,Billy,96 Landing Road,Brooklyn,NY,12345,(718)921-7577",
            "Steward,Kane,64 Brown Drive,Plainview,NY,12345,(516)671-1299",
            "Alex,Joseph,35 Forest Avenue,Glen Cove,NY,12345,(516)937-4021",
            "Beetle,Robert,96 Landing Road,Brooklyn,NY,12345,(718)551-7505",
            "Colfawk,Albert,64 Lisa Drive,Plainview,NY,12345,(516)101-2445",
            "Lint,Mike,35 Forest Avenue,Glen Cove,NY,12345,(516)937-1631",
            "Grey,Anicho,96 Landing Road,Brooklyn,NY,12345,(718)921-7577",
            "Steezy,Calvin,64 Brown Drive,Plainview,NY,12345,(516)671-1299",
            "Azul,Joseph,35 Forest Avenue,Glen Cove,NY,12345,(516)937-4021",
            "Bean,Robert,96 Landing Road,Brooklyn,NY,12345,(718)551-7505",
            "Colin,Alex,64 Lisa Drive,Plainview,NY,12345,(516)101-2445",
            "Little,Mike,35 Forest Avenue,Glen Cove,NY,12345,(516)937-1631",
            "Groof,Anicho,96 Landing Road,Brooklyn,NY,12345,(718)921-7577",
            "Stern,Mike,64 Brown Drive,Plainview,NY,12345,(516)671-1299",
            "Avery,John,35 Forest Avenue,Glen Cove,NY,12345,(516)937-4021",
            "Box,Tom,96 Landing Road,Brooklyn,NY,12345,(718)551-7505",
            "Connie,Jean,64 Lisa Drive,Plainview,NY,12345,(516)101-2445",
            "Lake,Denim,35 Forest Avenue,Glen Cove,NY,12345,(516)937-1631",
            "Mary,Jean,96 Landing Road,Brooklyn,NY,12345,(718)921-7577",
            "Monroe,Tyrese,33 Brown Drive,Plainview,NY,12345,(516)671-1299"
        };

        // Instantiate the MVC components
        AddressBookModel model = new AddressBookModel(addrbook);
        AddressBookController controller = new AddressBookController(model);
        AddressBookView view = new AddressBookView();

        // Prompt user for input
        String lastName = view.promptUser();

        // Perform search
        List<String> results = controller.searchLastName(lastName);

        // Display result
        view.displayResult(results);
    }
}
