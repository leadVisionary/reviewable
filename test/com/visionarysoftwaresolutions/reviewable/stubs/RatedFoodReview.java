package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.rating.RatedReview;
import com.visionarysoftwaresolutions.reviewable.rating.RatingScale;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

/**
 *
 * @author master
 */
public class RatedFoodReview extends FoodReview implements RatedReview {
    private RatingScale scale;
    
    public RatedFoodReview(Reviewer reviewer, 
                           Reviewable reviewed, 
                           String description,
                           RatingScale scale)
    {
        super(reviewer, reviewed, description);
        this.scale = scale;
    }

    @Override
    public RatingScale getRatingScale() {
        return scale;
    }
}
