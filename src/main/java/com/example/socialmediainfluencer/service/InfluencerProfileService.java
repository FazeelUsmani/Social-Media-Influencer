package com.example.socialmediainfluencer.service;

import com.example.socialmediainfluencer.model.InfluencerProfile;

import java.util.List;

public interface InfluencerProfileService {

    InfluencerProfile createInfluencer(InfluencerProfile influencerProfile);

    InfluencerProfile findInfluencer(Long id);

    List<InfluencerProfile> findAllInfluencers();

    InfluencerProfile deleteInfluencerById(Long id);

}
