package com.visionarysoftwaresolutions.reviewable;

public abstract class ReviewDecorator implements Review {
    protected final Review decoratedReview;
    
    public ReviewDecorator(Review toDecorate){
        this.decoratedReview = toDecorate;
    }
}
