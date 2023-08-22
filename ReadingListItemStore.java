import java.util.*;
import java.io.*;

public class ReadingListItemStore {
    private HashMap<String, List<String>> map;
    
    //Initialises new HashMap
    public ReadingListItemStore() {
        map = new HashMap<String, List<String>>();
    }

    public ReadingListItemStore(String filename) throws IOException {
        this();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase();
                String firstChar = line.substring(0, 1);
                put(firstChar, line);
            }
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.print(e.getMessage());
            }
        }
    }

    //Checks weather map contains a key given string as a key
    public boolean containsKey(String key) { 
        return (map.containsKey(key));
    }

    //Creates new mapping from 'key' to 'item'
    public void put(String key, String item) {
        if (map.containsKey(key)) {
            List<String> itemList = map.get(key);
            itemList.add(item);
        } else {
            List<String> itemList = new ArrayList<String>();
            itemList.add(item);
            map.put(key, itemList);
        }
    }

    //Looks up 'key' and returns random item
    public String getRandom(String key) {
        key = key.toLowerCase();
        if (map.containsKey(key)) {
            List<String> itemList = map.get(key);
            Random rand = new Random();
            int randIndex = rand.nextInt(itemList.size());
            String randItem = itemList.get(randIndex);
            return randItem;
        }
        else {
            return null;
        }
    }
}