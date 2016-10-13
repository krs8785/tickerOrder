package com.yh.ticketOrder.processor;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.yh.ticketOrder.model.TicketOrder;


public class TicketExecutor extends Thread{

	public static Queue<TicketOrder> orderList = new ConcurrentLinkedQueue<TicketOrder>();
	
	ExecutorService executorService = Executors.newFixedThreadPool(3);

	public void run() {
		while (true) {
			try {
				if (!orderList.isEmpty()) {
					executorService.execute(new TicketAllocator(orderList.remove()));
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	    }
	}
	
	public static void addOrderToQueue(TicketOrder ord){
		orderList.add(ord);
	}
}
