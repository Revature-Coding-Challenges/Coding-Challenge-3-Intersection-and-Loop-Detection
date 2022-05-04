package com.revature.main;

import java.util.LinkedList;

import com.revature.datastructures.CircularLinkedList;
import com.revature.datastructures.CircularLinkedList.Node;
import com.revature.model.Car;

public class Driver {

	public static void main(String[] args) {
		LinkedList<Car> carsListOne = new LinkedList<Car>();
		LinkedList<Car> carsListTwo = new LinkedList<Car>();
		
		//Populate both lists.
		carsListOne.add(new Car("Ford", "Mustang", 2018, "blue"));
		carsListOne.add(new Car("Dodge", "Viper", 2018, "red"));
		carsListOne.add(new Car("Dodge", "Challenger", 2018, "Grey"));
		carsListOne.add(new Car("Dodge", "Charger", 2018, "Black"));
		
		carsListTwo.add(new Car("Audi", "TT", 2018, "Black"));
		carsListTwo.add(new Car("Audi", "R8", 2018, "blue"));
		carsListTwo.add(new Car("BMW", "M3", 2018, "Grey"));
		carsListTwo.add(new Car("BMW", "I8", 2018, "white"));
		carsListTwo.add(new Car("Porche", "911", 2018, "red"));

		//Set one object to another. The intersection
		carsListOne.set(2, carsListTwo.get(1));
		
		//Call the findTheIntersect method.
		Car interceptingNode = findTheIntersection(carsListOne, carsListTwo);
		
		//Check the value to see if its correct.
		System.out.println(interceptingNode);
		
		
		CircularLinkedList circularList = new CircularLinkedList();
		circularList.insertAtFirst(1);
		circularList.insertAtFirst(2);
		circularList.insertAtLast(3);
		circularList.insertAtLast(4);
	    System.out.println("size :" + circularList.size());
	    circularList.display();
	    Node lastNode = LoopDetection(circularList);
	}
	
	//Part a) Intersection
	public static Car findTheIntersection(LinkedList<Car> a, LinkedList<Car> b) {
		
		Car intersectingNode = null;
		
		for(Car object: a) {
			for(Car objectTwo: b) {
				if(object == objectTwo) {
					intersectingNode = object;
					System.out.println(object);
					System.out.println(objectTwo);
				}
			}
		}
		return intersectingNode;
	}
	
	//Part b) Loop Detection
	public static Node LoopDetection(CircularLinkedList circularList) {
		return circularList.getLast();
	}
	
	

}
