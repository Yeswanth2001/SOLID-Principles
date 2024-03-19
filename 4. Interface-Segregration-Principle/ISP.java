/**

Problem - Imagine we have 2 printers :
			1. HP printer     - supports print, scan, fax, photocopy
			2. Cancon printer - supports print, scan
		
* Now when we implement this IPrintTask interface with HP printer class, Cancon printer class.
* HP printer supports all feature so we don't have any problem here.
* Cancon supports only first 2 feature and remaining we need force to implement.

**/

interface IPrintTask {	
	void printContent();
	void scanContent();
	void faxContent();
	void photoCopyContent();
}

// Solution - Divide the feature into multiple interface.

interface IPrintScan {	
	void printContent();
	void scanContent();
}

interface IFax {
	void faxContent();
}

interface IPhotoCopy {
	void photoCopyContent();
}

class HPprinter implements IPrintScan, IFax, IPhotoCopy {
	public void printContent() {System.out.println("print");}
	public void scanContent() {System.out.println("scan");}
	public void faxContent() {System.out.println("fax");}
	public void photoCopyContent() {System.out.println("photocopy");}
}

class Canonprinter implements IPrintScan {
	public void printContent() {System.out.println("print");}
	public void scanContent() {System.out.println("scan");}
}

class Untitled {
	public static void main(String[] args) {
		
		HPprinter hp = new HPprinter();
		hp.faxContent();
		
		Canonprinter cp = new Canonprinter();
		cp.printContent();
		
	}
}