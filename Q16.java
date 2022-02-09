class Q16
{
	public static void main(String[] args) {
		int vCount=0, cCount=0,zCount=0,mCount=0;
		
		String str="chandu123@";
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') { 
			    vCount++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') { 
				cCount++;
			}
			else if(str.charAt(i) >= '0' && str.charAt(i)<='9') { 
				zCount++;
			}
			else{ 
			    mCount++;
			}
		}
		    System.out.println("number of uppercase"+vCount);
		    System.out.println("number of lowercase"+cCount);
		    System.out.println("number of digits"+zCount);
		    System.out.println("number of special char"+mCount);
		}
	}