package com.example.Talenta.model;

import java.util.UUID;

public class Skill {
    private UUID id;
    private String name;
    private String description;
    private String category;
    private Boolean isCore;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Boolean getIsCore() {
        return isCore;
    }
    public void setIsCore(Boolean isCore) {
        this.isCore = isCore;
    }
    public Skill() {
    }
    public Skill(UUID id, String name, String description, String category, Boolean isCore) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.isCore = isCore;
    }
    
}
