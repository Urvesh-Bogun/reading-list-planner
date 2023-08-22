import java.io.IOException;

public class ReadingListItemStoreTest {
    public static void main (String[] args){
        ReadingListItemStore store = new ReadingListItemStore();

        store.put("a", "Allen Ginsburg");
        store.put("be", "Ben Jonson");
        store.put("be", "Beryl Bainbridge");
        store.put("a", "Anne Brontë");

        System.out.println(store.getRandom("A"));
        System.out.println(store.getRandom("a"));

        try {
            ReadingListItemStore bookStore = new ReadingListItemStore("Books.txt");
            
            System.out.println(bookStore.getRandom("C"));
            System.out.println(bookStore.getRandom("a"));
            System.out.println(bookStore.getRandom("t"));
            System.out.println(bookStore.getRandom("e"));

            ReadingListItemStore prizeWinnerStore = new ReadingListItemStore("prize-winners.txt");

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