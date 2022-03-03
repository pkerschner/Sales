package com.maxtrain.bootcamp.sales;

public class CustomerDB {
	
	private Customer[] customers = new Customer[10];
	private int index = 0;
	
	public void add(Customer customer) throws Exception {
		if(index > 9) {
			throw new Exception("Collection is full!");
		}
		customers[index] = customer;
		index++;
	}
	
	private int findIndex(int id) {
		for(var i = 0; i < customers.length; i++) {
			var cust = customers[i];
			if(cust == null) {
				continue;
			}
			if(cust.getId() == id) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean delete(int id) {
		var index = findIndex(id);
		if(index == -1) {
			return false;
		}
		customers[index] = null;
		return true;
	}
	
	public Customer[] getAll() {
		var custs = new Customer[index];
		for(var i = 0; i < index; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	
	public Customer getByPk(int id) {
		var index = findIndex(id);
		if(index > -1) {
			return customers[index];
		}
		return null;
	}
	
	public Customer get(int index) throws Exception {
		if(index < 0 || index > 9) {
			throw new Exception("Index out of range!");
		}
		return customers[index];
	}
}
