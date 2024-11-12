package com.mlbsoft.recistorebackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RecipeOverviewDTO {
    private Long recipeId;
    private String name;
    private String description;
}
