import java.util.List;

class AddressBookController {
    private final AddressBookModel model;

    public AddressBookController(AddressBookModel model) {
        this.model = model;
    }
    public List<String> searchLastName(String partialLastName) {
    return model.search(partialLastName);
}
}
