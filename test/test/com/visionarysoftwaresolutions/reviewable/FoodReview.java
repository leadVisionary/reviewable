package com.visionarysoftwaresolutions.reviewable;

public abstract class FoodReview implements Review {
    private String description;
    private Reviewer reviewer;
    private Reviewable reviewed;
    
    public FoodReview(Reviewer reviewer, Reviewable reviewed, String description){
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
