class Q10{
    
    public static void main(String args[]){
      
      int arr[]={45,23,45,56,45,90};
      int key=45;
      int count=0;
       
       for(int i=0;i<arr.length;i++){
           if(key==arr[i]){
               count++;
                for(int j=i;j<arr.length-1;j++){
                       arr[j]=arr[j+1];
                }
               
           }
       }
       for(int i=0;i<arr.length-count;i++){
           System.out.print(arr[i]+" ");
       }
    }
}