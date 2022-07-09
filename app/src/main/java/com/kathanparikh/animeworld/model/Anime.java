package com.kathanparikh.animeworld.model;

/**
 * Anime model class
 */
public class Anime {
    private String animeId;
    private String animeName;
    private String animeDescription;
    private String animeSeasons;
    private int animeBannerImage;
    private int animeSmallImage;
    private double animePrice;
    private float animeRating;
    private int animeReleaseYear;

    public Anime(String animeId, String animeName, String animeDescription, String animeSeasons, int animeBannerImage, int animeSmallImage, double animePrice, float animeRating, int animeReleaseYear) {
        this.animeId = animeId;
        this.animeName = animeName;
        this.animeDescription = animeDescription;
        this.animeSeasons = animeSeasons;
        this.animeBannerImage = animeBannerImage;
        this.animeSmallImage = animeSmallImage;
        this.animePrice = animePrice;
        this.animeRating = animeRating;
        this.animeReleaseYear = animeReleaseYear;
    }

    public String getAnimeId() {
        return animeId;
    }

    public void setAnimeId(String animeId) {
        this.animeId = animeId;
    }

    public String getAnimeName() {
        return animeName;
    }

    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    public String getAnimeDescription() {
        return animeDescription;
    }

    public void setAnimeDescription(String animeDescription) {
        this.animeDescription = animeDescription;
    }

    public String getAnimeSeasons() {
        return animeSeasons;
    }

    public void setAnimeSeasons(String animeSeasons) {
        this.animeSeasons = animeSeasons;
    }

    public int getAnimeBannerImage() {
        return animeBannerImage;
    }

    public void setAnimeBannerImage(int animeBannerImage) {
        this.animeBannerImage = animeBannerImage;
    }

    public int getAnimeSmallImage() {
        return animeSmallImage;
    }

    public void setAnimeSmallImage(int animeSmallImage) {
        this.animeSmallImage = animeSmallImage;
    }

    public double getAnimePrice() {
        return animePrice;
    }

    public void setAnimePrice(double animePrice) {
        this.animePrice = animePrice;
    }

    public float getAnimeRating() {
        return animeRating;
    }

    public void setAnimeRating(float animeRating) {
        this.animeRating = animeRating;
    }

    public int getAnimeReleaseYear() {
        return animeReleaseYear;
    }

    public void setAnimeReleaseYear(int animeReleaseYear) {
        this.animeReleaseYear = animeReleaseYear;
    }
}
