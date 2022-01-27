package com.decline.calorietracker.navigation

import androidx.navigation.NavController
import com.decline.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}