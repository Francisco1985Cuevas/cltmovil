package py.com.clt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name="clientes")
@Data
public class Cliente implements Serializable {
	
	//mapeo de los campos de la Base de Datos.
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
		
	@NotNull(message = "El campo nombre no puede ser nulo")
	@NotEmpty(message = "El campo nombre no puede ser nulo")
	@NotBlank(message = "El campo nombre no puede estar en blanco")
	@Size(min = 2, max = 255, message = "El campo nombre debe tener entre 2 y 255 caracteres")
	@Column(name = "nombres", length = 255, nullable = false)
	private String nombre;
		
	@NotNull(message = "El campo apellido no puede ser nulo")
	@NotEmpty(message = "El campo apellido no puede ser nulo")
	@NotBlank(message = "El campo apellido no puede estar en blanco")
	@Size(min = 2, max = 255, message = "El campo apellido debe tener entre 2 y 255 caracteres")
	@Column(name = "apellidos", length = 255, nullable = false)
	private String apellido;
	
	@NotNull(message = "El campo numerodocumento no puede ser nulo")
	@NotEmpty(message = "El campo numerodocumento no puede ser nulo")
	@NotBlank(message = "El campo numerodocumento no puede estar en blanco")
	@Size(min = 2, max = 255, message = "El campo numerodocumento debe tener entre 2 y 255 caracteres")
	@Column(name = "numerodocumento", length = 255, nullable = false, unique = true)
	private String numerodocumento;
	
	@Column(name = "email", length = 255, nullable = true)
	private String email;
	
	@Column(name = "numerocuenta", length = 255, nullable = true)
	private String numerocuenta;
	
	@Column(name = "saldodisponible")
	private int saldodisponible;
	
}
