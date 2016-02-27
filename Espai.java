
package zoo;

import java.util.ArrayList;

public class Espai {

    public ArrayList<Especie> Especie;
    private ArrayList<Espai> espais;
    private String tipus;
    private String nom;
    
    ArrayList<Espai> llistaEspai = new ArrayList<Espai>();


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	

	public Espai(String tipus,String nom){
		this.tipus = tipus;
		this.nom = nom;
		
	}	
	public Espai(String tipus){
		this.tipus = tipus;
		
	}
	
	
	
	
}