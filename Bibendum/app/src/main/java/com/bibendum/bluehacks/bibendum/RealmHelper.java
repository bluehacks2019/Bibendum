package com.bibendum.bluehacks.bibendum;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {
    Realm realm;
    ArrayList<Habit> habitsInfo;
    public RealmHelper(Realm realm){
        this.realm = realm;
    }

    public void saveHabits(final Habit habit) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {

                Habit h =realm.copyToRealm(habit);

            }
        });
    }

    public ArrayList<Habit> retrieve() {
        ArrayList<Habit> habitDescriptions = new ArrayList<>();
        RealmResults<Habit> habits = realm.where(Habit.class).findAll();

        for (Habit h : habits) {
            Habit hToAdd = new Habit(h.getName(), h.getDuration(), h.getFrequency(), h.getStartDate());
            habitsInfo.add(hToAdd);
        }

        return habitsInfo;
    }
}
