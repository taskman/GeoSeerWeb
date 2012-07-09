/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.alarms;

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
public class AlarmsBean implements Serializable {

    private List<Alarm> alarmList = new ArrayList<Alarm>();

    public AlarmsBean() {
    }

    @PostConstruct
    public void init() {
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
        alarmList.add(new Alarm());
    }

    public List<Alarm> getAlarmList() {
        return alarmList;
    }
}
