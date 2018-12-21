package homePractice;

                  /*
                   NOTE: WHAT IS ARRAY?
                         ARRAY IS A COLLECTION OF VARIABLE OF THE SAME TYPE.
                         >SHOULD BE SAME TYPE OF DATA
                         >To create we need to use new operator
                         >as array is nonpremitive data we have to create. its not like premitive data type
                         >array number should be always positive must not be negetive
                         >index number always starts from 0
                   */

public class P1 {

	public static void main(String[] args) {
		              //int[] number;           // declarion
		             //number = new int[10];    // creation
		
		             // we can declare and create in single line too
		int[] number = new int[5];   // we can chose array size, here array size is [5]   //we can add more array in single line like, int[] number = new int[10]
		             //lets initialize  
		number[0]=10;  //inside the [] the number is index number and start from 0
	    number[1]=15;
	    number[2]=20;
	    number[3]=25;	
	    number[4]=26;	//as our array size is 5 we could take upto [4]	
	    //lets print the value of the index:
	    System.out.println(number[0]);
	    System.out.println(number[1]);
	    System.out.println(number[2]);
	    System.out.println(number[3]);
	    System.out.println(number[4]);
	}

}
