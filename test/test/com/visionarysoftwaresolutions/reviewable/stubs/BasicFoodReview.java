package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public class BasicFoodReview extends FoodReview {

    public BasicFoodReview(Reviewer reviewer, Reviewable reviewed, String description){
        super(reviewer, reviewed, description);
    }
}
