package com.example.headpotatogame
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import com.google.android.material.appbar.AppBarLayout

class MainActivity : AppCompatActivity() {
    lateinit var ear : ImageView
    lateinit var eye : ImageView
    lateinit var eyebrowss : ImageView
    lateinit var mustachess : ImageView
    lateinit var nosee : ImageView
    lateinit var mouthh : ImageView
    lateinit var shoess : ImageView
    lateinit var glassess : ImageView
    lateinit var hats : ImageView
    lateinit var arm : ImageView


    lateinit var checkboxhat: CheckBox
    lateinit var checkboxear: CheckBox
    lateinit var checkboxeye: CheckBox
    lateinit var checkboxarm: CheckBox
    lateinit var checkboxeyebrows: CheckBox
    lateinit var checkboxmoustaches: CheckBox
    lateinit var checkboxglasses: CheckBox
    lateinit var checkboxmouth: CheckBox
    lateinit var checkboxnose: CheckBox
    lateinit var checkboxshoes: CheckBox


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkboxhat = findViewById(R.id.checkHat)
        checkboxear = findViewById(R.id.checkears)
        checkboxeye = findViewById(R.id.checkeye)
        checkboxarm = findViewById(R.id.checkarms)
        checkboxeyebrows = findViewById(R.id.checkeyebrows)
        checkboxmoustaches = findViewById(R.id.checkmustaches)
        checkboxglasses = findViewById(R.id.checkglasses)
        checkboxmouth = findViewById(R.id.checkmouth)
        checkboxnose = findViewById(R.id.checknose)
        checkboxshoes = findViewById(R.id.checkshoes)

        ear = findViewById<ImageView>(R.id.ears)
        eye = findViewById<ImageView>(R.id.eyes)
        eyebrowss = findViewById<ImageView>(R.id.eyebrows)
        mustachess = findViewById<ImageView>(R.id.moustaches)
        nosee = findViewById<ImageView>(R.id.nose)
        mouthh = findViewById<ImageView>(R.id.mouth)
        shoess = findViewById<ImageView>(R.id.shoes)
        glassess = findViewById<ImageView>(R.id.glasses)
        hats = findViewById<ImageView>(R.id.hat)
        arm = findViewById<ImageView>(R.id.arms)


    }
    fun clickforhat(view: View)
    {
        val checked = checkboxhat.isChecked()
        if(checked)
        {
            hats.visibility = View.VISIBLE;
        }
        else
        {
            hats.visibility = View.INVISIBLE;
        }
    }
    fun clickforear(view: View)
    {
        val checked = checkboxear.isChecked()
        if(checked)
        {
            ear.visibility = View.VISIBLE;
        }
        else
        {
            ear.visibility = View.INVISIBLE;
        }
    }
    fun clickforeye(view: View)
    {
        val checked = checkboxeye.isChecked()
        if(checked)
        {
            eye.visibility = View.VISIBLE;
        }
        else
        {
            eye.visibility = View.INVISIBLE;
        }
    }
    fun clickformoustaches(view: View)
    {
        val checked = checkboxmoustaches.isChecked()
        if(checked)
        {
            mustachess.visibility = View.VISIBLE;
        }
        else
        {
            mustachess.visibility = View.INVISIBLE;
        }
    }
    fun clickforglasses(view: View)
    {
        val checked = checkboxglasses.isChecked()
        if(checked)
        {
            glassess.visibility = View.VISIBLE;
        }
        else
        {
            glassess.visibility = View.INVISIBLE;
        }
    }
    fun clickforshoes(view: View)
    {
        val checked = checkboxshoes.isChecked()
        if(checked)
        {
            shoess.visibility = View.VISIBLE;
        }
        else
        {
            shoess.visibility = View.INVISIBLE;
        }
    }
    fun clickfornose(view: View)
    {
        val checked = checkboxnose.isChecked()
        if(checked)
        {
            nosee.visibility = View.VISIBLE;
        }
        else
        {
            nosee.visibility = View.INVISIBLE;
        }
    }
    fun clickforarms(view: View)
    {
        val checked = checkboxarm.isChecked()
        if(checked)
        {
            arm.visibility = View.VISIBLE;
        }
        else
        {
            arm.visibility = View.INVISIBLE;
        }
    }
    fun clickformouth(view: View)
    {
        val checked = checkboxmouth.isChecked()
        if(checked)
        {
            mouthh.visibility = View.VISIBLE;
        }
        else
        {
            mouthh.visibility = View.INVISIBLE;
        }
    }
    fun clickforeyebrows(view: View)
    {
        val checked = checkboxeyebrows.isChecked()
        if(checked)
        {
            eyebrowss.visibility = View.VISIBLE;
        }
        else
        {
            eyebrowss.visibility = View.INVISIBLE;
        }
    }

}