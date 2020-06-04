package com.satyam.corona;

public class Countries
{
    private String NewRecovered;

    private String NewDeaths;

    private String TotalRecovered;

    private String TotalConfirmed;

    private String Country;

    private String CountryCode;

    private String Slug;

    private String NewConfirmed;

    private String TotalDeaths;

    private String Date;

    public String getNewRecovered ()
    {
        return NewRecovered;
    }

    public void setNewRecovered (String NewRecovered)
    {
        this.NewRecovered = NewRecovered;
    }

    public String getNewDeaths ()
    {
        return NewDeaths;
    }

    public void setNewDeaths (String NewDeaths)
    {
        this.NewDeaths = NewDeaths;
    }

    public String getTotalRecovered ()
    {
        return TotalRecovered;
    }

    public void setTotalRecovered (String TotalRecovered)
    {
        this.TotalRecovered = TotalRecovered;
    }

    public String getTotalConfirmed ()
    {
        return TotalConfirmed;
    }

    public void setTotalConfirmed (String TotalConfirmed)
    {
        this.TotalConfirmed = TotalConfirmed;
    }

    public String getCountry ()
    {
        return Country;
    }

    public void setCountry (String Country)
    {
        this.Country = Country;
    }

    public String getCountryCode ()
    {
        return CountryCode;
    }

    public void setCountryCode (String CountryCode)
    {
        this.CountryCode = CountryCode;
    }

    public String getSlug ()
    {
        return Slug;
    }

    public void setSlug (String Slug)
    {
        this.Slug = Slug;
    }

    public String getNewConfirmed ()
    {
        return NewConfirmed;
    }

    public void setNewConfirmed (String NewConfirmed)
    {
        this.NewConfirmed = NewConfirmed;
    }

    public String getTotalDeaths ()
    {
        return TotalDeaths;
    }

    public void setTotalDeaths (String TotalDeaths)
    {
        this.TotalDeaths = TotalDeaths;
    }

    public String getDate ()
    {
        return Date;
    }

    public void setDate (String Date)
    {
        this.Date = Date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [NewRecovered = "+NewRecovered+", NewDeaths = "+NewDeaths+", TotalRecovered = "+TotalRecovered+", TotalConfirmed = "+TotalConfirmed+", Country = "+Country+", CountryCode = "+CountryCode+", Slug = "+Slug+", NewConfirmed = "+NewConfirmed+", TotalDeaths = "+TotalDeaths+", Date = "+Date+"]";
    }
}

