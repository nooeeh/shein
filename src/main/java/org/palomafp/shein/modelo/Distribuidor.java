package org.palomafp.shein.modelo;

/**
 * Clase distribuidor con todos los atributos y métodos para crear un
 * distribuidor completo e implementarlo en otras clases
 */
public class Distribuidor {
    // Id del distribuidor
    private String id;
    // Teléfono del distribuidor
    private long telefono;
    // Correo electrónico del distribuidor
    private String correo;
    // Procedencia del distribuidor
    private String procedencia;

    /**
     * Constructor por defecto del distribuidor
     */
    public Distribuidor() {
    }

    /**
     * Constructor con parámetros para crear un distribuidor completo
     * 
     * @param id          Id del distribuidor
     * @param telefono    Teléfono del distribuidor
     * @param correo      Correo electrónico del distribuidor
     * @param procedencia Procedencia del distribuidor
     */
    public Distribuidor(String id, long telefono, String correo, String procedencia) {
        this.id = id;
        this.telefono = telefono;
        this.correo = correo;
        this.procedencia = procedencia;
    }

    /**
     * Métodos getter y setter para los atributos de la clase
     * 
     * @return Devuelve el id, teléfono, correo electrónico y procedencia del
     *         distribuidor
     */
    public String getId() {
        return id;
    }

    /**
     * Método setter para el id del distribuidor
     * 
     * @param id Id del distribuidor a establecer
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método getter para el teléfono del distribuidor
     * 
     * @return Devuelve el teléfono del distribuidor
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * Método setter para el teléfono del distribuidor
     * 
     * @param telefono Teléfono del distribuidor a establecer
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * Método getter para el correo electrónico del distribuidor
     * 
     * @return Devuelve el correo electrónico del distribuidor
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método setter para el correo electrónico del distribuidor
     * 
     * @param correo Correo electrónico del distribuidor a establecer
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método getter para la procedencia del distribuidor
     * 
     * @return Devuelve la procedencia del distribuidor
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * Método setter para la procedencia del distribuidor
     * 
     * @param procedencia Procedencia del distribuidor a establecer
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    /**
     * Método toString para mostrar toda la información del distribuidor
     * 
     * @return Devuelve una cadena con el id, teléfono, correo electrónico y
     *         procedencia del distribuidor
     */
    @Override
    public String toString() {
        return "Distribuidor{" +
                "id='" + id + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", procedencia='" + procedencia + '\'' +
                '}';
    }
}
