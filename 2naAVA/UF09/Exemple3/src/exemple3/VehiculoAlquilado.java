/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple3;

/**
 *
 * @author sanand
 */
public class VehiculoAlquilado {

    private int diaAlquiler;
    private int anoAlquiler;
    private int mesAlquiler;
    private int totalAlquiler;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public VehiculoAlquilado(int diaAlquiler, int mesAlquiler, int anoAlquiler, int totalAlquiler, Cliente cliente, Vehiculo vehiculo) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anoAlquiler = anoAlquiler;
        this.totalAlquiler = totalAlquiler;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }
    
    public int getAnoAlquiler() {
        return anoAlquiler;
    }

    public int getTotalAlquiler() {
        return totalAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}
