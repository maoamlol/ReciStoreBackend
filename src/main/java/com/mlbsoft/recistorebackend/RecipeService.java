package com.mlbsoft.recistorebackend;

import com.mlbsoft.recistorebackend.dto.RecipeOverviewDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe getRecipe(Long id) {
        return recipeRepository.findById(id).orElseThrow();
    }

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public Recipe updateRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteRecipe(Long id) {
        recipeRepository.deleteById(id);
    }

    public List<RecipeOverviewDTO> listRecipes() {
        return recipeRepository.findAllOverview();
    }
}
