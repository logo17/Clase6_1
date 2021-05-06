package com.loguito.clase6.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.loguito.clase6.R
import kotlinx.android.synthetic.main.fragment_all.*

class AllFragment : Fragment(R.layout.fragment_all) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        contactViewAll.buttonTapped = {
            Log.d("AllFragment", "Ha presionado el boton en la pantalla de todos")
        }
    }
}