ticketOrder

Description:

TicketOrder allows Box Office to create N movies which are played in different theartre hall. When the box office is open (playing atleast one movie) users can start purchasing tickets.

Assumptions: 

1. Users can only purchase ticket when box office is open. If ticket is not available we discard the order (ie do no queue them). 
2. The user order are processed by their position in the queue however it does not guarantee gettin tickets if another order is processed quicky since each order is running parallely.

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
Ticket issued
Ticket issued
Ticket issued
Movie not playing at the box Office
Ticket issued
Ticket Not Available. Sold Out. House Full
Ticket issued
Ticket issued
Ticket Not Available. Sold Out. House Full
Ticket Not Available. Sold Out. House Full
Ticket Not Available. Sold Out. House Full
Movie not playing at the box Office
Ticket issued
Ticket issued
</pre>
