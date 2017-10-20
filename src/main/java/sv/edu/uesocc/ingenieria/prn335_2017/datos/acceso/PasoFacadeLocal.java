/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Paso;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface PasoFacadeLocal {

    boolean create(Paso paso);

    boolean edit(Paso paso);

    boolean remove(Paso paso);

    Paso find(Object id);

    List<Paso> findAll();

    List<Paso> findRange(int desde, int hasta);

    int count();
    
}
