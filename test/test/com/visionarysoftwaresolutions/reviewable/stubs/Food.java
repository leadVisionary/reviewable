package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public class Food implements Reviewable {
    private String name;
    
    public Food(String string) {
        name = string;
    }

    @Override
    public Review getReview(Reviewer reviewer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}