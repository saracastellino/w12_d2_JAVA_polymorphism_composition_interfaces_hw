package com.babycastles.attractions;

import com.babycastles.behaviours.IReviewed;
import com.babycastles.behaviours.ITicketed;
import com.babycastles.people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 4.50;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() > 12);
        return 2.25;
    }
}
