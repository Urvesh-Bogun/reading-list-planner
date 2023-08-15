import java.io.*;

public class ReadingListItemStoreTest {

    //Some tests for checking if capital letters, loading prize winners and loading books work
    public static void main(String[] args) {
        ReadingListItemStore store = new ReadingListItemStore();
        store.put("a", "Allen Ginsburg");
        store.put("be", "Ben Jonson");
        store.put("be", "Beryl Bainbridge");
        store.put("a", "Anne Brontë");
        System.out.println(store.getRandomItem("A"));//"Allen Ginsburg" or "Anne Brontë"
        System.out.println(store.getRandomItem("a"));//"Allen Ginsburg" or "Anne Brontë"
        System.out.println(store.getRandomItem("x"));//"null"

        try {
            ReadingListItemStore store2 = new ReadingListItemStore("prize-winners.txt");
            System.out.println(store2.getRandomItem("u"));//starting w/ "u"
            System.out.println(store2.getRandomItem("r"));//starting w/ "r"
            System.out.println(store2.getRandomItem("v"));//starting w/ "v"
            System.out.println(store2.getRandomItem("e"));//starting w/ "e"
            System.out.println(store2.getRandomItem("s"));//starting w/ "s"
            System.out.println(store2.getRandomItem("h"));//starting w/ "h"
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage() + ", while loading prize winners.");
        }

        try {
            ReadingListItemStore store3 = new BookStore("books.txt");
            System.out.println(store3.getRandomItem("b"));//starting w/ "b" 
            System.out.println(store3.getRandomItem("o"));//starting w/ "o" 
            System.out.println(store3.getRandomItem("g"));//starting w/ "g" 
            System.out.println(store3.getRandomItem("u"));//starting w/ "u" 
            System.out.println(store3.getRandomItem("n"));//starting w/ "n" 
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage() + ", while loading books.");
        }
    }
}
