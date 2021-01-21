package com.example.affirmationluis.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
        @StringRes val id: Int,
        @DrawableRes val imageId: Int) {}