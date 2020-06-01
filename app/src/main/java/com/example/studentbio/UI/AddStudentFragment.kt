package com.example.studentbio.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

import com.example.studentbio.R
import kotlinx.android.synthetic.main.fragment_add_student.*

/**
 * A simple [Fragment] subclass.
 */
class AddStudentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_student, container, false)
    }
    //create activity - override onActivityCreated
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fABDone.setOnClickListener {
            val action= AddStudentFragmentDirections.actionSaveNote()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
