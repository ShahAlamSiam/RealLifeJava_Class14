package class14;

import PackageClass14.MotorCycle;

public class Main {

	public static void main(String[] args) {
		
		MotorCycle motorCycle = new MotorCycle();
		
		motorCycle.setModel("Honda");
		motorCycle.setName("Mclaren p");
		motorCycle.setBrand("Mclaren F1");
		motorCycle.setWheel(2);
		
		System.out.println("This Model is>>>> " + motorCycle.getModel());
		System.out.println("MotorCycle Name: " + motorCycle.getName());
		System.out.println("Brand Name: " + motorCycle.getBrand());
		System.out.println("No of Wheel: " + motorCycle.getWheel());
		

	}

}
