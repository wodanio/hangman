package de.hangman;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Test extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    public Test(){  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {  
        l.setText("Key Pressed");  
    }  
    public void keyReleased(KeyEvent e) {  
        l.setText("Key Released");  
    }  
    public void keyTyped(KeyEvent e) {  
        l.setText("Key Typed");  
    }  
  
    public static void main(String[] args) {  
        new Test();  
    }  
}  
