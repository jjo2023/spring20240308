package com.example.spring20240308.domain;

public class MyDto1 {

    // property명 : get/set 없애고 소문자로 시작
    private String name;

    private String homeAddress;

    private String MYHOME;

    private Boolean married;
    private boolean checked;


    // - - - - - - - - - - -
    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    // - - - - - - - - - - -
    public Boolean isMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    // - - - - - - - - - - -
    public String getMYHOME() {
        return MYHOME;
    }

    public void setMYHOME(String MYHOME) {
        this.MYHOME = MYHOME;
    }

    // - - - - - - - - - - -
    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    // - - - - - - - - - -
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
