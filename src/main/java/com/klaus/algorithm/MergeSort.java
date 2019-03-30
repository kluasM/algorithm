package com.klaus.algorithm;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,1,10,8,2,6,7,4,9,5};
        System.out.println("Origin arr : ");
        for (int var : arr) {
            System.out.print(var + " ");
        }
        System.out.println();
        System.out.println("Sorted arr : ");
        mergeSort(arr);
        for (int var : arr) {
            System.out.print(var + " ");
        }
    }
    /**
     * 归并排序
     */
    public static void mergeSort(int[] arrs){
        int[] temp=new int[arrs.length];
        mergeSort(arrs,temp,0,arrs.length-1);//
    }
    public static void mergeSort(int[] arr,int[] temp,int left,int right){
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(arr,temp,left,mid);
            mergeSort(arr,temp,mid+1,right);
            merge(arr,temp,left,mid,right);
        }
    }
    /**
     * 子数组归并算法，归并完成结果拷贝至原数组。
     *
     * @param arr 原数组
     * @param temp 交换数组
     * @param left 最左坐标值
     * @param mid 中点坐标值
     * @param right 最右坐标值*/

    public static void merge(int[] arr,int[] temp,int left,int mid,int right){
        int l=left;
        int m=mid+1;
        int k=0;
        while (l<=mid&&m<=right){
            if (arr[l]<arr[m]){
                temp[k++]=arr[l++];
            }else {
                temp[k++]=arr[m++];
            }
        }
        while(l<=mid){
            temp[k++] = arr[l++];
        }
        while(m<=right){
            temp[k++] = arr[m++];
        }
        k=0;
        while (left<=right) {
            arr[left++]=temp[k++];
        }
    }
}
