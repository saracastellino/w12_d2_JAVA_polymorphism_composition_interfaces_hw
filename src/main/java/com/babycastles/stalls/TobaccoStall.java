package com.babycastles.stalls;

import com.babycastles.behaviours.IReviewed;
import com.babycastles.behaviours.ISecurity;
import com.babycastles.people.Visitor;

public class TobaccoStall extends Stall implements IReviewed, ISecurity {

    public TobaccoStall(String name, int rating, String ownerName, ParkingSpot parkingSpot) {
        super(name, rating, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor != null) {
            return visitor.getAge() > 18;
        }
        return false;
    }


}

