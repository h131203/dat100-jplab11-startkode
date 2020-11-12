package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
		
		
		try {
			File fil = new File(mappe + filnavn);
			Scanner leser = new Scanner(fil);
			//hent ut første linje og sett tallet der til lengde i blogg konstrk 
			
			int antallLestFrafil = leser.nextInt();
			
			Blogg bloggen = new Blogg(antallLestFrafil);
			for (int i=0; i< antallLestFrafil; i++) {
				if () {
					//hvis linje 2 = TEKST, opprett tekst-innlegg
					//hvis linje 8 = BILDe, opprett bilde-innlegg
				}
			}
				
		
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found..");
		}
		
		

		//throw new UnsupportedOperationException(TODO.method());

	}
}
