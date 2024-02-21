package com.example.socialmediainfluencer.model;

import lombok.Data;

@Data
public class InfluencerProfile {
    private Long id;
    private String name;
    private String profile;
    private String youtube;
    private String instagram;
    private String facebook;
    private String snapchat;
    private String tiktok;
}
