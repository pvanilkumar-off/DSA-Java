public class BubbleSort {
    public int[] sort(int[]arr){
        int n=arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=i;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args){
    BubbleSort sorter=new BubbleSort();
    int[] givenArr={-90,60,80,54,105};
    int[] sortedArray=sorter.sort(givenArr);
    for(int i=0;i<sortedArray.length;i++){
        System.out.print(sortedArray[i]+" ");
    }
}

}

