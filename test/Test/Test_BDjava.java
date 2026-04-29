/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.Test_BDjava to edit this template
 */
package Test;
import java.sql.*;
import Util1.ConexionSingleton;

/**
 *
 * @author jeont
 */
public class Test_BDjava {

   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public void testConexion(){
        ConexionSingleton conn = new ConexionSingleton();
        try {
          
            Connection connection = conn.getConnection();
            if (connection != conn.getConnection()) {
                System.out.println(" Conexion sastifactoria");  
                
                
            } else {
                System.out.println(" No se puede establecer una conexion");
            }
        } catch (Exception e) {
            System.out.println(" Error:" + e.getMessage());
            e.printStackTrace();
    }
    }
}
    
