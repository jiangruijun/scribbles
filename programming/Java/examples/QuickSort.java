package examples;

import java.util.*;

public class QuickSort{
	public static void main(String[] args){
		int len=100000;
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			int mr=(int)(Math.random()*100000);
			a[i]=mr;
		}
		
		/*
		System.out.println("A New List: ");
		for(int i=0;i<a.length;i++){
			if((i+1)%10==0){
				System.out.println(a[i]+" ");
			}
			else{
				System.out.print(a[i]+" ");
			}
		}
		*/
		
		RunQuickSort rqs=new RunQuickSort();
		Calendar start=Calendar.getInstance();
		System.out.println("Start Sorting Time: \n"+start.getTime());
		rqs.runQuickSort(0,a.length-1,a);
		Calendar finish=Calendar.getInstance();
		System.out.println("Finish Sorting Time: \n"+finish.getTime());
		
		/*
		System.out.println("The Sorted List: ");
		for(int i=0;i<a.length;i++){
			if((i+1)%10==0){
				System.out.println(a[i]+" ");
			}
			else{
				System.out.print(a[i]+" ");
			}
		}
		*/
	}
}

class RunQuickSort{
	public void runQuickSort(int leftElementIndex,int rightElementIndex,int array[]){
		int leftPointer=leftElementIndex;
		int rightPointer=rightElementIndex;
		int pivot=array[(leftElementIndex+rightElementIndex)/2];
		int container=0;
		while(leftPointer<rightPointer){
			while(array[leftPointer]<pivot){
				leftPointer++;
			}
			while(array[rightPointer]>pivot){
				rightPointer--;
			}
			if(leftPointer>=rightPointer){
				break;
			}
			container=array[leftPointer];
			array[leftPointer]=array[rightPointer];
			array[rightPointer]=container;
			if(array[leftPointer]==pivot){
				rightPointer--;
			}
			if(array[rightPointer]==pivot){
				leftPointer++;
			}
		}
		if(leftPointer==rightPointer){
			leftPointer++;
			rightPointer--;
		}
		if(leftElementIndex<rightPointer){
			runQuickSort(leftElementIndex,rightPointer,array);
		}
		if(rightElementIndex>leftPointer){
			runQuickSort(leftPointer,rightElementIndex,array);
		}
	}
}
