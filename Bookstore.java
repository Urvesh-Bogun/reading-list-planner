import java.io.*;

public class Bookstore extends ReadingListItemStore {

    public Bookstore(String filename) throws IOException {
        super(filename);
    }

    //Appending '(comtemporary)', '(modern)', or '(classic)' depending on release date
    @Override
    public String getRandom(String key) {
        String randItem =  super.getRandom(key);
        String type;
        if (year >= 1990) {
            type = "(comtemporary)";
        }
        else if (year >= 1900) {
            type = "(modern)";
        }
        else {
            type = "(classic)";
        }
            return null;
        }
    }
}
