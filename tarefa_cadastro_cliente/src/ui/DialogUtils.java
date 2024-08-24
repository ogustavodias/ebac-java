package ui;

import javax.swing.JOptionPane;

public final class DialogUtils {
  public static final String OPTION_CADASTRAR = "1";
  public static final String OPTION_REMOVER = "2";
  public static final String OPTION_BUSCAR = "3";
  public static final String OPTION_LISTAR = "4";
  public static final String OPTION_SAIR = "5";

  public static String getMenuOptions() {
    return OPTION_CADASTRAR + " - Para cadastrar | "
        + OPTION_REMOVER + " - Para remover | "
        + OPTION_BUSCAR + " - Para buscar | "
        + OPTION_LISTAR + " - Para listar todos | "
        + OPTION_SAIR + " - Para sair ";
  }

  public static String showInputDialog(String message) {
    return JOptionPane.showInputDialog(message);
  }

  public static void showMessageDialog(String message, Boolean success) {
    JOptionPane.showMessageDialog(null, message,
        success ? "A operação foi um sucesso!" : "Ocorreu um erro na operação!",
        success ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
  }

  public static void showMessageDialog(String message, Boolean success, String title) {
    JOptionPane.showMessageDialog(null, message, title,
        success ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
  }

}