# NaiveTicket

The second Objects lab, from the BlueJ book's second chapter.

Look for the [Chapter 2 file](./doc/BlueJ-objects-first-ch2.pdf) you need in the [doc](./doc) folder.
There is 35 pages of reading and exercises in the chapter.

Work through all these exercises. You edit this file with your answers for these exercises.

## Exercise 2.1
* Create a TicketMachine object on the object bench.
* Upon viewing its methods, `getBalance`, `getPrice`, `insertMoney`, `printTicket`.
* Use `getPrice` method to view the value of the price of the tickets that was set when this object was created.
* Use `insertMoney` method to simulate inserting an amount of money into the machine.
* Use `getBalance` to check that the machine has a record of the amount inserted.
	* You can insert several separate amounts of money into the machine, just like you might insert multiple coins or notes into a real machine. Try inserting the exact amount required for a ticket. As this is a simple machine, a ticket will not be issued automatically, so once you have inserted enough money, call the `printTicket` method. A facsimile ticket should be printed in the BlueJ terminal window.

## Exercise 2.2
* What value is returned if you check the machine’s balance after it has printed a ticket? 0

## Exercise 2.3
* Experiment with inserting different amounts of money before printing tickets.
	* Do you notice anything strange about the machine’s behavior? If you keep inserting money the balance keeps adding up -- seems correct.
	* What happens if you insert too much money into the machine – do you receive any refund? No balance always goes to 0.
	* What happens if you do not insert enough and then try to print a ticket? Balance  goes to 0 and you get no ticket printed.

## Exercise 2.4
* Try to obtain a good understanding of a ticket machine’s behavior by interacting with it on the object bench before we start looking at how the `TicketMachine` class is implemented in the next section.

## Exercise 2.5
* Create another ticket machine for tickets of a different price.
	* Buy a ticket from that machine.
	* Does the printed ticket look different? No looks the same

## Exercise 2.6
* Write out what you think the outer wrappers of the `Student` and `LabClass` classes might look like – do not worry about the inner part.

public class Student
{
}

public class LabClass
{
}

## Exercise 2.7
Does it matter whether we write<br>
`public class TicketMachine`<br>
or<br>
`class public TicketMachine`<br>
in the outer wrapper of a class?  Yes it won't compile if you write class public TicketMachine

* Edit the source of the `TicketMachine` class to make the change and then close the editor window.
	* Do you notice a change in the class diagram? Yes the TicketMachine box is filled with crosses.
	* What error message do you get when you now press the compile button? There are 4 errors: <identifier> expected, illegal start of expression, invalid method declaration, return type required. 
	* Do you think this message clearly explains what is wrong? No I wouldn't know why it wasn't working.

## Exercise 2.8
* Check whether or not it is possible to leave out the word `public` from the outer wrapper of the `TicketMachine` class.  Yes everything appears to work the same without the public.

## Exercise 2.9
* From your earlier experimentation with the ticket machine objects within BlueJ you can probably remember the names of some of the methods – `printTicket`, for instance.
	* Look at the class definition in Code 2.1 and use this knowledge, along with the additional information about ordering we have given you, to try to make a list of the names of the fields, constructors, and methods in the `TicketMachine` class.
	* Hint: There is only one constructor in the class.

Fields: price, balance, total, ticketCost
Constructor: TicketMachine(int ticketCost)
Methods: getPrice(), getBalance(), insertMoney(), printTicket()

## Exercise 2.10
* Do you notice any features of the constructor that make it significantly different from the other methods of the class? The constructor for the TicketMachine requires a parameter of int ticketCost be passed to it.

## Exercise 2.11
* What do you think is the type of each of the following fields?

```java
private int count;                primitive integer data type
private Student representative;   object called Student
private Server host;              object called host
```

## Exercise 2.12
* What are the names of the following fields?

```java
private boolean alive;    field called alive
private Person tutor;     Object of Person class called tutor
private Game game;        Object of Game class called game
```

## Exercise 2.13

In the following field declaration from the TicketMachine class<br>

