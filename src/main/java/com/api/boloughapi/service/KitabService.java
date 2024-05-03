package com.api.boloughapi.service;

import com.api.boloughapi.model.Kitab;
import com.api.boloughapi.repository.KitabRepository;
import org.springframework.stereotype.Service;

@Service
public class KitabService {

    private KitabRepository kitabRepository;

    public KitabService(KitabRepository kitabRepository) {
        this.kitabRepository = kitabRepository;
    }

    public Kitab getKitab(Long id) {
        return kitabRepository.findById(id).orElse(null);
    }
}
