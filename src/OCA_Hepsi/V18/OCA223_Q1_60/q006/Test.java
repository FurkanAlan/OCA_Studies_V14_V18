package OCA_Hepsi.V18.OCA223_Q1_60.q006;
import java.io.IOException;

class X{
		public void printFileContent() throws IOException {
			/*code goes here */
			throw new IOException();
		}
	}
public class Test {
	public static void main(String[] args) throws IOException {
		X xobj = new X();
		xobj.printFileContent();		
	}
}
//exceptions must be handled where they thrown