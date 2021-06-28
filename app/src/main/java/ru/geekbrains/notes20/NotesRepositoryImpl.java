package ru.geekbrains.notes20;

import java.util.ArrayList;
import java.util.List;

public class NotesRepositoryImpl implements NotesRepository{

    public static final NotesRepository INSTANCE = new NotesRepositoryImpl();

    @Override
    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("id1", "Title Note1", "https://pixabay.com/images/id-2389219/"));
        notes.add(new Note("id2", "Title Note2", "https://pixabay.com/images/id-2389219/"));
        notes.add(new Note("id3", "Title Note3", "https://pixabay.com/images/id-2389219/"));
        notes.add(new Note("id4", "Title Note4", "https://pixabay.com/images/id-2389219/"));
        return notes;
    }
}
