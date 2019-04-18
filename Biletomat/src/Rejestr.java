import java.time.LocalDate;

public class Rejestr {
 LocalDate date;
 Bilet bilet;
 int liczbaBiletow;
 public Rejestr(Bilet bilet, int liczbaBiletow) {
	this.date = LocalDate.now();
	this.bilet = bilet;
	this.liczbaBiletow = liczbaBiletow;
 }
@Override
public String toString() {
	return "Rejestr [date=" + date + ", bilet=" + bilet + ", liczbaBiletow=" + liczbaBiletow + "dochod: " + (bilet.cena * liczbaBiletow)+ "]";
}
 
}
