package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

import java.util.HashMap;

public class RollerCoaster extends Attraction implements IReviewed, ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor != null) {
            return visitor.getHeight() > 145 && visitor.getAge() > 12;
        }
        return false;
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200);
        return 16.80;
    }


}

