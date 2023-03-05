package modelo.javabeans;

import java.util.Objects;

public class Cuenta {
	
	private int idCuenta;
	private String tipoCuenta ;
	private double saldo;
	private Cliente cliente;
	public Cuenta(int idCuenta, String tipoCuenta, double saldo, Cliente cliente) {
		super();
		this.idCuenta = idCuenta;
		this.tipoCuenta = tipoCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	public Cuenta() {
		super();
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String toString() {
		return "Cuenta [idCuenta=" + idCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + ", cliente="
				+ cliente + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idCuenta);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return idCuenta == other.idCuenta;
	}
		
		public void ingresar (double cantidad) {
			saldo +=cantidad;
			
			
			
		}
		
		public void extraer(double cantidad) {
			saldo -=cantidad;
			

	}
	
	


}
