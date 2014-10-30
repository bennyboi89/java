
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author benny
 */

public class Rom {

	private int romNummer; 
	private String romNavn;
	

    
	
	//public Rom( String romNavn, int romNummer) {
	//	super();
	//	this.romNummer = romNummer;
	//	this.romNavn = romNavn;
	//}


	public int getRomNummer() {
		return romNummer;
	}


	public void setRomNummer(int romNummer) {
		this.romNummer = romNummer;
	}


	public String getRomNavn() {
		return romNavn;
	}


	public void setRomNavn(String romNavn) {
		this.romNavn = romNavn;
	}

     @Override
     public String toString(){
         return romNummer + romNavn;
     }

   

    
	
	
	
	
	
	
	
	
	
	
	
}

