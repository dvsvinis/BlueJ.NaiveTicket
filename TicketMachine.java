/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
public class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine () 
    {
        price = 1000;
        balance = 0;
        total = 0;
    }

    /**
     * Constructor that issues ticket with a specified ticketCost.
     */
    public TicketMachine (int ticketCost) 
    {
        price = ticketCost;
    }
    
    /**
     * Prompt user to insert money.
     */
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");

    }
    
    /**
     * Show the price of a ticket.
     */
    public void showPrice()
    {
        System.out.println("The price of a ticket is " + price + " cents.");

    }
    
    /**
     * Display the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Set the price of a ticket.
     */
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
    

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

   /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) {
        balance = balance + amount;
    }
    else {
        System.out.println("Insert a positive amount: " + amount);
    }
    }

    
    /**
    * Return the money in the balance.
    * The balance is cleared.
    */
    public int refundBalance() {
        int amountToRefund; 
        amountToRefund = balance; 
        balance = 0;
        return amountToRefund;
    }
    
    
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        if(balance >= price) {
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();

        // Update the total collected with the balance.
        total = total + price;
        // Reduce the balance by the price.
        balance = balance - price;
        }
        else {
            int amountLeftToPay = price - balance;
            System.out.println("You must insert at least: " + amountLeftToPay + 
        " cents.");
        }       
    }
    
    /**
    * Empty the money from machine.
    * The total is cleared.
    */
    public int emptyMachine() {
        total = 0;
        return total;
    }
}
