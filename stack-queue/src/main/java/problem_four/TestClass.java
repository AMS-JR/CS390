package problem_four;

public class TestClass {

    public static void main(String[] args) {
        TicketSystem board = new TicketSystem();
        board.addTicket("Arsenal vs Chelsea");
        board.addTicket("Arsenal vs Man City");
        board.addTicket("Arsenal vs Liverpool");
        board.processTicket();
        board.viewNextTicket();
        board.allTickets();

    }
}
