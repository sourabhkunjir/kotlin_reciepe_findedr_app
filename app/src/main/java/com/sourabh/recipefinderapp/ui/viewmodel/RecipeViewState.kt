package com.sourabh.recipefinderapp.ui.viewmodel

import com.sourabh.recipefinderapp.data.model.Meal

sealed class RecipeViewState {
    object Loading: RecipeViewState()
    data class Success(val recipes: List<Meal>): RecipeViewState()
    data class Error(val message: String): RecipeViewState()
}
