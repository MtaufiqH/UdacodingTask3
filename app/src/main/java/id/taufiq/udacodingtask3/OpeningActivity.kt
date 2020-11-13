package id.taufiq.udacodingtask3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.taufiq.udacodingtask3.view.MainActivity
import kotlinx.android.synthetic.main.activity_opening.*

class OpeningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opening)

        btn_explore.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
            finishAffinity()
        }
    }
}