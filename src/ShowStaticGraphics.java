// for static figures

import java.awt.*;

public class ShowStaticGraphics extends Canvas {
    int x;
    int y;
    int width;
    int height;

    public void paint(Graphics g){
        g.fillRect(x, y, width, height);
    }

    public ShowStaticGraphics(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
