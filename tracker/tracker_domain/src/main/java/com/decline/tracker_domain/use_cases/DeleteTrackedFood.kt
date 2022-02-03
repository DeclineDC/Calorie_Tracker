package com.decline.tracker_domain.use_cases

import com.decline.tracker_domain.model.TrackedFood
import com.decline.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        repository.deleteTrackedFood(trackedFood)
    }
}