package com.example.animations

import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnup = findViewById<Button>(R.id.btnup)
        val btndown = findViewById<Button>(R.id.btndown)
        val btnleft = findViewById<Button>(R.id.btnleft)
        val btnright = findViewById<Button>(R.id.btnright)
        val img = findViewById<ImageView>(R.id.img)

        var flag = 1;
        var flag1 = 0
        btnup.setOnClickListener{
            if (flag != 1)
            {
                val tr = ObjectAnimator.ofFloat(
                    img,
                    ImageView.ROTATION,
                    img.rotation,
                    if(flag == -1)
                    {
                        img.rotation + 180f
                    }
                else if(flag == -10){
                        img.rotation + 90f
                    }
                else{
                        img.rotation - 90f
                    }
                )
                tr.duration = 500
                tr.start()
                flag = 1;
            }
            val ty = ObjectAnimator.ofFloat(
                img,
                ImageView.TRANSLATION_Y,
                img.translationY,
                img.translationY - 100f,
            )
            ty.duration = 500
            ty.start()
            val location = IntArray(2)
            img.getLocationOnScreen(location)
            var x = location[0]
            var y = location[1]
            if( y == 15)
            {
                y = 1545
            }
            Toast.makeText(this , "x = $x , y = $y " , Toast.LENGTH_SHORT ).show()

        }
        btndown.setOnClickListener{
            if (flag != -1)
            {
                val tr = ObjectAnimator.ofFloat(
                    img,
                    ImageView.ROTATION,
                    img.rotation,
                    if(flag == 1)
                    {
                        img.rotation + 180f
                    }
                    else if(flag == -10){
                        img.rotation - 90f
                    }
                    else{
                        img.rotation + 90f
                    }
                )
                tr.duration = 500
                tr.start()
                flag = -1;
            }
            val ty = ObjectAnimator.ofFloat(
                img,
                ImageView.TRANSLATION_Y,
                img.translationY,
                img.translationY + 100f

            )
            ty.duration = 500
            ty.start()
            val location = IntArray(2)
            img.getLocationOnScreen(location)
            val x = location[0]
            val y = location[1]
            Toast.makeText(this , "x = $x , y = $y " , Toast.LENGTH_SHORT ).show()

        }

        btnright.setOnClickListener{
            if (flag != 10)
            {
                val tr = ObjectAnimator.ofFloat(
                    img,
                    ImageView.ROTATION,
                    img.rotation,
                    if(flag == 1)
                    {
                        img.rotation + 90f
                    }
                    else if(flag == -1){
                        img.rotation - 90f
                    }
                    else{
                        img.rotation + 180f
                    }
                )

                tr.duration = 500
                tr.start()
                flag = 10;
            }
            val ty = ObjectAnimator.ofFloat(
                img,
                ImageView.TRANSLATION_X,
                img.translationX,
                img.translationX+ 100f

            )
            ty.duration = 500
            ty.start()
            val location = IntArray(2)
            img.getLocationOnScreen(location)
            val x = location[0]
            val y = location[1]
            Toast.makeText(this , "x = $x , y = $y " , Toast.LENGTH_SHORT ).show()

        }

        btnleft.setOnClickListener{
            if (flag != -10)
            {
                val tr = ObjectAnimator.ofFloat(
                    img,
                    ImageView.ROTATION,
                    img.rotation,
                    if(flag == 1)
                    {
                        img.rotation - 90f
                    }
                    else if(flag == -1){
                        img.rotation + 90f
                    }
                    else{
                        img.rotation + 180f
                    }
                )
                tr.duration = 500
                tr.start()
                flag = -10;
            }
            val ty = ObjectAnimator.ofFloat(
                img,
                ImageView.TRANSLATION_X,
                img.translationX,
                img.translationX - 100f

            )
            ty.duration = 500
            ty.start()
            val location = IntArray(2)
            img.getLocationOnScreen(location)
            val x = location[0]
            val y = location[1]
            Toast.makeText(this , "x = $x , y = $y " , Toast.LENGTH_SHORT ).show()

        }

    }
}