package nl.qnh.qforce.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Main Object class of character in the star wars movies.
 *
 * @author jordi
 */
@JsonPropertyOrder({ "id", "name", "birth_year", "gender", "height", "weight", "movies", "url" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonModel implements Person{

    @JsonProperty("id")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("birth_year")
    private String birthYear;

    @JsonProperty("gender")
    private Gender gender;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("mass")
    private Integer weight;

    @JsonProperty("films")
    private List<String> moviesURLs;

    @JsonProperty("url")
    private String personalUrl;

    private List<Movie> movies;

    /**
     * empty constructor for serialization.
     */
    public PersonModel() {}

    /**
     * the constructor to create these characters
     *
     * @param id the unique id of the person
     * @param name the name of the person
     * @param birthYear the birth year of the person
     * @param gender the gender of the person
     * @param height the height of the person
     * @param weight the weight of the person
     * @param movies the movies the person has been in
     */
    public PersonModel(long id, String name, String birthYear, Gender gender, Integer height, Integer weight, List<String> moviesURLs, String personalUrl) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.moviesURLs = moviesURLs;
        this.personalUrl = personalUrl;
    }

    /**
     * Returns the unique id of the person.
     *
     * @return the unique id of the person
     */
    @Override
    public long getId() {
        return id;
    }

    /**
     * a setter for the id variable.
     * 
     * @param id the id of the person in the url path
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Retuns the name of the person.
     *
     * @return the name of the person
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Retuns the birth year of the person.
     *
     * @return the birth year of the person
     */
    @Override
    public String getBirthYear() {
        return birthYear;
    }

    /**
     * Retuns the gender of the person.
     *
     * @return the gender of the person
     */
    @Override
    public Gender getGender() {
        return gender;
    }

    /**
     * Retuns the height of the person in centimeters.
     *
     * @return the height of the person
     */
    @Override
    public Integer getHeight() {
        return height;
    }

    /**
     * Retuns the weight of the person in kilograms.
     *
     * @return the weight of the person
     */
    @Override
    public Integer getWeight() {
        return weight;
    }

    /**
     * Returns the movies the person has been in.
     *
     * @return the movies the person has been in
     */
    @Override
    public List<Movie> getMovies() {
        return movies;
    }

    /**
     * Puts all the movies in a list.
     *
     * @param movies list of movies it played in.
     */
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    /**
     * Puts all the movie urls in a list.
     *
     * @param moviesURLs list of movies it played in URL format.
     */
    public List<String> getMoviesURL() {
        return moviesURLs;
    }

    /**
     * Retuns the url of the person in String format.
     *
     * @return the url of the person
     */
    public String getPersonalUrl() {
        return personalUrl;
    }

    /**
     * converts the object to a string.
     *
     * @return String of object.
     */
    public String toString() {
        return "Person{" +
                "id = " + id +
                ", name =" + name +
                ", birthYear =" + birthYear +
                ", gender =" + gender +
                ", height =" + height +
                ", weight =" + weight +
                ", movies {" + movies +
                "}";
    }

}
