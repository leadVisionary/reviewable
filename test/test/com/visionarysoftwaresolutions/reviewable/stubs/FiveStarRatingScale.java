package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.Rating;
import com.visionarysoftwaresolutions.reviewable.RatingScale;

public class FiveStarRatingScale implements RatingScale {
    private Rating stars;
    
    public static RatingScale five() {
        FiveStarRatingScale five = new FiveStarRatingScale(5);
        return five;
    }

    private FiveStarRatingScale(int i) {
        rate(i);
    }
    
    public final void rate(int stars){
        if(stars < 0){
            throw new IllegalArgumentException("Must be greater than 0 stars");
        }
        if(stars > 5){
            throw new IllegalArgumentException("Can't be more than 5 stars");
        }
        this.stars = new NumericalRating(stars, this);
    }

    @Override
    public String[] range() {
        return new String[] { "0", "1", "2", "3", "4", "5" };
    }
    
    @Override
    public Rating getRating() {
        return stars;
    }
    
    @Override
    public boolean equals(Object object) {
        return !(object instanceof FiveStarRatingScale) && 
                stars == ((FiveStarRatingScale) object).stars;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.stars.hashCode();
        return hash;
    }
}
