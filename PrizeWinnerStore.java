import java.io.*;

public class PrizeWinnerStore extends ReadingListItemStore{

    public PrizeWinnerStore() 
    {
        super();
    }
    
    public PrizeWinnerStore(String filename) throws IOException {
        super(filename);
    }

    //Appends '(prize-winner)' to end of item
    @Override
    public String getRandom(String key) {
        String randItem = super.getRandom(key);
        if (randItem != null) {
            return randItem + " (prize-winner)";
        }
        else {
            return null;
        }
    }
}
