package Classes_abstratas;

public abstract class TesteWapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dados primitivos
		short num1 = 1;
		byte num2 = 10;
		long num4 = 10001;
		float num5  = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		Short num7 = new Short((short)1);
		Byte num8 = new Byte ((byte)10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10001);
		Float num11 = new Float(3.5f);
		Double num12 = new Double(3.5555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('b');
		
		
		Integer num13 = new Integer("100");
		
		Double num14 = new Double("3.5");
		
		// conversão de um tipo para outro
		System.out.println(num13.intValue());
		System.out.println(num14.longValue());
		
		
		// Conversão string em um valor numerico
		int num16 = Integer.parseInt("1000");
		
		double num17 = Double.parseDouble("3.5555");
		
		
		//conversão numero primitivo em instancia
		Integer num18 = Integer.valueOf(1234);
		System.out.println(num18);
	}

}
