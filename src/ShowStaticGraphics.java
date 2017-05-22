// for static figures

import java.awt.*;

public class ShowStaticGraphics extends Canvas {
    int x;
    int y;

    public void paint(Graphics g){
        g.fillRect(400, 400, 50, 50);
    }

    public ShowStaticGraphics(int x, int y){
        this.x = x;
        this.y = y;
    }

}
