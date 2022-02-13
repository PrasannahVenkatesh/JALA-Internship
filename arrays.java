
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		int total = 0;
		for(int i=0;i<array.length;i++) {
			total+=array[i];
		}
		System.out.println("Total: "+total);
		System.out.println("Average: "+total/array.length);
		
		int x = 5;
		for(int i=0;i<array.length;i++) {
			if(array[i]==x) {
				System.out.println(i);
			}
		}
		// to remove by replacing with 0
		int element = 5;
		for(int i = 0;i<array.length;i++) {
			if(array[i] == element) {
				array[i] = 0;
			}
		}
		int[] arr = new int[array.length];
		for(int i = 0;i<array.length;i++)
		{
			arr[i] = array[i];
		}
		
		int pos = 4, n = 20;
		array[pos] = n;
		
		int min = array[0],max = array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
			if(max<array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("Maximum: "+max+" Minimum: "+min);
		System.out.println("Reversed Array");
		int[] reverse = new int[array.length];
		for(int i=array.length-1;i>=0;i--) {
			reverse[array.length - 1 - i] = array[i];
			System.out.print(reverse[array.length - 1 - i]+" ");
		}
		
		System.out.println("");
		// adding duplicate element 9 to array
		array[2] = 9;
		int[] count = new int[array.length];
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] == array[j]) {
					count[i]++;
				}
			}
		}
		System.out.println("Duplicate Elements");
		for(int i=0;i<count.length;i++) {
			if(count[i]>0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
		
		// second max
		int secondmax = array[0];
		for(int i=0;i<array.length;i++) {
			if(secondmax<array[i] && array[i]<max) {
				secondmax = array[i];
			}
		}
		System.out.println("Second Maximum: "+secondmax);

	}

}
