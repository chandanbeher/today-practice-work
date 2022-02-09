class Q6
{
    public static void main(String args[]){
        int k=0,m=0;
        int count=0;
        int arr[]={23,45,56,67,90,45,23};
        int even[]=new int[arr.length];
        int odd[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    even[k]=arr[i];
                    k++;
                    count=count+1;
                }
                else{
                    odd[m]=arr[i];
                    m++;
                    count=count+1;
                }
            }
            for(int i=0;i<k;i++){
                System.out.println("sum of even numbers"+even[i]+" ");
            }
            for(int i=0;i<m;i++)
            System.out.print("sum of odd numbers"+odd[i]+" ");
            }
    
        }