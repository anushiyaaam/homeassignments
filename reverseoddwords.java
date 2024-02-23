package week3.day1.reverseoddwords;

public class reverseoddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String test="I am a software tester";
		  // I    ma    a    erawtfos   tester
		    
		    //Segreate the sentences in to words
		    String[] split = test.split(" ");
		    //iterate the values from split
		    for (int i = 0; i < split.length; i++) {
		        //check index values if it is odd index it will be converted to charArray
		        if(i%2!=0) {
		        //System.out.println(split[i]);
		        	
		        	char[] charArray = split[i].toCharArray();
		        //char[] charArray = split[i].toCharArray();
		        for (int j =charArray.length-1;j>=0 ;j--) {
		            System.out.print(charArray[j]);
		            
		        }
		        
		    }
		        else {
		            //System.out.print("");
		            System.out.print(" "+split[i] +" ");
		        }
		    }
	}

}
