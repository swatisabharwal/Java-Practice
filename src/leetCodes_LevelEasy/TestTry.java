/*
 * package leetCodes_LevelEasy;
 * 
 * import java.util.*;
 * 
 * public class TestTry { public static void main(String[] args) { int[] arr1 =
 * { 3, 15, 4, 126, 87 }; bubbleSort(arr1); mergeSort(arr1, 0, arr1.length); }
 * 
 * public static void bubbleSort(int[] arr) { int temp=0; // Time Complexity :
 * O(n^2) for (int i = arr.length - 1; i > 0; i--) { for (int j = 0; j <
 * arr.length - 1; j++) { if (arr[j] > arr[j + 1]) { temp =arr[j+1];
 * arr[j+1]=arr[j]; arr[j]=temp; }
 * 
 * } } System.out.println("Bubble Sorted: "); for(int i=0;i<arr.length;i++) {
 * System.out.print(arr[i]+","); } }
 * 
 * public static void mergeSort(int[]arr,int l,int h) {
 * 
 * if(l<h) { int middle = (l+h)/2; mergeSort(arr,l, middle); mergeSort(arr,
 * middle+1, h); merge(arr,l,middle+1,h); } } public static void merge(int[]
 * arr,int l,int h, int middleplus1) { int temp=0; int middle = middleplus1-1;
 * while(l<=middle&& middleplus1<=h) { arr[] }
 * 
 * }
 * 
 * }
 */