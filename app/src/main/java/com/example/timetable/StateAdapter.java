package com.example.timetable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Day> days;

    StateAdapter(Context context, List<Day> days) {
        this.days = days;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.day_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Day day = days.get(position);
        holder.number.setText(day.getNum());
        holder.lesson.setText(day.getName());
        holder.teacherName.setText(day.getTeacher());
    }

    @Override
    public int getItemCount() {
        return days.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView number;
        TextView lesson;
        TextView teacherName;
        ViewHolder(View view){
            super(view);
            number = view.findViewById(R.id.lesson_num);
            lesson = view.findViewById(R.id.lesson_name);
            teacherName = view.findViewById(R.id.lesson_teacher);
        }
    }
}