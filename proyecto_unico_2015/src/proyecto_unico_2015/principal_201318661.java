	package proyecto_unico_2015;
    import java.io.File;
    import java.io.IOException;
    
public class principal_201318661 {
	public static void main(String[] args) {
	    interfaz_201318661 ventana = new interfaz_201318661();
	    ventana.setVisible(true);

	    File venta=new File("venta.fct");

	    if(!venta.exists()){
	    try{
	    venta.createNewFile();
	    }catch(IOException ex){ex.printStackTrace();}

	    File empleados=new File("empleados.emp");

	    if(!empleados.exists()){
	      try{
	           empleados.createNewFile();
	       }catch(IOException ex){ex.printStackTrace();}
	    }

	    File producto=new File("producto.prt");

	    if(!producto.exists()){
	    try{
	    producto.createNewFile();
	    }catch(IOException ex){ex.printStackTrace();}
	    }

	    File cliente=new File("cliente.emp");

	    if(!cliente.exists()){
	    try{
	    cliente.createNewFile();
	    }catch(IOException ex){ex.printStackTrace();}
	    }
	    
	    }}
}
