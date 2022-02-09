class Q9{
    
    public static void main(String args[]){
      
      int arr[]=new int[100];
      arr[0]=90;           // 90 40 30 20 10 50  
      arr[1]=40;
      arr[2]=30;
      arr[3]=20;
      arr[4]=10;
      arr[5]=50;
      
      
      int index=3;
      int value=100;
       
        if(index<=arr.length  && index>=0){
            for(int i=6;i>=index;i--){
                arr[i]=arr[i-1];
                
            }
            arr[index]=value;
            
        } 
        else{

          System.out.println("Index poisition should be between 0- "+((arr.length)+1));  
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                count++;
            }
            else{
                break;
            }
            
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}