class Q27 {
    
    public static void main(String args[]){
     
     String str="hihiabc@# helloabc23 bitLabs123";   //  hi@#-2  hello23 -5  bitLabs123: 7
        int acount=0;
       String words[]=str.split(" ");
       
       for(int i=0;i<words.length;i++){      // number of words: 3
           for(int j=0;j<words[i].length();j++) { // number of characters
               if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z' || words[i].charAt(j)>='a' && words[i].charAt(j)<='z' ){
                     acount++;
               }
           }
           System.out.println("No. of alphabets in "+words[i]+" is : "+acount);
           acount=0;      
       }
       
         
    }
    
}