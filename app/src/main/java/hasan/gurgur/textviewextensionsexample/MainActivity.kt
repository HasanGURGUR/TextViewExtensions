package hasan.gurgur.textviewextensionsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hasan.gurgur.textviewextensionsexample.databinding.ActivityMainBinding
import hasan.gurgur.textviewextensionsexample.extensions.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.tv1.setColorOfSubstring("H", R.color.myTextColor1)
        binding.tv1.setColorOfSubstring("e", R.color.myTextColor2)
        binding.tv1.setColorOfSubstring("l", R.color.myTextColor3)
        binding.tv1.setColorOfSubstring("l", R.color.myTextColor4)
        binding.tv1.setColorOfSubstring("o", R.color.myTextColor5)
        binding.tv1.setColorOfSubstring("W", R.color.myTextColor6)
        binding.tv1.setColorOfSubstring("o", R.color.myTextColor7)
        binding.tv1.setColorOfSubstring("r", R.color.myTextColor8)
        binding.tv1.setColorOfSubstring("l", R.color.myTextColor1)
        binding.tv1.setColorOfSubstring("d", R.color.myTextColor2)
        binding.tv1.setColorOfSubstring("!", R.color.myTextColor3)


        binding.tv1.underLine()

        binding.tv1.setDrawableLeft(R.drawable.ic_music)
        binding.tv1.setBoldSubstring("Hello")

        binding.tv2.deleteLine()


    }
}