/* Leila MOHAMMEDI
   Master 1 MIAGE 
 */
package kata;

public class OneToHundred {

	private String numChar="";
	private String sNum;
	private int number=1;
	public OneToHundred(){
		
	
		for(number=1;number<=100;number++){
			if(number % 3==0){
			 numChar=numChar+"Foo";
			}
			if(number % 5==0){
				 numChar=numChar+"Bar";
				}
			if(number%7==0)
			{
				numChar=numChar+"Qix";
			}
		sNum=String.valueOf(number);
		
		for(int i=0;i<sNum.length();i++)
		{
			
			if(sNum.charAt(i)== '3'){
				numChar=numChar+"Foo";
			}
			else if(sNum.charAt(i)=='5'){
				numChar=numChar+"Bar";
			}
			else if(sNum.charAt(i)=='7'){
				numChar=numChar+"Qix";
			}
			
		}
		 if(numChar.equals(""))
		 {
			 numChar=sNum;
		 }
			System.out.print(numChar);
			System.out.print(" ");
			numChar="";
			
		}
				
		
	}
	public static void main(String[] args){
		
		new OneToHundred();
		
	
	}

}

