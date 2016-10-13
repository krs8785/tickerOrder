ticketOrder

Description:

TicketOrder allows Box Office to create N movies which are played in different theartre hall. When the box office is open (playing atleast one movie) users can start purchasing tickets. The box ffice can be thought of as a database (would require perhaps row level locking)

Assumptions: 

1. Users can only purchase ticket when box office is open. If ticket is not available we discard the order (ie do no queue them). 
2. The user order are processed by their position in the queue however it does not guarantee gettin tickets if another order is processed quicky since each order is running parallely.
3. The controller is essentially can be thought of like a REST endpoint where we can dynamically add movies and place orders. The orders are processed are put in a queue and processed 
4. Once the movie ticket is issued it it the ticket count is decremented from the box office. The method to decrement are synchronized so only one order can be process it

To do:

1. Proper unit testing
2. Proper commenting/Exception handling/responses

Requirements :

1. JAVA 1.5
2. Maven

Running the app :

1. You can run using mvn exec:java or directly run the App.java file

Input Example :

Input consists of list of movies 

<pre>
q
w
e
r
t
y
u
i
o
p
</pre>

List of orders [movie quantity]
<pre>
q 2
w 2
q 3
w 3
a 4
q 3
q 2
q 2
w 3
w 2
w 1
q 3
w 3
b 3
</pre>

Result: 

<pre>
Ticket issued [order: w 2]
Ticket issued [order: q 2]
Ticket issued [order: q 3]
Ticket issued [order: w 3]
Ticket issued [order: q 3]
Movie not playing at the box Office [order: a 4]
Ticket Not Available. Sold Out. House Full [order: q 2]
Ticket issued [order: q 2]
Ticket issued [order: w 2]
Ticket Not Available. Sold Out. House Full [order: q 3]
Ticket Not Available. Sold Out. House Full [order: w 3]
Movie not playing at the box Office [order: b 3]
Ticket issued [order: w 3]
Ticket Not Available. Sold Out. House Full [order: w 1]
</pre>
