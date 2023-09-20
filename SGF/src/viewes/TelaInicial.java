package viewes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.Base;
import Controller.Insercao;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private static JTextField textID;
	private static JTextField textNome;
	private static JTextField textCargo;
	private static JTextField textSalario;
	private static JTextField textTelefone;
	private static JTextField textEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textID = new JTextField();
		textID.setBounds(172, 25, 331, 20);
		contentPane.add(textID);
		textID.setColumns(10);
		textID.setEnabled(false);

		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(21, 28, 101, 14);
		contentPane.add(lblId);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 62, 101, 14);
		contentPane.add(lblNome);

		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(172, 59, 331, 20);
		contentPane.add(textNome);
		textNome.setEnabled(false);

		JLabel lblCargo = new JLabel("Cargo / Fun\u00E7\u00E3o:");
		lblCargo.setBounds(21, 100, 101, 14);
		contentPane.add(lblCargo);

		textCargo = new JTextField();
		textCargo.setColumns(10);
		textCargo.setBounds(172, 97, 331, 20);
		contentPane.add(textCargo);
		textCargo.setEnabled(false);

		JLabel lblSalario = new JLabel("Sal\u00E1rio:");
		lblSalario.setBounds(21, 139, 101, 14);
		contentPane.add(lblSalario);

		textSalario = new JTextField();
		textSalario.setColumns(10);
		textSalario.setBounds(172, 136, 331, 20);
		contentPane.add(textSalario);
		textSalario.setEnabled(false);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(21, 178, 101, 14);
		contentPane.add(lblTelefone);

		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(172, 175, 331, 20);
		contentPane.add(textTelefone);
		textTelefone.setEnabled(false);

		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setBounds(21, 215, 101, 14);
		contentPane.add(lblEndereco);

		textEndereco = new JTextField();
		textEndereco.setColumns(10);
		textEndereco.setBounds(172, 212, 331, 20);
		contentPane.add(textEndereco);
		textEndereco.setEnabled(false);

		JButton btnNovo = new JButton("Novo");
		btnNovo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				habilita();

			}
		});
		btnNovo.setBounds(21, 266, 89, 23);
		contentPane.add(btnNovo);

		JButton btnDetalhes = new JButton("Detalhes");
		btnDetalhes.setBounds(120, 266, 89, 23);
		contentPane.add(btnDetalhes);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(219, 266, 89, 23);
		contentPane.add(btnAtualizar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(318, 266, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Controller.Insercao();
			}
		});
		btnSalvar.setBounds(417, 266, 89, 23);
		contentPane.add(btnSalvar);

	}

	public static JTextField getTextID() {
		return textID;
	}

	public void setTextID(JTextField textID) {
		this.textID = textID;
	}

	public static JTextField getTextNome() {
		return textNome;
	}

	public void setTextNome(JTextField textNome) {
		this.textNome = textNome;
	}

	public static JTextField getTextCargo() {
		return textCargo;
	}

	public void setTextCargo(JTextField textCargo) {
		this.textCargo = textCargo;
	}

	public static JTextField getTextSalario() {
		return textSalario;
	}

	public void setTextSalario(JTextField textSalario) {
		this.textSalario = textSalario;
	}

	public static JTextField getTextTelefone() {
		return textTelefone;
	}

	public void setTextTelefone(JTextField textTelefone) {
		this.textTelefone = textTelefone;
	}

	public static JTextField getTextEndereco() {
		return textEndereco;
	}

	public void setTextEndereco(JTextField textEndereco) {
		this.textEndereco = textEndereco;
	}

	public void habilita() {
		textID.setEnabled(true);
		textNome.setEnabled(true);
		textCargo.setEnabled(true);
		textSalario.setEnabled(true);
		textTelefone.setEnabled(true);
		textEndereco.setEnabled(true);

	}
}
