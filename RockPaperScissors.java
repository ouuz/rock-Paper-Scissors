import java.util.Random;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;

public class RockPaperScissors extends JFrame {
 private Random r;
 private final String[] box = {"剪刀","石头","布"};
 private JComboBox<String> choice;
 private JTextArea ta;
 private JLabel lb;
 private int win=0;
 private int loss=0;
 private int equal=0;

 public RockPaperScissors() {
  setTitle("Small Game");
  initial();
  pack();
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocation(400, 300);
  setVisible(true);
 }
 
 public void initial() {
  r = new Random();

  choice = new JComboBox<String>();
  for(int i=0; i<box.length; i++) {
   choice.addItem(box[i]);
  }
  
  ta = new JTextArea(3, 15);
  ta.setEditable(false);
  
  JButton okBut = new JButton("出招");
  okBut.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e){
    ta.setText(getResult());
    lb.setText(getTotal());
   }
  });
  JButton clearBut = new JButton("清除分数");
  clearBut.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e){
    ta.setText("");
    win=0;
    loss=0;
    equal=0;
    lb.setText(getTotal());
   }
  });
  
  lb = new JLabel(getTotal());
  
  JPanel choicePanel = new JPanel();
  choicePanel.add(choice);
  choicePanel.add(okBut);
  choicePanel.add(clearBut);
  
  JScrollPane resultPanel = new JScrollPane(ta);
  
  JPanel totalPanel = new JPanel();
  totalPanel.add(lb);
  
  Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
  contentPane.add(choicePanel, BorderLayout.NORTH);
  contentPane.add(resultPanel, BorderLayout.CENTER);
  contentPane.add(totalPanel, BorderLayout.SOUTH);
 }
 
 public String getResult() {
  String tmp = "";
  int boxPeop = choice.getSelectedIndex();
  int boxComp = getBoxComp();
  tmp += "你出：\t" + box[boxPeop];
  tmp += "\n电脑出：\t" + box[boxComp];
  tmp += "\n结果：\t" + check(boxPeop, boxComp);
  return tmp;
 }
 
 public int getBoxPeop(String str) {
  return choice.getSelectedIndex();
 }
 
 public int getBoxComp() {
  return r.nextInt(3);
 }
 
 public String check(int boxPeop, int boxComp) {
  String result="";
  if(boxPeop == (boxComp+1)%3) {
   result="你赢了！";
   win++;
  }
  else if(boxPeop == boxComp) {
   result="平";
   equal++;
  }
  else {
   result="你输了！";
   loss++;
  }
  return result;
 }
 
 public int getPoint() {
  return (win-loss)*10;
 }
 
 public String getTotal() {
  return "赢：" + win + "     平：" + equal + "     输：" + loss + "     得分：" + getPoint();
 }
 
 public static void main(String[] args) {
  RockPaperScissors game = new RockPaperScissors();
 }
} 
