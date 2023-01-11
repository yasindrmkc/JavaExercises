package Tickets;

import java.util.*;

public class TicketSeller {
    List<Ticket> tickets=new ArrayList<>();
    double incomes;
    TicketSeller(List<Ticket> tickets){
        this.tickets=tickets;
    }
    void sell(Ticket ticket){
        tickets.remove(ticket);
        incomes+=ticket.computePrice();
    }
    double getIncomes(){
        return incomes;
    }
}
