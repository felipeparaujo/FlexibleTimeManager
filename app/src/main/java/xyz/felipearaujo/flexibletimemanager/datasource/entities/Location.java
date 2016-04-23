package xyz.felipearaujo.flexibletimemanager.datasource.entities;

import com.hannesdorfmann.sqlbrite.objectmapper.annotation.Column;
import com.hannesdorfmann.sqlbrite.objectmapper.annotation.ObjectMappable;

import java.util.List;

@ObjectMappable
public class Location {
    public static final String TABLE_NAME = "Location";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";

    @Column(COL_ID) long mId;
    @Column(COL_NAME) String mName;

    private List<Rule> mRules;
    private List<Task> mTasks;
}
