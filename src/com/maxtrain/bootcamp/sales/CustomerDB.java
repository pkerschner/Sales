package com.maxtrain.bootcamp.sales;

import java.util.ArrayList;

public class CustomerDB {
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();	
	
	public void add(Customer customer) throws Exception {
		customers.add(customer);
	}
		
	public boolean delete(int id) {
		var cust = getByPk(id);
		if(cust == null) {
			return false;
		}
		customers.remove(cust);
		return true;
	}
	
	public Customer[] getAll() {
		var custs = new Customer[customers.size()];
		for(var i = 0; i < customers.size(); i++) {
			custs[i] = customers.get(i);
		}
		return custs;
	}
	
	public Customer getByPk(int id) {
		for(var cust : customers) {
			if(cust.getId() == id) {
				return cust;
			}
		}
		return null;
	}

}
