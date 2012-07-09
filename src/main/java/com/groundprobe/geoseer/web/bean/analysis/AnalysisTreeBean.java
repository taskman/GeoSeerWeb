/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.analysis;

import com.groundprobe.geoseer.web.bean.home.*;
import com.groundprobe.geoseer.objectmodel.home.Deployment;
import com.groundprobe.geoseer.objectmodel.home.Pit;
import com.groundprobe.geoseer.objectmodel.home.Wall;
import java.io.Serializable;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.event.NodeUnselectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author kobus.dutoit
 */
@Controller("analysisTreeBean")
@Scope("view")
public class AnalysisTreeBean implements Serializable {

    @Autowired
    private HomeBean homeBean;
    private TreeNode root = new DefaultTreeNode("SSR Root", "SSR Root", null);
    private TreeNode selectedNode;

    public void init() {
        root = new DefaultTreeNode("SSR Root", "SSR Root", null);
        Pit selectedPit = homeBean.getSelectedPit();
        if (selectedPit != null) {
            for (Deployment deployment : selectedPit.getDeploymentList()) {
                TreeNode node = new DefaultTreeNode(deployment.getName(), root);
                
                for (Wall wall : deployment.getWallList()) {
                    DefaultTreeNode wallNode = new DefaultTreeNode(wall.getName(), node);
                    wallNode.setData(wall);
                }
            }
        }
    }

    public AnalysisTreeBean() {
    }

    public TreeNode getRoot() {
        return root;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        Wall wall = (Wall) selectedNode.getData();
        String wallPhoto = wall.getWallPhotoList().get(0);
        homeBean.setSelectedWall(wall);
        homeBean.setSelectedWallPhoto(wallPhoto);
    }

    public void onNodeUnselect(NodeUnselectEvent event) {
        homeBean.setSelectedWall(null);
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        this.selectedNode = selectedNode;
    }
}
