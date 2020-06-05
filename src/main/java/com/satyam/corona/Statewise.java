package com.satyam.corona;

public class Statewise
{
    private String statenotes;

    private String recovered;

    private String deltadeaths;

    private String migratedother;

    private String deltarecovered;

    private String active;

    private String deltaconfirmed;

    private String state;

    private String statecode;

    private String confirmed;

    private String deaths;

    private String lastupdatedtime;

    public String getStatenotes ()
    {
        return statenotes;
    }

    public void setStatenotes (String statenotes)
    {
        this.statenotes = statenotes;
    }

    public String getRecovered ()
    {
        return recovered;
    }

    public void setRecovered (String recovered)
    {
        this.recovered = recovered;
    }

    public String getDeltadeaths ()
    {
        return deltadeaths;
    }

    public void setDeltadeaths (String deltadeaths)
    {
        this.deltadeaths = deltadeaths;
    }

    public String getMigratedother ()
    {
        return migratedother;
    }

    public void setMigratedother (String migratedother)
    {
        this.migratedother = migratedother;
    }

    public String getDeltarecovered ()
    {
        return deltarecovered;
    }

    public void setDeltarecovered (String deltarecovered)
    {
        this.deltarecovered = deltarecovered;
    }

    public String getActive ()
    {
        return active;
    }

    public void setActive (String active)
    {
        this.active = active;
    }

    public String getDeltaconfirmed ()
    {
        return deltaconfirmed;
    }

    public void setDeltaconfirmed (String deltaconfirmed)
    {
        this.deltaconfirmed = deltaconfirmed;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getStatecode ()
    {
        return statecode;
    }

    public void setStatecode (String statecode)
    {
        this.statecode = statecode;
    }

    public String getConfirmed ()
    {
        return confirmed;
    }

    public void setConfirmed (String confirmed)
    {
        this.confirmed = confirmed;
    }

    public String getDeaths ()
    {
        return deaths;
    }

    public void setDeaths (String deaths)
    {
        this.deaths = deaths;
    }

    public String getLastupdatedtime ()
    {
        return lastupdatedtime;
    }

    public void setLastupdatedtime (String lastupdatedtime)
    {
        this.lastupdatedtime = lastupdatedtime;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [statenotes = "+statenotes+", recovered = "+recovered+", deltadeaths = "+deltadeaths+", migratedother = "+migratedother+", deltarecovered = "+deltarecovered+", active = "+active+", deltaconfirmed = "+deltaconfirmed+", state = "+state+", statecode = "+statecode+", confirmed = "+confirmed+", deaths = "+deaths+", lastupdatedtime = "+lastupdatedtime+"]";
    }
}


