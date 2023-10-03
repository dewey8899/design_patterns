package com.dewey.design_patterns.type.structure.facade;

/**
 * @author dewey
 * @date 2023/10/3 18:39
 * @function 功能描述
 */
public class FacadePattern {
    public static void main(String[] args) {
        Servicer servicer = new Servicer();
        servicer.service();
    }
}
class Register{
    public void register(){
        System.out.println("挂号......");
    }
}
class Doctor{
    public void talk(){
        System.out.println("医生看病......");
    }
}
class Nurse{
    public void drawBlood(){
        System.out.println("护士抽血......");
    }
}
class Cashier{
    public void pay(){
        System.out.println("缴费......");
    }
}
class Servicer{
    private Register register = new Register();
    private Doctor doctor = new Doctor();
    private Nurse nurse = new Nurse();
    private Cashier cashier = new Cashier();
    public Servicer(){
        System.out.println("陪诊员负责完成所有看病业务");
    }
    private void register(){
        register.register();
    }
    private void talk(){
        doctor.talk();
    }
    private void drawBlood(){
        nurse.drawBlood();
    }
    private void pay(){
        cashier.pay();
    }
    public void service(){
        this.register();
        this.talk();
        this.drawBlood();
        this.pay();
    }

}