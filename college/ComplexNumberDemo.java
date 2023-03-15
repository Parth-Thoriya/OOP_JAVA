package college;

public class ComplexNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 8. Define class for Complex number with real and imaginary part.
		 *  Describe its constructor, overload the constructors and instantiate its object. 
		 *  Also define addition method */
		ComplexNumber cp1 = new ComplexNumber(2,5);
		ComplexNumber cp2 = new ComplexNumber(3,5);
		
		 cp1.addComplexNumber(cp2);
	 cp1.diplay();			
	}

}

class ComplexNumber
{
	int realPart,imagenaryPart;
	
	 ComplexNumber() {
		this.realPart = 1;
		this.imagenaryPart = 1;
	 }
	 ComplexNumber(int realPart , int imagenaryPart)
	 {
		 this.realPart = realPart;
		 this.imagenaryPart = imagenaryPart;
	 }
	void addComplexNumber(ComplexNumber cp)
	{
		this.realPart = realPart + cp.realPart; 
		this.imagenaryPart = imagenaryPart + cp.imagenaryPart; 
	}
	void diplay()
	{
		System.out.println("Addition of given two complex number is:");
		System.out.println(realPart+" + i"+imagenaryPart);
	}
	
}
