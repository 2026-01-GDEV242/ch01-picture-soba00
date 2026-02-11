/*
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

/**
 * this class represents a picture of a christmas tree with a few people
 * celebrating around it
 * 
 * 
 */
public class Picture
{
    private Square trunkOne;
    private Square trunkTwo;
    private Square window;
    private Triangle treeLayerOne;
    private Triangle treeLayerTwo;
    private Triangle treeLayerThree;
    private Circle hillOne;
    private Circle hillTwo;
    private Circle sun;
    private Circle ballOne;
    private Circle ballTwo;
    private Circle ballThree;
    private Person fellaOne;
    private Person fellaTwo;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        trunkOne = new Square();
        trunkTwo = new Square();
        window = new Square();
        treeLayerOne = new Triangle();
        treeLayerTwo = new Triangle();
        treeLayerThree = new Triangle();
        sun = new Circle();
        ballOne = new Circle();
        ballTwo = new Circle();
        ballThree = new Circle();
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
            //BUILD THE BACKGROUND-
            /*
            //Setting up the two hills that make up the background:
            //hill one
            hillOne.changeColor("yellow");
            hillOne.moveHorizontal(100);
            hillOne.moveVertical(-40);
            hillOne.changeSize(80);
            hillOne.makeVisible();
            //hill two
            hillOne.changeColor("yellow");
            hillOne.moveHorizontal(100);
            hillOne.moveVertical(-40);
            hillOne.changeSize(80);
            hillOne.makeVisible();
            */
            
            //setting up the sun
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            
            //
            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();
            //
            
            //BUILD THE TREE-
            //Setting up the tunk of the tree
            trunkOne.changeColor("brown");
            trunkOne.moveHorizontal(-100);
            trunkOne.moveVertical(65);
            trunkOne.changeSize(20);
            trunkOne.makeVisible();
            
            trunkTwo.changeColor("brown");
            trunkTwo.moveHorizontal(-100);
            trunkTwo.moveVertical(85);
            trunkTwo.changeSize(20);
            trunkTwo.makeVisible();
            
            //Setting up the layers of foliage:
            //Layer One
            treeLayerOne.changeSize(50, 130);
            treeLayerOne.moveHorizontal(10);
            treeLayerOne.moveVertical(10);
            treeLayerOne.makeVisible();
            //Layer Two
            treeLayerTwo.changeSize(40, 120);
            treeLayerTwo.moveHorizontal(10);
            treeLayerTwo.moveVertical(-10);
            treeLayerTwo.makeVisible();
            //Layer Three
            treeLayerThree.changeSize(30, 100);
            treeLayerThree.moveHorizontal(10);
            treeLayerThree.moveVertical(-25);
            treeLayerThree.makeVisible();
            //Ornaments
            //First
            ballOne.changeColor("yellow");
            ballOne.moveHorizontal(100);
            ballOne.moveVertical(-40);
            ballOne.changeSize(80);
            ballOne.makeVisible();
            //Second
            ballTwo.changeColor("yellow");
            ballTwo.moveHorizontal(100);
            ballTwo.moveVertical(-40);
            ballTwo.changeSize(80);
            ballTwo.makeVisible();
            //Third
            ballThree.changeColor("yellow");
            ballThree.moveHorizontal(100);
            ballThree.moveVertical(-40);
            ballThree.changeSize(80);
            ballThree.makeVisible();
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        /*
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        */
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        /*
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        */
    }
}
