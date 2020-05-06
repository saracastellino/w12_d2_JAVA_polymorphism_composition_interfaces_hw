package com.babycastles.behaviours;

import com.babycastles.people.Visitor;

public interface ITicketed {
    public double defaultPrice();
    public double priceFor(Visitor visitor);
}
