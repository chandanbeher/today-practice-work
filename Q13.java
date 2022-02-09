class Q13
{
    public static void main(String args[]){
        int rev=0;
        int n=122;
        int temp=n;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}