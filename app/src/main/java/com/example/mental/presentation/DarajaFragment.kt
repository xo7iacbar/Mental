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
        binding.cardidoson.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, TestFragment.newInstance(param1 = "Oson", param2 = ""))
                .commit()
        }
        binding.cardidorta.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, TestFragment.newInstance(param1 = "O'rta", param2 = ""))
                .commit()
        }
        binding.cardidqiyin.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, TestFragment.newInstance(param1 = "Qiyin", param2 = ""))
                .commit()
        }
        binding.cardidgame.setOnClickListener {
            val dialog=AlertDialog.Builder(requireActivity()).create()
            dialog.setTitle("Prafilaktika")
            dialog.setMessage("Ushbu Mini oyin bo'limi prafilaktika jarayonida tez orada ushbu bo'lim ham qo'shiladi")
            dialog.show()

           /* requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, GameFragment.newInstance(param1 = "Game", param2 = ""))
                .commit()*/
        }
        binding.cardid5.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.continer, TestFragment.newInstance(param1 = "Oson", param2 = ""))
                .commit()
        }
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