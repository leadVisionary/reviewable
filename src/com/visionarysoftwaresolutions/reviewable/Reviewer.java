package com.visionarysoftwaresolutions.reviewable;

/**
 *
 * @author Nicholas Vaidyanathan, Lead Visionary of Visionary Software Solutions
 * @description Reviewer is a simple interface for a role that an entity that 
 * reviews other entities would take. We try to make it as generalizable as 
 * possible so it can apply in multiple situations
 * Scenario: A Reviewer creates a Review for a Reviewable, rating it on a RatingScale with a Description
 */
public interface Reviewer {
    public abstract Review review(Reviewable toReview, String description);
    public abstract RatedReview rate(Reviewable toReview, RatingScale ratingScale, String description);
}
