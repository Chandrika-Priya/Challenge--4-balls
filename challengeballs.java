import processing.core.PApplet;
public class challengeballs extends PApplet {
    int w=1,x=1,y=1,z=1;
    public static final int WIDTH = 1000;
    public static final int HEIGHT =1000;
    public static void main(String[] args) {
        PApplet.main("challengeballs",args);
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void  setup(){
    }
    @Override
    public void draw(){
        drawCricle1();
        drawCricle2();
        drawCricle3();
        drawCricle4();
    }
    public void drawCricle1()
    {
        ellipse(w,HEIGHT/5,20,20);
        w += 1;
    }
    public void  drawCricle2()
    {
        ellipse(x,2*(HEIGHT/5),20,20);
        x += 2;
    }
    public void drawCricle3()
    {
        ellipse(y,3*(HEIGHT/5),20,20);
        y += 3;
    }
    public void drawCricle4(){
        ellipse(z,4*(HEIGHT/5),20,20);
        z += 4;
    }
}
