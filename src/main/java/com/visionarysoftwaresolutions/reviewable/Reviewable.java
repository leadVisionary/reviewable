package com.visionarysoftwaresolutions.reviewable;

/**
 *
 * @author Nicholas Vaidyanathan, Lead Visionary of Visionary Software Solutions
 * @description Reviewable is a simple interface for a role that an entity that 
 * is reviewable would take. We try to make it as generalizable as 
 * possible so it can apply in multiple situations.
 * We assert a reviewable should know about its review from a Reviewer, and should be able to retrieve it.
 * Scenario: A Reviewer creates a Review for a Reviewable, rating it on a Scale with a Description
 */
public interface Reviewable {
    public abstract Review getReview(Reviewer reviewer);
}
