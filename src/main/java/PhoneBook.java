import java.util.*;

class PhoneBook {
    private final static HashMap<String, HashSet<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            HashSet<Integer> values = new HashSet<>();

            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public HashSet<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new HashSet<Integer>();
    }

    public static void getPhoneBook() {

        List<Map.Entry<String, HashSet<Integer>>> list = new ArrayList<>(phoneBook.entrySet());


        list.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        for (Map.Entry<String, HashSet<Integer>> entry : list) {
            System.out.println("Subject: " + entry.getKey() + ", Phone numbers: " + entry.getValue());
        }
    }

}