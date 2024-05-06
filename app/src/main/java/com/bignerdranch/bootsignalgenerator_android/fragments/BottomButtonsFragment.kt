package com.bignerdranch.bootsignalgenerator_android.fragments

import PoolActivity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.bignerdranch.bootsignalgenerator_android.R

class BottomButtonsFragment : Fragment() {

    private lateinit var buttonPool: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_buttons_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPool = view.findViewById(R.id.button_pool)

        buttonPool.setOnClickListener {
            val intent = Intent(requireActivity(), PoolActivity::class.java)
            startActivity(intent)
        }
    }
}