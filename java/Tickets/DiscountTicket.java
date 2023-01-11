package Tickets;

public class DiscountTicket extends StandartTicket {

    double discount;

    DiscountTicket(int number, int seatNumber,double discount) {
        super(number, seatNumber);
        this.discount=discount;
    }
    
    @Override
    public void print(){
        System.out.println(seatNumber +" " + number + " "+computePrice());
    }

    @Override
    public double computePrice(){
        return super.computePrice() - discount;
    }
}
