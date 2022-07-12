package com.intern.bangalore.model;

public class ReqDel {
    
    private String fName;
    private String lName;
    private String sex;
    private String cName;
    private int tSale;

    public ReqDel(String fName, String lName, String sex, String cName, int tSale) {
        this.fName = fName;
        this.lName = lName;
        this.sex = sex;
        this.cName = cName;
        this.tSale = tSale;
    }

    public ReqDel() {
        super();
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int gettSale() {
        return tSale;
    }

    public void settSale(int tSale) {
        this.tSale = tSale;
    }

    @Override
    public String toString() {
        return "ReqDel [cName=" + cName + ", fName=" + fName + ", lName=" + lName + ", sex=" + sex + ", tSale=" + tSale+ "]";
    }

    
    
}
