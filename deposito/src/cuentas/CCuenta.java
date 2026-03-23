package cuentas;

/**
 * Clase CCuenta
 * Crea el objeto cuenta con un titular, númerode cuenta, saldo actual y tipo de interés.
 * Los métodos permiten consulta el saldo, retirar e ingresar dinero.
 * 
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return saldo
     */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Permite ingresar dinero en la cuenta
 * @param cantidad
 * @throws Exception 
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Permite retirar dinero de la cuenta
 * @param cantidad
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private double getTipoInterés() {
		return tipoInterés;
	}

	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
