/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.UsuarioRolCategoria;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface UsuarioRolCategoriaFacadeLocal {

    boolean create(UsuarioRolCategoria usuarioRolCategoria);

    boolean edit(UsuarioRolCategoria usuarioRolCategoria);

    boolean remove(UsuarioRolCategoria usuarioRolCategoria);

    UsuarioRolCategoria find(Object id);

    List<UsuarioRolCategoria> findAll();

    List<UsuarioRolCategoria> findRange(int desde, int hasta);

    int count();
    
}
