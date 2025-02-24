package com.example.mental.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mental.R
import com.example.mental.databinding.FragmentGameBinding
import com.example.mental.databinding.FragmentLoginBinding
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

        binding.variant1.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, DarajaFragment.newInstance(param1 = "Game", param2 = ""))
                .commit()
        }
        binding.variant2.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, DarajaFragment.newInstance(param1 = "Game", param2 = ""))
                .commit()
        }
        binding.variant3.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, DarajaFragment.newInstance(param1 = "Game", param2 = ""))
                .commit()
        }






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