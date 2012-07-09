/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.dataaccess.site;

import com.groundprobe.geoseer.objectmodel.home.Site;
import java.util.List;

/**
 *
 * @author kobus.dutoit
 */
public interface ISiteDAO {
    List<Site> findSiteList();
}
