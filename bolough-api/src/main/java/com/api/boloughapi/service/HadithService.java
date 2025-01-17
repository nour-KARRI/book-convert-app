package com.api.boloughapi.service;

import com.api.boloughapi.dto.HadithDto;
import com.api.boloughapi.mapper.HadithMapper;
import com.api.boloughapi.model.Chapter;
import com.api.boloughapi.model.Hadith;
import com.api.boloughapi.repository.ChapterRepository;
import com.api.boloughapi.repository.HadithRepository;
import com.api.boloughapi.repository.HadithTranslationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HadithService {

    private HadithTranslationRepository hadithTranslationRepository;
    private HadithMapper hadithMapper;
    private HadithRepository hadithRepository;
    private ChapterRepository chapterRepository;

    public HadithService(HadithTranslationRepository hadithTranslationRepository, HadithMapper hadithMapper, HadithRepository hadithRepository, ChapterRepository chapterRepository) {
        this.hadithTranslationRepository = hadithTranslationRepository;
        this.hadithMapper = hadithMapper;
        this.hadithRepository = hadithRepository;
        this.chapterRepository = chapterRepository;
    }

    public HadithDto getHadith(Long id) {
        return hadithMapper.mapToDto(hadithRepository.findById(id).orElse(null));
    }

    public void save(HadithDto dto) {
        log.info("save new hadith in the db");
        Chapter chapter = chapterRepository.findById(1L).orElse(null);
        try{
            Hadith hadith = HadithMapper.map(dto);
            hadith.setChapter(chapter);
            hadithRepository.save(hadith);
        }catch (Exception e){
            log.error("Can't save hadith in the db");
        }
    }
}
