package ru.geekbrains.notes20;

import java.util.ArrayList;
import java.util.List;

public class NotesRepositoryImpl implements NotesRepository{

    public static final NotesRepository INSTANCE = new NotesRepositoryImpl();

    @Override
    public List<Note> getNotes() {
        ArrayList<Note> notes = new ArrayList<>();
        notes.add(new Note("id1", "Title Note1", "https://pixabay.com/get/gf1ae51566c081788ae32a5d1315474075d95ecdfb736bb345f4971ca7e04dce111e451bfc401c18839e7f525c5fe7e3b_640.jpg"));
        notes.add(new Note("id2", "Title Note2", "https://pixabay.com/get/gb568c40b983685b9900f36d0d24b7bd1bfa53f6fe9c6e7f214e85fc8340bac23ca8f163fde29ed2f6e0dfb873b021742_640.jpg"));
        notes.add(new Note("id3", "Title Note3", "https://pixabay.com/get/gce4473bc53fe97090cdda980d44bb918944d7ad0b7640d1bbdae0b2223996c799a79b333dad7c9207c5259231ffff392_640.jpg"));
        notes.add(new Note("id4", "Title Note4", "https://pixabay.com/get/g981b291632efa2768e412416987814a213a779403e77f3164230e2ca8dda3638a4c3b266121d61504c39f6d10a241777_640.jpg"));
        return notes;
    }
}
