/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo5;

/**
 *
 * @ GUILLERMO ESPINOZA SANCHEZ
 */
public class POO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona per1 = new Persona();
        System.out.println(per1);
        per1.setNombre("Sofia");
        System.out.println(per1.getNombre());
        per1.setApellido("Hernandez");
        per1.setfNacimiento(new Fecha(21,10,22));
        
        Persona per2 = new Persona("Arturo","Rodriguez",new Fecha(11,6,3));
        System.out.println(per2);
        Fecha fecha = new Fecha();
        fecha.setDia(33);
        fecha.setMes(4);
        fecha.setAnio(99);
        
        Persona per3 = new Persona("Moises","Espinoza",fecha);
        System.out.println(per3);
    }
    
}
