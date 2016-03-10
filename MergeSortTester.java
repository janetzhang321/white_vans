/*======================================
  class MergeSortTester
  ALGORITHM:
  When one runs a sort on a certain aray, the sort method is first called.
  It checks if the array is of length one, if so, it returns, otherwise it begins
  to split the original input array, creating empty arrays half the size and
  populating them, recursing on each half, first heading down a single branch of the
  recursive "break-down" tree. Once a branch is fully split, the merging is called,
  and the arrays merge back sorted, via a comparison of the elements within, looking at
  the frontmost element, one index at a time. Once the counter exceeds the lengths of one of
  the list you are merging, it continues on with the list you have not finished, by adding it
  on to the array. (The splitting continues down the next branch of the recursive tree, followed
  by merging, and so on, until the final branch is hit, and fully merged with the previously split/sorted
  ones, and the array is sorted.)
  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(n log(n))
  //log base 2
  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 2816.0 ns
  n=10      time: 16128.0 ns
  n=100     time: 189952.0 ns
  ...
  n=<huge>  time: 2.47575808E8 ns
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

	
	double beginning=System.nanoTime();
	a.sort(batch1);
	double end=System.nanoTime();
	System.out.print("Time to sort length1: " );
	System.out.println(end-beginning);

	beginning=System.nanoTime();
	a.sort(batch2);
	end=System.nanoTime();
	System.out.print("Time to sort length10: " );
	System.out.println(end-beginning);
	
	beginning=System.nanoTime();
	a.sort(batch3);
	end=System.nanoTime();
	System.out.print("Time to sort length100: " );
	System.out.println(end-beginning);
	
	beginning=System.nanoTime();
	a.sort(batch4);
	end=System.nanoTime();
	System.out.print("Time to sort length10000: " );
	System.out.println(end-beginning);
	
	beginning=System.nanoTime();
	a.sort(batch5);
	end=System.nanoTime();
	System.out.print("Time to sort length1000000: " );
	System.out.println(end-beginning);

    }//end main


}//end class
