import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import ddf.minim.signals.*; 
import ddf.minim.*; 
import ddf.minim.analysis.*; 
import ddf.minim.effects.*; 
import javax.sound.sampled.*; 
import spacebrew.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class When_I_come_Home extends PApplet {










Minim minim;
AudioPlayer thrift;
AudioPlayer rapgod;
AudioPlayer shit;
AudioPlayer mario;
AudioPlayer billionaire;
AudioPlayer majestic;
AudioPlayer total;
AudioPlayer tennis;
AudioPlayer pterodactyl;
AudioPlayer pressure;
AudioPlayer royals;

String server="sandbox.spacebrew.cc";
String name="Oh Yes";
String description ="";


Spacebrew sb;


String local_string = "";
//String remote_string = "";
//String last_string = "";

public void setup() {
  size(300, 300);
  background(0);

  // instantiate the spacebrewConnection variable
  sb = new Spacebrew( this );

  // declare your publishers
  sb.addPublish( "Can You Dig It?", "string", local_string ); 

  // declare your subscribers
  sb.addSubscribe( "Music", "string" );

  // connect!
  sb.connect(server, name, description );

  minim = new Minim(this);
  thrift = minim.loadFile("Thrift.mp3");
  rapgod = minim.loadFile("Rap God.mp3");
  shit = minim.loadFile("know.mp3");
  mario = minim.loadFile("Mario.mp3");
  billionaire = minim.loadFile("Billionaire.mp3");
  majestic = minim.loadFile("Majestic.mp3");
  total = minim.loadFile("total.mp3");
  pterodactyl = minim.loadFile("pterodactyl.mp3");
  royals = minim.loadFile("royals.mp3");
  tennis = minim.loadFile("tennis.mp3");
  pressure = minim.loadFile("pressure.mp3");
}

public void draw() {
  background(0);
  fill(255);
  stroke(250);
}




public void onStringMessage( String name, String value ) {
  // println("got string message " + name + " : " + value);
  println(value);
  if (name.equals("Music") && value.equals("Thrift")) {
    thrift.play();
    rapgod.rewind();
    majestic.rewind();
    total.rewind();
    mario.rewind();
    shit.rewind();
    billionaire.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    rapgod.pause();
    majestic.pause();
    total.pause();
    mario.pause();
    shit.pause();
    billionaire.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
  }
  if (name.equals("Music") && value.equals("Total eclipse of the heart")) {
    total.play();
    rapgod.rewind();
    majestic.rewind();
    thrift.rewind();
    mario.rewind();
    shit.rewind();
    billionaire.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    rapgod.pause();
    majestic.pause();
    thrift.pause();
    mario.pause();
    shit.pause();
    billionaire.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
  }
  if (name.equals("Music") && value.equals("Rap god")) {
    rapgod.play();
    total.rewind();
    majestic.rewind();
    thrift.rewind();
    mario.rewind();
    shit.rewind();
    billionaire.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    total.pause();
    majestic.pause();
    thrift.pause();
    mario.pause();
    shit.pause();
    billionaire.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
  }
  if (name.equals("Music") && value.equals("Majestic")) {
    majestic.play();
    total.rewind();
    rapgod.rewind();
    thrift.rewind();
    mario.rewind();
    shit.rewind();
    billionaire.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    total.pause();
    rapgod.pause();
    thrift.pause();
    mario.pause();
    shit.pause();
    billionaire.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
  }
  if (name.equals("Music") && value.equals("Billionaire")) {
    billionaire.play();
    total.rewind();
    rapgod.rewind();
    thrift.rewind();
    mario.rewind();
    shit.rewind();
    majestic.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    total.pause();
    rapgod.pause();
    thrift.pause();
    mario.pause();
    shit.pause();
    majestic.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
  }
  if (name.equals("Music") && value.equals("Hey mario")) {
    mario.play();
    total.rewind();
    rapgod.rewind();
    thrift.rewind();
    billionaire.rewind();
    shit.rewind();
    majestic.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    total.pause();
    rapgod.pause();
    thrift.pause();
    billionaire.pause();
    shit.pause();
    majestic.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
  }
  if (name.equals("Music") && value.equals("I already know")) {
    shit.play();
    //rewind
    total.rewind();
    rapgod.rewind();
    thrift.rewind();
    billionaire.rewind();
    mario.rewind();
    majestic.rewind();
     tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
    pressure.rewind();
    //pause

    total.pause();
    rapgod.pause();
    thrift.pause();
    billionaire.pause();
    mario.pause();
    majestic.pause();
     tennis.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
   
  }
  if (name.equals("Music") && value.equals("Royals")) {
    royals.play();
        tennis.rewind();
    tennis.rewind();
    pressure.rewind();
      total.rewind();
    rapgod.rewind();
    thrift.rewind();
    billionaire.rewind();
    mario.rewind();
    majestic.rewind();
    shit.rewind();
    
    
    total.pause();
    rapgod.pause();
    thrift.pause();
    billionaire.pause();
    mario.pause();
    majestic.pause();
   tennis.pause();
    pterodactyl.pause();
    pressure.pause();
    shit.pause();
    
    
  }
  if (name.equals("Music") && value.equals("Tennis")) {
    tennis.play();
    pterodactyl.rewind();
    royals.rewind();
    pressure.rewind();
    total.rewind();
    rapgod.rewind();
    thrift.rewind();
    billionaire.rewind();
    mario.rewind();
    majestic.rewind();
    shit.rewind();
    
    total.pause();
    rapgod.pause();
    thrift.pause();
    billionaire.pause();
    mario.pause();
    majestic.pause();
    royals.pause();
    pterodactyl.pause();
    pressure.pause();
    shit.pause();
  }
  if (name.equals("Music") && value.equals("Mother fucking pterodactyl")) {
  pterodactyl.play();
      tennis.rewind();
    royals.rewind();
    pressure.rewind();
      total.rewind();
    rapgod.rewind();
    thrift.rewind();
    billionaire.rewind();
    mario.rewind();
    majestic.rewind();
    shit.rewind();
    
        total.pause();
    rapgod.pause();
    thrift.pause();
    billionaire.pause();
    mario.pause();
    majestic.pause();
   tennis.pause();
    royals.pause();
    pressure.pause();
    shit.pause();
  }
  if (name.equals("Music") && value.equals("Under pressure")) {
    pressure.play();
    tennis.rewind();
    royals.rewind();
    pterodactyl.rewind();
      total.rewind();
    rapgod.rewind();
    thrift.rewind();
    billionaire.rewind();
    mario.rewind();
    majestic.rewind();
    shit.rewind();
    
    tennis.pause();
    royals.pause();
    pterodactyl.pause();
      total.pause();
    rapgod.pause();
    thrift.pause();
    billionaire.pause();
    mario.pause();
    majestic.pause();
    shit.pause();
   
  }
}
public void stop() {

  shit.close();
  total.close();
  rapgod.close();
  thrift.close();
  billionaire.close();
  mario.close();
  majestic.close();
  minim.stop();
  super.stop();
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--stop-color=#cccccc", "When_I_come_Home" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
