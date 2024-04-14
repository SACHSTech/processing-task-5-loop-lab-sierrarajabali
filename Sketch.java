import processing.core.PApplet;

/**
 * Draws seven different colors of stickman and hearts between
 * @author Sierra Rajabali
 */
public class Sketch extends PApplet {


  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    size(800, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    // Using the methods and different colors to draw the stick men and hearts out
    stroke(238, 7, 5);
    rowMan(0);
    stroke(230, 137, 15);
    rowMan(50);
    stroke(222, 230, 9);
    rowMan(100);
    stroke(59, 160, 43);
    rowMan(150);
    stroke(0, 103, 171);
    rowMan(200);
    stroke(0, 19, 223);
    rowMan(250);
    stroke(137, 0, 224);
    rowMan(300);


  // drawing out the hearts
  for (int y = 1; y < 7; y++) {
    int xBalance = (y % 2) * 50; // Calculate balance once per row
    for (int x = 50; x < 700; x += 100) {
        drawHeart(x + xBalance, y * 50);
    }
  }
}
  /**
   * Draws 15 stickmen in a row where the y-coordinate is put.
   * @param y y-coordinates of row
   * @author Sierra Rajabali
   */
  private void rowMan(int y) {
    for(int x = 0; x < 750; x += 50){
      drawMan(x, y);
    }
  }

  /**
   * Draws a stickman at specified coordinates.
   * @param x  x-coordinate for the stickman
   * @param y  y-coordinate for the stickman
   * @author J. Lau
   */

   private void drawMan(int x, int y) {
    int baseX = 50 + x;
    int baseY = y;

    fill(210, 255, 173); // set color for the stick figure
    line(baseX, 40 + baseY, baseX, 55 + baseY); // body of figure
    line(baseX, 55 + baseY, 60 + x, 65 + baseY); // right leg
    line(baseX, 55 + baseY, 40 + x, 65 + baseY); // left leg
    ellipse(baseX, 30 + baseY, 15, 15); // head of stick figure
    line(baseX, 50 + baseY, 60 + x, 40 + baseY); // right arm
    line(baseX, 50 + baseY, 40 + x, 40 + baseY); // left arm
}

  /**
   * Draws a heart out
   * @param x x-coordinates of where heart is drawn + 17
   * @param y y-coordinates of where heart is drawn + 10
   * @author Sierra Rajabali
   */
  private void drawHeart(int x, int y) {
    stroke(0); // outline
    fill(0); // set fill black
    triangle(17 + x, 10 + y, 25 + x, 20 + y, 33 + x, 10 + y);
    triangle(17 + x, 10 + y, 21 + x, 5 + y, 25 + x, 10 + y);
    triangle(25 + x, 10 + y, 29 + x, 5 + y, 33 + x, 10 + y);
  }
}