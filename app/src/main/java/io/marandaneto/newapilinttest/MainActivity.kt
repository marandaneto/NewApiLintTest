package io.marandaneto.newapilinttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import java.nio.charset.StandardCharsets
import io.marandaneto.lib.MyClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // throws:
        // Error: Field requires API level 19 (current min is 16): java.nio.charset.StandardCharsets#UTF_8 [NewApi]
        // println(StandardCharsets.UTF_8.toString());

        println(MyClass.test())
    }
}