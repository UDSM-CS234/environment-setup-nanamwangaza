public class Assignment1 {
    //variable initialization

    //acceleration in metres per second squared
    private double a = -9.81;

    //time in seconds
    private int t = 10;

    //initial velocity in metres per second
    private double vi = 0;

    //initial position
    private double xi = 0;

    //new position
    private double xt = 0;

    public void calculatePosition() {

        System.out.println("*****POSITION OF AN OBJECT AFTER FALLING FOR 10 SECONDS*****");

        //formula..
        xt = 0.5 * (a * Math.pow(t,2)) +  vi*t + xi;
        System.out.println("The new position after\t" + t +"\tseconds =\t" + xt+"\tm");
    }

}