package com.designpattern.structural.composite;

import sun.security.provider.SHA;

/**
 * Created by pgangadhar on 5/27/16.
 */
public class CompositePatternDemo {

	public static void main(String args[]) {
		//Employee head = new Employee();
		Employee ceo = new Employee("PG", "CEO", 250000);
		Employee headSales = new Employee("SaleAbc", "SalesHead", 200000);
		Employee headMrktg = new Employee("HdMktAbc", "HeadMrktg", 180000);

		Employee clerk1 = new Employee("clrkAbc", "Clerk", 100000);
		Employee clerk2 = new Employee("clrkXyz", "Clerk", 100000);

		Employee salesAss1 = new Employee("salesAcc1", "SalesAcc", 80000);
		Employee salesAss2 = new Employee("salesAcc2", "SalesAcc", 80000);

		ceo.addSubOridnate(headMrktg);
		ceo.addSubOridnate(headSales);
		headSales.addSubOridnate(salesAss1);
		headSales.addSubOridnate(salesAss2);

		headMrktg.addSubOridnate(clerk1);
		headMrktg.addSubOridnate(clerk2);

		for(Employee emp : ceo.getSubOrdinates()) {
			System.out.println(emp);
			for(Employee employee : emp.getSubOrdinates()) {
				System.out.println(employee);
			}
		}

		//Shape Compiste Pattern Demo
		System.out.println("Shape Pattern Demo");
		Shape circle = new Circle();
		Shape trg1 = new Triangle();
		Shape trg2 = new Triangle();

		Drawing drawing = new Drawing();
		drawing.addShape(circle);
		drawing.addShape(trg1);
		drawing.addShape(trg2);

		drawing.draw("RED");
	}
}
