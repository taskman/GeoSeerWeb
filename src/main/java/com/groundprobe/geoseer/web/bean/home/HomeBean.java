/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.web.bean.home;

import com.groundprobe.geoseer.objectmodel.home.MapDetails;
import com.groundprobe.geoseer.objectmodel.home.Pit;
import com.groundprobe.geoseer.objectmodel.home.Site;
import com.groundprobe.geoseer.objectmodel.home.Wall;
import com.groundprobe.geoseer.services.site.ISiteService;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author kobus.dutoit
 */

@Controller("homeBean")
@Scope("session")
public class HomeBean implements Serializable {

    @Autowired
    private ISiteService siteService;
    private List<Site> siteList;
    private List<Pit> pitList;
    private Site selectedSite;
    private Pit selectedPit;
    private Wall selectedWall;
    private String selectedWallPhoto;
    private Date toDate;
    private Date fromDate;
    private MapDetails currentMapDetails;

    @PostConstruct
    protected void init() {
        currentMapDetails = new MapDetails();
        currentMapDetails.setLatitude(3.688855);
        currentMapDetails.setLongitude(21.416012);
        currentMapDetails.setZoom(2);
        
        selectedWall = new Wall();
        toDate = new Date();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(Calendar.MONTH, -1);
        fromDate = gregorianCalendar.getTime();
        
        siteList = siteService.findSiteList();
        if (siteList.size() > 0) {
            selectedSite = siteList.get(0);
            currentMapDetails = selectedSite.getMapDetails();
            onSiteChange();
        }
        else {
            currentMapDetails = new MapDetails();
        }
    }
    
    public void onSiteChange() {
        pitList = selectedSite.getPitList();

//        if (pitList.size() == 1){
            selectedPit = pitList.get(0);
            currentMapDetails = selectedPit.getMapDetails();
//        }
//        else {
//            selectedPit = new Pit();
//            currentMapDetails = selectedSite.getMapDetails();
//        }
    }

    public void onPitChange() {
        currentMapDetails = selectedPit.getMapDetails();
    }

    public Date getCurrentPitTime() {
        if (selectedPit == null) return null;                
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.add(Calendar.MINUTE, selectedPit.getOffset() * -1);
        
        return gregorianCalendar.getTime();
    }

    public Pit getSelectedPit() {
        return selectedPit;
    }

    public void setSelectedPit(Pit selectedPit) {
        this.selectedPit = selectedPit;
    }

    public List<Pit> getPitList() {
        return pitList;
    }

    public List<Site> getSiteList() {
        return siteList;
    }

    public Site getSelectedSite() {
        return selectedSite;
    }

    public void setSelectedSite(Site selectedSite) {
        this.selectedSite = selectedSite;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Wall getSelectedWall() {
        return selectedWall;
    }

    public void setSelectedWall(Wall selectedWall) {
        this.selectedWall = selectedWall;
    }

    public String getSelectedWallPhoto() {
        return selectedWallPhoto;
    }

    public void setSelectedWallPhoto(String selectedWallPhoto) {
        this.selectedWallPhoto = selectedWallPhoto;
    }

    public MapDetails getCurrentMapDetails() {
        return currentMapDetails;
    }       
}
