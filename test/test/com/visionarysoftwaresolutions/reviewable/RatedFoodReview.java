package com.visionarysoftwaresolutions.reviewable;

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
