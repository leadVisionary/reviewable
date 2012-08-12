package com.visionarysoftwaresolutions.reviewable.stubs;

import com.visionarysoftwaresolutions.reviewable.Review;
import com.visionarysoftwaresolutions.reviewable.ReviewFactory;
import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public class StubReviewFactory implements ReviewFactory {
	private boolean wantsDate = true;
	
	@Override
    public Review create(Reviewer reviewer, Reviewable reviewed, String description){
    	return pickReview(reviewer, reviewed, description);
    }
	
	public void doNotWant(){
		wantsDate = false;
	}
	
	private Review pickReview(Reviewer reviewer, Reviewable reviewed, String description){
		return (wantsDate) ? 
				new FoodReview(reviewer, reviewed, description) :
				new DatedReview(new FoodReview(reviewer, reviewed, description));
	}
}
