package cuentas;

/*
* Clase que define las operaciones realizadas con el saldo
* @autor Alberto
* @version Versión 1.0
*/


public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    /**
     * 
     * @param nom nombre titular
     * @param cue cuenta 
     * @param sal salario
     * @param tipo tipo de interes
     */

    public CCuenta(String nom, String cue, double sal, double tipo)
 
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * 
     * @return devuelve el saldo actual
     */

    public double estado()
    {
        return saldo;
    }
    
    /**
     * 
     * @param cantidad cantidad de dinero que se ingresa
     * @throws Exception En caso de que la cantidad sea negativia
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * 
     * @param cantidad cantidad de dinero para retirar 
     * @throws Exception En caso de que la cantidad sea negativa
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * 
     * se ha definido los Getter y Setter de los parámetros de la clase
     */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
    
}
