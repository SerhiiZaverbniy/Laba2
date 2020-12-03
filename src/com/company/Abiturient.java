package com.company;

public class Abiturient {
    protected String id,surname, name,patronymic,address,phone;
    protected double bal;
    Abiturient()
    {
        id = " ";
        bal = 0;
        surname=" ";
        name=" ";
        patronymic=" ";
        address=" ";
        phone=" ";
    }
    public void setValueId(String x){
        id=x;
    }
    public void setValueName(String x){
        name=x;
    }
    public void setValueSurname(String x){
        surname=x;
    }
    public void setValuePatronymic(String x){
        patronymic=x;
    }
    public void setValuePhone(String x){
        phone=x;
    }
    public void setValueAddress(String x){
        address=x;
    }
    public void setValueBal(double x){
        bal=x;
    }
    public String getValueId(){
        return id;
    }
    public String getValueName(){
        return name;
    }
    public String getValueSurname(){
        return surname;
    }
    public String getValuePatronymic(){
        return patronymic;
    }
    public String getValuePhone() {
        return  phone;
    }
    public String getValueAddress() {
        return  address;
    }
    public double getValueBal() {
        return  bal;
    }
    public String toString(){
        return id+"|"+surname+"|"+name+"|"+patronymic+"|"+address+"|"+phone+"|"+bal;
    }
}
