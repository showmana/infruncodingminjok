package kr.co.pitch_solution.infruncodingminjok

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter(private val context: Context) : PagerAdapter() {

    private var layoutInflater : LayoutInflater? = null

    val Image = arrayOf(
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
        R.drawable.tiff

    )

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return Image.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.viewpager_activity, null)
        val image = v.findViewById<View>(R.id.imageview) as ImageView

        image.setImageResource(Image[position])

        val vp = container as ViewPager
        vp.addView(v,0)

        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }

}