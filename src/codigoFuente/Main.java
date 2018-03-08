/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codigoFuente;


public class Main {

    public static void main(String[] args) {
    	/*1. Para cambiar el nombre de la variable "miCuenta" a "cuenta1" debemos hacer doble click izquierda sobre
    	 * la variable, y después hacemos click derecho, nos vamos a "Refactor > Rename", y escribimos "cuenta1".
    	 * Una vez hecho esto se refactorizara el nombre. */
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1);
    }

	public static void operativa_cuenta(CCuenta cuenta1) {
		try {
            cuenta1.retirar(2300);
            //modificado
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
