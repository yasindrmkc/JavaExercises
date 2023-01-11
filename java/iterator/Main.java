package iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Book b1=new Book("Book 1",250);
        Book b2=new Book("book 2", 280);
        Book b3=new Book("book 3", 240);
        Book b4=new Book("book 4", 260);
        LinkedList<Book> books=new LinkedList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        Collections.sort(books);
        Iterator<Book> itr=books.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
