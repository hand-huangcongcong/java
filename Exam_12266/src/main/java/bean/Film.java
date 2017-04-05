package bean;

import java.math.BigDecimal;
import java.sql.Date;

public class Film {
	private int film_id;
	private String title;
	private String description;
	private Date release_year;
	private byte language_id;
	private byte original_language_id;
	private byte rental_duration;
	private BigDecimal rental_rate;
	private Integer length;
	private BigDecimal replacement_cost;
	private Enum rating;
	private String special_features;
	private Date last_update;

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRelease_year() {
		return release_year;
	}

	public void setRelease_year(Date release_year) {
		this.release_year = release_year;
	}

	public byte getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(byte language_id) {
		this.language_id = language_id;
	}

	public byte getOriginal_language_id() {
		return original_language_id;
	}

	public void setOriginal_language_id(byte original_language_id) {
		this.original_language_id = original_language_id;
	}

	public byte getRental_duration() {
		return rental_duration;
	}

	public void setRental_duration(byte rental_duration) {
		this.rental_duration = rental_duration;
	}

	public BigDecimal getRental_rate() {
		return rental_rate;
	}

	public void setRental_rate(BigDecimal rental_rate) {
		this.rental_rate = rental_rate;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public BigDecimal getReplacement_cost() {
		return replacement_cost;
	}

	public void setReplacement_cost(BigDecimal replacement_cost) {
		this.replacement_cost = replacement_cost;
	}

	public Enum getRating() {
		return rating;
	}

	public void setRating(Enum rating) {
		this.rating = rating;
	}

	public String getSpecial_features() {
		return special_features;
	}

	public void setSpecial_features(String special_features) {
		this.special_features = special_features;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public Film(int film_id, String title, String description, Date release_year, byte language_id,
			byte original_language_id, byte rental_duration, BigDecimal rental_rate, Integer length,
			BigDecimal replacement_cost, Enum rating, String special_features, Date last_update) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.release_year = release_year;
		this.language_id = language_id;
		this.original_language_id = original_language_id;
		this.rental_duration = rental_duration;
		this.rental_rate = rental_rate;
		this.length = length;
		this.replacement_cost = replacement_cost;
		this.rating = rating;
		this.special_features = special_features;
		this.last_update = last_update;
	}

	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

}
