import processing.core.PApplet;

public class Main extends PApplet {
    public static final int DIAMETER = 15;
    public static final int HEIGHT = 768;
    public static final int WIDTH = 1024;

    private int[] xAxis;
    private int[] yAxis;

    public static void main(String[] args) {
        PApplet.main("Main", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        xAxis = new int[] {0, 0, 0, 0};
        yAxis = new int[] {HEIGHT/5, 2*HEIGHT/5, 3*HEIGHT/5, 4*HEIGHT/5};
    }

    @Override
    public void draw(){
        for(int i=0; i<4; i++){
            ellipse(xAxis[i], yAxis[i], 15, 15);
            xAxis[i]+=i+1;
        }
    }
}
