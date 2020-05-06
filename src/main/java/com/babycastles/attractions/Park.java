package com.babycastles.attractions;

import com.babycastles.behaviours.IReviewed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }
}