package com.example.socialmediainfluencer.repository;

import com.example.socialmediainfluencer.entity.InfluencerProfileEntity;
import com.example.socialmediainfluencer.model.InfluencerProfile;
import org.springframework.stereotype.Repository;

public interface CustomInfluencerProfileRepository {
    InfluencerProfile deleteAndReturnProfile(Long id);
}
