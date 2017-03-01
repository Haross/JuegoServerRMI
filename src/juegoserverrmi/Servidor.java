package juegoserverrmi;
import java.rmi.registry.Registry;

class Servidor  {
    static public void main (String args[]){


        try{

            System.setProperty ("java.rmi.server.codebase", "file:C:/Users/Ernesto/Desktop/RMI/");

            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            //ServiciosMetodos obj = new ServiciosMetodos(); 

            r.rebind("ObjetoRemoto", new ServiciosMetodos());

               
               //Naming.rebind("//localhost/ObjetoRemoto", objetoRemoto);

        }catch(Exception e){
            System.out.println("Algo fallo en el Servidor :'v");
        }
    
    }
}

