package com.example.socialmediainfluencer.repository;

import com.example.socialmediainfluencer.entity.InfluencerProfileEntity;
import com.example.socialmediainfluencer.model.InfluencerProfile;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
public class InfluencerProfileRepositoryImpl implements CustomInfluencerProfileRepository {

    private final InfluencerProfileRepository influencerProfileRepository;

    public InfluencerProfileRepositoryImpl(@Lazy InfluencerProfileRepository influencerProfileRepository) {
        this.influencerProfileRepository = influencerProfileRepository;
    }

    @Override
    public InfluencerProfile deleteAndReturnProfile(Long id) {
        InfluencerProfileEntity profileEntity = influencerProfileRepository.findById(String.valueOf(id)).get();
        if (profileEntity != null) {
            influencerProfileRepository.deleteById(String.valueOf(id));
            InfluencerProfile profile = new InfluencerProfile();
            BeanUtils.copyProperties(profileEntity, profile);
            return profile;
        }
        return null;
    }
}