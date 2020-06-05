package com.satyam.corona;


public class Cases_time_series
{
    private String date;

    private String dailyrecovered;

    private String totalconfirmed;

    private String totaldeceased;

    private String dailydeceased;

    private String totalrecovered;

    private String dailyconfirmed;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getDailyrecovered ()
    {
        return dailyrecovered;
    }

    public void setDailyrecovered (String dailyrecovered)
    {
        this.dailyrecovered = dailyrecovered;
    }

    public String getTotalconfirmed ()
    {
        return totalconfirmed;
    }

    public void setTotalconfirmed (String totalconfirmed)
    {
        this.totalconfirmed = totalconfirmed;
    }

    public String getTotaldeceased ()
    {
        return totaldeceased;
    }

    public void setTotaldeceased (String totaldeceased)
    {
        this.totaldeceased = totaldeceased;
    }

    public String getDailydeceased ()
    {
        return dailydeceased;
    }

    public void setDailydeceased (String dailydeceased)
    {
        this.dailydeceased = dailydeceased;
    }

    public String getTotalrecovered ()
    {
        return totalrecovered;
    }

    public void setTotalrecovered (String totalrecovered)
    {
        this.totalrecovered = totalrecovered;
    }

    public String getDailyconfirmed ()
    {
        return dailyconfirmed;
    }

    public void setDailyconfirmed (String dailyconfirmed)
    {
        this.dailyconfirmed = dailyconfirmed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", dailyrecovered = "+dailyrecovered+", totalconfirmed = "+totalconfirmed+", totaldeceased = "+totaldeceased+", dailydeceased = "+dailydeceased+", totalrecovered = "+totalrecovered+", dailyconfirmed = "+dailyconfirmed+"]";
    }
}

