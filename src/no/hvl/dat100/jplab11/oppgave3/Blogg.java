package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		// this(20);
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
		// throw new UnsupportedOperationException(TODO.method());

	}

	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i<nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			} 
		}
		return -1;

		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		for (int i = 0; i < nesteledig; i++) {

			if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
				finnes = true;
			}
		}
		return finnes;

	}

	public boolean ledigPlass() {

		if (nesteledig < innleggtabell.length) {
			return true;
		} else {
			return false;
		}
		// return nesteledig < innleggtabell.length;

	}

	public boolean leggTil(Innlegg innlegg) {

		boolean finnesInnlegg = false;
		//sjekker først om det er et likt innlegg der eller tom plass?

		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].getId() == innlegg.getId() && innleggtabell[i] != null) {
				finnesInnlegg = true;
				return false;
			}
		}
		
		//hvis innlegget ikke finnes fra før, legger vi til og plusser på 1 i størrelse
		if (!finnesInnlegg) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		} else {
			return false;
		}

		// throw new UnsupportedOperationException(TODO.method());
	}

	public String toString() {
		String str = nesteledig + "\n";
		for (int i=0; i<nesteledig; i++) {
			str += innleggtabell[i].toString();
		}
		return str;
		//throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor

	public void utvid() {
		
		//lager ny innleg-tabell med dobbel størrelse av nåværende tabell
		Innlegg[] utvidetInnleggtabell = new Innlegg[nesteledig*2];
		
		for (int i=0; i<nesteledig; i++) {
			utvidetInnleggtabell[i] = innleggtabell[i];
			//kopierer over elementer fra originaltab til ny tab
			
		}
		innleggtabell = utvidetInnleggtabell; //setter gammel til å peke på utvidet/ny.
		
		
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());

	}

	public boolean slett(Innlegg innlegg) {
		int posisjon = finnInnlegg(innlegg); // bruker metoden for å finne indeksen i tabellen til innlegge som skal slettes
		if (posisjon != -1) { //hvis posisjon er funnet (-1 betyr ikke funnet, ihht returverdi metode)
			innleggtabell[posisjon] = null;
			nesteledig--;
			return true;
		}
		
		return false;

		//throw new UnsupportedOperationException(TODO.method());
	}

	public int[] search(String keyword) {

		throw new UnsupportedOperationException(TODO.method());

	}
}