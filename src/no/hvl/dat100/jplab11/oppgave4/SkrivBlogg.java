package no.hvl.dat100.jplab11.oppgave4;


import java.io.FileNotFoundException;
import java.io.PrintWriter;


import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave2.Bilde;
import no.hvl.dat100.jplab11.oppgave2.Tekst;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		try {
			PrintWriter skriver = new PrintWriter(mappe + filnavn);
			skriver.print(samling.toString());
			skriver.close();
			return true;
			
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Filen finnes ikke!");
			return false;
		}
		
		//throw new UnsupportedOperationException(TODO.method());
	}


	
}

