/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel;

import com.groundprobe.geoseer.objectmodel.home.MapDetails;
import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;
import org.neo4j.graphdb.Node;

/**
 *
 * @author Kobus
 */
public class GeoSeerBase implements Serializable {

    private Node underlyingNode;
    private int id;
    private String name = "";
    private int createdUserId;
    private Date createdDate;
    private int updatedUserId;
    private Date updatedDate;
    private boolean active;
    private Timestamp timeStamp;
    private MapDetails mapDetails;

    public GeoSeerBase() {
    }

    public GeoSeerBase(Node underlyingNode) {
        this.underlyingNode = underlyingNode;
    }

    public long getId() {
        if (underlyingNode == null) {
            return this.id;
        } else {
            return underlyingNode.getId();
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        if ((underlyingNode) == null) {
            return this.name;
        } else {
            return (String) underlyingNode.getProperty("name");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        if (underlyingNode == null) {
            return this.active;
        } else {
            return (Boolean) underlyingNode.getProperty("active");
        }
    }

    public void setActive(boolean activeFlag) {
        this.active = activeFlag;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public int getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(int createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(int updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    @Override
    public String toString() {
        return name;
    }

    public MapDetails getMapDetails() {
        if (mapDetails == null) {
            mapDetails = new MapDetails();
            mapDetails.setLatitude((Double) underlyingNode.getProperty("latitude"));
            mapDetails.setLongitude((Double) underlyingNode.getProperty("longitude"));
            mapDetails.setZoom((Integer) underlyingNode.getProperty("zoom"));
        }
        return mapDetails;
    }

    public void setMapDetails(MapDetails mapDetails) {
        this.mapDetails = mapDetails;
    }

    protected Node getUnderlyingNode() {
        return underlyingNode;
    }       
}
