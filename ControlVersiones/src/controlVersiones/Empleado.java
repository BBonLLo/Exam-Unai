package controlVersiones;
/**
 * 
 * @author unai
 * @version Version 1, 2021
 * @since 24/05/2021
 *
 */
public class Empleado {
	/**
	 * nombre Nombre del empleado
	 * apellidos Apellidos del empleado
	 * salario Salario del empleado
	 */
	private String nombre;
	private String apellidos;
	private double salario;
	/**
	 * 
	 * @param nombre Contiene el nombre del empleado
	 * @param apellido Contiene el apellido del empleado
	 * @param salario Contiene el salario del empleado
	 * 
	 */

	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellidos = apellido;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void subirsalario(double subida) {
		salario = salario + subida;
	}
	/**
	 * 
	 * @param subida Añade al salario un extra llamado subida
	 */

}