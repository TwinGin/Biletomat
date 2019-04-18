
public class Bilet {
	String rodzajBiletu;
	double cena;
	Bilet(String rodzajBiletu,double cena){
		this.rodzajBiletu=rodzajBiletu;
		this.cena=cena;
	}
	@Override
	public String toString() {
		return "Bilet [rodzajBiletu=" + rodzajBiletu + ", cena=" + cena + "]";
	}
}

class BiletNormalny extends Bilet{
	BiletNormalny() {
		super("Normalny", 4);
	}
}

class BiletUlgowy extends Bilet{
	BiletUlgowy(){
		super("Ulgowy",2);
	}

}
