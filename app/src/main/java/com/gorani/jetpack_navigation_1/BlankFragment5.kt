package com.gorani.jetpack_navigation_1

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation

/**
 * 1. Fragment 5 에서 Back Button 을 눌렀을 때 Fragment 1 로 이동하기.
 * => onAttach 에서 Back Button Callback 을 사용하여 Back Button 을 눌렀을 때 발생하는 이벤트에 5 -> 1 로 이동하는 코드 작성.
 * 5 -> 1 로 잘 이동은 되지만 5 <-> 1 구간에 갇히게 된다. 이를 해결하기 위해서는 다음을 수행한다.
 * 또한 원하는 것은 5 -> 1 로 이동한 뒤에 1 에서 Back Button 을 누르면 종료되는 것이다.
 * 1 방법으로는 해결할 수 없다.
 *
 * 2. navigation > Design 탭 에서 4 -> 5 로 가는 구간의 화살표를 클릭한다.
 * 우측의 Attributes 탭 > Pop Behavior 탭 > popUpTo 옵션 > blankFragment1 을 선택
 * => 1 -> 2 -> 3 -> 4 -> 5 도달한 후 Back Button 을 클릭 시 1 로 이동되며 한번 더 Back Button 을 누르면 앱이 종료된다.
 *
 */

class BlankFragment5 : Fragment() {

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//
//        val callback: OnBackPressedCallback  = object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                Log.d("BlankFragment5!!!", "Pressed!")
//                view?.let {
//                    Navigation.findNavController(it).navigate(R.id.action_blankFragment5_to_blankFragment1)
//                }
//            }
//        }
//        requireActivity().onBackPressedDispatcher.addCallback(this, callback)
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}