package com.example.lesson1410.presenter.day

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson1410.WeekScheduleData
import com.example.lesson1410.data.LessonData
import com.example.lesson1410.data.PersonData
import com.example.lesson1410.databinding.FragmentDayScheduleBinding

class DayScheduleFragment: Fragment() {

    private var binding: FragmentDayScheduleBinding? = null
    private var adapter = DayItemAdapter()

    val lessons = mutableListOf<LessonData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.myFirstRecycler?.adapter = this.adapter
        binding?.myFirstRecycler?.layoutManager = LinearLayoutManager(requireContext())
        lessons.addAll(WeekScheduleData.list[1].lessons)
        adapter?.submitList(lessons)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDayScheduleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DayScheduleFragment()
    }
}