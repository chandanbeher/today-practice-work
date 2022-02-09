class Q25{
    
    public static void main(String args[]){
     
     String str="hi hello bitLabs hi hello";
      int count=1;
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)==' '){
              count++;
          }
      } 
    
     System.out.println("Number of words : "+count);
         
    }
    
}