package WraaperClass;

public class ABAUnboxing {

	
	public static void main(String[] args) {
		
		byte b1=50;
		Byte bval=Byte.valueOf(b1);
		 
		Byte bvalue=new Byte((byte)50);
		byte b=bval.byteValue();
		

	}

}
