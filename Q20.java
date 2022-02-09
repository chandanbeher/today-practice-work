class Q20 {
    
    public static void main(String args[]){
     
       String str="madam";   // SCP
       StringBuffer sb=new StringBuffer(""); //Heap        =  ==  equals()
       for(int i=str.length()-1;i>=0;i--){
           
           sb.append(str.charAt(i));
       }
       if(sb.toString().equals(str)) {
           
           System.out.println("palindrome string");
       }
       else{
           System.out.println("Not a palindrome strig");
       }
       
         
    }
    
}