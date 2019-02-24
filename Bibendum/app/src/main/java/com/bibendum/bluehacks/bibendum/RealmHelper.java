package com.bibendum.bluehacks.bibendum;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {
    Realm realm;
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

    public ArrayList<Habit> retrieveHabits() {
        ArrayList<Habit> habitsInfos = new ArrayList<>();
        RealmResults<Habit> habits = realm.where(Habit.class).findAll();

        for (Habit h : habits) {
            Habit toAdd = new Habit(h.getName(),h.getDuration(),h.getFrequency(),h.getStartDate(),h.getTag());
            habitsInfos.add(h);
        }

        return habitsInfos;
    }

    public void deleteHabits(){
        RealmResults<Habit> habits = realm.where(Habit.class).findAll();
        realm.beginTransaction();
        habits.deleteAllFromRealm();
        realm.commitTransaction();
    }
}
