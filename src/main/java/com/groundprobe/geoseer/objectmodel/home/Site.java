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
 * @author kobus.dutoit
 */
public class Site extends GeoSeerBase {

    private int companyId;
    private int dataKeepDays;
    private List<Pit> pitList = new ArrayList<Pit>();

    public Site() {
    }

    public Site(Node underlyingNode) {
        super(underlyingNode);
    }

    public List<Pit> getPitList() {
        return pitList;
    }
    /*public List<Pit> getPitList() {
        if (pitList.isEmpty()) {
            Traverser traverser = getUnderlyingNode().traverse(Traverser.Order.BREADTH_FIRST, StopEvaluator.DEPTH_ONE,
                    ReturnableEvaluator.ALL_BUT_START_NODE,
                    MyRelationshipTypes.HAS, Direction.OUTGOING);

            for (Node node : traverser) {
                pitList.add(new Pit(node));
            }
        }

        return pitList;
    }*/

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getDataKeepDays() {
        return dataKeepDays;
    }

    public void setDataKeepDays(int dataKeepDays) {
        this.dataKeepDays = dataKeepDays;
    }
}
