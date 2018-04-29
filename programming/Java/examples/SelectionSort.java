package examples;

import java.util.*;

public class SelectionSort{
	public static void main(String[] args){
		int len=100000;
		int a[]=new int[len];
		for(int i=0;i<len;i++){
			int seq=(int)(Math.random()*100000);
			a[i]=seq;
		}
		
		/*
		System.out.println("A New Sequence: ");
		for(int i=0;i<a.length;i++){
			if((i+1)%10==0){
				System.out.println(a[i]+" ");
			}
			else{
				System.out.print(a[i]+" ");
			}
		}
		*/
		
		RunSelectionSort rss=new RunSelectionSort();
		Calendar start=Calendar.getInstance();
		System.out.println("Start Sorting Time: \n"+start.getTime());
		rss.runSelectionSort(a);
		Calendar finish=Calendar.getInstance();
		System.out.println("Finish Sorting Time: \n"+finish.getTime());
		
		/*
		System.out.println("The Sorted Sequence: ");
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

class RunSelectionSort{
	public void runSelectionSort(int array[]){
		int container=0;
		for(int i=0;i<array.length-1;i++){
			int minimumElement=array[i];
			int minimumElementIndex=i;
			for(int j=i+1;j<array.length;j++){
				if(minimumElement>array[j]){
					minimumElement=array[j];
					minimumElementIndex=j;
				}
			}
			container=array[i];
			array[i]=array[minimumElementIndex];
			array[minimumElementIndex]=container;
		}
	}
}
