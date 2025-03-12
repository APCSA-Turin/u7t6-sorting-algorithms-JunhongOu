package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements){
        int count = 0;
        for (int i = 1; i < elements.length; i++){
            int currentElement = elements[i];
            int previousElement = i - 1;
            
            while (previousElement >= 0 && elements[previousElement] > currentElement){
                elements[previousElement + 1] = elements[previousElement];
                previousElement--;
                count++;
            }

            elements[previousElement + 1] = currentElement;
    }
    System.out.println(count);
    return elements;
}

   
    public static void selectionSort(int[] elements) {
        int x = elements.length;
        int count = 0;

        for (int i = 0; i < x - 1; i++){
            int initialIdx = i;
            for (int j = i + 1; j < x; j++){
                if (elements[j] < elements[initialIdx]){
                    initialIdx = j;
                }
                count++;
            }
            if (initialIdx != i){
                int swap = elements[i];
                elements[i] = elements[initialIdx];
                elements[initialIdx] = swap;
            }
        }

        System.out.println(count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        
        for (int i = 1; i < words.size(); i++){
            String currentElement = words.get(i);
            int previousElement = i - 1;
            
            while (previousElement >= 0 && words.get(previousElement).compareTo(currentElement) > 0){
                words.set(previousElement + 1, words.get(previousElement));
                previousElement--;
            }

            words.set(previousElement + 1, currentElement);
    }
    
    return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        int x = words.size();
        int count = 0;

        for (int i = 0; i < x - 1; i++){
            int initialIdx = i;
            for (int j = i + 1; j < x; j++){
                if (words.get(j).compareTo(words.get(initialIdx)) < 0){
                    initialIdx = j;
                }
                count++;
            }
            if (initialIdx != i){
                String swap = words.get(initialIdx);
                words.set(initialIdx, words.get(initialIdx));
                words.set(initialIdx, swap);
            }
        }

        System.out.println(count);
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }

   
}