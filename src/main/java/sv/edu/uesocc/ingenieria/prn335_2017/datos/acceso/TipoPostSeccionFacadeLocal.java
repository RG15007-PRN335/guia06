/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPostSeccion;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface TipoPostSeccionFacadeLocal {

    boolean create(TipoPostSeccion tipoPostSeccion);

    boolean edit(TipoPostSeccion tipoPostSeccion);

    boolean remove(TipoPostSeccion tipoPostSeccion);

    TipoPostSeccion find(Object id);

    List<TipoPostSeccion> findAll();

    List<TipoPostSeccion> findRange(int desde, int hasta);

    int count();
    
}
