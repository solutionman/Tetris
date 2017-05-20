import java.awt.*;

public class ShowSomeGraphics extends Canvas {

    private int x;
    private int y;
    private int width;
    private int height;
    private int FRAMEWIDTH;
    private int FRAMEHEIGHT;

    public ShowSomeGraphics() {

    }

    public ShowSomeGraphics(int x, int y, int width, int height, int FRAMEWIDTH, int FRAMEHEIGHT) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    public void paint(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    public void setX(int x) {

        if (this.x + x > 750) {
            this.x = 750;
        } else if (this.x + x < 0) {
            this.x = 0;
        } else {
            this.x = this.x + x;
        }
    }

    public void setY(int y) {
        if (this.y + y < 0) {
            this.y = 0;
        } else {
            this.y = this.y + y;
        }
    }
}
