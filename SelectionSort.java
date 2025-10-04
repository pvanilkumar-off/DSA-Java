public class SelectionSort {
    public int[] sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        SelectionSort sorter=new SelectionSort();
        int[] givenArr={-40,5,60,0,90};
        int[] sortedArray=sorter.sort(givenArr);
        for(int i=0;i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
        
    }
}



