/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.TipoPaso;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface TipoPasoFacadeLocal {

    boolean create(TipoPaso tipoPaso);

    boolean edit(TipoPaso tipoPaso);

    boolean remove(TipoPaso tipoPaso);

    TipoPaso find(Object id);

    List<TipoPaso> findAll();

    List<TipoPaso> findRange(int desde, int hasta);

    int count();
    
}
