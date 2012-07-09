/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.home;

import java.io.Serializable;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author kobus.dutoit
 */

@Controller("imageViewOptionsBean")
@Scope("session")
public class ImageViewOptionsBean implements Serializable {
    private String selectedImageViewOption = "1";
    
    public void onImageViewOptionChange() {

    }
    public String getSelectedImageViewOption() {
        return selectedImageViewOption;
    }

    public void setSelectedImageViewOption(String selectedImageViewOption) {
        this.selectedImageViewOption = selectedImageViewOption;
    }   
    
    public boolean getDisplayPitPlan() {
        return selectedImageViewOption.equals("2");
    }
}
