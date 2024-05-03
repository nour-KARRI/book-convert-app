package com.api.boloughapi.service;

import com.api.boloughapi.dto.HadithDto;
import com.api.boloughapi.mapper.HadithMapper;
import com.api.boloughapi.repository.HadithRepository;
import org.springframework.stereotype.Service;

@Service
public class HadithService {

    private HadithRepository hadithRepository;
    private HadithMapper hadithMapper;

    public HadithService(HadithRepository hadithRepository, HadithMapper hadithMapper) {
        this.hadithRepository = hadithRepository;
        this.hadithMapper = hadithMapper;
    }

    public HadithDto getHadith(Long id) {
        return hadithMapper.mapToDto(hadithRepository.findById(id).orElse(null));
    }
}
