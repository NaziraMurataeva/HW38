package com.example.urok38
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.urok38.databinding.FragmentBBinding

class FragmentB: Fragment(R.layout.fragment_b) {
    lateinit var bindingb: FragmentBBinding
    lateinit var listener: FragmentBListener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingb = FragmentBBinding.inflate(inflater, container, false)
        return bindingb.root

    }

    fun setNewText(text: String) {
        bindingb.tvfrom1.text = text
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            bindingb.btn2.setOnClickListener {
                val text = bindingb.etText2.text.toString()
                listener.setTextToFragmentA(text)
            }

        }

        override fun onAttach(context: Context) {
            super.onAttach(context)
            if (context is FragmentBListener) listener = context
        }

        companion object {
            const val TAG = "FragmentB"
        }

}
