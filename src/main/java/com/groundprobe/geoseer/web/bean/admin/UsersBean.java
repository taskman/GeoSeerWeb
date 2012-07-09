/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.admin;

import com.groundprobe.geoseer.objectmodel.admin.User;
import com.groundprobe.geoseer.objectmodel.alarms.Alarm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author kobus.dutoit
 */
@ManagedBean
@ViewScoped
public class UsersBean implements Serializable {

    private List<User> userList = new ArrayList<User>();

    public UsersBean() {
    }

    @PostConstruct
    public void init() {
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
        userList.add(new User("name", "username"));
    }

    public List<User> getUserList() {
        return userList;
    }
}
