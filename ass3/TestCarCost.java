package tester;

import com.sunbeam.CarCost_Ques_3;

public class TestCarCost {

	public static void main(String[] args) {
		CarCost_Ques_3 cost = new CarCost_Ques_3(100,90,16,20,100);
		
		double totalCost = (double)( cost.getMiles() / cost.getMileage() ) * cost.getGasPrice() + cost.getParkingFees() + cost.getToll();
		
		System.out.println("The Total cost for driving the car is : " + totalCost);

	}

}
