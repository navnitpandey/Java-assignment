
public class Bubble {
	public static void main(String[] args) {
		int arr[]= {32,45,34,67,12,82};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
			//	if(arr[j]>arr[j+1]) {    
				//	int temp=arr[j]; 
					//arr[j]=arr[j+1];   
					//arr[j+1]=temp; 
					if(arr[i]>arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
				}
			}
		for(int i=0;i<arr.length;i++) { //for(int i=0;i<=arr.length-1;i++)
			System.out.println(arr[i]);
		}
		}

}

