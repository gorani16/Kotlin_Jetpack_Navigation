package com.gorani.jetpack_navigation_1

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation

class BlankFragment1 : Fragment() {

    private var isDouble = false

    // Fragment1 에서 뒤로가기 버튼 2번 클릭 후 앱 종료.
    override fun onAttach(context: Context) {
        super.onAttach(context)

        val callback: OnBackPressedCallback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Log.d("BlankFragment5!!!", "Pressed!")
                if (isDouble) {
                    activity?.finish()
                }
                isDouble = true
                Toast.makeText(context, "종료하시려면 한번 더 누르세요", Toast.LENGTH_LONG).show()

                Handler().postDelayed({
                    isDouble = false
                }, 2000)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_blankFragment1_to_blankFragment2)
        }

    }

}