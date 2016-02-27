
package zoo;

import java.util.ArrayList;

public class Animal {

	
    public ArrayList <Aliment> Aliment;
    public Especie especie;
    private int codiAnimal;
    
    private String nomAnimal;

    
    public void AfegirAnimal ( int codiAnimal, String nomAnimal ){
    	//añadir los animales al arraylist
    }
  
    
    public int llevarAnimal ( int codiAnimal ){
		return codiAnimal;
    	//otras funciones arraylist quitar el animal
    }
    
    
    public int getCodiAnimal (){
    	return codiAnimal;
    }

    
    public void setCodiAnimal ( int codiAnimal ){
    	this.codiAnimal = codiAnimal;
    }

    
    public void setnomAnimal (String nomAnimal){
    	this.nomAnimal = nomAnimal;
    }

    
    public String getnomAnimal (){
    	return nomAnimal;
    	
    }
    /**
     * Operation Animal
     *
     * @param codiAnimal - 
     * @param nomAnimal - 
     * @return 
     */
    public Animal ( int codiAnimal, String nomAnimal ){
    	this.codiAnimal = codiAnimal;
    	this.nomAnimal = nomAnimal;
    }

    public Animal (){
    	
    }
	@Override
	public String toString() {
		return "Animal [Aliment=" + Aliment + ", especie=" + especie + ", codiAnimal=" + codiAnimal + ", nomAnimal="
		+ nomAnimal + "]";
	}
    
    
    
    
    
    
}
