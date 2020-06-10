package com.haytham.coder.graduationproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.haytham.coder.graduationproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var dataBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        dataBinding= FragmentHomeBinding.inflate(inflater)

        val itemSpacing= resources.getDimension(R.dimen.students_list_half_spacing).toInt()
        dataBinding.studentsRecycler.apply {
            addItemDecoration(SpacesItemDecoration(itemSpacing))
            adapter= StudentsQuickAdapter().apply {
                val data= MutableList(100){" "}
                setNewInstance(data)
            }
        }
        return dataBinding.root
    }

}