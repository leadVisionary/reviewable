package com.visionarysoftwaresolutions.reviewable;

public abstract class ReviewDecorator implements Review {
    protected final Review decoratedReview;
    
    public ReviewDecorator(Review toDecorate){
        this.decoratedReview = toDecorate;
    }
    
    @Override
    public String getDescription() {
        return decoratedReview.getDescription();
    }

    @Override
    public Reviewer getReviewer() {
        return decoratedReview.getReviewer();
    }

    @Override
    public Reviewable getReviewed() {
        return decoratedReview.getReviewed();
    }
}
