package abecedario.modelo.entidades;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Ejemplar {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idejemplar;
	
	@NotNull
	@NotEmpty
	private Date fechaimp;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Libro libro;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Libreria libreria;

	public long getIdejemplar() {
		return idejemplar;
	}

	public void setIdejemplar(long idejemplar) {
		this.idejemplar = idejemplar;
	}

	public Date getFechaimp() {
		return fechaimp;
	}

	public void setFechaimp(Date fechaimp) {
		this.fechaimp = fechaimp;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}



	

}
