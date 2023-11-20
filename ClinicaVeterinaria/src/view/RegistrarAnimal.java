package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarAnimal extends JFrame implements ActionListener{

  protected JPanel RegistroPetPanel;
  protected JTextField txtNomePet;
  protected JTextField txtNomeDono;
  protected JTextField txtRacaPet;
  protected JButton btnRegistrarPet;
  private JTextField txtEspecie;

  public RegistrarAnimal() {

    txtNomePet.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    txtNomeDono.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    txtEspecie.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    txtRacaPet.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    btnRegistrarPet.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Pet registrado com sucesso");
      }
    });
  }

  public static void main (String[] args){
    JFrame tela = new JFrame("Registro do Pet");
    tela.setContentPane(new RegistrarAnimal().RegistroPetPanel);
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tela.pack();
    tela.setVisible(true);
  }


  @Override
  public void actionPerformed(ActionEvent e) {

  }
}
