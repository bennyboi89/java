/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author benny
 */

public class Krypdyr extends Dyr {

	private boolean farlig;
	private String underArt;
	
	
	
	// konstruktøren
	
	public Krypdyr( String navn, String leveområde, String plassering, String art,String underArt,boolean farlig )
	{
		super( navn,  leveområde,  plassering, art);
		
		this.farlig = farlig;
		this.underArt = underArt;
		
		}
	
	
	
	
	public boolean isFarlig() {
		return farlig;
	}

	
	public void setFarlig(boolean farlig) {
		this.farlig = farlig;
	}



	public String getUnderArt() {
		return underArt;
	}



	public void setUnderArt(String underArt) {
		this.underArt = underArt;
	}








// for å teste 

	public void displayInfo()
	{
		System.out.println("Navn: " + navn );
		System.out.println("Dyrehagen dyret befinner seg i :" + plassering);
		System.out.println("Dyret er av art: " + underArt);
		
		if (farlig == true){
			System.out.println( navn + " Er et farlig dyr" );
		}
		else{
			System.out.println( navn + " Er ikke et farlig dyr" );
		}
		
		if (leveområde == null){
			System.out.println("Det er ennå ikke laget et læreprogram for denne dyrearten");
		}
		else{
			System.out.println(leveområde);
		}
	}

	
}
