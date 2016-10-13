package com.yh.ticketOrder.processor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yh.ticketOrder.model.TicketOrder;


public class TicketExecutor extends Thread{

	
	static ExecutorService executorService = Executors.newFixedThreadPool(3);

	public static void processOrders(LinkedList<TicketOrder> orderList) {
		while (!orderList.isEmpty()) {
			try {
				executorService.execute(new TicketAllocator(orderList.remove()));
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	    }
		executorService.shutdown();
	}
	
	
}
