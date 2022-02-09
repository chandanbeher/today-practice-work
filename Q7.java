class Q7
{
    public static void main(String args[]){
        int fr=1;
        int arr[]={23,45,56,67,90,45,23};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]==arr[j]){
                fr++;
                arr[j]=0;
                }
            }
            if(arr[i]!=0){
            System.out.print(arr[i]+fr);
            }
            fr=1;
        }
    }
    
}
