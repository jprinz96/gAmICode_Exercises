package org.lecture.emmiAufDerSuche.emmisGroßerSnackAnsturm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.util.*;

public class EmmiSnackFinder {
    // TO DO
    public static List<Snack> findSnacks(TrackedSnackList snacks, List<Integer> targetIds){

        mergeSort(snacks);
        return binarySearch(snacks, targetIds);

    }
    //mergeSort
    private static void mergeSort(TrackedSnackList snacks){
        if(snacks.size() <= 1){
            return;
        }

        List<Snack> left = new ArrayList<>();
        List<Snack> right = new ArrayList<>();


        int middle = snacks.size()/2;
        //links
        for (int i = 0; i < middle; i++){
            left.add(snacks.get(i));
        }
        //rechts
        for(int i = middle; i < snacks.size(); i++){
            right.add(snacks.get(i));
        }


        TrackedSnackList leftSnacks = new TrackedSnackList(left);
        TrackedSnackList rightSnacks = new TrackedSnackList(right);

        mergeSort(leftSnacks);
        mergeSort(rightSnacks);
        merge(snacks, leftSnacks, rightSnacks);

    }

    private static void merge(TrackedSnackList snacks, TrackedSnackList left, TrackedSnackList right){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.size() && j < right.size()){

            if(left.get(i).id() <= right.get(j).id()){
                //snacks.set(index, snack);
                snacks.set(k, left.get(i));
                i++;
            }
            else{
                snacks.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while(i < left.size()){
            snacks.set(k, left.get(i));
            i++;
            k++;
        }
        while(j < right.size()){
            snacks.set(k, right.get(j));
            j++;
            k++;
        }
    }

    //binarySearch
    private static List<Snack> binarySearch(
            TrackedSnackList snacks, List<Integer> targetIds) {

        List<Snack> result = new ArrayList<>();

        for (int id : targetIds) {
            int left = 0;
            int right = snacks.size() - 1;
            Snack found = null;

            while (left <= right) {
                int middle = left + (right - left) / 2;
                Snack current = snacks.get(middle);

                if (current.id() == id) {
                    found = current;
                    break;
                } else if (current.id() < id) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } // Suche für diese ID beendet

            result.add(found);
        } // Alle Ziel-IDs bearbeitet

        return result;
    }


}
