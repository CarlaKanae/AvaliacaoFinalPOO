package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI {


  private JButton btnRegistrarAnimal;
  private JPanel MenuPrincipal;
  private JButton btnAdicionarHistoricoMedico;
  private JButton btnListarAnimais;
  private JButton btnRemoverRegistro;
  private JButton btnListarHistoricosMedicos;
  private JButton btnSair;

  private static void criarGUI() {
    JFrame frame = new JFrame("Menu Principal");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    JButton btnRegistrarAnimal = new JButton("Registrar Animal");

    panel.add(btnRegistrarAnimal);

    btnRegistrarAnimal.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Lógica para chamar a tela de registro de animal
        abrirTelaRegistroAnimal();
      }
    });

    // Adicione outros botões e ouvintes de ação conforme necessário...

    frame.add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private static void abrirTelaRegistroAnimal() {
    JFrame frameRegistroAnimal = new JFrame("Registrar Animal");
    frameRegistroAnimal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Fechar apenas a janela de registro

    JPanel panelRegistroAnimal = new JPanel();
    panelRegistroAnimal.setLayout(new BoxLayout(panelRegistroAnimal, BoxLayout.Y_AXIS));

    JTextField textFieldNome = new JTextField(20);
    JTextField textFieldEspecie = new JTextField(20);
    JTextField textFieldDono = new JTextField(20);
    JTextField textFieldRaca = new JTextField(20);

    JButton btnRegistrar = new JButton("Registrar");

    panelRegistroAnimal.add(new JLabel("Nome do Animal:"));
    panelRegistroAnimal.add(textFieldNome);
    panelRegistroAnimal.add(new JLabel("Espécie do Animal:"));
    panelRegistroAnimal.add(textFieldEspecie);
    panelRegistroAnimal.add(new JLabel("Nome do Dono:"));
    panelRegistroAnimal.add(textFieldDono);
    panelRegistroAnimal.add(new JLabel("Raça (se aplicável):"));
    panelRegistroAnimal.add(textFieldRaca);
    panelRegistroAnimal.add(btnRegistrar);

    btnRegistrar.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        // Obter dados da interface gráfica
        String nome = textFieldNome.getText();
        String especie = textFieldEspecie.getText();
        String dono = textFieldDono.getText();
        String raca = textFieldRaca.getText();

        // Validar os campos
        if (nome.isEmpty() || especie.isEmpty() || dono.isEmpty()) {
          JOptionPane.showMessageDialog(frameRegistroAnimal, "Preencha todos os campos obrigatórios.");
        } else {
          // Lógica para registrar o animal
          registrarAnimal(nome, especie, dono, raca);
          JOptionPane.showMessageDialog(frameRegistroAnimal, "Animal registrado com sucesso!");
          frameRegistroAnimal.dispose(); // Fechar a janela de registro após o registro
        }
      }
    });

    frameRegistroAnimal.add(panelRegistroAnimal);
    frameRegistroAnimal.setSize(400, 300);
    frameRegistroAnimal.setLocationRelativeTo(null);
    frameRegistroAnimal.setVisible(true);
  }

  private static void registrarAnimal(String nome, String especie, String dono, String raca) {
    // Lógica para registrar o animal
    // Exemplo: clinica.registrarAnimal(new Animal(nome, especie, dono));
    // Adapte conforme sua implementação real
    // ...
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        criarGUI();
      }
    });
  }
}
