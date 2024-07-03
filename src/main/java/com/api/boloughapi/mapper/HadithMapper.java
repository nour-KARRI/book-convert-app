package com.api.boloughapi.mapper;

import com.api.boloughapi.dto.HadithDto;
import com.api.boloughapi.model.Hadith;
import com.api.boloughapi.model.translation.HadithTranslation;
import org.springframework.stereotype.Component;

@Component
public class HadithMapper {
    public static Hadith map(HadithDto dto) {

        if (dto == null){
            return null;
        }

        return Hadith.builder()
                .name(dto.getName())
                .isnaad(dto.getIsnaad())
                .matn(dto.getMatn())
                .takhrij(dto.getTakhrij())
                .hamesh(dto.getHamesh())
                .basamLink(dto.getBasamLink())
                .san3aniLink(dto.getSan3aniLink())
                .uthaymeenLink(dto.getUthaymeenLink())
                .build();
    }

    public HadithDto mapToDto(Hadith hadith) {

        if (hadith == null){
            return null;
        }

        return HadithDto.builder()
                .id(hadith.getId())
                .name(hadith.getName())
                .isnaad(hadith.getIsnaad())
                .matn(hadith.getMatn())
                .takhrij(hadith.getTakhrij())
                .hamesh(hadith.getHamesh())
                .basamLink(hadith.getBasamLink())
                .san3aniLink(hadith.getSan3aniLink())
                .uthaymeenLink(hadith.getUthaymeenLink())
                .build();
        }
}
