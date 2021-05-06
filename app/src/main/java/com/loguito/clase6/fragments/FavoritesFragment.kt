package com.loguito.clase6.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.loguito.clase6.R
import kotlinx.android.synthetic.main.fragment_favorites.*

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactViewFavorites.buttonTapped = {
            Log.d("FavoriteFragment", "Ha presionado el boton en la pantalla de favoritos")
        }
    }
}