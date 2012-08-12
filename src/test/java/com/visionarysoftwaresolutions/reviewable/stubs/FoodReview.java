package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public final class FoodReview implements Review {
    private final String description;
    private final Reviewer reviewer;
    private final Reviewable reviewed;
    
    FoodReview(Reviewer reviewer, Reviewable reviewed, String description){
        this.reviewer = reviewer;
        this.reviewed = reviewed;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Reviewable getReviewed() {
        return reviewed;
    }

    @Override
    public Reviewer getReviewer() {
        return reviewer;
    }
}
