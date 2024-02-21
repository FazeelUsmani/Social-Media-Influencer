package com.example.socialmediainfluencer.repository;

import com.example.socialmediainfluencer.entity.InfluencerProfileEntity;
import com.example.socialmediainfluencer.model.InfluencerProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfluencerProfileRepository extends JpaRepository<InfluencerProfileEntity, String> {

    InfluencerProfile deleteById(Long id);

}
