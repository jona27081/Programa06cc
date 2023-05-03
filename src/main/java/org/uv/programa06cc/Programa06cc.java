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

        DAOVenta dao = new DAOVenta();

        DetalleVenta d1 = new DetalleVenta();
        DetalleVenta d2 = new DetalleVenta();
        Venta venta = new Venta();

        Date fecha = Date.from(Instant.now());
        venta.setFecha(new java.sql.Date(fecha.getTime()));
        venta.setMonto(100.0);
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

        dao.create(venta);
    }
}
