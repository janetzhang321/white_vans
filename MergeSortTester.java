/*======================================
  class MergeSortTester
  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>
  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 0.0
  n=10      time: 0.0
  n=100     time: 0.1
  ...
  n=<huge>  time: 7510.0
  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{
    /******************************
     * execution time analysis 
     * To calculate the time it takes for the function,
     * we set the beginning time as System.currentTimeMillis
     * then we find the end time by calling the same command
     * Then we find the total time it took for mergesort by 
     * subtracting beginning from end time
     ******************************/
    public static void pop(int[] j, int n){
	for(int x=0;x<n;x++){j[n]=(int)(Math.random()*100);}
    }
    public static void main( String[] args ) 
    {
	MergeSort a=new MergeSort();
	int[] batch1={1};
	int[] batch2={10,9,8,7,6,5,4,3,2,1};
	int[] batch3=new int[100];
	//pop(batch3, batch3.length-1);
	int[] batch4=new int[10000];
	//pop(batch4, batch4.length-1);
	int[] batch5=new int[1000000];
	//pop(batch5, batch5.length-1);

	
	double beginning=System.currentTimeMillis();
	a.sort(batch1);
	double end=System.currentTimeMillis();
	System.out.print("Time to sort length1: " );
	System.out.println(end-beginning);

	beginning=System.currentTimeMillis();
	a.sort(batch2);
	end=System.currentTimeMillis();
	System.out.print("Time to sort length10: " );
	System.out.println(end-beginning);
	
	beginning=System.currentTimeMillis();
	a.sort(batch3);
	end=System.currentTimeMillis();
	System.out.print("Time to sort length100: " );
	System.out.println(end-beginning);
	
	beginning=System.currentTimeMillis();
	a.sort(batch4);
	end=System.currentTimeMillis();
	System.out.print("Time to sort length10000: " );
	System.out.println(end-beginning);
	
	beginning=System.currentTimeMillis();
	a.sort(batch5);
	end=System.currentTimeMillis();
	System.out.print("Time to sort length1000000: " );
	System.out.println(end-beginning);

    }//end main

}//end class
