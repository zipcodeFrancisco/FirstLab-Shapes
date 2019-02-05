
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square brick;
    private Circle grass;
    private Triangle tree;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        int sizeBrick = 8;
        int separationHorizontalBrick = 10;
        int separationVerticalBrick = 20;
        int verticalOffset = 200 - sizeBrick;
        int horizontalOffset = 50;
        for(int j = 0; j < 5; j++){
            for(int i = 0; i < 15; i++){
                brick = new Square();
                brick.moveHorizontal(separationHorizontalBrick * (1)*i + horizontalOffset);
                brick.moveVertical(separationVerticalBrick * (-1)*j + verticalOffset);
                brick.changeSize(sizeBrick);
                brick.changeColor("red");
                brick.makeVisible();
            }
        }
        
        for(int j = 1; j < 6; j++){
            for(int i = 0; i < 15; i++){
                brick = new Square();
                brick.moveHorizontal(separationHorizontalBrick * (1)*i + horizontalOffset+6);
                brick.moveVertical(separationVerticalBrick * (-1)*j + verticalOffset+10);
                brick.changeSize(sizeBrick);
                brick.changeColor("red");
                brick.makeVisible();
            }
        }
        
        wall = new Square();
        wall.moveVertical(100);
        wall.moveHorizontal(0);
        wall.changeSize(56);
        wall.changeColor("white");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(150);
        wall.moveHorizontal(0);
        wall.changeSize(56);
        wall.changeColor("white");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(100);
        wall.moveHorizontal(199);
        wall.changeSize(55);
        wall.changeColor("white");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(150);
        wall.moveHorizontal(199);
        wall.changeSize(55);
        wall.changeColor("white");
        wall.makeVisible();
        
        
        for(int j = 0; j < 20; j++){
            for(int i = 0; i < 35; i++){
                grass = new Circle();
                grass.moveHorizontal((i * 15) + (j * 5) - 200);
                grass.moveVertical(200 + j * 5);
                grass.changeColor("green");
                grass.changeSize(4);
                grass.makeVisible();
            }
        }
        
        for(int i = 102; i < 200; i++){
        wall = new Square();
        wall.moveVertical(i);
        wall.moveHorizontal(55);
        wall.changeSize(1);
        wall.changeColor("black");
        wall.makeVisible();
        }
        
        // Door
        wall = new Square();
        wall.moveVertical(150);
        wall.moveHorizontal(125);
        wall.changeSize(50);
        wall.changeColor("black");
        wall.makeVisible();
        
        // Window Black
        wall = new Square();
        wall.moveVertical(125);
        wall.moveHorizontal(65);
        wall.changeSize(35);
        wall.changeColor("black");
        wall.makeVisible();
        // Window Black - White
        wall = new Square();
        wall.moveVertical(127);
        wall.moveHorizontal(67);
        wall.changeSize(31);
        wall.changeColor("white");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(129);
        wall.moveHorizontal(69);
        wall.changeSize(15);
        wall.changeColor("black");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(200);
        wall.moveHorizontal(50);
        wall.changeSize(1);
        wall.changeColor("black");
        wall.makeVisible();
        
        wall = new Square();
        wall.moveVertical(100);
        wall.moveHorizontal(50);
        wall.changeSize(1);
        wall.changeColor("blue");
        wall.makeVisible();
        
        /*
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();
        */
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        for(int i = 100; i < 300; i++){
            wall = new Square();
            wall.moveVertical(200);
            wall.moveHorizontal(i);
            wall.changeSize(1);
            wall.changeColor("black");
            wall.makeVisible();
        }
        for(int i = 0; i < 3; i++){ 
            window = new Square();
            window.changeColor("black");
            window.moveHorizontal(250);
            window.moveVertical(190 + (i * 10)*(-1) );
            window.makeVisible();
        }
        for(int i =0; i < 5; i++){
            tree = new Triangle();
            tree.changeSize(10 * i, 18 * i);
            tree.moveHorizontal(205);
            tree.moveVertical( 100 + i * 7 );
            tree.changeColor("green");
            tree.makeVisible();
        }
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
