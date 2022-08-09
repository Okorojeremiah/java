package tddClass;

public class Ticket {

    private int ticketId;
    private String customerName;
    private  String destination;

    public Ticket(){

    }
    public Ticket(int ticketId){
        this.ticketId = ticketId;
    }
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketId() {
        return ticketId;
    }
}
