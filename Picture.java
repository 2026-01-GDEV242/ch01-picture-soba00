/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square trunk;
    private Square window;
    private Triangle treeLayerOne;
    private Triangle treeLayerTwo;
    private Triangle treeLayerThree;
    private Circle hillOne;
    private Circle hillTwo;
    private Circle sun;
    private Person fellaOne;
    private Person fellaTwo;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        trunk = new Square();
        window = new Square();
        treeLayerOne = new Triangle();
        treeLayerTwo = new Triangle();
        treeLayerThree = new Triangle();
        sun = new Circle();
        hillOne = new Circle();
        hillTwo = new Circle();
        fellaOne = new Person();
        fellaTwo = new Person();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            //Setting up the hills that make up the background:
            hillOne.changeColor("yellow");
            hillOne.moveHorizontal(100);
            hillOne.moveVertical(-40);
            hillOne.changeSize(80);
            hillOne.makeVisible();
            
            hillOne.changeColor("yellow");
            hillOne.moveHorizontal(100);
            hillOne.moveVertical(-40);
            hillOne.changeSize(80);
            hillOne.makeVisible();
            
            
            //Setting up the tunk of the tree
            trunk.moveHorizontal(-140);
            trunk.moveVertical(20);
            trunk.changeSize(120);
            trunk.makeVisible();
            //
            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();
            //
            treeLayerOne.changeSize(60, 180);
            treeLayerOne.moveHorizontal(20);
            treeLayerOne.moveVertical(-60);
            treeLayerOne.makeVisible();
            
            treeLayerTwo.changeSize(60, 180);
            treeLayerTwo.moveHorizontal(20);
            treeLayerTwo.moveVertical(-60);
            treeLayerTwo.makeVisible();
            
            treeLayerThree.changeSize(60, 180);
            treeLayerThree.moveHorizontal(20);
            treeLayerThree.moveVertical(-60);
            treeLayerThree.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
