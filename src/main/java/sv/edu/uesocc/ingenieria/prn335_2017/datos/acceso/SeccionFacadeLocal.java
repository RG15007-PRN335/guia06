/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Seccion;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface SeccionFacadeLocal {

    boolean create(Seccion seccion);

    boolean edit(Seccion seccion);

    boolean remove(Seccion seccion);

    Seccion find(Object id);

    List<Seccion> findAll();

    List<Seccion> findRange(int desde, int hasta);

    int count();
    
}
