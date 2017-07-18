package com.example.android.newsapp;

/**
 * {@link News} represents a single News object.
 * Each object has 5 properties: title, section name, date, url
 */
public class News {

    // News title
    private String mNewsTitle;

    /**
     * News section name
     */
    private String mSectionName;

    // News date
    private String mDate;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param vNewsTitle   is the news title
     * @param vSectionName is the name of the section which the news is part of
     * @param vDate        is the date when the news was published
     * @param vUrl         in the link to get more info about the news
     */
    public News(String vNewsTitle, String vSectionName, String vDate, String vUrl) {
        mNewsTitle = vNewsTitle;
        mSectionName = vSectionName;
        mDate = vDate;
        mUrl = vUrl;
    }

    /**
     * Get the title of the news
     */
    public String getNewsTitle() {
        return mNewsTitle;
    }

    /**
     * Get the name of the section
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the date when the website was published.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }
}
