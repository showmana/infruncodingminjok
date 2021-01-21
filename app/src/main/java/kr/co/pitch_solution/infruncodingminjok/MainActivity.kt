package kr.co.pitch_solution.infruncodingminjok

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    internal lateinit var viewpager : ViewPager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val img = arrayOf(

                R.drawable.ai,
                R.drawable.css,
                R.drawable.html,
                R.drawable.id,
                R.drawable.jpg,
                R.drawable.js,
                R.drawable.mp4,
                R.drawable.pdf,
                R.drawable.php,
                R.drawable.png,
                R.drawable.psd,
                R.drawable.tiff,
        )

        val text = arrayOf(
                "ai",
                "css",
                "html",
                "id",
                "jpg",
                "js",
                "mp4",
                "pdf",
                "php",
                "png",
                "psd",
                "tiff",
        )

        val gridviewAdapter = GridviewAdapter(this, img, text)
        gridview.adapter = gridviewAdapter

        gridview.setOnItemClickListener { adapterView, view, i, l ->

            val intent = Intent(this, LectureActivity::class.java)
            startActivity(intent)

        }

        viewpager = findViewById(R.id.viewpager) as ViewPager

        val adapter = ViewPagerAdapter(this)
        viewpager.adapter = adapter


    }
}