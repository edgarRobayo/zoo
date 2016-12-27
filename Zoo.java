
package zoo;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {

    private String nom;
    static ArrayList<Espai> llistaEspa = new ArrayList<Espai>();
    static ArrayList<Cuidador> llistaCuidado = new ArrayList<Cuidador>();
    
    public ArrayList<Cuidador> getLlistaCuidadors (){
		for(Cuidador c: llistaCuidado){
			System.out.println(c.toString());
		}
		return llistaCuidado;
		
		}
    
    public ArrayList<Cuidador> afegirllistaCuidador(Cuidador nou){
		llistaCuidado.add(nou);
    	System.out.println("Has afegit el cuidador " + nou.getNomComplet());
    	return llistaCuidado;
    }
    
    public void eliminarllistaCuidador(int codi){
    	System.out.println("abans" + llistaCuidado.size());
    	Iterator<Cuidador> nombreIterator = llistaCuidado.iterator();
    	int i = 0;
    	while(nombreIterator.hasNext()){
    	Cuidador elemento = nombreIterator.next();
    	i++;
    	if(elemento.getCodi() == codi){
    		nombreIterator.remove();
    		}
    	
    	}
    	System.out.println("Has eliminat un Cuidador amb codi" + codi );
    	System.out.println("ahora el tamany es " + llistaCuidado.size());

    }
    
    
    public ArrayList<Espai> afegirllistaEspai(Espai nou){
    	llistaEspa.add(nou);
    	System.out.println("Has afegit l'espai " + nou.getTipus());
		return llistaEspa;
    }
    
    
    public ArrayList<Espai> getLlistaiEspai(){
    	
    	for (int i = 0; i < llistaEspa.size();i++){
    		System.out.print( llistaEspa.get(i).getTipus() + " ");
    		
    	}
		return llistaEspa;
    }

    
    public ArrayList<Espai> llistaEspai2 ( int identificador ){
		return null;
		}

    public ArrayList<Espai> llistaEspaiSegonTipus ( String tipus ){
		return null;}

    public ArrayList<Especie> llistaCuidadorCertEspecie ( int identificador ){
		return null;}

    
    public String getNom(){
		return nom;
		}

    public void setNom ( String nom ){
    	this.nom = nom;
    }

    public Zoo(String nom){
    	this.nom = nom;
    	
    }
    
    
    public void proves(){
    	
    }
    
    public static void main(String args[]) {
    	
    	Espai volador;
    	Espai piscina;
    	Espai tancat;
    	Espai aquari;

    	Zoo zoo1 = new Zoo("Palma") ;
    	
    	volador = new Espai("volador","Camp de terra");
    	piscina = new Espai("piscina","Camp d'aigua per animals");
    	tancat = new Espai("tancat","Tancat per animals");
    	aquari = new Espai("aquari","aquari per animals");
    	
    	//metodo para añadir un objeto a un campo de la lista 
    	
    	zoo1.afegirllistaEspai(volador);
    	zoo1.afegirllistaEspai(piscina);
    	zoo1.afegirllistaEspai(tancat);
    	zoo1.afegirllistaEspai(aquari);
    	
    	//System.out.println(volador.getTipus());
      	//zoo1.mostraLlistaEspai();

      	//mostra la llista de espais
      	zoo1.getLlistaiEspai();
      	
      	Cuidador c1 = new Cuidador(1,"Jawete Castinol");
      	Cuidador c2 = new Cuidador(2,"Jen Castana");
      	Cuidador c3 = new Cuidador(3,"Mer Cace");
      	Cuidador c4 = new Cuidador(4,"Nosa Pom");
      	
      	zoo1.afegirllistaCuidador(c1); 
      	zoo1.afegirllistaCuidador(c2); 
      	zoo1.afegirllistaCuidador(c3); 
      	zoo1.afegirllistaCuidador(c4); 

      	zoo1.getLlistaCuidadors();
      	//comprovar si existe el elemento da true
      	System.out.println("element es " + llistaCuidado.contains(c1));
      	zoo1.eliminarllistaCuidador(1);
      	// elemento no existe da falso
      	System.out.println("element es " + llistaCuidado.contains(c1));

      	
      	Tareas netetjar;
      	Tareas cambiaraigua;
      	
      	netetjar = new Tareas("netetjar","fer net ");
      	cambiaraigua = new Tareas("cambiaraigua","cambiar aigua que esta per cambiar ");

      	

      	Animal lleo;
      	Animal manta;
      	Animal tauro;
      	Animal aguila;
      	
      	lleo = new Animal(1,"lleo");
      	manta = new Animal(10,"manta");
      	tauro = new Animal(100,"tauro");
      	aguila = new Animal(1000,"aguila");
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
      	
    	
    	//System.out.println(zoo1.getLlistaEspai());
    	//System.out.println(zoo1.getLlistaiEspai());

    	/*
    	ArrayList llistaString = new ArrayList<>();
    	
    	
    	llistaString.add("hoal");
    	llistaString.add("hoal2");

    	System.out.println(llistaString.size());
       	System.out.println(llistaString);
		*/
    	
    	
    	
    	
    	
    	
    }

}
