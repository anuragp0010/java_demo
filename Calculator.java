
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =35;
		int num2 =5;
		
		CalculatorApp.Multiply(num1,num2);
		CalculatorApp.Divide(num1,num2);

	}
	
	public static void Multiply(int num1, int num2)
    {
        int pro= num1*num2;
        System.out.println("Product of "+num1+" and "+num2+" is : "+pro);
    }
    public static void Divide(int num1, int num2)
    {
        float div =num1/num2;
        System.out.println("The Quotient "+num1+" and "+num2+" is : "+div);
    }

}
