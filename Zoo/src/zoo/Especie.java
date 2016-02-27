
package zoo;

import java.util.ArrayList;

public class Especie {

	
    public int identificador;


	public ArrayList<Cuidador> Cuidador ;

    public ArrayList<Aliment> Aliment;

    private String nomComu;

    private String nomCientific;

    private String descripcio;

    public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNomComu() {
		return nomComu;
	}
	public void setNomComu(String nomComu) {
		this.nomComu = nomComu;
	}
	public String getNomCientific() {
		return nomCientific;
	}
	public void setNomCientific(String nomCientific) {
		this.nomCientific = nomCientific;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

    public void afegirEspecie ( String nomComu, String nomCientific, String descripcio, int identificador ){
    	
    }
   
    public Especie ( int identificador, String nomComu, String nomCientific, String descripcio ){
    	
    }

    public void llevarEspecie ( int identificador ){
    	
    }
    @Override
   	public String toString() {
   		return "Especie [identificador=" + identificador + ", Cuidador=" + Cuidador + ", Aliment=" + Aliment
   				+ ", nomComu=" + nomComu + ", nomCientific=" + nomCientific + ", descripcio=" + descripcio + "]";
   	}
   	
    
    
}