package com.mlbsoft.recistorebackend;

import com.mlbsoft.recistorebackend.dto.RecipeOverviewDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    @Query("SELECT new com.mlbsoft.recistorebackend.dto.RecipeOverviewDTO(r.id ,r.name, r.description) FROM recipes r")
    List<RecipeOverviewDTO> findAllOverview();

}
