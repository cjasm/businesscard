package br.cjasm.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.cjasm.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners() {
        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.btnConfirm.setOnClickListener {

        }
    }
}