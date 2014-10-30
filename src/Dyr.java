/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author benny
 */

public class Dyr {

	public  String navn;
	public String leveområde;
	public String plassering;
	public String art;
	
	
	//konstruktør
	
	public Dyr(String navn, String leveområde, String plassering, String art){
		
		this.navn = navn;
		this.leveområde = leveområde;
		this.plassering = plassering;
		this.art = art;
	}
	
	public String getNavn(){
		return navn;
	}
	
	public void setNavn(String navn){
		this.navn = navn;
	}

	public String getLæreProgram() {
		return leveområde;
	}

	public void setLæreProgram(String leveområde) {
		this.leveområde = leveområde;
	}

	public String getPlassering() {
		return plassering;
	}

	public void setPlassering(String plassering) {
		this.plassering = plassering;
	}

	public String getArt() {
		return art;
	}

	public void setArt(String art) {
		this.art = art;
	}

	
	
	
	
	
	
}

