/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.roberto.reportes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author elect
 */

@ManagedBean(name = "generarCalendario", eager = true)
@RequestScoped
public class generarCalendario {

    private String proveedor;

    public generarCalendario() {
        System.out.println("init generar calendario");
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void showProveedor() {
        System.out.println(this.proveedor);
    }
}
