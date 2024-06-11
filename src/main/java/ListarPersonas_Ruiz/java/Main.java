package ListarPersonas_Ruiz.java;


import javax.sound.midi.Soundbank;
import java.util.Collection;
import java.util.Comparator;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {

     // Creo una lista de 5  personas, con array y instacio los objetos creandolos de la clase Persona.
     List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pedro", "Gutierrez"));
        personas.add(new Persona("Lucia", "Gomez"));
        personas.add(new Persona("Agustina", "Sanchez"));
        personas.add(new Persona("Daniel", "Alarcon"));
        personas.add(new Persona("Ricardo", "Fort"));


     //Comparo los nombres con el metodo sort y Comparator los ordeno alfabeticamente
    Collections.sort(personas, Comparator.comparing(Persona ::getNombre));
        System.out.println("Nombres Ordenados Alfabeticamente: ");
        for(Persona persona : personas) {
            System.out.println( persona.getNombre());
        }


     //Comparo los apellidos con el metodo sort y Comparator los ordeno alfabeticamente
 Collections.sort(personas, Comparator.comparing(Persona::getApellido));
        System.out.println("Apellidos Ordenados Alfabeticamente: ");
        for(Persona persona : personas) {
            System.out.println(persona.getApellido());
        }


     //Comparo los apellido y los ordeno inversamente con el comparator.reverseOrder
     Collections.sort(personas, Comparator.comparing(Persona::getApellido, Comparator.reverseOrder()));
        System.out.println("Apellidos Ordenados a la Inversa: ");
        for(Persona persona : personas) {
            System.out.println(persona.getApellido());
        }



    }
}
