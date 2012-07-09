/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel.home;

import com.groundprobe.geoseer.objectmodel.GeoSeerBase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.neo4j.graphdb.Node;

/**
 *
 * @author Kobus
 */
public abstract class Deployment extends GeoSeerBase {

    private int easting;
    private int northing;
    private int relativeLevel;
    private double pitch;
    private double roll;
    private double yaw;
    private Date startDate;
    private Date endDate;
    private int scanAreaWidth;
    private int scanAreaHeight;
    private double angle;
    private Date startDateOffset;
    private Date endDateOffset;
    private double topAngle;
    private double leftAngle;
    private double bottomAngle;
    private double rightAngle;
    private double x;
    private double y;
    private boolean activeAlarm;
    private List<Wall> wallList = new ArrayList<Wall>();

    public Deployment() {
    }

    public Deployment(Node underlyingNode) {
        super(underlyingNode);
    }

    public abstract int getType();

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getBottomAngle() {
        return bottomAngle;
    }

    public void setBottomAngle(double bottomAngle) {
        this.bottomAngle = bottomAngle;
    }

    public int getEasting() {
        return easting;
    }

    public void setEasting(int easting) {
        this.easting = easting;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getEndDateOffset() {
        return endDateOffset;
    }

    public void setEndDateOffset(Date endDateOffset) {
        this.endDateOffset = endDateOffset;
    }

    public double getLeftAngle() {
        return leftAngle;
    }

    public void setLeftAngle(double leftAngle) {
        this.leftAngle = leftAngle;
    }

    public int getNorthing() {
        return northing;
    }

    public void setNorthing(int northing) {
        this.northing = northing;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public int getRelativeLevel() {
        return relativeLevel;
    }

    public void setRelativeLevel(int relativeLevel) {
        this.relativeLevel = relativeLevel;
    }

    public double getRightAngle() {
        return rightAngle;
    }

    public void setRightAngle(double rightAngle) {
        this.rightAngle = rightAngle;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public int getScanAreaHeight() {
        return scanAreaHeight;
    }

    public void setScanAreaHeight(int scanAreaHeight) {
        this.scanAreaHeight = scanAreaHeight;
    }

    public int getScanAreaWidth() {
        return scanAreaWidth;
    }

    public void setScanAreaWidth(int scanAreaWidth) {
        this.scanAreaWidth = scanAreaWidth;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getStartDateOffset() {
        return startDateOffset;
    }

    public void setStartDateOffset(Date startDateOffset) {
        this.startDateOffset = startDateOffset;
    }

    public double getTopAngle() {
        return topAngle;
    }

    public void setTopAngle(double topAngle) {
        this.topAngle = topAngle;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public List<Wall> getWallList() {
        return wallList;
    }

    public String getDiagnostics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Deployment name: ");
        stringBuilder.append(getName());
        return stringBuilder.toString();
    }

    public boolean isActiveAlarm() {
        if (getUnderlyingNode() == null) {
            return this.activeAlarm;
        } else {
            return (Boolean) getUnderlyingNode().getProperty("activeAlarm");
        }
    }

    public void setActiveAlarm(boolean activeAlarm) {
        this.activeAlarm = activeAlarm;
    }
}
