package com.example.mental.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mental.R
import com.example.mental.databinding.FragmentNatijaBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [NatijaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NatijaFragment : Fragment() {
 private   lateinit var binding: FragmentNatijaBinding
    // TODO: Rename and change types of parameters
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

        binding=FragmentNatijaBinding.inflate(LayoutInflater.from(container?.context),container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var tjavob=param1?.toInt()?:0
        var ummumiysavollar=20
        var javoblar=param2?.toInt()?:0
        var xatojavob=javoblar-tjavob
        var notogrijavob=xatojavob
        var ball=tjavob*5
        binding.jamibaltxt.text="Jami ball:"+ball.toString()
        binding.togrijavobtxt.text="To'gri javoblar:"+tjavob.toString()
        binding.notogrijavobtxt.text="Xato javoblar:"+xatojavob.toString()
        binding.umumiyberilganjavobtxt.text="umumiy javoblar soni:"+javoblar.toString()
        binding.qaytishbtn.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.continer,DarajaFragment()).commit()
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NatijaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NatijaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}