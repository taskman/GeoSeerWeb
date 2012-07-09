/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.analysis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author kobus.dutoit
 */
@ManagedBean
@ViewScoped
public class AnalysisBean implements Serializable {

    private String selectedWall;

    public AnalysisBean() {
    }

    public String getSelectedWall() {
        return selectedWall;
    }

    public void setSelectedWall(String selectedWall) {
        this.selectedWall = selectedWall;
    }

    public List<String> getWalls() {
        ArrayList<String> walls = new ArrayList<String>();
        walls.add("SSR116_110525_Ranger_Pit_3_South_wall");
        walls.add("SSR116_110525_Ranger_Pit_3_South_wall2");
        walls.add("SSR116_110525_Ranger_Pit_3_South_wall3");
        walls.add("SSR116_110525_Ranger_Pit_3_South_wall_alot more text to see the scrolling");
        walls.add("SSR116_110525_Ranger_Pit_3_South_wall_alot more text to see the scrolling_alot more text to see the scrolling");
        
        return walls;
    }
}
