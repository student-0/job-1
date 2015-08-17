//// Job #2:  make zoog move.
//// Add your code where indicated below with +++

////  GLOBAL DATA ////
float x, y;

////  SETUP:  screen size. //
void setup() {
  size(600,400 );
  // Start at center //
  x=  width/2;
  y=  height/2;
}

////  NEXT FRAME:  create scene, move and draw zoog.  //
void draw() {
  //// Scene:  sky, sun, grass.
  background( 100,150,200 );
  //++++  sun is yellow circle
  //++++  grass is gree rectangle 
  //// Move zoog.
  x=  x + 3;
  y=  y + 2;
  //// Draw zoog.
  fill( 255,0,0 );
  rect( x,y, 30,50 );               // body
  ellipse( x+15, y-10, 20,20 );     // head
  //++++ add more zoog code, below.
}

////  HANDLE CLICKS ////
void mousePressed() {
  x=  mouseX;
  y=  mouseY;
}


