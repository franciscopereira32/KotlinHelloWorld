package android.autoinstalls.config.multi.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btStart = this.findViewById<Button>(R.id.button);
        var helloWorld = this.findViewById<TextView>(R.id.helloworld);

        btStart.setOnClickListener(){
            if(helloWorld.visibility == TextView.INVISIBLE){
                helloWorld.visibility = TextView.VISIBLE
            }else{
                helloWorld.visibility = TextView.INVISIBLE
            }
            }

        }

    }



