package org.palomafp.shein.modelo;

/**
 * Clase modelo con todos los atributos y métodos para crear un modelo completo
 * e
 * implementarlo en otras clases
 */
public class Modelo {
    // Nombre del modelo
    private String nombre;
    // Apellido del modelo
    private String apellido;
    // Teléfono del modelo
    private long telefono;
    // DNI del modelo
    private String dni;
    // Correo electrónico del modelo
    private String correo;
    // Género del modelo
    private Genero genero;

    /**
     * Enumeración para el género del modelo
     */
    public enum Genero {
        MASCULINO, FEMENINO, OTRO
    }

    /**
     * Constructor por defecto del modelo
     */
    public Modelo() {
    }

    /**
     * Constructor con parámetros para crear un modelo completo
     * 
     * @param nombre   Nombre del modelo
     * @param apellido Apellido del modelo
     * @param telefono Teléfono del modelo
     * @param dni      DNI del modelo
     * @param correo   Correo electrónico del modelo
     * @param genero   Género del modelo
     */
    public Modelo(String nombre, String apellido, long telefono, String dni, String correo, Genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
        this.correo = correo;
        this.genero = genero;
    }

    /**
     * Métodos getter y setter para los atributos de la clase
     * 
     * @return Devuelve el nombre, apellido, teléfono, DNI, correo y género del
     *         modelo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para el nombre del modelo
     * 
     * @param nombre Nombre del modelo a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para el apellido del modelo
     * 
     * @return Devuelve el apellido del modelo
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método setter para el apellido del modelo
     * 
     * @param apellido Apellido del modelo a establecer
     */

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método getter para el teléfono del modelo
     * 
     * @return Devuelve el teléfono del modelo
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * Método setter para el teléfono del modelo
     * 
     * @param telefono Teléfono del modelo a establecer
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * Método getter para el DNI del modelo
     * 
     * @return Devuelve el DNI del modelo
     */
    public String getDni() {
        return dni;
    }

    /**
     * Método setter para el DNI del modelo
     * 
     * @param dni DNI del modelo a establecer
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Método getter para el correo electrónico del modelo
     * 
     * @return Devuelve el correo electrónico del modelo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método setter para el correo electrónico del modelo
     * 
     * @param correo Correo electrónico del modelo a establecer
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método getter para el género del modelo
     * 
     * @return Devuelve el género del modelo
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * Método setter para el género del modelo
     * 
     * @param genero Género del modelo a establecer
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * Método toString para mostrar toda la información del modelo
     * 
     * @return Devuelve una cadena con el nombre, apellido, teléfono, DNI, correo y
     *         género del modelo
     */
    @Override
    public String toString() {
        return "Modelo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", dni='" + dni + '\'' +
                ", correo='" + correo + '\'' +
                ", genero=" + genero +
                '}';
    }
}
