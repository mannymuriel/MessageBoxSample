import java.awt.*;
import java.awt.event.*;

public class MessageBox extends Dialog implements ActionListener
{
 private String result;
 private Button OKButton;

 public MessageBox(Frame frame, String title, String messageString)
 {
  super(frame, title, true);

  Rectangle bounds = frame.getBounds();
  setBackground(Color.white);
  setLocation(bounds.x+bounds.width/3, bounds.y+bounds.height/3);

  Panel messagePane = new Panel();
  Label message = new Label(messageString);
  messagePane.add(message);
  add(messagePane, BorderLayout.CENTER);

  Panel buttonPane = new Panel();
  OKButton = new Button("  OK  ");
  buttonPane.add(OKButton);
  add(buttonPane, BorderLayout.SOUTH);

  OKButton.addActionListener(this);

  pack();
 }

 public void actionPerformed(ActionEvent e)
 {
  setVisible(false);
 }
}