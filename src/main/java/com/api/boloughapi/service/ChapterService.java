package com.api.boloughapi.service;

import com.api.boloughapi.dto.ChapterDto;
import com.api.boloughapi.mapper.ChapterMapper;
import com.api.boloughapi.mapper.HadithMapper;
import com.api.boloughapi.mapper.KitabMapper;
import com.api.boloughapi.model.Chapter;
import com.api.boloughapi.model.Kitab;
import com.api.boloughapi.repository.KitabRepository;
import com.api.boloughapi.repository.ChapterRepository;
import com.api.boloughapi.repository.HadithRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChapterService {

    private ChapterRepository chapterRepository;
    private ChapterMapper chapterMapper;
    private HadithMapper hadithMapper;
    private HadithRepository hadithRepository;
    private KitabRepository kitabRepository;
    private KitabMapper kitabMapper;

    public ChapterService(ChapterRepository chapterRepository, ChapterMapper chapterMapper, HadithMapper hadithMapper, HadithRepository hadithRepository, KitabRepository kitabRepository, KitabMapper kitabMapper) {
        this.chapterRepository = chapterRepository;
        this.chapterMapper = chapterMapper;
        this.hadithMapper = hadithMapper;
        this.hadithRepository = hadithRepository;
        this.kitabRepository = kitabRepository;
        this.kitabMapper = kitabMapper;
    }

    public void save(ChapterDto dto) {
        Kitab kitab = kitabRepository.findByTitle(dto.getKitab()).orElse(null);

        Chapter chapter = chapterRepository.findByChapterTitle(dto.getChapter())
                .orElse(null);

        if (kitab == null){
            kitabRepository.save(kitabMapper.map(dto));
        }
        if (chapter == null && kitab !=null){
            chapterRepository.save(ChapterMapper.map(dto, kitab));
        }
        else if(chapter != null && kitab !=null){
            hadithRepository.save(HadithMapper.map(dto, chapter));
        }
    }

    public Chapter getChapter(Long id) {
        return chapterRepository.findById(id).orElse(null);
    }
}
