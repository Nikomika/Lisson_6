import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneDic {
    private Map<String, List<String>> phoneBook;

    public TelephoneDic() {
        phoneBook = new HashMap<>();
    }
    public void add(String lastName, String phoneNumber) {
        phoneBook.putIfAbsent(lastName, new ArrayList<>());
        phoneBook.get(lastName).add(phoneNumber); // проверка если есть однофамильцы
    }
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }
}