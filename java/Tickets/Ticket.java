package Tickets;

public abstract class Ticket {
    int number;
    int seatNumber;

    Ticket(int number,int seatNumber){
        this.number=number;
        this.seatNumber=seatNumber;
    }
    abstract void print();
    abstract double computePrice();
}
