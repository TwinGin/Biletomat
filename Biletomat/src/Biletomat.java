import java.time.LocalDate;
import java.util.ArrayList;

public class Biletomat {
	BiletNormalny normalny;
	BiletUlgowy ulgowy;
	String lokalizacja;
	double bank;
	ArrayList<Rejestr> rejestr=new ArrayList<Rejestr>();
	public Biletomat(String lokalizacja,double bank) {
		this.lokalizacja = lokalizacja;
		this.bank=bank;
	}
	
	public void wydrukujTransakcje(LocalDate date) {
		for(int i=0;i<rejestr.size();i++) {
			if(date.equals(rejestr.get(i).date)) {
				System.out.println(rejestr.get(i).toString());
			}
		}
	}
	
	@Override
	public String toString() {
		String str=""+(rejestr.size());
		for(int i=0;i<rejestr.size();i++) {
			str+=rejestr.get(i).toString();
		}
		return str;
	}
	public void DostepneBilety() {
		System.out.println(normalny.toString());
		System.out.println(ulgowy.toString());
	}

	public void kupBilet(Bilet bilet,int ilosc,Pieniadz pieniadz,double wplata) {
		if(pieniadz.equals("Gotowka")) {
			if(wplata-(bilet.cena*ilosc)>0) {
				System.out.println("Reszta = " + (wplata - (bilet.cena*ilosc)));
				rejestr.add(new Rejestr(bilet, ilosc));
				bank+=bilet.cena*ilosc;
			}
		}
		else {
			rejestr.add(new Rejestr(bilet, ilosc));
			bank+=bilet.cena*ilosc;
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biletomat b = new Biletomat("Pawia",500);
		b.kupBilet(new BiletUlgowy(), 5, new Pieniadz("Gotowka"), 12);
		System.out.println(b.toString());
	}

}
