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
@ManagedBean(name = "generatorReport", eager = true)
@SessionScoped
public class generatorReport {

    private String option;

    public generatorReport() {
        System.out.println("init generator report");
        this.option = "option number one";
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
