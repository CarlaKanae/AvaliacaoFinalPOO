package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarHistoricoMedico {
  private JTextField txtNomePet;
  private JTextField txtData;
  private JTextArea txtDescricao;
  private JTextArea txtDiagnostico;
  private JTextArea txtTratamento;
  private JTextArea txtObservacoes;
  private JButton btnSalvar;

  public AdicionarHistoricoMedico() {
    txtNomePet.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    txtData.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
    btnSalvar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {

      }
    });
  }
}
