package pe.edu.upc.studywinproyect.dtos;
//No se toca a menos que se modifique la base de datos
public class UsuarioDTO {
    private Long id_usuario;
    private String nombres;
    private String apellidos;
    private String dni;
    private String email;
    private String contrasena;
    private int puntos_usuario;
    private String institucion_educativa;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getPuntos_usuario() {
        return puntos_usuario;
    }

    public void setPuntos_usuario(int puntos_usuario) {
        this.puntos_usuario = puntos_usuario;
    }

    public String getInstitucion_educativa() {
        return institucion_educativa;
    }

    public void setInstitucion_educativa(String institucion_educativa) {
        this.institucion_educativa = institucion_educativa;
    }
}
