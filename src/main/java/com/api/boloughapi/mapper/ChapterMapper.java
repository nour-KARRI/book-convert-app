package com.api.boloughapi.mapper;

import com.api.boloughapi.dto.ChapterDto;
import com.api.boloughapi.model.Hadith;
import com.api.boloughapi.model.Chapter;
import com.api.boloughapi.model.Kitab;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChapterMapper {


    public static Chapter map(ChapterDto dto, Kitab kitab) {

        List<Hadith> hadithList = new ArrayList<>();
        if (dto == null){
            return null;
        }

        Chapter chapter = Chapter.builder()
                .chapterTitle(dto.getChapter())
                .kitab(kitab)
                .build();


        hadithList.add(HadithMapper.map(dto, chapter));
        chapter.setHadiths(hadithList);
        return chapter;
    }
}
