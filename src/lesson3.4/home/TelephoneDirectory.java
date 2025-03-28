import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TelephoneDirectory {

    protected HashMap<String, HashSet<String>> telephoneDirectory = new HashMap<>();

    public void Add(String lastName, String telephone) {
        if (telephoneDirectory.containsKey(lastName)) {
            HashSet<String> phones = telephoneDirectory.get(lastName);
            phones.add(telephone);
        } else {
            HashSet<String> phones = new HashSet<>();
            phones.add(telephone);
            telephoneDirectory.put(lastName, phones);
        }
    }

    public HashSet<String> Get(String lastName) {
        if (telephoneDirectory.containsKey(lastName)) {
            return telephoneDirectory.get(lastName);
        } else {
            return new HashSet<>();
        }
    }
}