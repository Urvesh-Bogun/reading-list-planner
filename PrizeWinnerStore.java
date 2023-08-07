import java.io.*;

public class PrizeWinnerStore extends ReadingListItemStore 
{

    public PrizeWinnerStore() 
    {
        super();
    }

    public PrizeWinnerStore(String fileName) throws IOException 
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
            return item + " (prize-winner)";
        }
    }

}
