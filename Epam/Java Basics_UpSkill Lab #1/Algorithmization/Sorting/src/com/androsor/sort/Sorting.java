package com.androsor.sort;

public interface Sorting {

     /**
      * Returns an array in ascending or descending order.
      * @param numbers sortable array.
      * @param sortSelection selection of sorting direction.
      * @return array in ascending or descending order.
      */
     int[] sort(int[] numbers, boolean sortSelection);
}
