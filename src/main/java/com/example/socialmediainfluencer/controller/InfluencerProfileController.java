package com.example.socialmediainfluencer.controller;

import com.example.socialmediainfluencer.model.InfluencerProfile;
import com.example.socialmediainfluencer.service.InfluencerProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/influencer")
public class InfluencerProfileController {

    @Autowired
    private InfluencerProfileService influencerProfileService;

    @PostMapping
    public InfluencerProfile createInfluencer(@RequestBody InfluencerProfile influencerProfile) {
        log.info(">> In controller ", influencerProfile);
        return this.influencerProfileService.createInfluencer(influencerProfile);
    }

    @GetMapping("{id}")
    public InfluencerProfile findInfluencer(@PathVariable Long id) {
        return this.influencerProfileService.findInfluencer(id);
    }

    @GetMapping
    public List<InfluencerProfile> findAllInfluencers() {
        return this.influencerProfileService.findAllInfluencers();
    }

    @DeleteMapping("{id}")
    public InfluencerProfile deleteInfluencerById(@PathVariable Long id) {
        return this.influencerProfileService.deleteInfluencerById(id);
    }


}
