package com.visionarysoftwaresolutions.reviewable;

/**
 *
 * @author Nicholas Vaidyanathan, Lead Visionary of Visionary Software Solutions
 * @description RatingScale is a simple interface for a rating scale used in a review. 
 * We try to make it as generalizable as possible so it can apply in multiple situations
 * Scenario: A Reviewer creates a Review for a Reviewable, rating it on a RatingScale with a Description
 */
public interface RatingScale {
    public abstract String[] range();
    public abstract Rating getRating();
}
