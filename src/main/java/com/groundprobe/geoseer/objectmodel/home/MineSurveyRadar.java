/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel.home;

/**
 *
 * @author kobus.dutoit
 */
public class MineSurveyRadar extends Deployment{
    public static final int TYPE_CODE = 3;
    private static final String TYPE_DESCRIPTION = "Mine Survey Radar";
    
    @Override
    public int getType(){
        return TYPE_CODE;
    }

    @Override
    public String getDiagnostics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Deployment name: ");
        stringBuilder.append(getName());
        stringBuilder.append(" ");
        stringBuilder.append("Type: ");
        stringBuilder.append(TYPE_DESCRIPTION);
        return stringBuilder.toString();        
    }    
}
