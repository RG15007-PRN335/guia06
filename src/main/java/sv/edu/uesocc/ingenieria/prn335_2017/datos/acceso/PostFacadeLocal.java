/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import java.util.List;
import javax.ejb.Local;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Post;

/**
 *
 * @author jonathanhdz
 */
@Local
public interface PostFacadeLocal {

    boolean create(Post post);

    boolean edit(Post post);

    boolean remove(Post post);

    Post find(Object id);

    List<Post> findAll();

    List<Post> findRange(int desde, int hasta);

    int count();
    
}
