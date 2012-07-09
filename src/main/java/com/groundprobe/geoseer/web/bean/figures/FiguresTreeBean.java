/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.figures;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author kobus.dutoit
 */
@ManagedBean
@ViewScoped
public class FiguresTreeBean implements Serializable {  
  
    private TreeNode root;  
  
    private TreeNode[] selectedNodes;  
  
    public FiguresTreeBean() {  
        root = new DefaultTreeNode("Root", null);  
        TreeNode node0 = new DefaultTreeNode("SSR 116", root);  
        TreeNode node1 = new DefaultTreeNode("SSR 117", root);  
  
        TreeNode node00 = new DefaultTreeNode("Figure 1", node0);  
        TreeNode node01 = new DefaultTreeNode("Figure 2", node0);  
  
        TreeNode node10 = new DefaultTreeNode("Figure 1", node1);  
        TreeNode node11 = new DefaultTreeNode("Figure 2", node1);  
    }  
  
    public TreeNode getRoot() {  
        return root;  
    }  
  
    public TreeNode[] getSelectedNodes() {  
        return selectedNodes;  
    }  
  
    public void setSelectedNodes(TreeNode[] selectedNodes) {  
        this.selectedNodes = selectedNodes;  
    }  
  
    public void displaySelectedMultiple(ActionEvent event) {  
        if(selectedNodes != null && selectedNodes.length > 0) {  
            StringBuilder builder = new StringBuilder();  
  
            for(TreeNode node : selectedNodes) {  
                builder.append(node.getData().toString());  
                builder.append("<br />");  
            }  
  
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", builder.toString());  
  
            FacesContext.getCurrentInstance().addMessage(null, message);  
        }  
    }  
}  
       