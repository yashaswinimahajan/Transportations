package com.transportation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TransportationProject {

	public static void main(String[] args) {
		
	         // Custom Comparator to sort vehicles by capacity, then by name
				Comparator<Vehicle> capacityComparator = new Comparator<Vehicle>() {

					@Override
					public int compare(Vehicle v1, Vehicle v2) {
						int capacityComparison = Integer.compare(v1.getCapacity(), v2.getCapacity());
						if (capacityComparison == 0) {
							return v1.getName().compareTo(v2.getName());
						}
						return capacityComparison;
					}

				};

				// Priority queue with custom comparator
				PriorityQueue<Vehicle> vehicleQueue = new PriorityQueue<>(capacityComparator);
				vehicleQueue.add(new Vehicle("Bus", 50));
				vehicleQueue.add(new Vehicle("Van", 12));
				vehicleQueue.add(new Vehicle("Car", 5));
				vehicleQueue.add(new Vehicle("Bicycle", 1));
				vehicleQueue.add(new Vehicle("Truck", 20));
				vehicleQueue.add(new Vehicle("Motorcycle", 2));
				vehicleQueue.add(new Vehicle("Minibus", 30));

				System.out.println("Vehicles in priority order:");
				while (!vehicleQueue.isEmpty()) {
					System.out.println(vehicleQueue.poll());
				}
			}

			static class Vehicle {
				private String name;
				private int capacity;

				public Vehicle(String name, int capacity) {
					this.name = name;
					this.capacity = capacity;
				}

				public String getName() {
					return name;
				}

				public int getCapacity() {
					return capacity;
				}

				@Override
				public String toString() {
					return name + " with capacity " + capacity;
				}
			}
		}

	


