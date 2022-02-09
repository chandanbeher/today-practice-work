class Q11{
    
    public static void main(String args[]){
      
      int arr[]={45,23,45,56,45,90};
      int key=45;
       
       for(int i=arr.length-1;i>=0;i--){
           if(key==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                       arr[j]=arr[j+1];
                }
                break;
           }
       }
       for(int i=0;i<arr.length-1;i++){
           System.out.print(arr[i]+" ");
       }
    }
}