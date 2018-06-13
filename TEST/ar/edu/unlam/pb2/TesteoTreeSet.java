package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class TesteoTreeSet {

	@Test
	public void test() {
		Persona p1 = new Persona("Paula", "Ramirez", 18, 1.82);
		Persona p2 = new Persona("Marco", "Fritz", 58, 1.60);
		Persona p3 = new Persona("Paula", "Ramirez", 18, 1.82);
		Persona p4 = new Persona("Amalia", "Sanchez", 33, 1.59);
		TreeSet<Persona> personal = new TreeSet<Persona>(); //Un TreeSet que guarda objetos tipo "Persona"
		personal.add(p4); //33 años
		personal.add(p3); //18 años 
		personal.add(p2); //58 años
		personal.add(p1); //18 años
									//Esto es como poner "int y" para que se recorra, solo que 
		for(Persona var:personal){ //<-aca se recorre con un tipo "Persona" y "personal" es el TreeSet a recorrer
		System.out.println(var.nombreCompletoyEdad());//<-aca puse para que cada vez que se recorra, diga el nombre completo
		 }
	}
	//Como pueden ver cuando se ejecute, se ordenan por edad. NO POR EL ORDEN QUE LOS AGREGUÉ. 
	//Paula Ramirez aparece una sola vez, porque TreeSet NO acepta duplicados 
	//En este caso, los compara por edad (ver clase*). Si cambian el nombre de Paula en p1 igual no va a aparecer
	//Lo que no sé, es si esto es orden natural o el otro que no me acuerdo el nombre xdxdxd
}
