package pe.edu.upc.studywinproyect.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

//No se toca a menos que se modifique la base de datos
@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "nombres",nullable = false,length = 40)
    private String nombres;

    @Column(name="apellidos",nullable = false,length = 40)
    private String apellidos;

    @Column(name="dni",length = 10, unique = true )
    private String dni;

    @Column(name="email",nullable = false,length = 100, unique = true )
    private String email;

    @Column(name="contrasena",nullable = false,length = 200 )
    private String contrasena;

    @Column(name="puntos_usuario",nullable = false )
    private int puntos_usuario;

    @Column(name="institucion_educativa",nullable = false, length = 50)
    private String institucion_educativa;

    @Column(name="enabled")
    private Boolean enabled;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public Usuario() {
    }

    public Usuario(Long id_usuario, String nombres, String apellidos, String dni, String email, String contrasena, int puntos_usuario, String institucion_educativa) {
        this.id_usuario = id_usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.contrasena = contrasena;
        this.puntos_usuario = puntos_usuario;
        this.institucion_educativa = institucion_educativa;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
