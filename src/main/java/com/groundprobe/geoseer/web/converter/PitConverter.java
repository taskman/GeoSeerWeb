/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.converter;

import com.groundprobe.geoseer.objectmodel.home.Pit;
import com.groundprobe.geoseer.objectmodel.home.Site;
import com.groundprobe.geoseer.web.bean.home.HomeBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import org.springframework.web.jsf.FacesContextUtils;

/**
 *
 * @author kobus.dutoit
 */
@FacesConverter("pitConverter")
public class PitConverter implements Converter  {    
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {        
        Pit result = new Pit();
        result.setId(-1);
        HomeBean homeBean = (HomeBean) FacesContextUtils.getWebApplicationContext(fc).getBean("homeBean");
        for (Pit pit : homeBean.getPitList()) {
            if (pit.getId() == Integer.valueOf(string)) {
                result = pit;
                break;
            }
        }
        
        return result;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        long id = ((Pit) o).getId();
        return String.valueOf(id);
    }        
}
