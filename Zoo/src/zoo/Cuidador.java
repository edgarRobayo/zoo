
package zoo;

import java.util.ArrayList;

public class Cuidador {
    /** Attributes */
    /**
     * 
     */
    public ArrayList<Especie> Especie;
    private int codi;
    private String nomComplet;

    public void afegirCuidador ( int codi, String nomComplet ){
    	
    }
    /**
     * Operation llevarCuidador
     *
     * @param codi - 
     */
    public void llevarCuidador ( int codi ){
    	
    }
    /**
     * Operation Cuidador
     *
     * @param codi - 
     * @param nomComplet - 
     * @return 
     */
    public Cuidador ( int codi, String nomComplet ){
    	this.codi = codi;
    	this.nomComplet = nomComplet ;	
    }
    /**
     * Operation getCodi
     *
     * @return String
     */
    public int getCodi (){
    	return codi;
    }
 
    public void setCodi ( int codi ){
    	this.codi = codi;
    }

    public String getNomComplet (){
    	return nomComplet;
    }

    
    public void setNomComplet ( String nomComplet ){
    	this.nomComplet = nomComplet;
    }
}