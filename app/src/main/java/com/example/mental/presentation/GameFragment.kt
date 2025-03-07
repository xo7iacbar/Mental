package com.example.mental.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import com.example.mental.R
import com.example.mental.databinding.FragmentGameBinding
import com.example.mental.databinding.FragmentLoginBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GameFragment : Fragment() {

lateinit var binding: FragmentGameBinding

    private var param1: String? = null
    private var param2: String? = null
private var tJavob=""
    private  var yolbars=R.drawable.tiger
    private  var wolf=R.drawable.wolf
    private  var burgut=R.drawable.burgut
    private  var fil=R.drawable.fil
    private  var baliq=R.drawable.fish
    private  var horse=R.drawable.horse
    private  var jaguar=R.drawable.jaguar
    private  var kengru=R.drawable.kengru
    private var sheep=R.drawable.sheep
    private var lion=R.drawable.lion
   private var javoblar =ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=
            FragmentGameBinding.inflate(LayoutInflater.from(container?.context),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
              savol()
        overfunction()
        binding.variant1.setOnClickListener {
            savol()
        }
        binding.variant2.setOnClickListener {
            savol()
        }
        binding.variant3.setOnClickListener {
            val javob = binding.variant3.toString()
              savol()

        }


    }

    private fun savol() {

        var rasm1=0

        var savol = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var rasm=savol.random()

        when(rasm){

            1->{ rasm1=yolbars
            binding.imageView.setImageResource(yolbars)
                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("Tiger")
                javoblar.add("Wolf")
                javoblar.add("Eagle")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)
            }

            2->{rasm1=wolf
                binding.imageView.setImageResource(wolf)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("wolf")
                javoblar.add("tiger")
                javoblar.add("elephant")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)           }

            3->{rasm1=burgut
                binding.imageView.setImageResource(burgut)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("eagle")
                javoblar.add("tiger")
                javoblar.add("jaguar")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)           }

            4->{rasm1=fil
                binding.imageView.setImageResource(fil)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("fil")
                javoblar.add("tiger")
                javoblar.add("jaguar")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)             }

            5->{  rasm1=baliq
                binding.imageView.setImageResource(baliq)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("fish")
                javoblar.add("eagle")
                javoblar.add("sheep")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)        }

            6->{ rasm1=horse
                binding.imageView.setImageResource(horse)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("horse")
                javoblar.add("tiger")
                javoblar.add("jaguar")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)      }

            7->{     rasm1=jaguar
                binding.imageView.setImageResource(jaguar)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("jaguar")
                javoblar.add("lion")
                javoblar.add("horse")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar) }

            8->{     rasm1=kengru
                binding.imageView.setImageResource(kengru)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("kengru")
                javoblar.add("lion")
                javoblar.add("elephant")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)
            }

            9->{      rasm1=sheep
                binding.imageView.setImageResource(sheep)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("sheep")
                javoblar.add("horse")
                javoblar.add("eagle")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)
            }

            10->{      rasm1=lion
                binding.imageView.setImageResource(lion)

                //arrayOf("Tigr","Wolf","Egle")
                javoblar.add("lion")
                javoblar.add("jaguar")
                javoblar.add("fish")
                tJavob=javoblar.get(0)
                joylashtirish(javoblar)   }

        }

    }

    private fun joylashtirish(list:ArrayList<String>) {
        var javob1=list.random()
        list.remove(javob1)
        binding.variant1.setText(javob1)

        var javob2=list.random()
        list.remove(javob2)
        binding.variant2.setText(javob2)

        var javob3=list.random()
        binding.variant3.setText(javob3)
        javoblar.clear()
    }
    private fun overfunction() {
        viewLifecycleOwner.lifecycleScope.launch {

            var secunt=when(param1){
                "Game"-> 20
                else-> 0
            }

            for (i in 1..secunt) {
                delay(1000)
                binding.sekunttxtid.text = i.toString()
                if (i == secunt) {
                    over()
                }

            }
        }
    }

    private fun over() {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, DarajaFragment.newInstance(param1 = "Game", param2 = ""))
                .commit()
    }


    companion object {
        /**
         *
         *
         *
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GameFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GameFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

//fun yaratish(){
//
//
//
//    val images= arrayOf(R.drawable.wolf,R.drawable.tiger,R.drawable.fil,R.drawable.fish,R.drawable.kengru,R.drawable.burgut,R.drawable.horse,R.drawable.sheep,R.drawable.wolf,R.drawable.jaguar,R.drawable.lion,)
//    var randomindex= Random.nextInt(images.size)
//    image.setImageResourse(images[randomindex])
//
//}