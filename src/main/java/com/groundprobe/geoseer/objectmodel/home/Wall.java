/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel.home;

import com.groundprobe.geoseer.objectmodel.GeoSeerBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kobus.dutoit
 */
public class Wall extends GeoSeerBase{
    private double width;
    private double height;
    private List<String> wallPhotoList = new ArrayList<String>();
    private List<Scan> scanList = new ArrayList<Scan>();

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public List<String> getWallPhotoList() {
        return wallPhotoList;
    }

    public List<Scan> getScanList() {
        return scanList;
    }        
}
