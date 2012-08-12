package com.visionarysoftwaresolutions.reviewable;

import com.visionarysoftwaresolutions.reviewable.stubs.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewableTest {
    Reviewer nick = new User("nick");
    Reviewable food = new Food("Phonecian Cafe Hummus");
    
    @Test
    public void testReview() {
        //When I have the Reviewer review the Reviewable
        Review result = nick.review(food, 
                "It is so creamy and delicious!");
        //Then it is reviewed
        assertEquals(result.getReviewer(), nick);
        assertEquals(result.getReviewed(), food);
        assertEquals(result.getDescription(), "It is so creamy and delicious!");
    }
    
    
    @Test
    public void testDatedReview(){
        //Given I'm reviewing something today
        java.util.Date today = new java.util.Date();
        //When I have a reviewer rate a reviewable
        Review result = nick.review(food, 
                "It is so creamy and delicious!");
        //And I want a Dated Review
        DatedReview datedResult = new DatedReview(result);
        //Then it is rated
        assertEquals(datedResult.getReviewer(), nick);
        assertEquals(datedResult.getReviewed(), food);
        assertEquals(today.compareTo(datedResult.getDate()),-1);
        assertEquals("It is so creamy and delicious! on " + today, 
                datedResult.getDescription());
    }
}
