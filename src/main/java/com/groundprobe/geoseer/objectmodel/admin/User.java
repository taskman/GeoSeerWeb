/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.objectmodel.admin;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kobus.dutoit
 */
public class User {
    private String name;
    private String userName;
    private String password;
    private boolean ldap;
    private List<Role> roleList = new ArrayList<Role>();
    private List<Access> accessList = new ArrayList<Access>();

    public User(String name, String userName) {
        this.name = name;
        this.userName = userName;
    }
    
    public List<Access> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<Access> accessList) {
        this.accessList = accessList;
    }

    public boolean isLdap() {
        return ldap;
    }

    public void setLdap(boolean ldap) {
        this.ldap = ldap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }        
}
