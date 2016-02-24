
public class Test 
{
	public static void main(String[] args) 
	{
		Jarra A = new Jarra(7);
		Jarra B = new Jarra(5);
		
		A.vacia();
		B.llena();
		A.llenaDesde(B);
		B.llena();
		A.llenaDesde(B);
		A.vacia();
		A.llenaDesde(B);
		B.llena();
		A.llenaDesde(B);
		System.out.println(A.toString());
		System.out.println(B.toString());
	}
}

