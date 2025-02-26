package com.example.project.Selection_Sort;
public class Main{
    public static void main (String[] args){
        int[] numbers = {68, 71, 33, 44, 101};
        SelectionSort.selectionSort(numbers);
        
                for (int num : numbers){
                    System.out.print(num + " ");
                }
            }
        
 
    
}