package model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	private int id;
	@Column
	private String nome;
	@Column
	private String cpf;
	@Column
	private String rg;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	
	public void setNome(String name) {
		this.nome = name;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
}
