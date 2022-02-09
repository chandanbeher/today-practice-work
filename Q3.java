class Q3
{
    public static void main(String args[]){
        int fr=1;
        int arr[]={23,45,56,67,90,45,23};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                fr++;
                arr[j]=0;
                }
            }
            if(arr[i]!=0 && fr>1){
            System.out.print(arr[i]);
            }
            fr=1;
        }
    }
    
}