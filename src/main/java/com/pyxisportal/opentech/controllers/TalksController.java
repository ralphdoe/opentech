package com.pyxisportal.opentech.controllers;

import com.pyxisportal.opentech.models.Talk;
import com.pyxisportal.opentech.repositories.TalkJpaRepository;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/talks")
public class TalksController {

    @Resource
    private TalkJpaRepository talkJpaRepository;

    @GetMapping()
    public List<Talk> findAll() {
        return talkJpaRepository.findAll();
    }

    @PutMapping()
    public Talk updateTalk(@RequestBody final Talk talk) {
        talkJpaRepository.save(talk);
        return talkJpaRepository.findByName(talk.getName());
    }

    @GetMapping(value = "/{name}")
    public Talk getTalkByName(@PathVariable final String name) {
        return talkJpaRepository.findByName(name);
    }

    @PostMapping(value = "/add")
    public Talk addTalk(@RequestBody final Talk talk) {
        talkJpaRepository.save(talk);
        return talkJpaRepository.findByName(talk.getName());
    }
}
