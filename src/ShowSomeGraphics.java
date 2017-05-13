import java.awt.*;

public class ShowSomeGraphics  extends Canvas {

    private int x;
    private int y;
    private int width;
    private int height;

    public ShowSomeGraphics(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics g){
        g.fillRect(x, y, width, height);
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}
