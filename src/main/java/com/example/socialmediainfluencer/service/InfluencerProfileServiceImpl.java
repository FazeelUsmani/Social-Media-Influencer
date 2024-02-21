package com.example.socialmediainfluencer.service;

import com.example.socialmediainfluencer.entity.InfluencerProfileEntity;
import com.example.socialmediainfluencer.model.InfluencerProfile;
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

    @Transactional
    public InfluencerProfile createInfluencer(InfluencerProfile influencerProfile) {
        try {
            InfluencerProfileEntity profileEntity = new InfluencerProfileEntity();
            log.info(">>> influencer profile {}}", influencerProfile);
            log.info(">>> profile entiry {} ",profileEntity);
            if (influencerProfile != null) {
                log.info(">>> In influencer profile if condition");
                BeanUtils.copyProperties(influencerProfile, profileEntity);
            }
            log.info(">>> influencer profile 2 {}",influencerProfile);
            log.info(">>> profile entiry 2 {}",profileEntity);
            InfluencerProfileEntity savedEntity = influencerProfileRepository.save(profileEntity);
            InfluencerProfile savedProfile = new InfluencerProfile();
            log.info(">>> saved entity 1 {}",savedEntity);
            log.info(">>> saved profile 1 {}",savedProfile);
            if (savedProfile != null) {
                log.info(">>> In saved profile if condition");
                BeanUtils.copyProperties(savedEntity, savedProfile);
            }
            log.info(">>> saved entity 2 {}",savedEntity);
            log.info(">>> saved profile 2 {}",savedProfile);
            return savedProfile;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return influencerProfile;
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
        return influencerProfileRepository.deleteById(id);
    }

}
