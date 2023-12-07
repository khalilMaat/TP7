package com.example.tp7_developpement_api_spring_boot.controller;

import com.example.tp7_developpement_api_spring_boot.model.Property;
import com.example.tp7_developpement_api_spring_boot.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    PropertyService propertyService;

//    @GetMapping("/all")
//    public ResponseEntity getALL(){
//        return ResponseEntity.ok(propertyService.getALL());
//    }

    @GetMapping("/get_prop")
    public ResponseEntity getById(@RequestParam Long id){
        return ResponseEntity.ok(propertyService.getPropertyById(id));
    }

    @PostMapping("/save_prop")
    public ResponseEntity saveProp(@RequestBody Property property){
        return ResponseEntity.ok(propertyService.saveProperty(property));
    }

    @GetMapping("/delete_prop")
    public void deleteProp(@RequestParam Long id){
        propertyService.deleteProperty(id);
    }

    @PostMapping("/update_prop")
    public ResponseEntity updateProp(@RequestBody Property property){
        return ResponseEntity.ok(propertyService.updateProperty(property));
    }



}
