/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author estudiante
 */
public class interfaz extends Frame {

    Label l1, l2;
    TextField Text, Text2;
   private Button Boton1;
   Operaciones op;

    public interfaz() {
        setTitle("VENTANA");
        setSize(400, 400);
        setBackground(Color.CYAN);
        setLocationRelativeTo(this);
        setResizable(false);
        setLayout(null);

        l1 = new Label("Numero 1");
        l1.setBounds(100, 100, 90, 30);
        add(l1);

        Text = new TextField("");
        Text.setBounds(180, 100, 90, 30);
        add(Text);

        l2 = new Label("Numero 2");
        l2.setBounds(100, 200, 90, 30);
        add(l2);

        Text2 = new TextField("");
        Text2.setBounds(180, 200, 90, 30);
        add(Text2);

        Boton1 = new Button("Hola");
        Boton1.setBounds(155, 300, 100, 30);
        add(Boton1);

//        Boton1.addActionListener(op.suma(Text.set, WIDTH));

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );

        setVisible(true);
    }

}
