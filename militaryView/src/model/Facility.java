package model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Mohammad on 9/22/2016.
 */
public class Facility implements Serializable {
    private static final long serialVersionUID = -1002501885708065689L;

    private Long id;

    private String displayName;

    private Long latitude;

    private Long longitude;

    private Integer width;

    private Integer height;

    private Date startDate;

    private Date endtDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndtDate() {
        return endtDate;
    }

    public void setEndtDate(Date endtDate) {
        this.endtDate = endtDate;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
