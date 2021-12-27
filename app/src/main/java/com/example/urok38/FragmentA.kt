package com.example.urok38

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.urok38.databinding.FragmentABinding


class FragmentA : Fragment(R.layout.fragment_a){
    lateinit var binding: FragmentABinding
    lateinit var listener: FragmentAListener
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }
     fun setNewText(text: String){
         binding.tvfrom2.text = text
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btn1.setOnClickListener {
            val text =  binding.etText1.text.toString()
            listener.setTextToFragmentB(text)

        }

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is FragmentAListener)listener = context
    }


    companion object {
      const val TAG = "FragmentA"
    }
}