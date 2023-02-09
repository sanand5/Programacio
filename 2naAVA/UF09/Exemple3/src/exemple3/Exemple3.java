/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple3;

/**
 *
 * @author sanand
 */
public class Exemple3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VehiculoAlquilado V1 = new VehiculoAlquilado(20, 50, 600, 900, new Cliente("26573369C","Andreu","Sanz"), new Vehiculo("1234ABC","","","",2000));
        System.out.printf("""
                          ***Vehiclo llogat
                          Client: %s %s %s
                          Vehicle: %s
                          """, V1.getCliente().getDni() ,V1.getCliente().getNombre(), V1.getCliente().getApellido(), V1.getVehiculo().getMatricula());
        System.out.println("""
                           Aquí está un tablero de 10x10 hecho con caracteres ASCII:
                           
                      
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           |   |   |   |   |   |   |   |   |   |   |
                           +---+---+---+---+---+---+---+---+---+---+
                           """);
    }
    
}
