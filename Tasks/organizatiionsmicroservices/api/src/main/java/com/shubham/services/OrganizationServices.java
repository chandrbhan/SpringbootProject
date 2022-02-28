package com.shubham.services;


import com.shubham.entites.Organizations;

import java.util.List;

public interface OrganizationServices {
    Organizations saveOrgs(Organizations organizations);
    List<Organizations> getAllOrgs();
    void deleteOrgs(long id);
    Organizations updateOrgs(Organizations organizations,long id);

}
