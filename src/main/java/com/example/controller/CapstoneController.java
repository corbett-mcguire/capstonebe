package com.example.controller;

import com.example.repository.CapstoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Type;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(path = "/api")
public class CapstoneController {

        private CapstoneRepository capstoneRepository;

    @Autowired
    public void setCapstoneRepository(CapstoneRepository capstoneRepository) {
        this.capstoneRepository = capstoneRepository;
    }
    // http://localhost:9092/api/types
    @GetMapping("/types")
    public List<Type> getTypes() {
        System.out.println("calling getTypes method from controller");
        return capstoneRepository.getTypes();
    }

    // http://localhost:9092/api/types/1
    @GetMapping(path = "/types/{typeId}")
    public Type getType(@PathVariable Long typeId) {
        System.out.println("Calling getType ==>");
        return capstoneRepository.getType(typeId);
    }

    // http://localhost:9092/api/types
    @GetMapping(path = "/types")
    public Type createType(@RequestBody Type typeObject) {
        System.out.println("Calling createType ==>");
        return capstoneRepository.createType(typeObject);
    }

    // http://localhost:9092/api/types/1
    @PutMapping(path = "/types/{typeId}")
    public Type updateType(@PathVariable(value = "typeId") Long typeId, @RequestBody Type typeObject) {
        System.out.println("calling updateType method from controller");
        return capstoneRepository.updateType(typeId, typeObject);
    }


}