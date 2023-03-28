/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrohotel;

/**
 *
 * @author Varpu
 */
public class reservacion {
     
    private String nombre;
    private String documento;
    private int telefono;
    private String tipohabitacion;
    private String extras;
    private String formapago;
    private int cantpersonas;
    private double valor;
    private double total;
    private int numerohabitacion;
    private int dias;
    //DateTime Reservacion, Salida;
    
     public reservacion (String nombre, String documento, int telefono, String tipohabitacion,
            String extras,int cantpersonas,int dias,Double valor, Double total, String formapago, int numerohabitacion){
         
         this.nombre = nombre;
         this.documento = documento;
         this.telefono = telefono;
         this.tipohabitacion = tipohabitacion;
         this.extras = extras;
         this.cantpersonas = cantpersonas;
         this.dias = dias;
         this.valor = valor;
         this.total = total;
         this.formapago = formapago;
         this.numerohabitacion = numerohabitacion;
         
     }
     
     public String getNombre(){
        return nombre;
    }
     public String getDocumento(){
        return documento;
    }
     public int getTelefono(){
        return telefono;
    }
    public String getTipoHabitacion(){
        return tipohabitacion;
    }
    public String getExtras(){
        return extras;
    }
    public int getCantPersonas(){
        return cantpersonas;
    }
    public int getDias(){
        return dias;
    }
    public double getValor(){
        return valor;
    }
    public double getTotal(){
        return total;
    }
    public String getFormaPago(){
        return formapago;
    }
    public int getNumeroHabitacion(){
        return numerohabitacion;
    }
    
}
