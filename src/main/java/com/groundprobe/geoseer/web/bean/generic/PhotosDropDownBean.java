/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.generic;

import com.groundprobe.geoseer.objectmodel.alarms.Alarm;
import com.groundprobe.geoseer.web.bean.home.HomeBean;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author kobus.dutoit
 */
@Controller("photosDropDownBean")
@Scope("view")
public class PhotosDropDownBean implements Serializable {

    @Autowired
    private HomeBean homeBean;
    private String selectedPhoto;

    public PhotosDropDownBean() {
    }

    @PostConstruct
    public void init() {
    }

    public String getSelectedPhoto() {
        return selectedPhoto;
    }

    public void setSelectedPhoto(String selectedPhoto) {
        this.selectedPhoto = selectedPhoto;
    }        
}
