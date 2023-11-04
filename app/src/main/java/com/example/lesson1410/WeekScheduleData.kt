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
                dayOfTheWeek = WeekDays.TUESDAY,
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
                dayOfTheWeek = WeekDays.WEDNESDAY,
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
            ),
            Week(
                dayOfTheWeek = WeekDays.THURSDAY,
                lessonAmount = 2,
                startsWith = 5,
                lessons = listOf<LessonData>(
                    LessonData(
                        timeStart = "15:00",
                        timeEnd = "16:30",
                        disciplineName = "Анал данных",
                        lecturerName = "Алюков",
                        lessonAudience = "132-а каб."
                    ),
                    LessonData(
                        timeStart = "16:40",
                        timeEnd = "18:10",
                        disciplineName = "Анал данных",
                        lecturerName = "Алюков",
                        lessonAudience = "А-13 каб."
                    )
                )
            ),
            Week(
                dayOfTheWeek = WeekDays.FRIDAY,
                lessonAmount = 1,
                startsWith = 5,
                lessons = listOf<LessonData>(
                    LessonData(
                        timeStart = "19:30",
                        timeEnd = "21:30",
                        disciplineName = "Фронтенд",
                        lecturerName = "Фронтендер",
                        lessonAudience = "дистант"
                    )
                )
            ),
            Week(
                dayOfTheWeek = WeekDays.SATURDAY,
                lessonAmount = 4,
                startsWith = 2,
                lessons = listOf<LessonData>(
                    LessonData(
                        timeStart = "9:40",
                        timeEnd = "11:10",
                        disciplineName = "Android",
                        lecturerName = "Никиточка",
                        lessonAudience = "132 каб."
                    ),
                    LessonData(
                        timeStart = "11:20",
                        timeEnd = "12:50",
                        disciplineName = "Android",
                        lecturerName = "Никиточка",
                        lessonAudience = "132 каб."
                    ),
                    LessonData(
                        timeStart = "13:15",
                        timeEnd = "14:45",
                        disciplineName = "Android",
                        lecturerName = "Никиточка",
                        lessonAudience = "132 каб."
                    ),
                    LessonData(
                        timeStart = "15:00",
                        timeEnd = "16:30",
                        disciplineName = "Android",
                        lecturerName = "Никиточка",
                        lessonAudience = "132 каб."
                    )
                )
            )
        )
}