package com.api.boloughapi.mapper;

import com.api.boloughapi.dto.ChapterDto;
import com.api.boloughapi.dto.HadithDto;
import com.api.boloughapi.model.Chapter;
import com.api.boloughapi.model.Hadith;
import org.springframework.stereotype.Component;

@Component
public class HadithMapper {
    public static Hadith map(ChapterDto dto, Chapter chapter) {

        return Hadith.builder()
                .hadithName(dto.getHadithName())
                .isnaad(dto.getIsnaad())
                .matn(dto.getMatn())
                .takhrij(dto.getTakhrij())
                .tahkeek(dto.getTahkeek())
                .chapter(chapter)
                .build();
    }

    public HadithDto mapToDto(Hadith hadith) {

        if (hadith == null){
            return null;
        }

        return HadithDto.builder()
                .hadithName(hadith.getHadithName())
                .isnaad(hadith.getIsnaad())
                .matn(hadith.getMatn())
                .takhrij(hadith.getTakhrij())
                .tahkeek(hadith.getTahkeek())
                .build();
        }
}
