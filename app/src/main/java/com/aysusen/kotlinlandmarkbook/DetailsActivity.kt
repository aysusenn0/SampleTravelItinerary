package com.aysusen.kotlinlandmarkbook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aysusen.kotlinlandmarkbook.databinding.ActivityDetailsBinding
import com.aysusen.kotlinlandmarkbook.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent=intent
        //val selectedLandMark=intent.getSerializableExtra("landmark") as LandMark
        val selectedLandMark=Singleton.chosenLandMark
        selectedLandMark?.let {
            binding.nameText.text = it.info
            binding.nameText2.text = it.name
            binding.imageView.setImageResource(it.image)

        }

    }
}