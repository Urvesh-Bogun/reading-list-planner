import java.io.IOException;

public class ReadingListItemStoreTest {
    public static void main (String[] args){
        ReadingListItemStore store = new ReadingListItemStore();

        store.put("a", "Allen Ginsburg");
        store.put("be", "Ben Jonson");
        store.put("be", "Beryl Bainbridge");
        store.put("a", "Anne Brontë");

        //Capital input check
        System.out.println(store.getRandom("A"));
        System.out.println(store.getRandom("a"));
        System.out.println("");

        try {
            ReadingListItemStore bookStore = new ReadingListItemStore("Books.txt");

            //Testing if bookStore works with getRandom
            System.out.println(bookStore.getRandom("C"));
            System.out.println(bookStore.getRandom("a"));
            System.out.println(bookStore.getRandom("t"));
            System.out.println(bookStore.getRandom("e"));
            System.out.println("");

            ReadingListItemStore prizeWinnerStore = new ReadingListItemStore("prize-winners.txt");

            //Testing if PrizeWinnerStore works with getRandom()
            System.out.println(prizeWinnerStore.getRandom("B"));
            System.out.println(prizeWinnerStore.getRandom("l"));
            System.out.println(prizeWinnerStore.getRandom("a"));
            System.out.println(prizeWinnerStore.getRandom("k"));
            System.out.println(prizeWinnerStore.getRandom("e"));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}