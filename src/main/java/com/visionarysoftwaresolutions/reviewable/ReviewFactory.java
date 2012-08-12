package com.visionarysoftwaresolutions.reviewable;

public interface ReviewFactory {
	public Review create(Reviewer reviewer, Reviewable toReview, String description);
}
