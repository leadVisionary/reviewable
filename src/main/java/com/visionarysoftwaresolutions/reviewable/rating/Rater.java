package com.visionarysoftwaresolutions.reviewable.rating;

import com.visionarysoftwaresolutions.reviewable.Reviewable;
import com.visionarysoftwaresolutions.reviewable.Reviewer;

public interface Rater extends Reviewer {
    public abstract RatedReview rate(Reviewable toReview, String description, RatingScale scale);
}
