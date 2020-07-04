package OCA_Hepsi.V18.OCA223_Q1_60.q051;
interface Exportable{
	void export();
}
class Tool implements Exportable{
	public void export() {						// line n1 , burada protected olmasi hataya sebep olur, hernekadar
		System.out.println("Tool::export");		// interface de default da olsa, biz en ustun izin yetkisi
												// kullanmaliyiz
	}
}
public class ReportTool extends Tool implements Exportable {
	public void export() {							// line n2
		System.out.println("RTool::export");
	}

	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		callExport(aTool); // bu ifade sirasiyla implement edilmis olan export metodlarini cagiriyor
		callExport(bTool);	// fark edildigi gibi metod override edilmis her nekadar metod adi ayni olsa da
							//farkli sonuclar veriyor
	}
	public static void callExport(Exportable ex) {
		ex.export();
	}
}
//What is the result?
//A.	Compilation fails only at line n2.
//B.	RTool::exportTool::export
//C.	Tool::exportTool:export
//D.	Compilation fails only at line n1.
//E.	Compilation fails at both line n1 and line n2.
