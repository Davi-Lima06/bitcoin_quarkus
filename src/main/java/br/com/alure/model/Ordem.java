package br.com.alure.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ordem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double preco;
	private String tipo;
	private LocalDate data;
	private String status;
	
	@Column(name = "user_id")
	private Integer userId;

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getUserId() {
		return userId;
	}

	public Double getPreco() {
		return preco;
	}

	public String getTipo() {
		return tipo;
	}

	public LocalDate getData() {
		return data;
	}

	public String getStatus() {
		return status;
	}
	
	
	
}
