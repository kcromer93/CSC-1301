package lab7;

public class question3 {
	public static void main(String[] args) {
		double k=0;
		for (int i=940; i/3>=1; i=i-((int) Math.ceil(k/3))) {
			int j=i+1;
			k= i+j;
			System.out.println(i+"+"+j+" = "+((int)k));
		}
	}

}
