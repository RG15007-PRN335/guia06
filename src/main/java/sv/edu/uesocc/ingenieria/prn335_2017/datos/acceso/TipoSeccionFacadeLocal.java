/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface TipoSeccionFacadeLocal {

    boolean create(TipoSeccion tipoSeccion);

    boolean edit(TipoSeccion tipoSeccion);

    boolean remove(TipoSeccion tipoSeccion);

    TipoSeccion find(Object id);

    List<TipoSeccion> findAll();

    List<TipoSeccion> findRange(int desde, int hasta);

    int count();
    
}
