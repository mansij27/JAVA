import java.util.Arrays;

class DuplicateArray{
    public static void main(String[] args){
        int arr[]={1,2,4,5,8,8,5,4,4,2,7};
        for(int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println(arr[j]); 
            }
        }
    }
}