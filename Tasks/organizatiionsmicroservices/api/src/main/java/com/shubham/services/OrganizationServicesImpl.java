package com.shubham.services;

import com.shubham.entites.Organizations;
import com.shubham.exception.ResourceNotFoundException;
import com.shubham.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServicesImpl implements OrganizationServices {

    @Autowired
    private OrganizationRepository organizationRepository;


    @Override
    public Organizations saveOrgs(Organizations organizations) {
        return organizationRepository.save(organizations);
    }

    @Override
    public List<Organizations> getAllOrgs() {
        return (List<Organizations>) organizationRepository.findAll();
    }

    @Override
    public void deleteOrgs(long id) {
        organizationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Organization","Id",id));
        organizationRepository.deleteById(id);

    }

    @Override
    public Organizations updateOrgs(Organizations organizations, long id) {
        Organizations existingOrgs=organizationRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Organizations","Id",id));
        existingOrgs.setOrganizationName(organizations.getOrganizationName());
        existingOrgs.setAddress(organizations.getAddress());
        organizationRepository.save(organizations);
        return existingOrgs;
    }
}
