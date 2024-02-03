package mod9;

public class exercicio {
	
	public static void main(String args[]) {
		verificar();
	}
	
	private static void verificar() {
		
		int num1 = 770;
		Integer num2 = num1;
		double mult = 2.85343;
		float num3 = (float) (num2*mult);
		byte num4 = (byte) num3;
		
			
		System.out.println("O Primeiro numero e': " + num1);
		System.out.println("----------------------");
		System.out.println("Passando o num1 do tipo primitivo para o Wrapper: " + num2);
		System.out.println("----------------------");
		System.out.println("Multiplicador: " + mult);
		System.out.println("----------------------");
		System.out.println("Num2 X Multiplicador: " + num3);
		System.out.println("----------------------");
		System.out.println("Transformando de float para byte, temos o resultado: " + num4);
		System.out.println("----------------------");
		
		
		
		
	}

}
