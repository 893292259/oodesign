package chapter1;

public class MidTank extends TankBase {
    public MidTank(){
        action = new MidAction();
        turrent = new MidTurrent();
    }
}
