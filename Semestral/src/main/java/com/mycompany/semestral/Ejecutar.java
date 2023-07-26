
package com.mycompany.semestral;


public class Ejecutar {

    public static void main(String[] args) {
        
        MetodosJDBC mJdbc=new MetodosJDBC();
        
        Clientes Julian=new Clientes(); 
        if(mJdbc.modificar(Julian)){
            System.out.println("\n\n Se actualizó correctamente");
        }else{
            System.out.println("\n\n No se actualizó");
        }
         
        mJdbc.crear(new Clientes());
        
        Clientes buscado=mJdbc.buscarXCedula("cedula");
        System.out.println(buscado.getNombre());
        System.out.println(buscado.getCiudad());
        System.out.println(buscado.getGenero());
        System.out.println(buscado.getTelefono());
        System.out.println(buscado.getFechaNacimiento());
        System.out.println(buscado.getCorregimiento());
        System.out.println(buscado.getCorreo());
        System.out.println(buscado.getProvincia());
        System.out.println(buscado.getTipoCliente());
        
        
        Clientes buscado1=mJdbc.buscarXCiudad("ciudad");
        System.out.println(buscado1.getNombre());
        System.out.println(buscado1.getCedula());
        System.out.println(buscado1.getGenero());
        System.out.println(buscado1.getTelefono());
        System.out.println(buscado1.getFechaNacimiento());
        System.out.println(buscado1.getCorregimiento());
        System.out.println(buscado1.getCorreo());
        System.out.println(buscado1.getProvincia());
        System.out.println(buscado1.getTipoCliente());
        
        
        Clientes buscado3=mJdbc.buscarXNombre("nombre");
        System.out.println(buscado3.getNombre());
        System.out.println(buscado3.getCiudad());
        System.out.println(buscado3.getGenero());
        System.out.println(buscado3.getTelefono());
        System.out.println(buscado3.getFechaNacimiento());
        System.out.println(buscado3.getCorregimiento());
        System.out.println(buscado3.getCorreo());
        System.out.println(buscado3.getProvincia());
        System.out.println(buscado3.getTipoCliente());
        
        Clientes buscado2=mJdbc.buscarXTipoCliente("tipo_cliente");
        System.out.println(buscado2.getNombre());
        System.out.println(buscado2.getCiudad());
        System.out.println(buscado2.getGenero());
        System.out.println(buscado2.getTelefono());
        System.out.println(buscado2.getFechaNacimiento());
        System.out.println(buscado2.getCorregimiento());
        System.out.println(buscado2.getCorreo());
        System.out.println(buscado2.getProvincia());
        System.out.println(buscado2.getCedula());
        
    }
    
}
