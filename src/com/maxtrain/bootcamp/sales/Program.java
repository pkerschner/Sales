package com.maxtrain.bootcamp.sales;

public class Program {

	public static void main(String[] args) {
		
		var c1 = new Customer();
		c1.log();
		var c2 = new Customer("ACME MFG.");
		c2.log();
		var c3 = new Customer("MAX", "Cincinnati", "OH");
		c3.log();
		
		var db = new CustomerDB();
		try {
			
			db.add(c1);
			db.add(c2);
			db.add(c3);
			
			var customers = db.getAll();
			for(var c : customers) {
				c.log();
			}
			
			var max = db.getByPk(3);
			max.log();
			
			db.get(1).log();
			
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
