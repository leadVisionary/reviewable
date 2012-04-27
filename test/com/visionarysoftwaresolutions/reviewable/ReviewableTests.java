package com.visionarysoftwaresolutions.reviewable;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewableTests {
    @Test
    public void testReview() {
        //Given I have a Reviewer and a Reviewable
        Reviewer nick = new User("nick");
        Reviewable food = new Food("Phonecian Cafe Hummus");
        //When I have the Reviewer rate the Reviewable
        Review result = nick.review(food, 
                "It is so creamy and delicious!");
        //Then it is reviewed
        assertEquals(result.getReviewer(), nick);
        assertEquals(result.getReviewed(), food);
        assertEquals(result.getDescription(), "It is so creamy and delicious!");
    }
    
    @Test
    public void testRatedReview(){
        //Given I have a Reviewer and a Reviewable
        
        Reviewer nick = new User("nick");
        Reviewable food = new Food("Phonecian Cafe Hummus");
        //When I have the Reviewer rate the Reviewable
        RatedReview result = nick.rate(food, 
                FiveStarRatingScale.five(), 
                "It is so creamy and delicious!");
        //Then it is rated
        assertEquals(result.getRatingScale(), FiveStarRatingScale.class);
    }
    
    @Test
    public void testDatedReview(){
        java.util.Date today = new java.util.Date();
        fail("do something");
    }
}