package Tickets;

public class StandartTicket extends Ticket {

    double price=10;

    StandartTicket(int number, int seatNumber) {
        super(number, seatNumber);
    }

    @Override
    void print() {
        System.out.println(seatNumber +" " + number + " "+computePrice());
    }

    @Override
    double computePrice() {
        return price;
    }

}
