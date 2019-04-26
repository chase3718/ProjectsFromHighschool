// JavaScript Document
//noStroke();
var levels = 5; //Levels of the triangle
var scalar = 1; //Scales the shape (zoom)
var xPos = 0; //Translates the triangles
var yPos = 0; //Translates the triangles
var colorScalar = 1; //make >= oSize to make all triangles white;
var drawLevel = function(x,y,lNum,size) {
    fill(lNum*255/levels*colorScalar,lNum*255/levels*colorScalar,lNum*255/levels*colorScalar); //Changes color
    triangle(x,y,x+size,y,x+size/2,y+size*sqrt(3)/2); //Draws a triangle of the size size at the position (x,y)
    if (lNum > 1) {
        drawLevel(x+size/4,y-size*sqrt(3)/4,lNum-1,size/2); //If there are more levels, make more triangles
        drawLevel(x-size/4,y+size*sqrt(3)/4,lNum-1,size/2); //(And possibly even more levels)
        drawLevel(x+size*3/4,y+size*sqrt(3)/4,lNum-1,size/2);
    }
};
var keyPressed = function() {
    if (keyCode === UP) { //Up to increase zoom
        scalar *= 1.1;
    } else if (keyCode === DOWN) { //Down to decrease zoom
        scalar /= 1.1;
    } else if (keyCode === 32) { //Space to increase number of levels
        levels++;
    } else if (keyCode === 8) { //Backspace to decrease number of levels
        levels --;
    }
};
var mouseDragged = function() { //drag the mouse to move the object
    xPos += (mouseX-pmouseX)/scalar;
    yPos += (mouseY-pmouseY)/scalar;
};
var draw = function() {
    background(0, 0, 0);
    fill(0, 0, 0);
    triangle(scalar*(xPos),scalar*(yPos+400),scalar*(xPos+400),scalar*(yPos+400),scalar*(xPos+200),scalar*(yPos+400-200*sqrt(3))); //Original black triangle
    drawLevel(scalar*(100+xPos),scalar*(400-100*sqrt(3)+yPos),levels,scalar*200); //Starts drawing the white triangles
    fill(255, 0, 0);
    text("Levels: " + levels + "\nScalar: " + scalar,0,10);
};