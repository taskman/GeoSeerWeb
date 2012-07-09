/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;


/**
 *
 * @author kobus.dutoit
 */
@ManagedBean
@ApplicationScoped
public class WebConstants {
    private String dateTimePattern = "EEE dd/MMM/yyyy HH:mm";
    private String datePattern = "EEE dd/MMM/yyyy";

    public String getDatePattern() {
        return datePattern;
    }

    public String getDateTimePattern() {
        return dateTimePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public void setDateTimePattern(String dateTimePattern) {
        this.dateTimePattern = dateTimePattern;
    }
    
    
}
