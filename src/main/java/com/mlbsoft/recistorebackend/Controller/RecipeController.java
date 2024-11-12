package com.mlbsoft.recistorebackend.Controller;

import com.mlbsoft.recistorebackend.Recipe;
import com.mlbsoft.recistorebackend.RecipeService;
import com.mlbsoft.recistorebackend.dto.RecipeOverviewDTO;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipe")
    public Recipe getRecipe(@RequestParam Long id) {
        return recipeService.getRecipe(id);
    }

    @PostMapping("/recipe")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }

    @PutMapping("/recipe")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipe);
    }

    @DeleteMapping("/recipe")
    public void deleteRecipe(@RequestParam Long id) {
        recipeService.deleteRecipe(id);
    }

    @GetMapping("/listrecipes")
    @Operation(summary = "List all recipes")
    public List<RecipeOverviewDTO> listRecipes() {
        return recipeService.listRecipes();
    }
}
