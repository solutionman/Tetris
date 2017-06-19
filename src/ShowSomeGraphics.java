import java.awt.*;
import java.util.ArrayList;

public class ShowSomeGraphics extends Canvas {

    private int x;
    private int y;
    private int width;
    private int height;
    private ArrayList<Integer> oldX = new ArrayList<>();
    private ArrayList<Integer> oldY = new ArrayList<>();
    private ArrayList<Integer> oldWidth = new ArrayList<>();
    private ArrayList<Integer> oldHeight = new ArrayList<>();

    public ShowSomeGraphics() {

    }

    public ShowSomeGraphics(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, width, height);

        // debugging y changes, ok
        // System.out.println(y);

        if(oldY.size() != 0 && oldX.size() != 0){
            for(int i = 0; i < oldX.size(); ++i){
                g.fillRect(oldX.get(i), oldY.get(i), oldWidth.get(i), oldHeight.get(i));
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


    // for moving down
    public void setY(int y) {
        if (this.y + y < 0) {
            this.y = 0;
        } else if(this.y > 520){
            this.y = 520;
        } else {
            this.y = this.y + y;
        }

    }


    // Let's try to analyze the x coordinate - it almost works
    // shit, seems like  I need look at smallest, not biggest
    // somehow we have to get intersection
    public int getBiggestOldY(){
        int biggestOldY = 600;

        for(int i = 0; i < oldY.size(); ++i){
            //System.out.println(oldY.get(i));
            // the crossing with x coordinate is here

            // this intersection works only with complete matches of figures
            /*
            if(biggestOldY > oldY.get(i) && x == oldX.get(i)){
                biggestOldY = oldY.get(i);
            }
            */

            // well, this intersection is quite buggy
            // shit, seems like I need to the left divide the current width,
            // and to the right add the old width

            if (biggestOldY > oldY.get(i) && x > oldX.get(i) - this.width && x < oldX.get(i) + this.oldWidth.get(i) ){
                // for debugging
                int temp = oldX.get(i) - this.oldWidth.get(i);
                int temp2 = oldX.get(i) + this.oldWidth.get(i);
                System.out.println("x = " + x + "  oldX  = " + oldX.get(i) + "  oldX - oldWidth = " + temp + "  oldX + oldWidth " + temp2);

                biggestOldY = oldY.get(i);
                //System.out.println(biggestOldY);
            }

        }

        return biggestOldY;
    }


    public int getX(){
        return this.x;
    }

    public int getY(){
        // debugging - here ok too, wtf?
        //System.out.println(y);
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
        // for debugging
        for(int a : oldY){
            //System.out.println(a);
        }

    }

    public void setOldWidth(int width){
        this.oldWidth.add(width);
    }

    public void setOldHeight(int height){
        this.oldHeight.add(height);
    }

    public ArrayList<Integer> getOldY(){
        return oldY;
    }

}




