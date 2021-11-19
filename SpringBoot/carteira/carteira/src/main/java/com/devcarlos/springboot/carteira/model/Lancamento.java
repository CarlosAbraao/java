package com.devcarlos.springboot.carteira.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.devcarlos.springboot.carteira.ENUM.TipoLancamento;
import com.devcarlos.springboot.carteira.ENUM.TipoStatus;

@Entity
@Table(name = "lancamento" , schema = "carteira")
public class Lancamento {
	
	// MAPEANDO COM MAIS DETALHE OS ATRIBUTOS
	// ESTOU USANDO A ANOTAÇÃO COLUMN PARA INFORMAR O NOME DOS CAMPOS NA TABELA DE DADOS
	// POREM N SERIA NECESSARIOS POIS SÃO OS MESMOS NOMES
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "mes")
	private Integer mes;
	
	@Column(name = "ano")
	private Integer ano;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING) // AQUI ESTOU DIZENDO SE O DADOS É STRING OU ORDINAL E TAMBEM QUE É UM ENUM
	private TipoLancamento tipo;
	
	@Column(name = "status")
	@Enumerated(value =EnumType.STRING) // AQUI ESTOU DIZENDO SE O DADOS É STRING OU ORDINAL E TAMBEM QUE É UM ENUM 
	private TipoStatus status;
	
	
	// VOU CRIAR UM RELACIONAMENTO
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class) // DATA DINAMICA
	private LocalDate data_cadastro;

	// VOU ADICIONAR UM CONSTRUTOR VAZIO
	
	public Lancamento() {
		
	}
	
	
	// CRIADO O CONSTRUTOR DA CLASSE COM TODOS OS ATRIBUTOS
	public Lancamento(Long id, String descricao, Integer mes, Integer ano, BigDecimal valor, TipoLancamento tipo,
			TipoStatus status, Usuario usuario, LocalDate data_cadastro) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.mes = mes;
		this.ano = ano;
		this.valor = valor;
		this.tipo = tipo;
		this.status = status;
		this.usuario = usuario;
		this.data_cadastro = data_cadastro;
	}


	
	// ADICIONANDO OS GETTERS E SETTERS
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Integer getMes() {
		return mes;
	}


	public void setMes(Integer mes) {
		this.mes = mes;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public TipoLancamento getTipo() {
		return tipo;
	}


	public void setTipo(TipoLancamento tipo) {
		this.tipo = tipo;
	}


	public TipoStatus getStatus() {
		return status;
	}


	public void setStatus(TipoStatus status) {
		this.status = status;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public LocalDate getData_cadastro() {
		return data_cadastro;
	}


	public void setData_cadastro(LocalDate data_cadastro) {
		this.data_cadastro = data_cadastro;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	
	// HASH CODE E EQUALS NO ID

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		return Objects.equals(id, other.id);
	}

	
	// TO STRING

	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", descricao=" + descricao + ", mes=" + mes + ", ano=" + ano + ", valor="
				+ valor + ", tipo=" + tipo + ", status=" + status + ", usuario=" + usuario + ", data_cadastro="
				+ data_cadastro + "]";
	}


	
	
	
	


}
