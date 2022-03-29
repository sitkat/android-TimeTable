package com.example.timetable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Day> days = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        days.add(new Day (
                "Понедельник",
                "Нахимовский",
                ""));
        days.add(new Day (
                "1",
                "Системное программирование\nТехнология разработки и защиты баз данных",
                "О.В. Копылов\nГ.Ю. Волкова"));

        days.add(new Day (
                "2",
                "Разработка программных модулей",
                "А.А. Комаров"));

        days.add(new Day (
                "3",
                "Технология разработки программного обеспечения",
                "Л.А. Соколова"));

        days.add(new Day (
                "4",
                "Физическая культура",
                "А.В. Андрюков"));

        days.add(new Day (
                "",
                "",
                ""));

        days.add(new Day (
                "Вторник",
                "",
                ""));
        days.add(new Day (
                "1",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "2",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "3",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "4",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "5",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "6",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "",
                "",
                ""));

        days.add(new Day (
                "Среда",
                "",
                ""));
        days.add(new Day (
                "1",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "2",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "3",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "4",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "5",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "6",
                "ПРАКТИКА",
                ""));

        days.add(new Day (
                "",
                "",
                ""));

        days.add(new Day (
                "Четверг",
                "Нежинская",
                ""));
        days.add(new Day (
                "1",
                "Иностранный язык в профессиональной деятельности",
                "А.Д. Завьялова, А.Ю. Дымская"));

        days.add(new Day (
                "2",
                "Инструментальные средства разработки ПО",
                "Ю.В. Севастьянов"));

        days.add(new Day (
                "3",
                "Технология разработки и защиты баз данных",
                "Г.Ю. Волкова"));

        days.add(new Day (
                "4",
                "Разработка программных модулей",
                "А.Ю. Бушин"));

        days.add(new Day (
                "5",
                "Разработка мобильных приложений\nНет пары",
                "А.О. Лясников"));

        days.add(new Day (
                "",
                "",
                ""));

        days.add(new Day (
                "Пятница",
                "Нахимовский",
                ""));
        days.add(new Day (
                "1",
                "Системное программирование",
                "О.В. Копылов"));

        days.add(new Day (
                "2",
                "Технология разработки программного обеспечения\nИнструментальные средства разработки ПО",
                "Л.А. Соколова\nЮ.В. Севастьянов"));

        days.add(new Day (
                "3",
                "Разработка мобильных приложений",
                "А.О. Лясников"));

        days.add(new Day (
                "4",
                "Разработка программных модулей\nнет пары",
                "А.Ю. Бушин"));

        days.add(new Day (
                "",
                "",
                ""));

        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, days);
        recyclerView.setAdapter(adapter);
    }
}