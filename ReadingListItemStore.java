import java.util.*;
import java.io.*;

public class ReadingListItemStore 
{
    private Map<String, List<String>> map;
    
    public ReadingListItemStore() 
    {
        this.map = new HashMap<>();
    }
    
    public ReadingListItemStore(String filename) throws IOException 
    {
        this();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        try 
        {
            String line;
            while ((line = reader.readLine()) != null) 
            {
                String item = line.toLowerCase();
                String key = item.substring(0, 1).toUpperCase();
                this.put(key, item);
            }
        } finally {
            reader.close();
        }
    }
    
    public boolean containsKey(String key) 
    {
        return this.map.containsKey(key.toUpperCase());
    }
    
    public void put(String key, String item) 
    {
        key = key.toUpperCase();
        List<String> items = this.map.getOrDefault(key, new ArrayList<>());
        if (!items.contains(item)) 
        {
            items.add(item);
            this.map.put(key, items);
        }
    }
    
    public String getRandomItem(String key) 
    {
        key = key.toUpperCase();
        List<String> items = this.map.get(key);
        if (items == null) 
        {
            return null;
        }
        Random rand = new Random();
        String item = items.get(rand.nextInt(items.size()));
        return item.substring(0, 1).toUpperCase() + item.substring(1);
    }
}


