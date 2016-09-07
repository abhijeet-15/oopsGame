package Game;

import javax.imageio.ImageIO;
import java.io.IOException;

/**
 * Created by cerebro on 04/07/16.
 */
public class Player extends Element {
    public Player(int x, int y) {
        super(x, y, 72, 90);

        this.image = Resource.playerImage;
    }
    public  void jump(){
        if(this.y==365){
            Resource.jump.play();
            this.yVel=-20;
            this.yAcc=2;
        }
    }
}