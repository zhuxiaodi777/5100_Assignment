package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author judy
 */
public class EmployeeProfile {

    
   
    
    private String Name;
    private String EmployeeId;
    private String Age;
    private String Gender;
    private String StartDate;
    private String Level;
    private String TeamInfo;
    private String PositionTitle;
    private String CellPhoneNumber;
    private String EmailAddress;
    private String Photo;       

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }


    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeamInfo() {
        return TeamInfo;
    }

    public void setTeamInfo(String TeamInfo) {
        this.TeamInfo = TeamInfo;
    }

    public String getPositionTitle() {
        return PositionTitle;
    }

    public void setPositionTitle(String PositionTitle) {
        this.PositionTitle = PositionTitle;
    }

    public String getCellPhoneNumber() {
        return CellPhoneNumber;
    }

    public void setCellPhoneNumber(String CellPhoneNumber) {
        this.CellPhoneNumber = CellPhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }
    
    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }
    
    @Override
    public String toString() {
        
        return Name;
        
    }
    
}
