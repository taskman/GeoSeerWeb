/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.home;

import com.groundprobe.geoseer.objectmodel.home.MineSurveyRadar;
import com.groundprobe.geoseer.objectmodel.home.SlopeStabilityRadar;
import com.groundprobe.geoseer.objectmodel.home.SurveyPrism;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author kobus.dutoit
 */

@Controller("overlayOptionsBean")
@Scope("session")
public class OverlayOptionsBean implements Serializable {
    private List<String> selectedOptions;  
    private boolean displaySlopeStabilityRadar;
    private boolean displaySurveyPrism;
    private boolean displayMineSurveyRadar;
    private boolean displayWall;

    public OverlayOptionsBean() {
        selectedOptions = new ArrayList<String>();
    }

    public List<String> getSelectedOptions() {  
        return selectedOptions;  
    }  
    
    public void setSelectedOptions(List<String> selectedOptions) {  
        this.selectedOptions = selectedOptions;  
        
        if (selectedOptions != null) {
            displaySlopeStabilityRadar = selectedOptions.contains(String.valueOf(SlopeStabilityRadar.TYPE_CODE));
            displaySurveyPrism = selectedOptions.contains(String.valueOf(SurveyPrism.TYPE_CODE));
            displayMineSurveyRadar = selectedOptions.contains(String.valueOf(MineSurveyRadar.TYPE_CODE));
            displayWall = selectedOptions.contains("4");
        }
    }

    public void setDisplayMineSurveyRadar(boolean displayMineSurveyRadar) {
        this.displayMineSurveyRadar = displayMineSurveyRadar;
    }

    public void setDisplaySlopeStabilityRadar(boolean displaySlopeStabilityRadar) {
        this.displaySlopeStabilityRadar = displaySlopeStabilityRadar;
    }

    public void setDisplaySurveyPrism(boolean displaySurveyPrism) {
        this.displaySurveyPrism = displaySurveyPrism;
    }

    public void setDisplayWall(boolean displayWall) {
        this.displayWall = displayWall;
    }

    public boolean isDisplaySlopeStabilityRadar() {
        return displaySlopeStabilityRadar;
    }

    public boolean getDisplaySlopeStabilityRadar() {
        return displaySlopeStabilityRadar;
    }

    public boolean isDisplaySurveyPrism() {
        return displaySurveyPrism;
    }

    public boolean getDisplaySurveyPrism() {
        return displaySurveyPrism;
    }

    public boolean getDisplayMineSurveyRadar() {
        return displayMineSurveyRadar;
    }
    
    public boolean getDisplayWall() {
        return displayWall;
    }
}
