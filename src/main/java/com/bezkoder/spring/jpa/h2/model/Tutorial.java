package com.bezkoder.spring.jpa.h2.model;

import jakarta.persistence.*;
/**
 * Entity class representing a Tutorial.
 * Annotated with JPA annotations to map to the corresponding database table.
 */
@Entity
@Table(name = "tutorials")
public class Tutorial {

    /**
     * Unique identifier for the tutorial.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Title of the tutorial.
     */
    @Column(name = "title")
    private String title;

    /**
     * Description of the tutorial.
     */
    @Column(name = "description")
    private String description;

    /**
     * Published status of the tutorial.
     */
    @Column(name = "published")
    private boolean published;

    /**
     * Default constructor required by JPA.
     */
    public Tutorial() {
        // Default constructor required by JPA.
    }

    /**
     * Parameterized constructor to create a new tutorial.
     *
     * @param title       Title of the tutorial.
     * @param description Description of the tutorial.
     * @param published   Published status of the tutorial.
     */
    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    /**
     * Getter method for retrieving the tutorial ID.
     *
     * @return ID of the tutorial.
     */
    public long getId() {
        return id;
    }

    /**
     * Getter method for retrieving the tutorial title.
     *
     * @return Title of the tutorial.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter method for updating the tutorial title.
     *
     * @param title New title for the tutorial.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for retrieving the tutorial description.
     *
     * @return Description of the tutorial.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for updating the tutorial description.
     *
     * @param description New description for the tutorial.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for retrieving the published status of the tutorial.
     *
     * @return Published status of the tutorial.
     */
    public boolean isPublished() {
        return published;
    }

    /**
     * Setter method for updating the published status of the tutorial.
     *
     * @param isPublished New published status for the tutorial.
     */
    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    /**
     * Override of the toString method to provide a string representation of the tutorial.
     *
     * @return String representation of the tutorial.
     */
    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }

}
