package com.accp.domain;

public class Color {
    private Integer colorid;

    private String colorname;

    private String colorpicture;

    private Integer fatherid;

    public Integer getColorid() {
        return colorid;
    }

    public void setColorid(Integer colorid) {
        this.colorid = colorid;
    }

    public String getColorname() {
        return colorname;
    }

    public void setColorname(String colorname) {
        this.colorname = colorname;
    }

    public String getColorpicture() {
        return colorpicture;
    }

    public void setColorpicture(String colorpicture) {
        this.colorpicture = colorpicture;
    }

    public Integer getFatherid() {
        return fatherid;
    }

    public void setFatherid(Integer fatherid) {
        this.fatherid = fatherid;
    }
}