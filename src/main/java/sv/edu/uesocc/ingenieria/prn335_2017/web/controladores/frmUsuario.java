/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.UsuarioFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.definiciones.Usuario;

/**
 *
 * @author jonathanhdz
 */
@Named(value = "frmUsuario")
@ViewScoped
public class frmUsuario implements Serializable{

    public frmUsuario() {
    }
    
    @EJB
    private UsuarioFacadeLocal cfl;
    private LazyDataModel<Usuario> modelo;
    private Usuario registro;
    private boolean btnadd = true;
    private boolean botones = false;
    private boolean seleccions = false;
    
    @PostConstruct
    private void inicio() {

        registro = new Usuario();

        try {
            this.modelo = new LazyDataModel<Usuario>() {
                @Override
                public Object getRowKey(Usuario object) {
                    if (object != null) {
                        return object.getIdUsuario();
                    }
                    return null;
                }

                @Override
                public Usuario getRowData(String rowKey) {
                    if (rowKey != null && !rowKey.isEmpty() && this.getWrappedData() != null) {
                        try {
                            Integer buscado = new Integer(rowKey);
                            for (Usuario reg : (List<Usuario>) getWrappedData()) {
                                if (reg.getIdUsuario().compareTo(buscado) == 0) {
                                    return reg;
                                }
                            }
                        } catch (Exception e) {
                            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
                        }
                    }
                    return null;
                }

                @Override
                public List<Usuario> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
                    List<Usuario> salida = new ArrayList();
                    try {
                        if (cfl != null) {
                            this.setRowCount(cfl.count());
                            salida = cfl.findRange(first, pageSize);
                            
                        }
                    } catch (Exception e) {
                        Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
                    }
                    return salida;
                }

            };
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }
    
    public void cancelar() {
        this.registro = new Usuario();
        this.botones=false;
        this.btnadd=true;   
    }
    
    public void guardarRegistro() {
        try {
            if (this.registro != null && this.cfl != null) {
               if (this.cfl.create(registro)) {
                    System.out.println("AGREGOOOOO");
                    inicio();
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }


    public void Eliminar() {
        try {

            if (this.registro != null && this.cfl != null) {
                if (this.cfl.remove(registro)) {
                    this.registro = new Usuario();
                    inicio();
                }
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }
    
    public void Modificar() {
        try {
            if (this.registro != null && this.cfl != null) {
                if (this.cfl.edit(registro)) {
                    inicio();
                    
                }
            }
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
        }
    }


    public void cambiarSeleccion() {
                this.botones = true;
                this.btnadd = false;
                  
    }
    
    public LazyDataModel<Usuario> getModelo() {
        return modelo;
    }

    public void setModelo(LazyDataModel<Usuario> modelo) {
        this.modelo = modelo;
    }

    public Usuario getRegistro() {
        return registro;
    }

    public void setRegistro(Usuario registro) {
        this.registro = registro;
    }

    public boolean isBtnadd() {
        return btnadd;
    }

    public void setBtnadd(boolean btnadd) {
        this.btnadd = btnadd;
    }

    public boolean isSeleccions() {
        return seleccions;
    }

    public void setSeleccions(boolean seleccions) {
        this.seleccions = seleccions;
    }

    
    public boolean isBotones() {
        return botones;
    }

    public void setBotones(boolean botones) {
        this.botones = botones;
    }
        
}
