package com.visionarysoftwaresolutions.reviewable;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

final class User implements Reviewer {
    private final String name;
    
    public User(String string) {
        name = string;
    }

    @Override
    public Review review(Reviewable toReview, String description) {
        return new StubReviewFactory().create(this, toReview, description);
    }
}