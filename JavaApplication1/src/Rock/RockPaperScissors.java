/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rock;

/**
 *
 * @author ouu
 */
import java.util.Random;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;

public class RockPaperScissors extends JFrame {
 private Random r;
 private final String[] box = {"剪刀","石头","布"};
 private final String[] iconBox = {
     "C:\\Users\\ouu\\Documents\\NetBeansProjects\\JavaApplication1\\src\\1.png",
     "C:\\Users\\ouu\\Documents\\NetBeansProjects\\JavaApplication1\\src\\2.png",
     "C:\\Users\\ouu\\Documents\\NetBeansProjects\\JavaApplication1\\src\\3.png"};
 private JComboBox<String> choice;
 private JFrame frame = null;
 private JTextArea ta;
 private JLabel lb;
 private int win=0;
 private int loss=0;
 private int equal=0;
 private String player1Code = "",player2Code = "";
 
 /*
 * @description 创建新窗口：选择玩家人数的窗口
 */
  public RockPaperScissors() {
  setTitle("选择人机对战 / 人人对战");
  choiceNumbersOfPlayers();
  pack();
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(300, 300);
  setLocation(400, 300);
  setVisible(true);
 }
  
 /*
 * @description 创建新窗口：人机对战 / 人人对战
 * @param { String } String gameMode 游戏模式
 */
 public RockPaperScissors(String gameMode) {
  setTitle(gameMode);
  if(gameMode == "Man VS Man")
      manInitial();
  else
    computerInitial();
  pack();
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(300, 300);
  setLocation(400, 300);
  setVisible(true);
 }
 
 /*
 * @description 选择玩家人数后跳转新窗口
 */ 
 public void choiceNumbersOfPlayers(){
     JButton manBtn = new JButton("Man VS Man"); 
     JButton computerBtn = new JButton("Man VS Computer");

     manBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            dispose();
            new RockPaperScissors( "Man VS Man");
        }
    });
     
     computerBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            dispose();
            new RockPaperScissors( "Man VS Computer");
        }
    });
     
    JPanel choiceNumbersOfPlayersPanel = new JPanel();
    choiceNumbersOfPlayersPanel.add(manBtn);
    choiceNumbersOfPlayersPanel.add(computerBtn);
    
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(choiceNumbersOfPlayersPanel, BorderLayout.CENTER);
 }
 
 /*
 * @description 人人对战
 *player1: a:石头65 b:剪刀83 c:布68
 *player2: ←:石头37 ↓:剪刀40 →:布39
 */ 
 public void manInitial(){
     
    ImageIcon icon = new ImageIcon("C:\\Users\\ouu\\Documents\\NetBeansProjects\\JavaApplication1\\src\\1.png"); 
    JButton player = new JButton(icon);
     
    player.addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent e){
            switch(e.getKeyCode()){
                case 65:
                    player1Code ="石头";
                    break;
                case 83: 
                    player1Code ="剪刀";
                    break;
                case 68: 
                    player1Code ="布";
                    break;
                case 37:
                    player2Code ="石头";
                    break;
                case 40:
                    player2Code ="剪刀";
                    break;
                case 39:
                    player2Code ="布";
                    break;
            }
            System.out.println(player1Code);
            System.out.println(player2Code);
            System.out.println();
       } 
    });
     
    JPanel choiceNumbersOfPlayersPanel = new JPanel();
    choiceNumbersOfPlayersPanel.add(player);
    
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(choiceNumbersOfPlayersPanel, BorderLayout.CENTER);
    
    
 }
 
 public void computerInitial() {
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

