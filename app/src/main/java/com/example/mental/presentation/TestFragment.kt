package com.example.mental.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.mental.R
import com.example.mental.databinding.FragmentTestBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TestFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TestFragment : Fragment() {
    lateinit var binding: FragmentTestBinding
    private var mainjavob = 0
    private var tjavoblarsoni = 0
private var umumiySavollarsoni=20
    private var umumiyJavoblarsoni=0

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
        binding =
            FragmentTestBinding.inflate(LayoutInflater.from(container?.context), container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        yaratish()
        overfunction()
        binding.variant1.setOnClickListener {
            val javobtxt = binding.variant1txt.text.toString().toInt()
            tekshirish(javobtxt)
            umumiyJavoblarsoni++
            yaratish()
        }
        binding.variant2.setOnClickListener {
            val javobtxt = binding.variant2txt.text.toString().toInt()
            tekshirish(javobtxt)
            umumiyJavoblarsoni++
            yaratish()
        }
        binding.variant3.setOnClickListener {
            val javobtxt = binding.variant3txt.text.toString().toInt()
            tekshirish(javobtxt)
            umumiyJavoblarsoni++
        }

    }
    private fun tekshirish(javobtxt: Int) {
        if (umumiyJavoblarsoni<20){
        if (mainjavob == javobtxt) {
            tjavoblarsoni++
            yaratish()
        } else {
            yaratish()
        }
        }else{
            over()
        }
    }
    

    private fun yaratish() {
        var ms1 = arrayListOf(1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14, 15, 16, 17, 18, 19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50)
        var ms2 = arrayListOf(2, 3, 4, 5)
        var amalSoni = ms2.random()
        var birinchison = -1
        var ikkinchison = -1
        var uchinchison = -1
        var tortinchison = -1
        var beshinchison = -1
        var test = ""
        var javob = 0
        when (amalSoni) {
            2 -> {
                birinchison = ms1.random()
                ikkinchison = ms1.random()
                javob = birinchison + ikkinchison
                test = "$birinchison+$ikkinchison"
                mainjavob = javob
                variantlar(javob)

            }

            3 -> {
                birinchison = ms1.random()
                ikkinchison = ms1.random()
                uchinchison = ms1.random()
                test = "$birinchison+$ikkinchison-$uchinchison"
                javob = birinchison + ikkinchison - uchinchison
                mainjavob = javob
                variantlar(javob)
            }

            4 -> {
                birinchison = ms1.random()
                ikkinchison = ms1.random()
                uchinchison = ms1.random()
                tortinchison = ms1.random()
                test = "$birinchison+$ikkinchison-$uchinchison+$tortinchison"
                javob = birinchison + ikkinchison - uchinchison + tortinchison
                mainjavob = javob
                variantlar(javob)
            }
            5 -> {
                birinchison = ms1.random()
                ikkinchison = ms1.random()
                uchinchison = ms1.random()
                tortinchison = ms1.random()
                beshinchison = ms1.random()
                test = "$birinchison+$ikkinchison-$uchinchison+$tortinchison-$beshinchison"
                javob = birinchison + ikkinchison - uchinchison + tortinchison - beshinchison
                mainjavob = javob
                variantlar(javob)
            }

            else -> {
                Toast.makeText(requireActivity(), "Dasturiy xatolik", Toast.LENGTH_SHORT).show()
            }

        }
        binding.savoltxt.text = test

    }


    private fun variantlar(tjavob: Int) {

        var list = ArrayList<Int>()
        var boshlanish = tjavob - 9
        var tugash = tjavob + 9
        for (i in boshlanish..tugash) {
            list.add(i)
        }
        val remove = list.remove(tjavob)
        if (remove) {
            var javob2 = list.random()
            list.remove(javob2)
            var javob3 = list.random()
            javobjoylash(tjavob, javob2, javob3)
        }

    }

    private fun javobjoylash(javob1: Int, javob2: Int, javob3: Int) {
        var ms = arrayListOf(javob1, javob2, javob3)
        var bir = ms.random()
        ms.remove(bir)
        var ikki = ms.random()
        ms.remove(ikki)
        var uch = ms.random()

        binding.variant1txt.text = bir.toString()
        binding.variant2txt.text = ikki.toString()
        binding.variant3txt.text = uch.toString()
    }

    private fun overfunction() {
        viewLifecycleOwner.lifecycleScope.launch {

            var secunt=when(param1){
                "Oson"-> 80
                "O'rta"-> 60
                "Qiyin"->40
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
        requireActivity().supportFragmentManager.beginTransaction().replace(
            R.id.continer,
            NatijaFragment.newInstance(param1 = tjavoblarsoni.toString(), param2 = umumiyJavoblarsoni.toString())).commit()
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment TestFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TestFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
