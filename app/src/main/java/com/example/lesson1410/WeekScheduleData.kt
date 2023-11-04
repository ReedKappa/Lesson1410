package com.example.lesson1410

import com.example.lesson1410.data.LessonData
import com.example.lesson1410.data.Week
import com.example.lesson1410.data.WeekDays

object WeekScheduleData {
    val list
        get() = listOf<Week>(
        Week(
            dayOfTheWeek = WeekDays.MONDAY,
            lessonAmount = 0,
            lessons = listOf<LessonData>(

            ),
            startsWith = 0
        ),
        Week(
            dayOfTheWeek = WeekDays.WEDNESDAY,
            lessonAmount = 3,
            startsWith = 5,
            lessons = listOf<LessonData>(
                LessonData(
                    timeStart = "15:00",
                    timeEnd = "16:30",
                    disciplineName = "Экономика",
                    lecturerName = "Ткач",
                    lessonAudience = "304 каб."
                ),
                LessonData(
                    timeStart = "16:40",
                    timeEnd = "18:10",
                    disciplineName = "БД",
                    lecturerName = "БАРАБАН",
                    lessonAudience = "А-13 каб."
                ),
                LessonData(
                    timeStart = "18:20",
                    timeEnd = "19:50",
                    disciplineName = "БД",
                    lecturerName = "БАРАБАН",
                    lessonAudience = "А-13 каб."
                )
            )
        ),
        Week(
            dayOfTheWeek = WeekDays.THURSDAY,
            lessonAmount = 2,
            startsWith = 7,
            lessons = listOf<LessonData>(
                LessonData(
                    timeStart = "18:20",
                    timeEnd = "19:50",
                    disciplineName = "Управление",
                    lecturerName = "XQC и Точка банк",
                    lessonAudience = "200 каб."
                ),
                LessonData(
                    timeStart = "19:55",
                    timeEnd = "21:25",
                    disciplineName = "Управление",
                    lecturerName = "XQC и Точка банк",
                    lessonAudience = "200 каб."
                )
            )
        )
    )
}