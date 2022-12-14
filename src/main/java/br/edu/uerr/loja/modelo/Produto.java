package br.edu.uerr.loja.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="empresa_id")
	private Empresa empresaId;
	@Column(name="fornecedor_id")
	private Fornecedor fornecedorId;
	private String nome;
	private String unidade;
	private Integer quantidade;
	private double preco;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Empresa getEmpresaId() {
		return empresaId;
	}
	public void setEmpresaId(Empresa empresaId) {
		this.empresaId = empresaId;
	}
	public Fornecedor getFornecedorId() {
		return fornecedorId;
	}
	public void setFornecedorId(Fornecedor fornecedorId) {
		this.fornecedorId = fornecedorId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	
	
	
}
