package project2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame_gpt extends JFrame {
    JLabel la1 = new JLabel("아이디"); JLabel la2 = new JLabel("SSN"); JLabel la3 = new JLabel("전화번호");
    JTextField tf1 = new JTextField(5); JTextField tf2 = new JTextField(5);
    JTextField tf3 = new JTextField(10);
    JTextArea ta = new JTextArea(20, 50);
    JScrollPane scrollPane = new JScrollPane(ta);
    JButton bt1 = new JButton("로그인"); JButton bt2 = new JButton("회원가입"); JButton bt3 = new JButton("예금");
    JButton bt4 = new JButton("출금"); JButton bt5 = new JButton("잔고");

    List<Member> list = new ArrayList<>();
    Member member = null;

    MyFrame_gpt() {
        loadMembers();

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        Container con = this.getContentPane();
        con.setLayout(new BorderLayout());
        con.add(jp1, BorderLayout.NORTH);
        jp1.setLayout(new FlowLayout());
        jp1.add(la1); jp1.add(tf1); jp1.add(la2); jp1.add(tf2); jp1.add(la3); jp1.add(tf3);

        con.add(jp2, BorderLayout.CENTER);
        jp2.setLayout(new FlowLayout());
        jp2.add(scrollPane);

        con.add(jp3, BorderLayout.SOUTH);
        jp3.setLayout(new FlowLayout());
        jp3.add(bt1); jp3.add(bt2); jp3.add(bt3); jp3.add(bt4); jp3.add(bt5);

        bt1.addActionListener(e -> login());
        bt2.addActionListener(e -> register());
        bt3.addActionListener(e -> deposit());
        bt4.addActionListener(e -> withdraw());
        bt5.addActionListener(e -> showBalance());

        this.setBounds(1200, 200, 700, 400);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addWindowListener(new JFrameWindowClosingEventHandler());
    }

    private void loadMembers() {
        try (FileInputStream fis = new FileInputStream("c:\\temp\\members.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Member[] list2 = (Member[]) ois.readObject();
            list = new ArrayList<>(Arrays.asList(list2));
            ta.append("파일에서 객체를 가져왔습니다.\n저장된 회원 목록:\n");
            for (Member member : list) {
                ta.append(member.toString() + "\n");
            }
        } catch (IOException | ClassNotFoundException e) {
            ta.append("파일에서 객체를 가져오는데 실패했습니다.\n");
            e.printStackTrace();
        }
    }

    private void saveMembers() {
        Member[] list2 = list.toArray(new Member[list.size()]);
        try (FileOutputStream fos = new FileOutputStream("c:\\temp\\members.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(list2);
            ta.append("객체를 파일에 저장했습니다.\n");
        } catch (IOException e) {
            ta.append("객체를 파일에 저장하는데 실패했습니다.\n");
            e.printStackTrace();
        }
    }

    private void login() {
        String name = tf1.getText();
        String ssn = tf2.getText();
        int find = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name) && list.get(i).getSsn().equals(ssn)) {
                find = i;
                member = list.get(i);
                break;
            }
        }

        if (find != -1) {
            ta.append("로그인 성공: " + "\n");
            tf1.setText("");
            tf2.setText("");
        } else {
            ta.append("로그인 실패: 아이디 또는 패스워드가 틀림\n");
        }
    }

    private void register() {
        String name = tf1.getText();
        String ssn = tf2.getText();
        String phone = tf3.getText();

        list.add(new Member(name, ssn, phone));
        ta.append("회원 가입 성공: " + name + "\n");
        saveMembers();
        tf1.setText("");
        tf2.setText("");
        tf3.setText("");
    }

    private void deposit() {
        if (member == null) {
            ta.append("로그인 먼저 해주세요.\n");
            return;
        }

        String amountStr = tf3.getText();
        int amount = Integer.parseInt(amountStr);
        member.deposit(amount);
        ta.append("예금 성공: " + amount + "원\n");
        saveMembers();
        tf3.setText("");
    }

    private void withdraw() {
        if (member == null) {
            ta.append("로그인 먼저 해주세요.\n");
            return;
        }

        String amountStr = tf3.getText();
        int amount = Integer.parseInt(amountStr);
        member.withdraw(amount);
        ta.append("출금 성공: " + amount + "원\n");
        saveMembers();
        tf3.setText("");
    }

    private void showBalance() {
        if (member == null) {
            ta.append("로그인 먼저 해주세요.\n");
            return;
        }

        ta.append("현재 잔고: " + member.getBalance() + "원\n");
    }

    class JFrameWindowClosingEventHandler extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            saveMembers();
            JFrame frame = (JFrame) e.getWindow();
            frame.dispose();
            System.out.println("windowClosing()");
        }
    }

    public static void main(String[] ar) {
        new MyFrame_gpt();
    }
}
