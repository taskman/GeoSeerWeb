/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.home;

import com.groundprobe.geoseer.objectmodel.home.MineSurveyRadar;
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

@Controller("alertOptionsBean")
@Scope("session")
public class AlertOptionsBean implements Serializable {
    private List<String> selectedOptions;  
    private boolean alarmSlopeStabilityRadar;
    private boolean alarmSurveyPrism;
    
    public List<String> getSelectedOptions() {  
        return selectedOptions;  
    }  
    
    public void setSelectedOptions(List<String> selectedOptions) {  
        this.selectedOptions = selectedOptions;  
        
        if (selectedOptions != null) {
            alarmSlopeStabilityRadar = selectedOptions.contains(String.valueOf(SlopeStabilityRadar.TYPE_CODE));
            alarmSurveyPrism = selectedOptions.contains(String.valueOf(SurveyPrism.TYPE_CODE));
        }
    }

    public boolean isAlarmSlopeStabilityRadar() {
        return alarmSlopeStabilityRadar;
    }

    public void setAlarmSlopeStabilityRadar(boolean alarmSlopeStabilityRadar) {
        this.alarmSlopeStabilityRadar = alarmSlopeStabilityRadar;
    }

    public boolean isAlarmSurveyPrism() {
        return alarmSurveyPrism;
    }

    public void setAlarmSurveyPrism(boolean alarmSurveyPrism) {
        this.alarmSurveyPrism = alarmSurveyPrism;
    }
    
    public boolean getAlarmSlopeStabilityRadar() {
        return alarmSlopeStabilityRadar;
    }
    
    public boolean getAlarmSurveyPrism() {
        return alarmSurveyPrism;
    }
}
