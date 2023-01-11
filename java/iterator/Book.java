package iterator;

public class Book implements Comparable<Book>{
    String name;
    double price;
    Book(String name,double price){
        this.name=name;
        this.price=price;
    }
    double totalPrice(){
        return price+ price *0.08;
    }
    @Override
    public int compareTo(Book o) {        
        return (int) ((int)this.price - o.price);
    }
    @Override
    public String toString() {
        return "price=" + price ;
    }
}
