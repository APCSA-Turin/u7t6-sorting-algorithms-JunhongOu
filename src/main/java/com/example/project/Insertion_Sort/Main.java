package com.example.project.Insertion_Sort;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int[] arrA = {83,7,58,41,85,70,19,53,71,67,13,87,27,17,77,23,21,28,3,99,43,51,8,16,96,6,37,42,2,50,64,66,76,55,78,9,92,15,86,91,25,12,10,48,75,74,65,47,32,88};
InsertionSort.selectionSort(arrA);
System.out.println(Arrays.toString(arrA));
System.out.println();
int[] arrB = {83,7,58,41,85,70,19,53,71,67,13,87,27,17,77,23,21,28,3,99,43,51,8,16,96,6,37,42,2,50,64,66,76,55,78,9,92,15,86,91,25,12,10,48,75,74,65,47,32,88};
InsertionSort.insertionSort(arrB);
System.out.println(Arrays.toString(arrB));

    }
}