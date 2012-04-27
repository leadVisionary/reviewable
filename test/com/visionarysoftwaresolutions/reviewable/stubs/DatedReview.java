package com.visionarysoftwaresolutions.reviewable.stubs;
import com.visionarysoftwaresolutions.reviewable.rating.RatedReview;
import com.visionarysoftwaresolutions.reviewable.ReviewDecorator;
import java.util.Date;

public class DatedReview extends ReviewDecorator {
    
    private Date date;
    
    public DatedReview(RatedReview review){
        super(review);
        date = new java.util.Date();
    }
    
    @Override
    public String getDescription() {
        return super.getDescription() + " on " + date.toString();
    }
    
    public Date getDate(){
        return date;
    }
}
