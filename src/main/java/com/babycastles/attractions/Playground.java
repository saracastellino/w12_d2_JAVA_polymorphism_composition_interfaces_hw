package com.babycastles.attractions;

import com.babycastles.behaviours.IReviewed;
import com.babycastles.behaviours.ISecurity;
import com.babycastles.people.Visitor;

public class Playground extends Attraction implements IReviewed, ISecurity {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor != null) {
            return visitor.getAge() < 15;
        }
        return false;
    }


}
