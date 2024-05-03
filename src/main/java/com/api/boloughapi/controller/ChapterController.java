package com.api.boloughapi.controller;

import com.api.boloughapi.dto.ChapterDto;
import com.api.boloughapi.model.Chapter;
import com.api.boloughapi.service.ChapterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chapter")
public class ChapterController {

    private ChapterService chapterService;

    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @PostMapping("/")
    ResponseEntity<String> createChapter(@RequestBody ChapterDto dto){
        chapterService.save(dto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/chapter/{id}")
    public ResponseEntity<Chapter> getChapter(@RequestParam Long id){
        return ResponseEntity.ok(chapterService.getChapter(id));
    }
}
