/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.groundprobe.geoseer.services.site;

import com.groundprobe.geoseer.dataaccess.site.ISiteDAO;
import com.groundprobe.geoseer.objectmodel.home.Site;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kobus.dutoit
 */
@Service("siteService")
public class SiteService implements ISiteService, Serializable {
    @Autowired
    private ISiteDAO siteDAO;
    
    @Override
    public List<Site> findSiteList()
    {  
        return siteDAO.findSiteList();
    }
}
