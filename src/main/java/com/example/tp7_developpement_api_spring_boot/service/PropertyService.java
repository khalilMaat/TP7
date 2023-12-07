package com.example.tp7_developpement_api_spring_boot.service;

import com.example.tp7_developpement_api_spring_boot.model.Property;
import com.example.tp7_developpement_api_spring_boot.repository.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    @Autowired
    PropertyRepo propertyRepo;

    //Get by id
    public Property getPropertyById(Long id){
        return propertyRepo.findById(id).get();
    }

    //Get ALL
//    public Property getALL(){
//        return (Property) propertyRepo.findAll();
//    }
    //Save property
    public Property saveProperty(Property property){
        return propertyRepo.save(property);
    }

    //Delete Property
    public void deleteProperty(Long id){
        propertyRepo.deleteById(id);
    }

    //Update Property
    public Property updateProperty(Property property){
        return propertyRepo.save(property);
    }
}
