
package zoo;


public class Aliment {
    /** Attributes */
    /**
     * 
     */
    private String preparacio;
    private int identificador; //correccio antes estaba string
    private String nomAliment;
    
    public String getPreparacio (){
		return nomAliment;
		}

    
    public void setPreparacio (String preparacio){
    	this.preparacio = preparacio;
    }

    
    public int getIndentificador (){
		return identificador;}

    
    public void setIdentificador (int identificador){
    	this.identificador = identificador;
    }

    
    public String getNomAliment (){
		return nomAliment;
		}

    
    public void setNomAliment ( String nomAliment ){
    	this.nomAliment = nomAliment;
    }
    /**
     * Operation Aliment
     *
     * @param preparacio - 
     * @param identificador - 
     * @param nomAliment - 
     * @return 
     */
    public Aliment ( String preparacio, int identificador, String nomAliment ){
    	this.preparacio = preparacio;
    	this.identificador = identificador;
    	this.nomAliment = nomAliment;
    	
    }

    public Aliment (){
    	
    	
    }
}