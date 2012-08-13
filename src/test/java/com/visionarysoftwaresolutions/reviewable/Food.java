package com.visionarysoftwaresolutions.reviewable;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

class Food implements Reviewable {
    private final String name;
    
    public Food(String string) {
        name = string;
    }

    @Override
    public Review getReview(Reviewer reviewer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}