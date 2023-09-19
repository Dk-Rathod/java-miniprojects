package com.company;

class BinarySearch {
public static int BinarySearch(int[] arr,int target) {

    int start=0;
    int end = arr.length-1;
    boolean isasc=arr[start]<arr[end];

    while (start<=end){
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(isasc) {
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        else
        {
            if(arr[mid]>target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    }
    return -1;


}

    public static void main(String[] args) {
        int[]  arr = {8,7,5,4,3,2,1};
        int target = 5;
        int r = BinarySearch(arr,target);
        System.out.println(r);
    }
        }
