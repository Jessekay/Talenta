package com.example.Talenta.model;

public class Skill {
    private String skillId;
    private String name;
    private String description;
    private String category;
    private Boolean isCore;
    public String getSkillId() {
        return skillId;
    }
    public void setSkillId(String skillId) {
        this.skillId = skillId;
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
    public Skill(String skillId, String name, String description, String category, Boolean isCore) {
        this.skillId = skillId;
        this.name = name;
        this.description = description;
        this.category = category;
        this.isCore = isCore;
    }

    
}
