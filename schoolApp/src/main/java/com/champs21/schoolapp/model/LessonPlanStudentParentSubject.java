package com.champs21.schoolapp.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by BLACK HAT on 08-Apr-15.
 */
public class LessonPlanStudentParentSubject {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}
