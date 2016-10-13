package com.yh.ticketOrder;

import com.yh.ticketOrder.controller.movieController;
import com.yh.ticketOrder.controller.ticketController;
import com.yh.ticketOrder.processor.TicketExecutor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        new TicketExecutor().start();
        movieController.addMoviesToBoxOffice("testData/movies.txt");
        ticketController.processTicketOrder("testData/ticketOrder.txt");
    }
}
