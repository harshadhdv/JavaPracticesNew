package VDT;
//medium
//Trip Cost Calculator
//Store distance, fuel efficiency, and fuel price. Calculate the estimated fuel cost for the trip.
public class TripCalculator {
    public static void main(String[] args) {
        int budget = 5000; // total petrol budget
        int mileage = 15; // average mileage of my bmw 220i m sport
        int capacity = 40; //tank capacity
        int price= 107; // petrol price current market
        int km = 600; // total distance of the trip
        double reqfuel = km/mileage;//required fuel
        System.out.println("Required fuel in litres:"+reqfuel);
        System.out.println("Kilometers we can cover with full tank:"+ (capacity*mileage));
        System.out.println("estimated fuel cost:" + reqfuel*price);
        if(reqfuel*price < budget) {
            System.out.println("The trip is under budget");
        }
        else {
            System.out.println("The trip is not into the budget");
        }


    }
}
