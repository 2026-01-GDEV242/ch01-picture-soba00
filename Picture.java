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
 * this class represents a picture of a christmas tree with a two people
 * celebrating around it
 * 
 * 
 * @author Federico Cadavid Rojas
 * @version 2026.02.11
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
    private Circle land;
    private Circle hillTwo;
    private Circle sun;
    private Circle ballOne;
    private Circle ballTwo;
    private Circle ballThree;
    private Circle ballFour;
    private Circle ballFive;
    private Circle ballSix;
    private Circle ballSeven;
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
        ballFour = new Circle();
        ballFive = new Circle();
        ballSix = new Circle();
        ballSeven = new Circle();
        land = new Circle();
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
            
            //BUILD THE BACKGROUND
            //Setting up the sun:
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            //Setting up the land:
            land.changeColor("cyan");
            land.moveHorizontal(-2800);
            land.moveVertical(90);
            land.changeSize(5680);
            land.makeVisible();
                     
            //BUILD THE TREE AND PEOPLE
            //Setting up the tunk of the tree:
            //Trunk One
            trunkOne.changeColor("brown");
            trunkOne.moveHorizontal(-100);
            trunkOne.moveVertical(65);
            trunkOne.changeSize(20);
            trunkOne.makeVisible();
            //Trunk Two
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
            //Setting up Ornaments:
            //First
            ballOne.changeColor("yellow");
            ballOne.moveHorizontal(-17);
            ballOne.moveVertical(15);
            ballOne.changeSize(14);
            ballOne.makeVisible();
            //Second
            ballTwo.moveHorizontal(0); 
            ballTwo.moveVertical(39); 
            ballTwo.changeSize(10);
            ballTwo.makeVisible();
            //Third
            ballThree.changeColor("red");
            ballThree.moveHorizontal(-40);
            ballThree.moveVertical(42);
            ballThree.changeSize(10);
            ballThree.makeVisible();
            //Fourth
            ballFour.moveHorizontal(15);
            ballFour.moveVertical(90);
            ballFour.changeSize(10);
            ballFour.makeVisible();
            //Fifth
            ballFive.changeColor("red");
            ballFive.moveHorizontal(18);
            ballFive.moveVertical(66);
            ballFive.changeSize(10);
            ballFive.makeVisible();
            //Sixth
            ballSix.changeColor("red");
            ballSix.moveHorizontal(-55);
            ballSix.moveVertical(95);
            ballSix.changeSize(10);
            ballSix.makeVisible();
            //Seventh
            ballSeven.moveHorizontal(-35);
            ballSeven.moveVertical(65);
            ballSeven.changeSize(10);
            ballSeven.makeVisible();
            //Setting up the people:
            //Fella One
            fellaOne.changeSize(50,25);
            fellaOne.moveHorizontal(-100);
            fellaOne.moveVertical(50);
            fellaOne.makeVisible();
            //Fella Two
            fellaTwo.changeSize(50,25);
            fellaTwo.moveHorizontal(-25);
            fellaTwo.moveVertical(60);
            fellaTwo.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        land.changeColor("black");
        trunkOne.changeColor("black");
        trunkTwo.changeColor("black");
        treeLayerOne.changeColor("black");
        treeLayerTwo.changeColor("black");
        treeLayerThree.changeColor("black");
        sun.changeColor("white");
        ballOne.changeColor("white");
        ballTwo.changeColor("white");
        ballThree.changeColor("white");
        ballFour.changeColor("white");
        ballFive.changeColor("white");
        ballSix.changeColor("white");
        ballSeven.changeColor("white");
        fellaOne.changeColor("white");
        fellaTwo.changeColor("white");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        land.changeColor("cyan");
        trunkOne.changeColor("brown");
        trunkTwo.changeColor("brown");
        treeLayerOne.changeColor("green");
        treeLayerTwo.changeColor("green");
        treeLayerThree.changeColor("green");
        sun.changeColor("yellow");
        ballOne.changeColor("yellow");
        ballTwo.changeColor("blue");
        ballThree.changeColor("red");
        ballFour.changeColor("blue");
        ballFive.changeColor("red");
        ballSix.changeColor("red");
        ballSeven.changeColor("blue");
        fellaOne.changeColor("black");
        fellaTwo.changeColor("black");
    }
}
