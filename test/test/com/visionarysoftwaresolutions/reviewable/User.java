package com.visionarysoftwaresolutions.reviewable;

class User implements Reviewer {
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