package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;

public class Park extends Attraction implements IReviewed {

    public Park(String name, int rating) {
        super(name, rating);
    }
}
