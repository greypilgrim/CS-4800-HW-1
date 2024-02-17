package Q3;

public class Instructor {
    private String instrFirstName, instrLastName, instrOfficeNum;

    public Instructor(String instrFirstName, String instrLastName, String instrOfficeNum){
        this.setFirstName(instrFirstName);
        this.setInstrLastName(instrLastName);
        this.setInstrOfficeNum(instrOfficeNum);
    }

    protected void setFirstName(String instrFirstName){
        this.instrFirstName = instrFirstName;
    }
    public String getInstrFirstName(){
        return this.instrFirstName;
    }
    protected void setInstrLastName(String instrLastName){
        this.instrLastName = instrLastName;
    }
    protected String getInstrLastName(){
        return this.instrLastName;
    }
    protected void setInstrOfficeNum(String instrOfficeNum){
        this.instrOfficeNum = instrOfficeNum;
    }
    protected String getInstrOfficeNum(){
        return this.instrOfficeNum;
    }
}
