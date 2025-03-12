package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A. implementing selection sort
    public static int[] selectionSort(int[] elements) {
        int x = elements.length;

        for (int i = 0; i < x - 1; i++){
            int idx = i;
            for (int j = i + 1; j < x; j++){
                if (elements[j] < elements[idx]){
                    idx = j;
                }
            }
            if (idx != i){
                int swap = elements[i];
                elements[i] = elements[idx];
                elements[idx] = swap;
            }
        }
        return elements;
    }


    // PART B. sorting a 1000-word list
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        
        for (int i = 0; i < words.size() - 1; i++){
            int idx = i;
            for (int j = i + 1; j < words.size(); j++){
                if (words.get(j).compareTo(words.get(idx)) < 0){
                    idx = j;
                }
            }
           
                String swap = words.get(i);
                words.set(i, words.get(idx));
                words.set(idx, swap);
           
        }

        return words;
    }

    //call this method to load 1000 words into list. Use it to test Part B
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
