package com.visionarysoftwaresolutions.reviewable;

import com.visionarysoftwaresolutions.reviewable.rating.RatingScale;
import com.visionarysoftwaresolutions.reviewable.rating.RatedReview;
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
    public void testRatedReview(){
        //When I have the Reviewer rate the Reviewable
        RatedReview result = nick.rate(food, 
                "It is so creamy and delicious!",
                FiveStarRatingScale.five());
        //Then it is rated
        assertEquals(result.getReviewer(), nick);
        assertEquals(result.getReviewed(), food);
        RatingScale howRated = result.getRatingScale();
        assertEquals(howRated.getRating(), new NumericalRating(5,howRated));
        assertArrayEquals(howRated.range(), 
                          new String[] { "0", "1", "2", "3", "4", "5" });
    }
    
    @Test
    public void testDatedReview(){
        //Given I'm reviewing something today
        java.util.Date today = new java.util.Date();
        //When I have a reviewer rate a reviewable
        RatedReview result = nick.rate(food, 
                "It is so creamy and delicious!",
                FiveStarRatingScale.five());
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
