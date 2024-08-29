
package clasegenerica.Model;

    

import Controller.DBConnection;
import Controller.Inserccion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class ClaseGenerica {

   
    public static void main(String[] args) {
       
        
        
       ArrayList datos = new ArrayList(4);
       Manzana manzana1 = new Manzana();
       Persona persona1 = new Persona("Jack", 100, "Sura", LocalDate.of(1990, Month.MARCH, 21));
       
       
       datos.add(persona1);
       datos.add("Carlos");
       datos.add(45);
       datos.add(manzana1);
       
       
       
       String Nombre = (String)datos.get(1);
       Manzana Fruta = (Manzana)datos.get(3);
       System.out.println("El nombre es "+ Nombre+" Y la Fruta es " + Fruta);
       System.out.println("///");
       System.out.println("///");
       System.out.println("///");
       System.out.println("///");
              
       String nombre1 = Integer.toString((Integer)datos.get(2));
       
       System.out.println("Los nombre de la colección son " + datos.get(2));       
       
       
       
       caja<String> cajaCadena = new caja<String>();
       caja<Manzana> cajaManzanas = new caja<Manzana>();
        System.out.println("comparacion " + cajaCadena.equals(cajaManzanas));
       
        
        
        
       Manzana fruta1 = new Manzana();
       String palabra = "test";
       cajaCadena.SetDato(palabra);
       cajaManzanas.SetDato(fruta1);
       cajaManzanas.GetDato().despacho();
       
       System.out.println("El texto de la caja es" + cajaCadena.GetDato());
   
       System.out.println(cajaCadena.GetDato().toUpperCase());
       
       
       
       Pair<String, Integer> pair1 = new Pair(persona1.getNombre(), persona1.getEdad());
       
       Pair<String, LocalDate> pair2 = new Pair(persona1.getEps(), persona1.getFechaDeNacimiento());
        
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
       
        System.out.println("--------------");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond()+" hola");
       
       LocalDate cumple = pair2.getSecond();//For reference
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
       String cumpleS = cumple.format(formatter);
        
       DBConnection connection = new DBConnection();
       Connection conn = connection.conectar();
       
       Inserccion insert = new Inserccion();
       insert.guardar(conn, pair1.getFirst(), pair1.getSecond(), pair2.getFirst(), cumpleS);
       
        
        
        
        
        
        
        
        
        
        /*
        
        DBConnection connection = new DBConnection();
        String query = "INSERT INTO users(Nombre, edad, eps, fechaDeNacimiento) "
                + "VALUES('"+ pair1.getFirst() +"', '"+pair1.getSecond() +"', "
                + "'"+pair2.getFirst() +"', '"+pair2.getSecond() +"' )";
        try{
            int rs = connection.updateDataBase(query);
        }catch(Exception e){
            e.printStackTrace();
        }
        */
    }
    
}
