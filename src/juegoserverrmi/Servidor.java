package juegoserverrmi;
import java.rmi.*;
import java.rmi.server.*;

class Servidor  {
    static public void main (String args[]){


        try{

            System.setProperty ("java.rmi.server.codebase", "file:C:/Users/Ernesto/Desktop/RMI/");

               ServiciosMetodos objetoRemoto = new ServiciosMetodos(); 
               Naming.rebind("//localhost/ObjetoRemoto", objetoRemoto);

        }catch(Exception e){
            System.out.println("Algo fallo en el Servidor :'v");
        }
    
    }
}
