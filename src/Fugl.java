/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author benny
 */

public class Fugl extends Dyr {
	
	private int eggNedreGrense;
	private int eggØvreGrense;
	
	
	
	// konstruktøren
	
	public Fugl(String navn, String leveområde, String plassering, String art,int eggNedreGrense,int eggØvreGrense) {
		super(navn,  leveområde,  plassering, art);
		this.eggNedreGrense = eggNedreGrense;
		this.eggØvreGrense = eggØvreGrense;
	}
	
	
	
	public int getEggNedreGrense() {
		return eggNedreGrense;
	}



	public void setEggNedreGrense(int eggNedreGrense) {
		this.eggNedreGrense = eggNedreGrense;
	}



	public int getEggØvreGrense() {
		return eggØvreGrense;
	}



	public void setEggØvreGrense(int eggØvreGrense) {
		this.eggØvreGrense = eggØvreGrense;
	}



	public void displayInfo()
	{
		System.out.println("Navn: " + navn );
		System.out.println("Dyrehagen dyret befinner seg i :" + plassering);
		System.out.println(navn + "Kan legge opp til: " + eggØvreGrense + " egg");
		System.out.println(navn + "Kan minimum legge: " + eggNedreGrense + " egg");
		if (leveområde == null){
			System.out.println("Det er ennå ikke laget et læreprogram for denne dyrearten");
		}
		else{
			System.out.println(leveområde);
		}
		
	}
}

