package pe.edu.upc.studywinproyect.serviceInterfaces;

import pe.edu.upc.studywinproyect.entities.UsuariosXCurso;
import java.util.List;

public interface IUsuariosXCursoService {
    // Como programador quiero listar las relaciones UsuariosXCurso para gestionarlas
    public List<UsuariosXCurso> list();
    // Como programador quiero guardar las relaciones UsuariosXCurso para gestionarlas
    public void insert(UsuariosXCurso usuariosXCurso);
    // Como programador quiero listar por id las relaciones UsuariosXCurso
    public UsuariosXCurso listID(Long id);
    // Como programador quiero modificar las relaciones UsuariosXCurso para gestionarlas
    public void update(UsuariosXCurso usuariosXCurso);
    // Como programador quiero eliminar las relaciones UsuariosXCurso para gestionarlas
    public void delete(Long id);
    //Como programador, quiero listar los usuarios que no están inscritos en ningún curso para identificar aquellos que necesitan ser asignados a uno.
    public List<String[]> usuariossincurso();
    //Como programador, quiero listar la cantidad de usuarios inscritos por curso para poder analizar la participación.
    public List<String[]>  cursoscantusers();
}
