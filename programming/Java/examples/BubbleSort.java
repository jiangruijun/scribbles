package examples;

import java.util.*;

public class BubbleSort{
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
		
		RunBubbleSort rbs=new RunBubbleSort();
		Calendar start=Calendar.getInstance();
		System.out.println("Start Sorting Time: \n"+start.getTime());
		rbs.runBubbleSort(a);
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

class RunBubbleSort{
	public void runBubbleSort(int array[]){
		int container=0;
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					container=array[j];
					array[j]=array[j+1];
					array[j+1]=container;
				}
			}
		}
	}
}
