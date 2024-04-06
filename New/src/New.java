import java.util.Arrays;

public class New {
	
	public static void main(String[] args){
		
		int [] array= {1,4,5,9,7,8,10};
		int[] sortedArray=Arrays.stream(array).sorted().toArray();
		System.out.println(Arrays.toString(sortedArray));
		int [] arrafgy= {1,4,5,9,7,8,10};
	}


}
