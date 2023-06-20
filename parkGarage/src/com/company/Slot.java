package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Slot {
    private List<Integer> Slot= new ArrayList<Integer>();
    private List<Dimensions>dimensions= new ArrayList<Dimensions>();

    public List<Dimensions> getdimensions(int index) {
        return dimensions;
    }

    public void setdimensions( Dimensions d,int index) {
       // dimensions=new Dimensions();
        this.dimensions.add(index,d );
    }

    public List<Integer> getSlot() {
        return Slot;
    }

    public void setSlot(List<Integer> slot) {
        Slot = slot;
    }
}
