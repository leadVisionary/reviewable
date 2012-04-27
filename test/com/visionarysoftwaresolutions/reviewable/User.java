package com.visionarysoftwaresolutions.reviewable;

class User implements Reviewer {
    private String name;
    
    public User(String string) {
        name = string;
    }

    @Override
    public Review review(Reviewable toReview, String description) {
        return new FoodReview(this, toReview, description);
    }

    @Override
    public RatedReview rate(Reviewable toReview, RatingScale ratingScale, String description) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}