package com.api.boloughapi.controller;

import com.api.boloughapi.dto.HadithDto;
import com.api.boloughapi.service.HadithService;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hadith")
public class HadithController {

    private HadithService hadithService;

    public HadithController(HadithService hadithService) {
        this.hadithService = hadithService;
    }

    @PostMapping("/")
    ResponseEntity<String> save(@RequestBody HadithDto dto){
        hadithService.save(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HadithDto> getHadith(@PathVariable Long id){
        return ResponseEntity.ok(hadithService.getHadith(id));
    }
}
