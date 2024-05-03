
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bignerdranch.bootsignalgenerator_android.R
import com.bignerdranch.bootsignalgenerator_android.fragments.BottomButtonsFragment

class PoolActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragment = BottomButtonsFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.bottomButtonsContainer, fragment)
            .commit()
    }

}