import java.io.*;

public class BookStore extends ReadingListItemStore {

    public BookStore() 
    {
        super();
    }

    public BookStore(String fileName) throws IOException 
    {
        super(fileName);
    }

    @Override
    public String getRandomItem(String key) 
    {
        String item = super.getRandomItem(key);
        if (item == null)
        {
            return null;
        } else {
            String[] parts = item.split(" ");
            String titleAuthor = "";
            for (int i = 0; i < parts.length - 1; i++) 
            {
                titleAuthor += parts[i] + " ";
            }
            int year = Integer.parseInt(parts[parts.length - 1]);
            String type;
            if (year >= 1990) {
                type = " (contemporary)";
            } else if (year >= 1900) {
                type = " (modern)";
            } else {
                type = " (classic)";
            }
            return titleAuthor + type;
        }
    }

}
