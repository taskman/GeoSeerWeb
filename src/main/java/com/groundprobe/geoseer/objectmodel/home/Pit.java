/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel.home;

import com.groundprobe.geoseer.dataaccess.site.SiteDAO.MyRelationshipTypes;
import com.groundprobe.geoseer.objectmodel.GeoSeerBase;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.ReturnableEvaluator;
import org.neo4j.graphdb.StopEvaluator;
import org.neo4j.graphdb.Traverser;

/**
 *
 * @author Kobus
 */
public class Pit extends GeoSeerBase {
    private int offset;    
    private List<Deployment> deploymentList = new ArrayList<Deployment>();

    public Pit() {
        
    }
    
    public Pit (Node underlyingNode) {
        super(underlyingNode);
    }
    
    public int getOffset() {
        return (Integer) getUnderlyingNode().getProperty("offset");
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public List<Deployment> getDeploymentList() {
        return deploymentList;
    }
    /*public List<Deployment> getDeploymentList() {
        if (deploymentList.isEmpty()) {
            Traverser traverser = getUnderlyingNode().traverse(Traverser.Order.BREADTH_FIRST, StopEvaluator.DEPTH_ONE,
                    ReturnableEvaluator.ALL_BUT_START_NODE,
                    MyRelationshipTypes.HAS_SLOPE_STABILITY_RADAR, Direction.OUTGOING);

            for (Node node : traverser) {
                deploymentList.add(new SlopeStabilityRadar(node));
            }
            
            traverser = getUnderlyingNode().traverse(Traverser.Order.BREADTH_FIRST, StopEvaluator.DEPTH_ONE,
                    ReturnableEvaluator.ALL_BUT_START_NODE,
                    MyRelationshipTypes.HAS_SURVEY_PRISM, Direction.OUTGOING);

            for (Node node : traverser) {
                deploymentList.add(new SurveyPrism(node));
            }
            
        }
        return deploymentList;
    }*/
}
