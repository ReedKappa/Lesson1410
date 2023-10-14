package com.example.lesson1410.presenter.day

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson1410.data.PersonData
import com.example.lesson1410.databinding.FragmentDayScheduleBinding

class DayScheduleFragment: Fragment() {

    private var binding: FragmentDayScheduleBinding? = null
    private var adapter: PersonsAdapter? = null

    val persons = mutableListOf<PersonData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        for (i in 0 .. 10) {
            persons.add(PersonData("https://thispersondoesnotexist.com/", "Arseny Kachesov", "I love java"))
        }
        adapter = PersonsAdapter()
        binding?.myFirstRecycler?.adapter = adapter

        adapter?.submitList(persons)
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