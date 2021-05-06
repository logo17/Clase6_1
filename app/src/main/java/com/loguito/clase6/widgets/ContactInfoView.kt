package com.loguito.clase6.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.loguito.clase6.R
import com.loguito.clase6.databinding.ContactInfoViewBinding

class ContactInfoView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    var buttonTapped: (() -> Unit)? = null
    private var binding: ContactInfoViewBinding =
        ContactInfoViewBinding.inflate(LayoutInflater.from(context), this)

    init {

        val typedArray = context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ContactInfoView,
            defStyleAttr,
            defStyleRes
        )

        binding.userNameTextView.text = typedArray.getString(R.styleable.ContactInfoView_userName)
        binding.emailTextView.text = typedArray.getString(R.styleable.ContactInfoView_userEmail)
        binding.callButton.setOnClickListener {
            buttonTapped?.invoke()
        }

        typedArray.recycle()
    }
}