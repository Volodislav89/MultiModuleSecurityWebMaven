package com.controller;

import com.model.Parrot;
import com.repository.ParrotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/api/parrot")

public class ParrotController {
    @Autowired
    ParrotRepository parrotRepository;

    @GetMapping
    public Flux<Parrot> getAllParrots() {
        return parrotRepository.findAll();
    }

    @GetMapping("/{parrotId}")
    public Mono<Parrot> getParrotById(@PathVariable String parrotId) {
        return parrotRepository.findById(parrotId);
    }
}
