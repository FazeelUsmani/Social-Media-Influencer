package com.example.socialmediainfluencer.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name="Influencer_profile")
public class InfluencerProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Id
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
//    private String id;

    private String name;
    private String profile;
    private String youtube;
    private String instagram;
    private String facebook;
    private String snapchat;
    private String tiktok;

}
