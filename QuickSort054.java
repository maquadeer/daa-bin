/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort054;
import java.util.*;
/**
 *
 * @author Student
 */
public class QuickSort054 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random rand = new Random();
    int[] a = new int[10];

    for (int i = 0; i < a.length; i++) {
      a[i] = rand.nextInt(100);
    }
        quick(a, 0, a.length - 1);
        for(int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }
    }
    
    public static void quick(int a[],int l,int h){
        if(l>=h)
            return;
        int pivot=a[h];
        int lowIndex=l;
        int highIndex=h;
        while(lowIndex<highIndex){
            while(a[lowIndex]<=pivot && lowIndex<highIndex){
                lowIndex++;
            }
            while(a[highIndex]>=pivot && lowIndex<highIndex){
                highIndex--;
            }
            swap(a, lowIndex, highIndex);
        }
        if(a[lowIndex] > pivot) 
        swap(a, lowIndex, h);
        quick(a, l, lowIndex-1);
        quick(a, lowIndex+1, h);
    }
    public static void swap(int a[], int i, int j){
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
