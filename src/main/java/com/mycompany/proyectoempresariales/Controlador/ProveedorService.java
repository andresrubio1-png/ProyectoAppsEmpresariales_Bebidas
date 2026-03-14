package com.mycompany.proyectoempresariales.Controlador;

import com.mycompany.proyectoempresariales.Modelo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ProveedorService implements IProveedorService {
    
    private static ProveedorService proveedorService; //Singleton
    private IGuiService guiService = GuiService.getInstance();
    private static List<Proveedor> Proveedores = new ArrayList();

    private ProveedorService() {
        cargarProveedoresDefault();
    }

    public static ProveedorService getInstance() {
        if (proveedorService == null) {
            proveedorService = new ProveedorService();
        }
        return proveedorService;
    }

    private void cargarProveedoresDefault() {

        Proveedores.add(
                Proveedor.builder()
                        .Codigo(1)
                        .Nombre("Postobon")
                        .Telefono("22222")
                        .Estado("Activo")
                        .build()
        );
        Proveedores.add(
                Proveedor.builder()
                        .Codigo(2)
                        .Nombre("The Coca-Cola Company")
                        .Telefono("3333333")
                        .Estado("Activo")
                        .build()
        );
        guiService.cambioEnGUI();
    }

    @Override
    public void agregarGaseosa(Gaseosa gaseosa, Proveedor proveedor) throws Exception {
        if (gaseosa == null) {
            throw new Exception("La gaseosa es null");
        }

        if (proveedor == null) {
            throw new Exception("Proveedor no válido");
        }
        if (!proveedor.getGaseosas().contains(gaseosa)) {
            proveedor.getGaseosas().add(gaseosa);
        }
        guiService.cambioEnGUI();
    }

    @Override
    public void addProveedor(Proveedor proveedor) throws Exception {
        for (Proveedor p : Proveedores) {
            if (p.getCodigo() == proveedor.getCodigo()) {
                throw new Exception("Ya existe un proveedor con ese código");
            }
        }
        Proveedores.add(proveedor);
        guiService.cambioEnGUI();
    }

    @Override
    public void eliminarProveedor(Proveedor proveedor) {
        proveedor.setEstado("Inactivo");
        proveedor.getGaseosas().clear();
        guiService.cambioEnGUI();
    }

    @Override
    public List<Proveedor> listarProveedores() {
        return Proveedores;
    }

    @Override
    public Proveedor buscarProveedor(int codigo) {
        for (Proveedor p : Proveedores) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void updateProveedor(Proveedor proveedor, String nombre, String telefono,
            String estado) {
        proveedor.setNombre(nombre);
        proveedor.setTelefono(telefono);
        proveedor.setEstado(estado);
        guiService.cambioEnGUI();
    }

    @Override
    public void eliminarGaseosa(Proveedor proveedor, Gaseosa gaseosa) {
        proveedor.getGaseosas().remove(gaseosa);
        guiService.cambioEnGUI();
    }

}
