package com.visionarysoftwaresolutions.reviewable;

/**
 *
 * @author Nicholas Vaidyanathan, Lead Visionary of Visionary Software Solutions
 * @description Review is a simple interface for a review that an entity that 
 * reviews other entities would take. We try to make it as generalizable as 
 * possible so it can apply in multiple situations
 * Scenario: A Reviewer creates a Review for a Reviewable with a description
 * Example: Nick creates a Review of YourFace with a description "It's awesome!" 
 */
public interface Review {
    public abstract String getDescription();
    public abstract Reviewer getReviewer();
    public abstract Reviewable getReviewed();
}
