package cl.cutiko.motionpoc

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import cl.cutiko.motionpoc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
/*
DIRTY SOLUTION
https://stackoverflow.com/questions/28444016/how-can-i-force-gradle-to-set-the-same-version-for-two-dependencies
*/


/*
CONSTRAINT RELEASES
https://androidstudio.googleblog.com/2020/08/constraintlayout-201.html
https://developer.android.com/jetpack/androidx/releases/constraintlayout
*/

/*
SOURCES
https://github.com/android/views-widgets-samples/tree/main/ConstraintLayoutExamples
https://github.com/android/views-widgets-samples/blob/main/ConstraintLayoutExamples/motionlayout/src/main/res/layout/motion_18_coordination.xml
https://github.com/android/views-widgets-samples/blob/main/ConstraintLayoutExamples/motionlayout/src/main/res/xml/scene_18.xml
https://github.com/android/views-widgets-samples/blob/main/ConstraintLayoutExamples/motionlayout/src/main/res/layout/motion_17_coordination_header.xml
https://github.com/android/views-widgets-samples/blob/main/ConstraintLayoutExamples/motionlayout/src/main/res/xml/scene_17_header.xml
https://github.com/android/views-widgets-samples/blob/main/ConstraintLayoutExamples/motionlayout/src/main/res/layout/content_scrolling.xml
*/
