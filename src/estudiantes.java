import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class estudiantes {
    private String[] arregloDatos;
    private int indice;


    private void guardarDato(String dato) {
        if (indice < arregloDatos.length) {
            arregloDatos[indice] = dato;
            indice++;
            //System.out.println("Dato guardado: " + dato);
        } else {
            System.out.println("El arreglo está lleno. No se puede guardar más datos.");
        }
    }
    public estudiantes() {
        cod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codig = cod.getText();
                guardarDato(codig);
                cod.setText("");

            }
        });
        ced.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codig = ced.getText();
                guardarDato(codig);
                cod.setText("");
            }
        });
        name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codig = name.getText();
                guardarDato(codig);
                cod.setText("");
            }
        });
        apell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codig = apell.getText();
                guardarDato(codig);
                cod.setText("");
            }
        });
        signos.addItem("Aries");
        signos.addItem("Tauro");
        signos.addItem("Géminis");
        signos.addItem("Cáncer");
        signos.addItem("Léo");
        signos.addItem("Virgo");
        signos.addItem("Libra");
        signos.addItem("Escorpio");
        signos.addItem("Ofiuco");
        signos.addItem("Sagitario");
        signos.addItem("Capricornio");
        signos.addItem("Acuario");
        signos.addItem("Cetus");

        signos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] signosItems = {""};
                for (String item : signosItems) {
                    signos.addItem(item);
                }

            }
        });

        dia.addItem(" Día ");
        for (int i = 1; i <= 31; i++) {
            dia.addItem(String.valueOf(i));
        }

        dia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                String selectedDia = (String) comboBox.getSelectedItem();
                System.out.println("Día " + selectedDia);

            }
        });
        mes.addItem(" Mes");
        mes.addItem("Enero");
        mes.addItem("Febrero");
        mes.addItem("Marzo");
        mes.addItem("Abril");
        mes.addItem("Mayo");
        mes.addItem("Junio");
        mes.addItem("Julio");
        mes.addItem("Agosto");
        mes.addItem("Septiembre");
        mes.addItem("Octubre");
        mes.addItem("Noviembre");
        mes.addItem("Diciembre");

        mes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] mesItems = {""};
                for (String item : mesItems) {
                    mes.addItem(item);
                }
            }
        });
        anio.addItem(" Año ");
        for (int i = 1990; i <= 2023; i++) {
            anio.addItem(String.valueOf(i));
        }
        anio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                String selectedAnio = (String) comboBox.getSelectedItem();
                System.out.println("AÑo " + selectedAnio);
            }
        });
        arregloDatos = new String[10];
        indice = 0;
        guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato = cod.getText();
                guardarDato(dato);
                cod.setText("");
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Estudiantes");
        frame.setContentPane(new estudiantes().estu);
        frame.setBounds(750,300,1000,1050);
        //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JLabel codigo;
    private JButton cargar;
    private JButton guardar;
    private JButton siguiente;
    private JComboBox signos;
    private JButton anterior;
    private JTextField cod;
    private JTextField ced;
    private JTextField name;
    private JTextField apell;
    private JComboBox dia;
    private JComboBox mes;
    private JComboBox anio;
    private JCheckBox cred;
    private JCheckBox cgreen;
    private JCheckBox colors;
    private JRadioButton csi;
    private JRadioButton cno;
    private JPanel estu;
    private JTextArea textArea1;
}
