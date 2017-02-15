package abecedario.modelo.entidades;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Libreria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idlib;
	
	@NotNull
	@NotEmpty
	private String direccion;
	
	@NotNull
	@NotEmpty
	private String due�o;
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<Ejemplar> ejemplares;

	public long getIdlib() {
		return idlib;
	}

	public void setIdlib(long idlib) {
		this.idlib = idlib;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDue�o() {
		return due�o;
	}

	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}

	public Set<Ejemplar> getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(Set<Ejemplar> ejemplares) {
		this.ejemplares = ejemplares;
	}
	

}
