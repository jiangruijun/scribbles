package examples;

import java.util.*;

public class InsertionSort{
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
		
		RunInsertionSort ris=new RunInsertionSort();
		Calendar start=Calendar.getInstance();
		System.out.println("Start Sorting Time: \n"+start.getTime());
		ris.runInsertionSort(a);
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

class RunInsertionSort{
	public void runInsertionSort(int array[]){
		for(int i=1;i<array.length;i++){
			int firstUnsortedElement=array[i];
			int lastSortedElementIndex=i-1;
			while(lastSortedElementIndex>=0&&firstUnsortedElement<array[lastSortedElementIndex]){
				array[lastSortedElementIndex+1]=array[lastSortedElementIndex];
				lastSortedElementIndex--;
			}
			array[lastSortedElementIndex+1]=firstUnsortedElement;
		}
	}
}
