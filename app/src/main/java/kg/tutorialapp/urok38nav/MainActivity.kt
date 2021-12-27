package kg.tutorialapp.urok38nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import kg.tutorialapp.urok38nav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            navView.setNavigationItemSelectedListener {
                when(it.itemId)
                    {R.id.item1 -> Toast.makeText(this@MainActivity,"item1",Toast.LENGTH_SHORT).show()

                    R.id.item2 -> Toast.makeText(this@MainActivity,"item2",Toast.LENGTH_SHORT).show()

                    R.id.item3 -> Toast.makeText(this@MainActivity,"item3",Toast.LENGTH_SHORT).show()

                    R.id.item4 -> Toast.makeText(this@MainActivity,"item4",Toast.LENGTH_SHORT).show()
                    R.id.item5 -> Toast.makeText(this@MainActivity,"item5",Toast.LENGTH_SHORT).show()

                    R.id.item6 -> Toast.makeText(this@MainActivity,"item6",Toast.LENGTH_SHORT).show()


                }
                true
            }

        }
        binding.btnNav.setOnClickListener {
            binding.drawer.openDrawer(GravityCompat.START)
        }

    }
}