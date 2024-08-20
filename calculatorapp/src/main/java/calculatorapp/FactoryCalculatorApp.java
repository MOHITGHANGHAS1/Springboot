package calculatorapp;

public class FactoryCalculatorApp {

	public MathService getMathService(char o)
	{
		if(o=='+') {
			return (MathService) new Addition();
			
		}
		else if(o=='-') {
			return (MathService) new Subtraction();
			
		}
		else if(o=='*') {
			return (MathService) new Multiplication();
			
		}
		else if(o=='/') {
			return (MathService) new Division();
			
		}
		else
		{
			return null;
		}
		
	}

}
