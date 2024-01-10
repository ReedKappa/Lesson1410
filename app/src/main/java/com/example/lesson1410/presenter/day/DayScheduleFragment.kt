package com.example.lesson1410.presenter.day

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lesson1410.WeekScheduleData
import com.example.lesson1410.data.LessonData
import com.example.lesson1410.databinding.FragmentDayScheduleBinding
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class DayScheduleFragment : Fragment() {

    private var binding: FragmentDayScheduleBinding? = null
    private var adapter = DayItemAdapter()


    val lessons = mutableListOf<LessonData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.myFirstRecycler?.adapter = this.adapter
        binding?.myFirstRecycler?.layoutManager = LinearLayoutManager(requireContext())
        lessons.addAll(WeekScheduleData.list[getDay()].lessons)
        changeFlagOfCurrentLesson()
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

    private fun getDay(): Int {
        val calendar: Calendar = Calendar.getInstance()
        val day = calendar.get(Calendar.DAY_OF_WEEK)
        return when (day) {
            Calendar.SUNDAY -> 6
            Calendar.MONDAY -> 0
            Calendar.TUESDAY -> 1
            Calendar.WEDNESDAY -> 2
            Calendar.THURSDAY -> 3
            Calendar.FRIDAY -> 4
            Calendar.SATURDAY -> 5
            else -> {
                -1
            }
        }
    }

    private fun getTime(): String {
        val dateFormat = SimpleDateFormat("HH:mm")
        return dateFormat.format(Date())
    }

    private fun changeFlagOfCurrentLesson() {
        val curTime = getTime().split(":")
        for (elem in lessons) {
            val splitElemTimeStart = elem.timeStart.split(":")
            val splitElemTimeEnd = elem.timeEnd.split(":")
            //СЮДА ЛУЧШЕ НЕ СМОТРЕТЬ)))
            if (curTime[0].toInt() >= splitElemTimeStart[0].toInt()) {
                if (curTime[0].toInt() == splitElemTimeEnd[0].toInt()) {
                    if (curTime[1].toInt() < splitElemTimeEnd[1].toInt()) {
                        elem.isCurrentLesson = true
                    } else continue
                } else if (curTime[1].toInt() > splitElemTimeStart[1].toInt()) {
                    elem.isCurrentLesson = true
                } else if (curTime[0].toInt() < splitElemTimeEnd[0].toInt()) {
                    elem.isCurrentLesson = true
                } else continue
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DayScheduleFragment()
    }
}