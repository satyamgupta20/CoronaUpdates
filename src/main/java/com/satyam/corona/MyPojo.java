package com.satyam.corona;


public class MyPojo
{
    private Cases_time_series[] cases_time_series;

    private Tested[] tested;

    private Statewise[] statewise;

    public Cases_time_series[] getCases_time_series ()
    {
        return cases_time_series;
    }

    public void setCases_time_series (Cases_time_series[] cases_time_series)
    {
        this.cases_time_series = cases_time_series;
    }

    public Tested[] getTested ()
    {
        return tested;
    }

    public void setTested (Tested[] tested)
    {
        this.tested = tested;
    }

    public Statewise[] getStatewise ()
    {
        return statewise;
    }

    public void setStatewise (Statewise[] statewise)
    {
        this.statewise = statewise;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [cases_time_series = "+cases_time_series+", tested = "+tested+", statewise = "+statewise+"]";
    }
}


