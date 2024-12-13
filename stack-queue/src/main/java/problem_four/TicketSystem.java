package problem_four;

import java.util.LinkedList;
import java.util.Queue;
import java.util.random.RandomGenerator;

public class TicketSystem {
    Queue<Ticket> tickets = new LinkedList<>();
    int nextId;
    RandomGenerator rand = RandomGenerator.getDefault();

    public void addTicket(String description){
        if(description == null) return;
        nextId = rand.nextInt(1001,4999);
        tickets.add(new Ticket(description,nextId));
        System.out.println("Ticket with ID: "+ nextId + " generated sucessfully");
    }
    public void processTicket(){
        System.out.println("Removed Ticket: "+ tickets.remove());
    }
    public void viewNextTicket(){
        System.out.println("Next Ticket: " + tickets.peek());
    }

    public void allTickets(){
        System.out.println("Tickets in queue: "+ tickets);
    }
}
