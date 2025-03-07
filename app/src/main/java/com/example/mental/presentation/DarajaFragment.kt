package com.example.mental.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.example.mental.R
import com.example.mental.databinding.FragmentDarajaBinding
import com.example.mental.databinding.FragmentTestBinding
import com.example.mental.domein.recyclerobject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
/**
 * A simple [Fragment] subclass.
 * Use the [DarajaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DarajaFragment : Fragment() {
    lateinit var binding: FragmentDarajaBinding
    lateinit var adabter:RecAdapter
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
            FragmentDarajaBinding.inflate(LayoutInflater.from(container?.context), container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var list = listOf(
            "1-boshqich",
            "2-boshqich",
            "3-boshqich",
            "4-boshqich",
            "5-boshqich",
            "6-boshqich",
            "7-boshqich",
            "8-boshqich",
            "9-boshqich",
            "10-Mini Game",
            "11-boshqich",
            "12-boshqich",
            "13-boshqich",
            "14-boshqich",
            "15-boshqich",
            "16-boshqich",
            "17-boshqich",
            "18-boshqich",
            "19-boshqich",
            "20-Mini Game",
            "21-boshqich",
            "22-boshqich",
            "23-boshqich",
            "24-boshqich",
            "25-boshqich",
            "26-boshqich",
            "27-boshqich",
            "28-boshqich",
            "29-boshqich",
            "30-Mini Game",
            "31-boshqich",
            "32-boshqich",
            "33-boshqich",
            "34-boshqich",
            "35-boshqich",
            "36-boshqich",
            "37-boshqich",
            "38-boshqich",
            "39-boshqich",
            "40-Mini Game",
            "41-boshqich",
            "42-boshqich",
            "43-boshqich",
            "44-boshqich",
            "45-boshqich",
            "46-boshqich",
            "47-boshqich",
            "48-boshqich",
            "49-boshqich",
            "50-Mini Game",
            "51-boshqich",
            "52-boshqich",
            "53-boshqich",
            "54-boshqich",
            "55-boshqich",
            "56-boshqich",
            "57-boshqich",
            "58-boshqich",
            "59-boshqich",
            "60-Mini Game",
            "61-boshqich",
            "62-boshqich",
            "63-boshqich",
            "64-boshqich",
            "65-boshqich",
            "66-boshqich",
            "67-boshqich",
            "68-boshqich",
            "69-boshqich",
            "70-Mini Game",
            "71-boshqich",
            "72-boshqich",
            "73-boshqich",
            "74-boshqich",
            "75-boshqich",
            "76-boshqich",
            "77-boshqich",
            "78-boshqich",
            "79-boshqich",
            "80-Mini Game",
            "81-boshqich",
            "82-boshqich",
            "83-boshqich",
            "84-boshqich",
            "85-boshqich",
            "86-boshqich",
            "87-boshqich",
            "88-boshqich",
            "89-boshqich",
            "90-Mini Game",
            "91-boshqich",
            "92-boshqich",
            "93-boshqich",
            "94-boshqich",
            "95-boshqich",
            "96-boshqich",
            "97-boshqich",
            "98-boshqich",
            "99-boshqich",
            "100-Mini Game")
        adabter = RecAdapter(list)
        binding.recyclerid.adapter = adabter

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DarajaFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DarajaFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}