class SixteenthClass{
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
public static void main(String[]args){
// bubble sort-7,8,3,1,2->7,3,1,2,8->3,1,2,7,8->1,2,3,7,8.
int arr[]={7,8,3,1,2};
// bubble sort TC=O(n^2) worst case;
for(int i=0;i<arr.length-1;i++){
     for(int j=0;j<arr.length-i-1;j++){ // because the element at last will always be sorted
        if(arr[j]>arr[j+1]){
            // swap
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
     }
}

printarr(arr);
int arr1[]={7,8,3,1,2};
//selection sort
// in each iteration we will find the smallest element and sort it with the first position
// and we will start the next loop form next index ie 2.....thiws process will continue till last.
for(int i=0;i<arr1.length;i++){
    int smallest=i;
   for(int j=i+1;j<arr1.length;j++){
      if(arr1[smallest]>arr1[j]){
        smallest=j;
      }
   }
   int temp=arr1[smallest];
      arr1[smallest]=arr1[i];
      arr1[i]=temp;
   
}
printarr(arr1);

//the difference between selection sort and bubble sort is that selection sort goes on reducing the length of array from front where as the bubble sprt goes on reducing the length of array from back

// insertion sort
// we create two parts one sorted and one unsorted part,
// refer DAA notebook for reference of how insertion sort works or just refer the gfg images of how insertion sort works


}
}
