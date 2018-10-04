package payu.android.sushil.com.payu_test;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kumars28 on 12-08-2017.
 */

public class ProjectsVo {

    @SerializedName("s.no")
    private String sNo;
    @SerializedName("amt.pledged")
    private String amountPledged;
    private String blurb;
    private String by;
    private String country;
    private String currency;
    @SerializedName("end.time")
    private String endTime;
    private String location;
    @SerializedName("percentage.funded")
    private String percntFunded;
    @SerializedName("num.backers")
    private String numBackers;
    private String state;
    private String title;
    private String type;
    private String url;

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getAmountPledged() {
        return amountPledged;
    }

    public void setAmountPledged(String amountPledged) {
        this.amountPledged = amountPledged;
    }

    public String getBlurb() {
        return blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPercntFunded() {
        return percntFunded;
    }

    public void setPercntFunded(String percntFunded) {
        this.percntFunded = percntFunded;
    }

    public String getNumBackers() {
        return numBackers;
    }

    public void setNumBackers(String numBackers) {
        this.numBackers = numBackers;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
