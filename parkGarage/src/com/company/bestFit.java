package com.company;

import java.util.List;

public class bestFit implements ParkMethod
 {
  int index=0;
  @Override
  public int parkin(Vehicle vehicle, List<Integer> Slot, List<Dimensions>dimensions, int size){

   for(int i=0;i<size;i++)
   {
    if(Slot.get(i)==0)
    {
     Dimensions dim=dimensions.get(i);
     if(dim.getDepth()<= vehicle.getDepth()&&dim.getWidth()<= vehicle.getWidth())
     {
      index=i;
      return index;

     }
    }
    else
    {
     System.out.println("There are no empty places\n");
    }


   }

   return index;

  }
}
