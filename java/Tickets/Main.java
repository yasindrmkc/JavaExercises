package Tickets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Ticket t1=new StandartTicket(10, 1);
        Ticket t2=new DiscountTicket(22, 2, 0.1);
        Ticket t3=new DiscountTicket(12, 3, 0.2);
        Ticket t4=new StandartTicket(35, 4);

        List<Ticket> tickets=new ArrayList<>();
        tickets.add(t1);
        tickets.add(t2);
        tickets.add(t3);
        tickets.add(t4);

        List<Integer> seatNumbers=new ArrayList<>();
        for (Ticket t : tickets) {
            seatNumbers.add(t.seatNumber);
        }

        SortAndPrint(tickets);

        TicketSeller ts=new TicketSeller(tickets);
        ts.sell(t1);
        ts.sell(t2);
        ts.sell(t3);
        ts.sell(t4);
        System.out.println(ts.getIncomes());
    }

    static void SortAndPrint(List<Ticket> tickets) {

        SeatNumberComparator seatNumberComparator=new SeatNumberComparator();
        Collections.sort(tickets,seatNumberComparator);
        for (Ticket ticket : tickets) {
            ticket.print();
        }
    }
}
