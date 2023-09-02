import java.io.*;

public class Bookstore extends ReadingListItemStore {

    public Bookstore() 
    {
        super();
    }

    public Bookstore(String filename) throws IOException {
        super(filename);
    }

    //Appending '(comtemporary)', '(modern)', or '(classic)' depending on published year
    @Override
    public String getRandom(String key) {
        String randItem =  super.getRandom(key);
        if (randItem != null) {
            String type;
            int lastSpaceIndex = randItem.lastIndexOf(" ");
            String titleAuthorPart = randItem.substring(0, lastSpaceIndex);
            String yearPart = randItem.substring(lastSpaceIndex + 1);
            int year = Integer.parseInt(yearPart);
            if (year >= 1990) {
                type = "(comtemporary)";
            }
            else if (year >= 1900) {
            type = "(modern)";
            }
            else {
                type = "(classic)";
            }
            return titleAuthorPart + type;
        }
        else{
            return null;
        }
    }
}
