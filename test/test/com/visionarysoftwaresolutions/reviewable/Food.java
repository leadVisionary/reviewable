package com.visionarysoftwaresolutions.reviewable;

class Food implements Reviewable {
    private String name;
    
    public Food(String string) {
        name = string;
    }

    @Override
    public Review getReview(Reviewer reviewer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}