package com.yh.ticketOrder.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import com.yh.ticketOrder.model.TicketOrder;
import com.yh.ticketOrder.processor.TicketExecutor;

public class ticketController {

	public static void processTicketOrder(String file){
		try {
			String line;
			BufferedReader br = new BufferedReader(new FileReader(file));
			LinkedList<TicketOrder> orderList = new LinkedList<TicketOrder>();
			while ((line = br.readLine()) != null) {
				String[] order = line.split(" ");
				orderList.add(new TicketOrder(order[0],Integer.parseInt(order[1])));
			}
			TicketExecutor.processOrders(orderList);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
