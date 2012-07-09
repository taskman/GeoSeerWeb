/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.dataaccess.site;

import com.groundprobe.geoseer.objectmodel.home.Deployment;
import com.groundprobe.geoseer.objectmodel.home.MapDetails;
import com.groundprobe.geoseer.objectmodel.home.Pit;
import com.groundprobe.geoseer.objectmodel.home.Site;
import com.groundprobe.geoseer.objectmodel.home.Wall;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kobus.dutoit
 */
@Repository("siteDAOBackup")
public class SiteDAOBackup implements ISiteDAO, Serializable {
    @Override
    public List<Site> findSiteList()
    {        
        List<Site> siteList = new ArrayList<Site>();
        //site
        /*Site site = new Site();
        site.setId(1);
        site.setName("Ranger");
        MapDetails mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.684052273700322);
        mapDetails.setLongitude(132.91534423828125);
        mapDetails.setZoom(15);
        site.setMapDetails(mapDetails);
        siteList.add(site);
        //pit
        Pit pit = new Pit();
        pit.setId(1);
        pit.setName("Pit 1");       
        pit.setActive(false);
        pit.setOffset(-570);
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.675186565019125);
        mapDetails.setLongitude(132.9188632965088);
        mapDetails.setZoom(17);
        pit.setMapDetails(mapDetails);
        site.getPitList().add(pit);

        //deployment
        Deployment deployment = new Deployment();
        deployment.setName("SSR16");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.673378320312757);
        mapDetails.setLongitude(132.92021244764328);
        mapDetails.setZoom(17);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);
        
        //wall
        Wall wall = new Wall();
        wall.setName("Inactive wall 1");
        deployment.getWallList().add(wall);
        
        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");
        
        
        deployment = new Deployment();
        deployment.setName("SSR17");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.674069170745923);
        mapDetails.setLongitude(132.92049944400787);
        mapDetails.setZoom(17);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);
        
        //wall 
        wall = new Wall();
        wall.setName("Inactive wall ");
        deployment.getWallList().add(wall);
        
        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");
        wall.getWallPhotoList().add("cam_lowres_110727_160350.jpg");
        
        //pit
        pit = new Pit();
        pit.setId(2);
        pit.setName("Pit-3");
        pit.setActive(true);
        pit.setOffset(-570);
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.690855736870319);
        mapDetails.setLongitude(132.9173719882965);
        mapDetails.setZoom(17);
        pit.setMapDetails(mapDetails);
        site.getPitList().add(pit);
        
        //deployment
        deployment = new Deployment();
        deployment.setName("131");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.687574396954927);
        mapDetails.setLongitude(132.91577875614166);
        mapDetails.setZoom(17);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);

        //wall 
        wall = new Wall();
        wall.setName("South Wall1");
        deployment.getWallList().add(wall);
        
        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");
        wall.getWallPhotoList().add("cam_lowres_110727_160350.jpg");
        wall.getWallPhotoList().add("cam_lowres_110728_080630.jpg");
        wall.getWallPhotoList().add("cam_lowres_110728_120327.jpg");
        wall.getWallPhotoList().add("cam_lowres_110728_140458.jpg");
        wall.getWallPhotoList().add("cam_lowres_110728_160626.jpg");
        wall.getWallPhotoList().add("cam_lowres_110729_075517.jpg");
        wall.getWallPhotoList().add("cam_lowres_110729_080615.jpg");
        wall.getWallPhotoList().add("cam_lowres_110729_120248.jpg");
        wall.getWallPhotoList().add("cam_lowres_110729_140408.jpg");
        wall.getWallPhotoList().add("cam_lowres_110729_160530.jpg");
        wall.getWallPhotoList().add("cam_lowres_110730_080241.jpg");
        wall.getWallPhotoList().add("cam_lowres_110730_120437.jpg");
        wall.getWallPhotoList().add("cam_lowres_110730_140644.jpg");
        wall.getWallPhotoList().add("cam_lowres_110730_160357.jpg");
        
        //deployment
        deployment = new Deployment();
        deployment.setName("131b");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-12.689727944590418);
        mapDetails.setLongitude(132.91372954845428);
        mapDetails.setZoom(17);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);

        wall = new Wall();
        wall.setName("South Wall2");
        deployment.getWallList().add(wall);
        
        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");
        wall.getWallPhotoList().add("cam_lowres_110727_160350.jpg");
        wall.getWallPhotoList().add("cam_lowres_110728_080630.jpg");
        
        
        site = new Site();
        site.setId(2);
        site.setName("Ok-tedi");  
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-3.130638926463213);
        mapDetails.setLongitude(152.63749837875366);
        mapDetails.setZoom(15);
        site.setMapDetails(mapDetails);
        siteList.add(site);
        
        //pit
        pit = new Pit();
        pit.setId(1);
        pit.setName("Papua New Guinea");     
        pit.setActive(false);
        pit.setOffset(-600);
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-3.1284642208450877);
        mapDetails.setLongitude(152.6358675956726);
        mapDetails.setZoom(17);
        pit.setMapDetails(mapDetails);
        site.getPitList().add(pit);        
        
        //deployment
        deployment = new Deployment();
        deployment.setName("SSR1");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-3.128212468918057);
        mapDetails.setLongitude(152.6359748840332);
        mapDetails.setZoom(17);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);
        
        wall = new Wall();
        wall.setName("Moscow wall");
        deployment.getWallList().add(wall);
        
        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");
        
        deployment = new Deployment();
        deployment.setName("SSR2");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-3.128812388304093);
        mapDetails.setLongitude(152.63627529144287);
        mapDetails.setZoom(17);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);    
        
        wall = new Wall();
        wall.setName("Moscow wall 2");
        deployment.getWallList().add(wall);
        
        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");
        wall.getWallPhotoList().add("cam_lowres_110727_160350.jpg");*/
        
        
        return siteList;
    }
}
