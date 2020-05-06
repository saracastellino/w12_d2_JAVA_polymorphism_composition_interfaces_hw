package com.babycastles.behaviours;

import com.babycastles.people.Visitor;

public interface ISecurity {
    public boolean isAllowedTo(Visitor visitor);
}