```java
private int price;  primitive integer data type
```
does it matter which order the three words appear in? Yes it matters. It won't compile if the order is changed.
* Edit the `TicketMachine` class to try different orderings. After each change, close the editor.
	* Does the appearance of the class diagram after each change give you a clue as to whether or not other orderings are possible? It becomes checked and won't compile.
	* Check by pressing the compile button to see if there is an error message.  Yes there are two errors: illegal start of type, ; expected
	* Make sure that you reinstantiate the original version after your experiments!

## Exercise 2.14
* Is it always necessary to have a semicolon at the end of a field declaration? Yes
* Once again, experiment via the editor.
* The rule you will learn here is an important one, so be sure to remember it.

## Exercise 2.15
* Write in full the declaration for a field of type `int` whose name is `status`.
private int status;

## Exercise 2.16
* To what class does the following constructor belong? The Student class
```
public Student(String name)
```

## Exercise 2.17
* How many parameters does the following constructor have and what are their types?
Two:  a String called title, and a primitive double data type called price
public Book(String title, double price)
```

## Exercise 2.18
* Can you guess what types some of the `Book` class’s fields might be?
private String title;
private String author;
private int isbn;

* Can you assume anything about the names of its fields? I would assume that the three fields I described would be required.

Work all Exercises from 2.19 to 2.58 that are **NOT** marked *Challenge exercise*.
READ up to and INCLUDING section 2.15 of this chapter.

2.19
public Pet(String petsName)
  {
private String name = petsName;
}

2.21 Both methods return an int. The getPrice method returns the price. The getBalance method returns the balance. However, price is initialized to ticketCost, and balance is initialized to 0.

2.22 A call to getBalance is What is the current balance?

2.23 You can change the method name to amount without changing anything else and it still works. The method still returns the state of the field balance.

2.24 private int getTotal()
     {
	return total;
      }
	
2.25.You get an error "missing return statement"

2.26 public int getPrice()
     public void printTicket()
	printTicket has void -- so it does not return anything. But the method does a number of things including, outputting the ticket to the screen, computing the total, and setting the balance to 0 (even though these are not functioning properly).

2.27 public void insertMoney(int amount)
     public void printTicket()
	No these methods are both void -- they do not return anything. The methods do things though.

2.28 ok

2.29 public void setPrice(int ticketCost)
	A constructor cannot have a return type (void).

2.30 public void setPrice(int ticketCost)
     {
        price = ticketCost;
     }

2.31 /**
      * Increase score by the given number of points.
      */
      public void increase(int points)
      {
	score = score + points;
      }

2.32 /**
      * Reduce price by the given amount.
      */
      public void discount(int amount)
      {
	price = price - amount;
      }

2.33 ok
2.34 ok

2.35 When you create each ticketMachine object you input the ticketCost for that object when you create it. So each object has its own ticketCost settings that the method uses when it prints the ticket price.

2.36 The word price would print instead of the value stored in the variable price.

2.37 # price cents. would print because the entire thing is a string of text within the quotes.

2.38 No -- you need to have the variable price print in order to show the ticketCost.

2.39 You are not prompted for the ticketCost when the object is created. It is automatically 1000.

2.40 The empty method is a mutator because it changes the value of a field. Currently there is no method that checks the total -- only a method that checks the balance. This method would not affect the balance.

2.41 ok
2.42 ok
2.43 ok Balance does not change when an amount >=0 is entered. 0 entered still generates the error message.
2.44 If you changed the operator you would always get the error
2.46 ok
2.47 The balance could never be 0 because we don't allow a negative number to be entered and we check to verify there is enough in balance to cover the cost of the ticket.
2.48 * / + - %
2.49 saving = price * discount
2.50 mean = total / count
2.51 if (price > budget){
        System.out.println("Too expensive");
      }
      else {
         System.out.println("Just right");
      }
2.52 if (price > budget){
        System.out.println("Too expensive on a budget of " + budget);
      }
      else {
         System.out.println("Just right");
      }
2.53 If you don't want to tell the customer how much is being returned you don't need the local variable. But if you want to return how much is returned with the refund you have to have a local variable to hold the amount before you 0 out the balance.
2.54 return balance; ends the method so then the balance would not be returned to 0. 
2.55 ok
2.56 emptyMachine is a mutator (it changes total) and an accessor it displays the status of the object.
2.57 ok


