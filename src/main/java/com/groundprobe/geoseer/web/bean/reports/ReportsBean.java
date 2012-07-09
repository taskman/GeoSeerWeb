/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.reports;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author kobus.dutoit
 */
@ManagedBean
@ViewScoped
public class ReportsBean implements Serializable {

    private String selectedReport;
    private String selectedTemplate;

    public ReportsBean() {
    }

    public String getSelectedTemplate() {
        return selectedTemplate;
    }

    public void setSelectedTemplate(String selectedTemplate) {
        this.selectedTemplate = selectedTemplate;
    }

    public String getSelectedReport() {
        return selectedReport;
    }

    public void setSelectedReport(String selectedReport) {
        this.selectedReport = selectedReport;
    }

    public List<String> getTemplates() {
        ArrayList<String> templates = new ArrayList<String>();
        templates.add("Sub Report");
        templates.add("GeoSeerDailyReportTemplate");
        templates.add("DailyReportGS");
        
        return templates;
    }
    
    public List<String> getReports() {
        ArrayList<String> reports = new ArrayList<String>();
        reports.add("Sub Report");
        reports.add("GeoSeerDailyReportTemplate");
        reports.add("DailyReportGS");
        
        return reports;
    }
    
}
