package com.example.notes.notes_app.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "notes")
class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Note description not be empty")
    private String description;
    @NotBlank(message = "Note rate not be minus")
    private String rate;

    public Note(){

    }
    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(final String rate) {
        this.rate = rate;
    }


}
