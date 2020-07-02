package OCA_Hepsi.V18.OCA223_Q120_180.q121;

public class MainTest {
	//bunu calistirabilmek icin intelliJ de, yukaridaki tablardan Run a gel ve oradan edit configuration i tikla
	//Program argument e sorudaki 1 2 3 yazalir

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}
	public static void main(Object[] args) {
		System.out.println("Object main " + args[0]);
	}

	public static void main(String[] args) {
		System.out.println("String main " + args[0]);
		System.out.println("String main " + args[0].length());
	}
}
