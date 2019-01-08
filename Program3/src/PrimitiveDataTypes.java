
/**
 *		Author: NCU
 *		Version:  1.0.0
 *      Class description : Write a program that displays the sizes and ranges of the 
 *							different primitive data types in Java in the given format.
 *							
 *							S.No. Data Type Size Minimum Value Maximum Value
 */
public class PrimitiveDataTypes{
	
	public static void main(String [] args){

	boolean booldata = true; //boolean data
	char cdata = 'B'; //char data
	byte bytedata = -10; //byte data
	int idata; //integer data
	short sdata = 1000; //short data
	long ldata = -100000L; //longdata
	float fdata=234.5f; //float data
	double ddata=12.4; //double data

	int counter=1;  // Counter for Serial Numbering

	System.out.println("S No."+"\t"+ "Data Type"+"\t"+" Size"+"\t"+"Minimum Value"+"\t"+ "Maximum Value");
	// Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or Boolean.MAX_VALUE
	// Type, Size, Minimum Value and Maximum Value of Character Data Type
	System.out.println((counter++)+"\t"+"Char"+"\t"
		+Character.TYPE+"\t"+Character.SIZE+"\t"+(int)Character.MIN_VALUE+"\t\t"+(int) Character.MAX_VALUE);
	
	// Type, Size, Minimum Value and Maximum Value of Byte Data Type
	System.out.println((counter++)+"\t"+"Byte"+"\t"
		+Byte.TYPE+"\t"+Byte.SIZE+"\t"+Byte.MIN_VALUE+"\t\t"+Byte.MAX_VALUE);
	
	// Type, Size, Minimum Value and Maximum Value of Integer Data Type
	System.out.println((counter++)+"\t"+"Integer"+"\t"
		+Integer.TYPE+"\t"+Integer.SIZE+"\t"+Integer.MIN_VALUE+"\t\t"+Integer.MAX_VALUE);
	
	// Type, Size, Minimum Value and Maximum Value of Short Data Type
	System.out.println((counter++)+"\t"+"Short"+"\t"
		+Short.TYPE+"\t"+Short.SIZE+"\t"+Short.MIN_VALUE+"\t\t"+Short.MAX_VALUE);
	
	// Type, Size, Minimum Value and Maximum Value of Long Data Type
	System.out.println((counter++)+"\t"+"Long"+"\t"
		+Long.TYPE+"\t"+Long.SIZE+"\t"+Long.MIN_VALUE+"\t\t"+Long.MAX_VALUE);
	
	// Type, Size, Minimum Value and Maximum Value of Float Data Type
	System.out.println((counter++)+"\t"+"Float"+"\t"
		+Float.TYPE+"\t"+Float.SIZE+"\t"+Float.MIN_VALUE+"\t\t"+Float.MAX_VALUE);

	// Type, Size, Minimum Value and Maximum Value of Double Data Type
	System.out.println((counter++)+"\t"+"Double"+"\t"
		+Double.TYPE+"\t"+Double.SIZE+"\t"+Double.MIN_VALUE+"\t\t"+Double.MAX_VALUE);


	} //End of Program 

}