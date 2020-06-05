package com.satyam.corona;

public class Global
{
    private String NewRecovered;

    private String NewDeaths;

    private String TotalRecovered;

    private String TotalConfirmed;

    private String NewConfirmed;

    private String TotalDeaths;

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

    @Override
    public String toString()
    {
        return "ClassPojo [NewRecovered = "+NewRecovered+", NewDeaths = "+NewDeaths+", TotalRecovered = "+TotalRecovered+", TotalConfirmed = "+TotalConfirmed+", NewConfirmed = "+NewConfirmed+", TotalDeaths = "+TotalDeaths+"]";
    }
}

