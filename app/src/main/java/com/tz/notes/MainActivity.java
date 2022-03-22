package com.tz.notes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotes;
    public static final ArrayList<Note> notes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewNotes = findViewById(R.id.recyclerViewNotes);
        if (notes.isEmpty()) {
            notes.add(new Note("Магазин", "Купить булку белого хлема", "Воскресенье", 1));
            notes.add(new Note("Мусор", "Вынести мусор", "Воскресенье", 3));
            notes.add(new Note("Магазин", "Купить булку белого хлема", "Понедельник", 1));
            notes.add(new Note("Барбершоп", "Сходить на стрижку бороды", "Вторник", 2));
            notes.add(new Note("Мусор", "Вынести мусор", "Среда", 3));
            notes.add(new Note("Магазин", "Купить булку белого хлема", "Воскресенье", 1));
            notes.add(new Note("Мусор", "Вынести мусор", "Воскресенье", 3));
            notes.add(new Note("Магазин", "Купить булку белого хлема", "Понедельник", 1));
            notes.add(new Note("Барбершоп", "Сходить на стрижку бороды", "Вторник", 2));
            notes.add(new Note("Мусор", "Вынести мусор", "Среда", 3));
        }
        NotesAdapter adapter = new NotesAdapter(notes);
        recyclerViewNotes.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewNotes.setAdapter(adapter);
    }

    public void onCLickAddNote(View view) {
        Intent intent = new Intent(this, AddNoteActivity.class);
        startActivity(intent);
    }
}