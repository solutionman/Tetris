import java.awt.*;
import java.util.ArrayList;

public class ShowSomeGraphics extends Canvas {

    private int x;
    private int x1;
    private int y;
    private int y1;
    private int width;
    private int height;
    private ArrayList<Integer> oldX = new ArrayList();
    private ArrayList<Integer> oldY = new ArrayList();

    public ShowSomeGraphics() {

    }

    public ShowSomeGraphics(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public ShowSomeGraphics(int x, int x1, int y, int y1, int width, int height){
        this.x = x;
        this.x1 = x1;
        this.y = y;
        this.y1  = y1;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, width, height);

        if(oldY.size() != 0 && oldX.size() != 0){
            for(int i = 0; i < oldX.size(); ++i){
                g.fillRect(oldX.get(i), oldY.get(i), width, height);
            }

        }

    }

    public void setX(int x) {

        if (this.x + x > 800 - width) {
            this.x = 800 - width;
        } else if (this.x + x < 0) {
            this.x = 0;
        } else {
            this.x = this.x + x;
        }


    }


    public void setY(int y) {
        if (this.y + y < 0) {
            this.y = 0;
        } else if(this.y > 520){
            this.y = 520;
        } else {
            this.y = this.y + y;
        }


    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setOldX(int x){
        oldX.add(x);
    }

    public void setOldY(int y){
        oldY.add(y);
    }
}


