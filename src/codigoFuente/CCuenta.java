/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package codigoFuente;

/**
 * 
 * @author Dany
 * @version 1.0
 * @since 08/03/2018
 * 
 */

/**
 * CCuenta: es el nombre de la clase que vamos a operar.
 *
 */
public class CCuenta {

	/**
	 * <b>Atributos de la CCuenta</b>
	 */
	
	/**
	 * Nombre es el nombre de la cuenta
	 */
    private String nombre;
    /**
     * Cuenta es la cuenta que utiliza 
     */
    private String cuenta;
    /**
     * Saldo es el saldo que hay en la cuenta
     */
    private double saldo;
    /**
     * tipoInteres es el tipo de interes que desea realizar dentro de la cuenta
     */
    private double tipoInterés;


    /**
	 * <b>Constructores</b>
	 */
	
	/**
	 * Constructor sin parametro
	 */
    public CCuenta()
    {
    }


	/**
	 * Constructor con parametros
	 * @param nombre Nombre de la cuenta
	 * @param cuenta Cuenta que desea utilizar
	 * @param saldo Saldo que tiene en la cuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
	 * Metodo asignarNombre: asigna un nombre que ha sido introducido en la cuenta
	 * 
	 * 
	 */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * obtenerNombre: obtiene el nombre que se ha introducido
     * 
     * @return retorna el nombre guardado dentro de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }
    
    /**
     * estado: Con el estado se obtiene el saldo que hay almacenado en la cuenta
     * 
     * @return retorna la cantidad de saldo que hay almacenada
     */

    public double estado()
    {
        return saldo;
    }

    /**
     * ingresar: Ingresa la cantidad de saldo deseada por el cliente en la cuenta
     * 
     * @param cantidad se refiere a la cantidad que desea introducir en la cuenta
     * @throws Exception es la excepcion que se produce si desea introducir una cantidad negativa de dinero en la cuenta
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");//Devuelve la excepcion de ingresar una cantidad negativa de dinero
        saldo = saldo + cantidad;
    }

    /**
     * retirar: retira la cantidad de saldo deseado por el cliente
     * 
     * @param cantidad se refiere a la cantidad que desea retirar en la cuenta
     * @throws Exception es la excepcion que se produce si desea retirar una cantidad negativa de dinero en la cuenta
     * @throws Exception si desea retirar una cantidad superior a la que hay dentro de la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");//Devuelve la excepcion de retirar una cantidad negativa de dinero
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");//Devuelve la excepcion de retirar una cantidad de saldo superior de la que dispone
        saldo = saldo - cantidad;
    }

    /**
     * obtenerCuenta: se realiza para obtener una cuenta nueva
     * 
     * @return retorna una cuenta al cliente
     */

    public String obtenerCuenta()
    {
        return cuenta;
    }

    /**
	 * Metodos getters y setters
	 */

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
