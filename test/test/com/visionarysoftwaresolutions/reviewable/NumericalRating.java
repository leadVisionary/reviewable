package com.visionarysoftwaresolutions.reviewable;

class NumericalRating implements Rating {
    private RatingScale scale;
    private int number;
    // No external construction!
    private NumericalRating(){}
    
    public NumericalRating(int number, RatingScale scale){
        this.number = number;
        this.scale = scale;
    }
    
    @Override
    public RatingScale getScale() {
        return scale;
    }
    
    @Override
    public boolean equals(Object object) {
        if(!(object instanceof NumericalRating)){
            return false;
        }
        NumericalRating rating = (NumericalRating) object;
        return number == rating.number;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.number;
        hash = 17 * hash + (this.getScale() != null ? this.getScale().hashCode() : 0);
        return hash;
    }
}
