package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    List<Passenger> passengerList = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassanger(Passenger passenger) {
        if (passengerList.size() < maxCapacity) {
            passengerList.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPassengers() {
        return passengerList.size();
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public int numberOfPackages() {
        int numOfP = 0;
        for (Passenger passenger: passengerList) {
            numOfP += passenger.getNumberOfPackages();
        }
        return numOfP;
    }
}
