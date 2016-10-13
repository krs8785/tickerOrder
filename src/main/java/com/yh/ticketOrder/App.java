package com.yh.ticketOrder;

import com.yh.ticketOrder.controller.movieController;
import com.yh.ticketOrder.controller.ticketController;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        movieController.addMoviesToBoxOffice("testData/movies.txt");
        ticketController.processTicketOrder("testData/ticketOrder.txt");
    }
}
