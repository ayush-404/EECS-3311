package model;

public class GreenViewInfo implements Observer{
    private final Subject subject;
    private String info;

    public GreenViewInfo(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void observe() {
        info = subject.notifyObserver(this);
        double feet = Double.parseDouble(info)/ 30.48;
        info = String.format("%.11f", feet)+ " ft";
    }

    public String getInfo() {
        return info;
    }
}
