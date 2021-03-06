package ejercicioD;

import java.util.ArrayList;
public class Profesor extends Persona {
	
//---------------------------------------------------------------ATRIBUTO
    public String departamento;
    public int anioIncorporacion; 
    public int numDespacho;
    
//--------------------------------------------------------------CONSTRUCTOR
    
    public Profesor() {
    	super ();
    }
   
    public Profesor(String nombre, String apellidos, String id, String estadoCivil, String departamento, int anioIncorporacion , int numDespacho) {
		super(nombre, apellidos, id, estadoCivil);
		// TODO Auto-generated constructor stub
		this.departamento = departamento;
		this.anioIncorporacion = anioIncorporacion; 
		this.numDespacho = numDespacho ; 
	}

     public void imprimir() {
 		System.out.println("\nNombre: " + super.getNombre() + "\n Apellidos: " + super.getApellidos() + "\n ID: " + super.getId() + "\n Estado Civil: " + super.getEstadoCivil() + "\nDepartamento: " + this.departamento + "\nAño de Incorporación: " + this.anioIncorporacion + "/nNumero de Despacho: " + this.numDespacho);
 	}
	
//-------------------------------------------------------------------SETT GETT

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getAnioIncorporacion() {
		return anioIncorporacion;
	}

	public void setAnioIncorporacion(int anioIncorporacion) {
		this.anioIncorporacion = anioIncorporacion;
	}

	public int getNumDespacho() {
		return numDespacho;
	}

	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}

//--------------------------------------------------------------------- TO STRING 
	@Override
	public String toString() {
		return super.toString() + "Profesor [departamento=" + departamento + ", anioIncorporacion=" + anioIncorporacion + ", numDespacho="
				+ numDespacho + "]";
	}

//--------------------------------------------------------------------METODOS
	   public void cambiarDepartamento(ArrayList<String> lista, String dep){
	      dep = dep.toLowerCase(); //validacion para que todos los nombres estén en minuscula 
	      boolean d=false;
		  //buscar en el arraylist que el departamento esté
		  for(int i=0; i<lista.size(); i++) {
			  //comparar string con lo que está dentro
			  if(lista.get(i).equals(dep)) {
				  //reemplazar el atributo departamento (dep)
				  this.departamento = dep;
				  d=true;
			  }
		  }
		  if(d) {
			  System.out.print("cambio exitoso");
		  }else {
			  System.out.print("no se encontro el departamento, cambio fallido");
		  }		  

	    }
	

	   
	   
	   public void reasignarDespacho(ArrayList<Integer> listaDespachos, int nudes){
		      boolean d=false;
			  							
			  for(int i=0; i<listaDespachos.size(); i++) //------------------buscar en el arraylist  el numero de despacho 
				  
				  if(listaDespachos.get(i) == nudes) { //--------------------------------comparar int con lo que está dentro
					
					  this.numDespacho = nudes;
					  d=true;
				  }
			  

			  if(d) {
				  System.out.print("cambio exitoso");
			  }else {
				  System.out.print("no se encontró el número de Despacho, cambio fallido");
			  }		  

		    }
		

//--------------------------------------------------------------------Comentarios tests

	  
	  




}











