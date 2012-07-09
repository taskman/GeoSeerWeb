/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.converter;

import com.groundprobe.geoseer.objectmodel.home.Site;
import com.groundprobe.geoseer.web.bean.home.HomeBean;
import com.sun.faces.mgbean.BeanManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedProperty;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.springframework.web.jsf.FacesContextUtils;

/**
 *
 * @author kobus.dutoit
 */
@FacesConverter("siteConverter")
public class SiteConverter implements Converter  {    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {        
        Site result = null;
        HomeBean homeBean = (HomeBean) FacesContextUtils.getWebApplicationContext(fc).getBean("homeBean");
        for (Site site : homeBean.getSiteList()) {
            if (site.getId() == Integer.valueOf(string)) {
                result = site;
                break;
            }
        }
        
        return result;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        long id = ((Site) o).getId();
        return String.valueOf(id);
    }        
}
