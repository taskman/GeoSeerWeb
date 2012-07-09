/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel.home;

import org.neo4j.graphdb.Node;

/**
 *
 * @author kobus.dutoit
 */
public class SurveyPrism extends Deployment{
    public static final int TYPE_CODE = 2;
    private static final String TYPE_DESCRIPTION = "Survey Prism";
    
    public SurveyPrism() {
        
    }
    
    public SurveyPrism(Node underlyingNode) {
        super(underlyingNode);         
    }
    
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
