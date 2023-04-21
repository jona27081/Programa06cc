/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package org.uv.programa06cc;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zS20006736
 */
public class Programa06cc {

    public static void main(String[] args) {
        /*eliminar venta
        DAOVenta dao = new DAOVenta();
        String clave = JOptionPane.showInputDialog(null, "ID de venta: ");
        long L = Long.parseLong(clave);
        dao.delete(L);*/

        //       Buscar por ID
        /*  int i = 1;
        String mensaje = "~~~~~Ventas Detalladas~~~~~\n";
        DAOVenta dao = new DAOVenta();
        String clave = JOptionPane.showInputDialog(null, "ID de venta: ");
        long L = Long.parseLong(clave);
        Venta venta = dao.findById(L);
        JOptionPane.showMessageDialog(null, "Fecha: " + venta.getFecha() + "   " + "Total: " + venta.getMonto(), "ID Venta: " + venta.getIdVenta(), JOptionPane.INFORMATION_MESSAGE);
        for (DetalleVenta dt : venta.getDetalle()) {
            mensaje += "ID: " + dt.getIdProducto() + "\n";
            mensaje += "Descripción: " + dt.getDescripcion() + "\n";
            mensaje += "Precio: " + dt.getPrecio() + "\n";
            mensaje += "Cantidad: " + dt.getCantidad() + "\n";
            mensaje += "Subtotal: " + dt.getSubtotal() + "\n\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, mensaje);*/

 /*crear una venta
        DAOVenta dao = new DAOVenta();
        Venta venta = new Venta();
        DetalleVenta d1 = new DetalleVenta();
        DetalleVenta d2 = new DetalleVenta();
        
        Date fecha=Date.from(Instant.now());
        venta.setFecha(new java.sql.Date(fecha.getTime()));
        venta.setMonto(100);
        d1.setDescripcion("Pro 1");
        d1.setCantidad(1.0);
        d1.setPrecio(10.0);
        d1.setSubtotal(10.0);
        d1.setVenta(venta);
        venta.getDetalle().add(d1);
        
        d2.setDescripcion("Pro 2");
        d2.setCantidad(1.0);
        d2.setPrecio(10.0);
        d2.setSubtotal(10.0);
        d2.setVenta(venta);
        venta.getDetalle().add(d2);
        
        dao.create(venta);*/
 /*actualizar una venta
        DAOVenta dao = new DAOVenta();
        Venta vN = new Venta();

        String clave = JOptionPane.showInputDialog(null, "ID de venta: ");
        long L = Long.parseLong(clave);
        Venta vO = dao.findById(L);

        if (vO != null) {
            String monto = JOptionPane.showInputDialog(null, "Monto: ");
            Double m = Double.parseDouble(monto);
            vN.setMonto(m);
            Date fecha = Date.from(Instant.now());
            vN.setFecha(new java.sql.Date(fecha.getTime()));

            boolean t = true;
            do {
                DetalleVenta d = new DetalleVenta();
                JOptionPane.showMessageDialog(null, "Complete los campos para actualizar el producto");
                String descripcion = JOptionPane.showInputDialog(null, "Descripcion: ");
                String precio = JOptionPane.showInputDialog(null, "Precio: ");
                Double P = Double.parseDouble(precio);
                String cantidad = JOptionPane.showInputDialog(null, "Cantidad: ");
                Double C = Double.parseDouble(cantidad);

                d.setDescripcion(descripcion);
                d.setPrecio(P);
                d.setCantidad(C);
                d.setSubtotal(C * P);
                d.setVenta(vN);
                vN.getDetalle().add(d);

                String opc = JOptionPane.showInputDialog(null, "Agregar Otro (1/SI - 2/NO) : ");
                if ("2".equals(opc)) {
                    t = false;
                }

            } while (t == true);
            

            dao.update(L, vN);
        }*/
//        DAOVenta ventaDAO = new DAOVenta();
//
//        // Obtener todas las ventas y sus detalles
//        List<Venta> ventas = ventaDAO.findAll();
//
//        // Iterar sobre las ventas y mostrar sus detalles
//        for (Venta venta : ventas) {
//            System.out.println("Venta #" + venta.getIdVenta() + ":");
//            for (DetalleVenta detalle : venta.getDetalle()) {
//                System.out.println("  - " + detalle.getDescripcion() + ": " + detalle.getPrecio());
//            }
//        }
    }
}
