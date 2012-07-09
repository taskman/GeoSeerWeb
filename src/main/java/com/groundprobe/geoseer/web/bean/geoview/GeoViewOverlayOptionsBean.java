/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.geoview;

import com.groundprobe.geoseer.objectmodel.home.SlopeStabilityRadar;
import com.groundprobe.geoseer.objectmodel.home.SurveyPrism;
import java.io.Serializable;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author kobus.dutoit
 */

@Controller("geoViewOverlayOptionsBean")
@Scope("session")
public class GeoViewOverlayOptionsBean implements Serializable {
    private List<String> selectedOptions;  
    private boolean displaySlopeStabilityRadar;
    private boolean displaySurveyPrism;
    private String photoName = "/img/photo_only.gif";
    
    public List<String> getSelectedOptions() {  
        return selectedOptions;  
    }  
    
    public void setSelectedOptions(List<String> selectedOptions) {  
        this.selectedOptions = selectedOptions;  
        
        if (selectedOptions != null) {
            displaySlopeStabilityRadar = selectedOptions.contains(String.valueOf(SlopeStabilityRadar.TYPE_CODE));
            displaySurveyPrism = selectedOptions.contains(String.valueOf(SurveyPrism.TYPE_CODE));
        }
        
        if (displaySlopeStabilityRadar && displaySurveyPrism) {
            photoName = "/img/wall_defprisms_overlaid.gif";
        }
        else if (displaySlopeStabilityRadar) {
            photoName = "/img/wall_def_overlaid.gif";
        }
        else {
            photoName = "/img/photo_only.gif";
        }
    }  
    
    public boolean getDisplaySlopeStabilityRadar() {
        return displaySlopeStabilityRadar;
    }
    
    public boolean getDisplaySurveyPrism() {
        return displaySurveyPrism;
    }

    public String getPhotoName() {
        return photoName;
    }  
}
