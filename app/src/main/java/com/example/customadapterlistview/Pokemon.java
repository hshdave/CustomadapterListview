package com.example.customadapterlistview;

public class Pokemon {

    private String name;
    private String image;
    private String type;
    private String ability;
    private String height;
    private String weight;
    private String description;


    public Pokemon(String name, String image, String type, String ability, String height, String weight, String description) {
        this.name = name;
        this.image = image;
        this.type = type;
        this.ability = ability;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }

  /*  public Pokemon(String name, String image) {
        this.name = name;
        this.image = image;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
