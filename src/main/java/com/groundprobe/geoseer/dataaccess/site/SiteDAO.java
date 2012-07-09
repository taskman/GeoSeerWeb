/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.dataaccess.site;

import com.groundprobe.geoseer.objectmodel.home.MapDetails;
import com.groundprobe.geoseer.objectmodel.home.MineSurveyRadar;
import com.groundprobe.geoseer.objectmodel.home.Pit;
import com.groundprobe.geoseer.objectmodel.home.Site;
import com.groundprobe.geoseer.objectmodel.home.SlopeStabilityRadar;
import com.groundprobe.geoseer.objectmodel.home.SurveyPrism;
import com.groundprobe.geoseer.objectmodel.home.Wall;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.ReturnableEvaluator;
import org.neo4j.graphdb.StopEvaluator;
import org.neo4j.graphdb.Traverser;
import org.neo4j.kernel.EmbeddedReadOnlyGraphDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kobus.dutoit
 */
@Repository("siteDAO")
public class SiteDAO implements ISiteDAO, Serializable {

    /*@Autowired
    private GraphDatabaseService graphDb;*/
    
    public enum MyRelationshipTypes implements RelationshipType {
        HAS, HAS_SLOPE_STABILITY_RADAR, HAS_SURVEY_PRISM
    }

    @Override
    public List<Site> findSiteList() {
        List<Site> siteList = new ArrayList<Site>();
        //site
        Site site = new Site();
        site.setId(1);
        site.setName("Mogalakwena");
        MapDetails mapDetails = new MapDetails();
        mapDetails.setLatitude(-24.004523);
        mapDetails.setLongitude(28.911025);
        mapDetails.setZoom(14);
        site.setMapDetails(mapDetails);
        siteList.add(site);
        //pit
        Pit pit = new Pit();
        pit.setId(1);
        pit.setName("Central");
        pit.setActive(true);
        pit.setOffset(-570);
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.991703);
        mapDetails.setLongitude(28.905237);
        mapDetails.setZoom(15);
        pit.setMapDetails(mapDetails);
        site.getPitList().add(pit);

        //deployment
        SlopeStabilityRadar deployment = new SlopeStabilityRadar();
        deployment.setName("SSR127XT");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.995305);
        mapDetails.setLongitude(28.903457);
        mapDetails.setZoom(16);
        deployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(deployment);

        //wall
        Wall wall = new Wall();
        wall.setName("East Wall");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-24.005807);
        mapDetails.setLongitude(28.911109);
        mapDetails.setZoom(17);
        wall.setMapDetails(mapDetails);
        deployment.getWallList().add(wall);

        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");

        deployment = new SlopeStabilityRadar();
        deployment.setName("SSR061X");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.989115);
        mapDetails.setLongitude(28.906834);
        mapDetails.setZoom(16);
        deployment.setMapDetails(mapDetails);
        deployment.setActiveAlarm(true);
        pit.getDeploymentList().add(deployment);

        //wall
        wall = new Wall();
        wall.setName("East Wall 2");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.989066);
        mapDetails.setLongitude(28.905586);
        mapDetails.setZoom(17);
        wall.setMapDetails(mapDetails);
        deployment.getWallList().add(wall);

        //wall photos
        wall.getWallPhotoList().add("cam_lowres_110727_152842.jpg");

        //prism
        SurveyPrism surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 1");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.994207);
        mapDetails.setLongitude(28.906868);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 2");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.995476);
        mapDetails.setLongitude(28.906938);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 3");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.986027);
        mapDetails.setLongitude(28.904759);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        surveyPrismDeployment.setActiveAlarm(true);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 4");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.986311);
        mapDetails.setLongitude(28.903955);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        surveyPrismDeployment.setActiveAlarm(true);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 5");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.986762);
        mapDetails.setLongitude(28.903375);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        surveyPrismDeployment.setActiveAlarm(true);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 6");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.98737);
        mapDetails.setLongitude(28.902935);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        surveyPrismDeployment.setActiveAlarm(true);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 7");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.987796);
        mapDetails.setLongitude(28.902931);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 8");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.988321);
        mapDetails.setLongitude(28.902867);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 9");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.98887);
        mapDetails.setLongitude(28.90285);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 10");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.995089);
        mapDetails.setLongitude(28.906879);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 11");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.995966);
        mapDetails.setLongitude(28.907029);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 12");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.996476);
        mapDetails.setLongitude(28.907083);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 13");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.996897);
        mapDetails.setLongitude(28.907142);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 14");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.989507);
        mapDetails.setLongitude(28.902727);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 15");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.990115);
        mapDetails.setLongitude(28.902711);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        surveyPrismDeployment = new SurveyPrism();
        surveyPrismDeployment.setName("Prism 16");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.990869);
        mapDetails.setLongitude(28.902624);
        mapDetails.setZoom(16);
        surveyPrismDeployment.setMapDetails(mapDetails);
        pit.getDeploymentList().add(surveyPrismDeployment);

        MineSurveyRadar mineSurveyRadar = new MineSurveyRadar();
        mineSurveyRadar.setName("Survey Radar 1");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.993844);
        mapDetails.setLongitude(28.905205);
        mapDetails.setZoom(16);
        mineSurveyRadar.setMapDetails(mapDetails);
        pit.getDeploymentList().add(mineSurveyRadar);

        mineSurveyRadar = new MineSurveyRadar();
        mineSurveyRadar.setName("Survey Radar 1");
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-23.991761);
        mapDetails.setLongitude(28.904648);
        mapDetails.setZoom(16);
        mineSurveyRadar.setMapDetails(mapDetails);
        pit.getDeploymentList().add(mineSurveyRadar);

        //pit 2
        pit = new Pit();
        pit.setId(2);
        pit.setName("Sandsloot");
        pit.setActive(true);
        pit.setOffset(-570);
        mapDetails = new MapDetails();
        mapDetails.setLatitude(-24.01303);
        mapDetails.setLongitude(28.911631);
        mapDetails.setZoom(15);
        pit.setMapDetails(mapDetails);
        site.getPitList().add(pit);

        return siteList;
    }
}
