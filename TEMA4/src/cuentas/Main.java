package cuentas;


import cuentas.CCuenta;

/*En esta clase se definene los tipos de operaciones que se puede realizar
* @author alberto
* @version versión 1.0
* */
public class Main {

   
    public static void main(String[] args) {
        /**
         * El método operativa_cuenta define todas las operaciones que se pueden hacer
         * La cantidad que ingresa el usuario debe ser positiva o inferior al saldo de la cuenta 
         * para que la operación se realice de forma satisfactoria
         * En caso contrario se realiza una escepción.
         * @param La var cuenta1 se encarga de almacenar el saldo de la cuenta
         * @param La var cantidad se encarga de almacenar la cantidad de dinero
         * que el usuario decide para realizar la operación.
         * */
        
    }
    public static void operativa_cuenta (){
        CCuenta cuenta1;
        double saldoActual;
        float cantidad;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }  
}

