package com.uce.edu.demo.modelo;

import java.math.BigDecimal;

public class Vehiculo {

	protected String marca;
	protected String paisOrigen;
	protected String placa;
	protected String tipo;
	protected BigDecimal precio;
	protected BigDecimal valorMatricula;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", paisOrigen=" + paisOrigen + ", placa=" + placa + ", tipo=" + tipo
				+ ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}

}
