package com.example.socialmediainfluencer.service;

import com.example.socialmediainfluencer.entity.InfluencerProfileEntity;
import com.example.socialmediainfluencer.model.InfluencerProfile;
import com.example.socialmediainfluencer.repository.CustomInfluencerProfileRepository;
import com.example.socialmediainfluencer.repository.InfluencerProfileRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class InfluencerProfileServiceImpl implements InfluencerProfileService {

    @Autowired
    InfluencerProfileRepository influencerProfileRepository;

    @Autowired
    CustomInfluencerProfileRepository customInfluencerProfileRepository;

    @Transactional
    public InfluencerProfile createInfluencer(InfluencerProfile influencerProfile) {
        try {
            InfluencerProfileEntity profileEntity = new InfluencerProfileEntity();
            if (influencerProfile != null) {
                BeanUtils.copyProperties(influencerProfile, profileEntity);
            }
            InfluencerProfileEntity savedEntity = influencerProfileRepository.save(profileEntity);
            InfluencerProfile savedProfile = new InfluencerProfile();
            if (savedProfile != null) {
                BeanUtils.copyProperties(savedEntity, savedProfile);
            }
            return savedProfile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public InfluencerProfile findInfluencer(Long id) {
        InfluencerProfileEntity profileEntity = influencerProfileRepository.findById(id.toString()).get();
        InfluencerProfile profile = new InfluencerProfile();
        BeanUtils.copyProperties(profileEntity, profile);
        return profile;
    }

    public List<InfluencerProfile> findAllInfluencers() {
        List<InfluencerProfileEntity> profileEntities = influencerProfileRepository.findAll();
        List<InfluencerProfile> profiles = profileEntities
                .stream()
                .map(influencerProfileEntity -> {
                    InfluencerProfile profile = new InfluencerProfile();
                    BeanUtils.copyProperties(influencerProfileEntity, profile);
                    return profile;
                })
                .collect(Collectors.toList());

        return profiles;
    }

    public InfluencerProfile deleteInfluencerById(Long id) {
        return this.customInfluencerProfileRepository.deleteAndReturnProfile(id);
    }

}
