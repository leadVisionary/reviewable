package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.rating.RatedReview;
import com.visionarysoftwaresolutions.reviewable.rating.RatingScale;
import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public class User implements Reviewer {
    private String name;
    
    public User(String string) {
        name = string;
    }

    @Override
    public Review review(Reviewable toReview, String description) {
        return new BasicFoodReview(this, toReview, description);
    }

    @Override
    public RatedReview rate(Reviewable toReview, String description, RatingScale scale) {
        return new RatedFoodReview(this,toReview,description,scale);
    }
}