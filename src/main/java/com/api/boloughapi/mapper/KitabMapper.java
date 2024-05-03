package com.api.boloughapi.mapper;

import com.api.boloughapi.dto.ChapterDto;
import com.api.boloughapi.model.Chapter;
import com.api.boloughapi.model.Hadith;
import com.api.boloughapi.model.Kitab;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KitabMapper {

    public Kitab map(ChapterDto dto) {
        List<Chapter> chapters = new ArrayList<>();

        if (dto == null){
            return null;
        }

        Kitab kitab = Kitab.builder()
                .title(dto.getKitab())
                .build();

        Chapter chapter = ChapterMapper.map(dto, kitab);
        chapters.add(chapter);
        kitab.setChapters(chapters);

        return kitab;
    }
}
