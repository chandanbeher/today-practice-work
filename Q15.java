class Q15
{
	public static void main(String[] args) {
		int vCount=0, cCount=0;
		
		String str="chandu";
		for(int i=str.length();i>=0;i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				vCount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') { 
				cCount++;
			}
		    System.out.print(vCount);
		    System.out.print(cCount);
		    
		}
	}
}