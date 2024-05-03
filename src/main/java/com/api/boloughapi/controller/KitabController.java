package com.api.boloughapi.controller;

import com.api.boloughapi.model.Kitab;
import com.api.boloughapi.service.KitabService;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kitab")
public class KitabController {

    private KitabService kitabService;

    public KitabController(KitabService kitabService) {
        this.kitabService = kitabService;
    }

    @GetMapping("/kitab/{id}")
    public ResponseEntity<Kitab> getKitab(@RequestParam Long id){
        return ResponseEntity.ok(kitabService.getKitab(id));
    }
}
