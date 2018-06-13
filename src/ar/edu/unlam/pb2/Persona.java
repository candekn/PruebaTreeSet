package ar.edu.unlam.pb2;

public class Persona implements Comparable<Persona>{ //Comparable es la interfaz que se utiliza para comparar
	//Atributos										//como está comparando un tipo de objeto creado por mi (no por defecto)	
	private String nombre;							//lo tengo que sobreescribir para elegir qué utiliza a la hora de comparar
	private String apellido;
	private Integer edad;
	private Double altura;
	//Metodos
	public Persona(String nom, String ape, Integer edad, Double alt){
		this.nombre=nom;
		this.apellido=ape;
		this.edad=edad;
		this.altura=alt;
	}
	public String saludar(){
		return "Hola";
	}
	public void cumpleanios(){
		this.edad=this.edad+1;
	}
	public String nombreCompletoyEdad(){
		return this.getNombre()+" "+this.getApellido()+", "+this.getEdad()+" años.";
	}
	
	//Getters Y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	@Override
	public int compareTo(Persona o) { //este es el metodo que compara
		return this.edad-o.edad; //hice que comparara por edad
	}

	
}

