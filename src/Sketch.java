
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */
    Ball[] balls;
    Bubble[] bubbles;
    Snowflake[] snowflakes;
/*
    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;

    Bubble bub1;
    Bubble bub2;
    Bubble bub3;
    Bubble bub4;

    Snowflake snf1;
    Snowflake snf2;
    Snowflake snf3;
    Snowflake snf4;

*/
    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);
        
        balls = new Ball[]{new Ball(this), new Ball(this), new Ball(this, 200, 300, 100, color(200, 69, 52),10, 10), new Ball(this)};

        bubbles = new Bubble[]{new Bubble(this), new Bubble(this), new Bubble(this), new Bubble(this,100, 300, 10, 10, 100, color(24, 45, 199))};

        snowflakes = new Snowflake[]{new Snowflake(this), new Snowflake(this), new Snowflake(this), new Snowflake(this, 10, 10, 100, 200, 300, color(24, 45, 199))};
        
        /*
        b1 = new Ball(this);
        b2 = new Ball(this);
        b3 = new Ball(this, 200, 300, 100, color(200, 69, 52),10, 10);
        b4 = new Ball(this);

        bub1 = new Bubble(this);
        bub2 = new Bubble(this, 100, 300, 10, 10, 100, color(24, 45, 199));
        bub3 = new Bubble(this);
        bub4 = new Bubble(this);

        snf1 = new Snowflake(this, 10, 10, 100, 200, 300, color(24, 45, 199));
        snf2 = new Snowflake(this);
        snf3 = new Snowflake(this);
        snf4 = new Snowflake(this);
        */
    }

    public void draw() {
        background(100);

        balls[0].drawBall();
        balls[0].moveBall();
        balls[1].drawBall();
        balls[1].moveBall();
        balls[2].drawBall();
        balls[2].moveBall();
        balls[3].drawBall();
        balls[3].moveBall();

        bubbles[0].drawBubble();
        bubbles[0].moveBubble();
        bubbles[1].drawBubble();
        bubbles[1].moveBubble();
        bubbles[2].drawBubble();
        bubbles[2].moveBubble();
        bubbles[3].drawBubble();
        bubbles[3].moveBubble();

        snowflakes[0].drawSnowflake();
        snowflakes[0].moveSnowflake();
        snowflakes[1].drawSnowflake();
        snowflakes[1].moveSnowflake();
        snowflakes[2].drawSnowflake();
        snowflakes[2].moveSnowflake();
        snowflakes[3].drawSnowflake();
        snowflakes[3].moveSnowflake();
    }
        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */

        /*
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();

        bub1.drawBubble();
        bub1.moveBubble();
        bub2.moveBubble();
        bub2.drawBubble();
        bub3.moveBubble();
        bub3.drawBubble();
        bub4.moveBubble();
        bub4.drawBubble();

        snf1.drawSnowflake();
        snf1.moveSnowflake();
        snf2.moveSnowflake();
        snf2.drawSnowflake();
        snf3.moveSnowflake();
        snf3.drawSnowflake();
        snf4.moveSnowflake();
        snf4.drawSnowflake();
    }
      */
    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */
    public void mousePressed() {
      balls[0].stop();
      balls[1].stop();
      balls[2].stop();
      balls[3].stop();
    }

    public void mouseReleased() {
      balls[0].start();
      balls[1].start();
      balls[2].start();
      balls[3].start();
    }

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
