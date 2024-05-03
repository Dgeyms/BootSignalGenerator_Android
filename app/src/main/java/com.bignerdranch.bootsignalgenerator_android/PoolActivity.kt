
import android.os.Bundle import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import com.bignerdranch.bootsignalgenerator_android.R

class PoolActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragment = PoolActivity()

        supportFragmentManager.beginTransaction()
            .replaсe(R.id.bottomButtonsContainer, fragment)
            .commit()
    }

}