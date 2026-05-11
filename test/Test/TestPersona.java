/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Dao.PersonaDaoImpl;
import Dao.UsuarioDaoImpl;
import Interface.IPersona;
import Interface.IUsuario;
import Model.Persona;
import Model.Rol;
import Model.Usuario;

/**
 *
 * @author jeont
 */
public class TestPersona {

    IPersona dao = new PersonaDaoImpl();
    IUsuario Udao= new UsuarioDaoImpl();
    
    
    public static void main(String[] args) {
     //hacemos la instanci
     TestPersona t = new TestPersona();
     t.insert();
     
    }
    public void insert (){
        Persona p = new Persona();
        
        p.setNombre ("Mishel");
        p.setEmail("jeonther@gmail.com");
        p.setTelefono("953734829");
        p.setDireccion("Jr: av lima");
        
       Usuario u = new Usuario();
        
       u.setPassword("admin123");
       u.setRol(Rol.CLIENTE);
       int result = dao.insert(p, u);
        if (result >0) {
            System.out.println("Persona y Usuario Creada");
            System.out.println("Usuario:"+p.getEmail());
            System.out.println("Rol asignado:"+u.getRol());
        }else{
            System.out.println(" no se pudo realizar el registro");
            
        }
    }
    
    public void valid_user(){
        Usuario u = Udao.validate("jeonther@gmail.com", "admin123");
        if (u!=null && u.getPersona()!= null) {
            System.out.println(" Bienvenido"+ u.getPersona().getNombre());
            System.out.println(" Rol"+ u.getRol());
            System.out.println(" Usuario" + u.getUsuario());
             System.out.println(" User_id" +u.getId_usuario());
             System.out.println(" persona_id:"+u.getPersona().getId_persona());
        }else{
            System.out.println(" credenciales incorrectas");
        }
       
        }
            }
    

