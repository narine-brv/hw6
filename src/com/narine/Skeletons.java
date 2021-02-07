package com.narine;

public class Skeletons extends Boss {

    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String info() {
        return super.info() + ", number of arrows " + numberOfArrows;
    }
}

