package day22_MultiDimensionArray;

import java.util.Arrays;

public class PrintElements {
    public static void main(String[] args) {
/*
 Given the array:
            int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };
 Use for each loop to print each elements
 */
/*
        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} };

        for (int[][][][][][][] arr7D : arr8D) {
            for (int[][][][][][] arr6 : arr7D) {
                for (int[][][][][] arr5 : arr6) {
                    for (int[][][][] arr4 : arr5) {
                        for (int[][][] arr3 : arr4) {
                            for (int[][] arr2 : arr3) {
                                for (int[] arr : arr2) {
                                    System.out.print(Arrays.toString(arr));
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }

*/
        int[][][][][][][][]  arr8D = { {{{{{{{1,2,3,4,5}}}}}}} }; // ===> other solution
        for (int[][][][][][][] ints : arr8D) {
            for (int[][][][][][] anInt : ints) {
                for (int[][][][][] ints1 : anInt) {
                    for (int[][][][] ints2 : ints1) {
                        for (int[][][] ints3 : ints2) {
                            for (int[][] ints4 : ints3) {
                                for (int[] ints5 : ints4) {
                                    for (int i : ints5) {
                                        System.out.print(i+" ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


























    }
}
