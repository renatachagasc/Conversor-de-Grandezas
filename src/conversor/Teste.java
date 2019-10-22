package conversor;

import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Teste extends JFrame {

    private JComboBox<String> deSeletorArea;
    private JComboBox<String> deSeletorTempo;
    private JComboBox<String> deSeletorEnergia;
    private JButton fechar;
    private JLabel jLabelArea;
    private JLabel jLabelDeArea;
    private JLabel jLabelDeTempo;
    private JLabel jLabelDeEnergia;
    private JLabel jLabelTempo;
    private JLabel jLabelEnergia;
    private JLabel jLabelParaArea;
    private JLabel jLabelParaTempo;
    private JLabel jLabelParaEnergia;
    private JTextField jTextFieldAreaDe;
    private JTextField jTextFieldAreaPara;
    private JTextField jTextFieldTempoDe;
    private JTextField jTextFieldTempoPara;
    private JTextField jTextFieldEnergiaDe;
    private JTextField jTextFieldEnergiaPara;
    private JComboBox<String> paraSeletorArea;
    private JComboBox<String> paraSeletorTempo;
    private JComboBox<String> paraSeletorEnergia;

    public Teste() {
        iniciarComponentes();
    }

    private void iniciarComponentes() {

        fechar = new javax.swing.JButton();
        jLabelArea = new javax.swing.JLabel();
        jLabelTempo = new javax.swing.JLabel();
        jLabelEnergia = new javax.swing.JLabel();
        jTextFieldAreaDe = new javax.swing.JTextField();
        jTextFieldTempoDe = new javax.swing.JTextField();
        jTextFieldEnergiaDe = new javax.swing.JTextField();
        deSeletorArea = new javax.swing.JComboBox<>();
        deSeletorTempo = new javax.swing.JComboBox<>();
        deSeletorEnergia = new javax.swing.JComboBox<>();
        paraSeletorArea = new javax.swing.JComboBox<>();
        paraSeletorTempo = new javax.swing.JComboBox<>();
        paraSeletorEnergia = new javax.swing.JComboBox<>();
        jTextFieldAreaPara = new javax.swing.JTextField();
        jTextFieldTempoPara = new javax.swing.JTextField();
        jTextFieldEnergiaPara = new javax.swing.JTextField();
        jLabelParaArea = new javax.swing.JLabel();
        jLabelParaTempo = new javax.swing.JLabel();
        jLabelParaEnergia = new javax.swing.JLabel();
        jLabelDeArea = new javax.swing.JLabel();
        jLabelDeTempo = new javax.swing.JLabel();
        jLabelDeEnergia = new javax.swing.JLabel();

        //setLocationRelativeTo(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 232));
        setLocationRelativeTo(null);
        
        fechar.setText("Fechar");
        fechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });

        jLabelArea.setText("Área");

        jLabelTempo.setText("Tempo");

        jLabelEnergia.setText("Energia");

        jTextFieldAreaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("VALOR >>> " + jTextFieldAreaDe.getText());
                jTextFieldAreaDeActionPerformed(evt);
            }
        });

        jTextFieldTempoDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextFieldDensidadeDeActionPerformed(evt);
            }
        });

        jTextFieldEnergiaDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextFieldEnergiaDeActionPerformed(evt);
            }
        });

        deSeletorArea.setModel(new DefaultComboBoxModel<>(new String[]{"Metros", "Centímetros", "Milímetros"}));
        deSeletorArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                deSeletorAreaActionPerformed(evt);
            }
        });

        deSeletorTempo.setModel(new DefaultComboBoxModel<>(new String[]{"Hora", "Minuto", "Segundo"}));
        deSeletorTempo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                deSeletorTempoActionPerformed(evt);
            }
        });

        deSeletorEnergia.setModel(new DefaultComboBoxModel<>(new String[]{"Megajoules", "Kilojoules", "Joules"}));
        deSeletorEnergia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                deSeletorEnergiaActionPerformed(evt);
            }
        });

        paraSeletorArea.setModel(new DefaultComboBoxModel<>(new String[]{"Centímetros", "Metros", "Milímetros"}));
        paraSeletorArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                paraSeletorAreaActionPerformed(evt);
            }
        });

        paraSeletorTempo.setModel(new DefaultComboBoxModel<>(new String[]{"Segundo", "Minuto", "Hora"}));
        paraSeletorTempo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                paraSeletorTempoActionPerformed(evt);
            }
        });

        paraSeletorEnergia.setModel(new DefaultComboBoxModel<>(new String[]{"Joules", "Kilojoules", "Megajoules"}));
        paraSeletorEnergia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                paraSeletorEnergiaActionPerformed(evt);
            }
        });

        jTextFieldAreaPara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextFieldAreaParaActionPerformed(evt);
            }
        });

        jTextFieldTempoPara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextFieldDensidadeParaActionPerformed(evt);
            }
        });

        jTextFieldEnergiaPara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jTextFieldEnergiaParaActionPerformed(evt);
            }
        });

        jLabelParaArea.setText("Para");

        jLabelParaTempo.setText("Para");

        jLabelParaEnergia.setText("Para");

        jLabelDeArea.setText("De");

        jLabelDeTempo.setText("De");

        jLabelDeEnergia.setText("De");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelTempo)
                                        .addComponent(jLabelEnergia)
                                        .addComponent(jLabelArea))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelDeEnergia)
                                        .addComponent(jLabelDeTempo, GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelDeArea, GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldEnergiaDe, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(deSeletorEnergia, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldTempoDe, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(deSeletorTempo, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldAreaDe, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(deSeletorArea, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabelParaArea)
                                                        .addComponent(jLabelParaTempo))
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(paraSeletorTempo, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(paraSeletorArea, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextFieldTempoPara, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextFieldAreaPara, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabelParaEnergia)
                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                .addComponent(paraSeletorEnergia, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldEnergiaPara, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(26, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechar)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldAreaPara, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldTempoPara, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldEnergiaPara, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(paraSeletorEnergia, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelParaEnergia)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldAreaDe, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDeArea)
                                                        .addComponent(jLabelArea)
                                                        .addComponent(deSeletorArea, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelParaArea)
                                                        .addComponent(paraSeletorArea, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldTempoDe, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deSeletorTempo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDeTempo)
                                                        .addComponent(jLabelTempo)
                                                        .addComponent(jLabelParaTempo)
                                                        .addComponent(paraSeletorTempo, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jTextFieldEnergiaDe, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(deSeletorEnergia, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabelDeEnergia)
                                                        .addComponent(jLabelEnergia))))
                                .addPreferredGap(ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(fechar)
                                .addContainerGap())
        );

        pack();
    }

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Você está encerrando a aplicação.");
        System.exit(0);
    }

    private void jTextFieldAreaDeActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void paraSeletorAreaActionPerformed(java.awt.event.ActionEvent evt) {
        if (numerico(jTextFieldAreaDe.getText())) {
            if (deSeletorArea.getSelectedItem() == "Centímetros") {

                if (paraSeletorArea.getSelectedItem() == "Centímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText())));
                } else if (paraSeletorArea.getSelectedItem() == "Metros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) * 100));
                } else if (paraSeletorArea.getSelectedItem() == "Milímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) / 10));
                }

            } else if (deSeletorArea.getSelectedItem() == "Metros") {

                if (paraSeletorArea.getSelectedItem() == "Centímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) * 100));
                } else if (paraSeletorArea.getSelectedItem() == "Metros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText())));
                } else if (paraSeletorArea.getSelectedItem() == "Milímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) * 1000));
                }

            } else if (deSeletorArea.getSelectedItem() == "Milímetros") {

                if (paraSeletorArea.getSelectedItem() == "Centímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) / 10));
                } else if (paraSeletorArea.getSelectedItem() == "Metros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) / 1000));
                } else if (paraSeletorArea.getSelectedItem() == "Milímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText())));
                }

            }
        } else {
            jTextFieldAreaPara.setText("0");
            JOptionPane.showMessageDialog(null, "Valor do campo área inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void paraSeletorTempoActionPerformed(java.awt.event.ActionEvent evt) {
         if (numerico(jTextFieldTempoDe.getText())) {
            if (deSeletorTempo.getSelectedItem() == "Hora") {

                if (paraSeletorTempo.getSelectedItem() == "Hora") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText())));
                } else if (paraSeletorTempo.getSelectedItem() == "Minuto") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) * 60));
                } else if (paraSeletorTempo.getSelectedItem() == "Segundo") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) * 3600));
                }

            } else if (deSeletorTempo.getSelectedItem() == "Minuto") {

                if (paraSeletorTempo.getSelectedItem() == "Hora") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) / 60));
                } else if (paraSeletorTempo.getSelectedItem() == "Minuto") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText())));
                } else if (paraSeletorTempo.getSelectedItem() == "Segundo") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) * 60));
                }

            } else if (deSeletorTempo.getSelectedItem() == "Segundo") {

                if (paraSeletorTempo.getSelectedItem() == "Hora") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) / 60));
                } else if (paraSeletorTempo.getSelectedItem() == "Minuto") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) / 3600));
                } else if (paraSeletorTempo.getSelectedItem() == "Segundo") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText())));
                }

            }
        } else {
            jTextFieldTempoPara.setText("0");
            JOptionPane.showMessageDialog(null, "Valor do campo área inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void paraSeletorEnergiaActionPerformed(java.awt.event.ActionEvent evt) {
        if (numerico(jTextFieldEnergiaDe.getText())) {
            /* CONVERSÃO DE ENERGIA */
            if (deSeletorEnergia.getSelectedItem() == "Megajoules") {

                if (paraSeletorEnergia.getSelectedItem() == "Megajoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText())));
                } else if (paraSeletorEnergia.getSelectedItem() == "Kilojoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) * 1000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Joules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) * 1000000));
                }

            } else if (deSeletorEnergia.getSelectedItem() == "Kilojoules") {

                if (paraSeletorEnergia.getSelectedItem() == "Megajoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) / 1000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Kilojoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText())));
                } else if (paraSeletorEnergia.getSelectedItem() == "Joules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) * 1000000));
                }

            } else if (deSeletorEnergia.getSelectedItem() == "Joules") {

                if (paraSeletorEnergia.getSelectedItem() == "Megajoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) / 1000000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Kilojoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) / 1000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Joules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText())));
                }
            }

        } else {
            jTextFieldEnergiaPara.setText("0");
            JOptionPane.showMessageDialog(null, "Valor do campo energia inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jTextFieldEnergiaDeActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTextFieldEnergiaParaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldDensidadeParaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextFieldAreaParaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deSeletorEnergiaActionPerformed(java.awt.event.ActionEvent evt) {
        if (numerico(jTextFieldEnergiaDe.getText())) {
            /* CONVERSÃO DE ENERGIA */
            if (deSeletorEnergia.getSelectedItem() == "Megajoules") {

                if (paraSeletorEnergia.getSelectedItem() == "Megajoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText())));
                } else if (paraSeletorEnergia.getSelectedItem() == "Kilojoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) * 1000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Joules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) * 1000000));
                }

            } else if (deSeletorEnergia.getSelectedItem() == "Kilojoules") {

                if (paraSeletorEnergia.getSelectedItem() == "Megajoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) / 1000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Kilojoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText())));
                } else if (paraSeletorEnergia.getSelectedItem() == "Joules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) * 1000000));
                }

            } else if (deSeletorEnergia.getSelectedItem() == "Joules") {

                if (paraSeletorEnergia.getSelectedItem() == "Megajoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) / 1000000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Kilojoules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText()) / 1000));
                } else if (paraSeletorEnergia.getSelectedItem() == "Joules") {
                    jTextFieldEnergiaPara.setText(String.valueOf(Double.parseDouble(jTextFieldEnergiaDe.getText())));
                }
            }

        } else {
            jTextFieldEnergiaPara.setText("0");
            JOptionPane.showMessageDialog(null, "Valor do campo energia inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deSeletorTempoActionPerformed(java.awt.event.ActionEvent evt) {
        if (numerico(jTextFieldTempoDe.getText())) {
            /* CONVERSÃO DE TEMPO */
            if (deSeletorTempo.getSelectedItem() == "Hora") {

                if (paraSeletorTempo.getSelectedItem() == "Hora") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText())));
                } else if (paraSeletorTempo.getSelectedItem() == "Minuto") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) * 60));
                } else if (paraSeletorTempo.getSelectedItem() == "Segundo") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) * 3600));
                }

            } else if (deSeletorTempo.getSelectedItem() == "Minuto") {

                if (paraSeletorTempo.getSelectedItem() == "Hora") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) / 60));
                } else if (paraSeletorTempo.getSelectedItem() == "Minuto") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText())));
                } else if (paraSeletorTempo.getSelectedItem() == "Segundo") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) * 60));
                }

            } else if (deSeletorTempo.getSelectedItem() == "Segundo") {

                if (paraSeletorTempo.getSelectedItem() == "Hora") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) / 3600));
                } else if (paraSeletorTempo.getSelectedItem() == "Minuto") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText()) / 60));
                } else if (paraSeletorTempo.getSelectedItem() == "Segundo") {
                    jTextFieldTempoPara.setText(String.valueOf(Double.parseDouble(jTextFieldTempoDe.getText())));
                }
            }

        } else {
            jTextFieldTempoPara.setText("0");
            JOptionPane.showMessageDialog(null, "Valor do campo tempo inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deSeletorAreaActionPerformed(java.awt.event.ActionEvent evt) {
        if (numerico(jTextFieldAreaDe.getText())) {
            /* CONVERSÃO DE ÁREA */
            if (deSeletorArea.getSelectedItem() == "Centímetros") {

                if (paraSeletorArea.getSelectedItem() == "Centímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText())));
                } else if (paraSeletorArea.getSelectedItem() == "Metros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) / 100));
                } else if (paraSeletorArea.getSelectedItem() == "Milímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) * 10));
                }

            } else if (deSeletorArea.getSelectedItem() == "Metros") {

                if (paraSeletorArea.getSelectedItem() == "Centímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) * 100));
                } else if (paraSeletorArea.getSelectedItem() == "Metros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText())));
                } else if (paraSeletorArea.getSelectedItem() == "Milímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) * 1000));
                }

            } else if (deSeletorArea.getSelectedItem() == "Milímetros") {

                if (paraSeletorArea.getSelectedItem() == "Centímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) / 10));
                } else if (paraSeletorArea.getSelectedItem() == "Metros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText()) / 1000));
                } else if (paraSeletorArea.getSelectedItem() == "Milímetros") {
                    jTextFieldAreaPara.setText(String.valueOf(Double.parseDouble(jTextFieldAreaDe.getText())));
                }
            }

        } else {
            jTextFieldAreaPara.setText("0");
            JOptionPane.showMessageDialog(null, "Valor do campo área inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jTextFieldDensidadeDeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    public static boolean numerico(String s) {
        if (naoContemLetras(s)) {
            try {
                Double.parseDouble(s);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return false;
    }

    public static boolean naoContemLetras(String s) {
        int t = s.length();
        int cont = t;
        String v[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "x", "z", "w", "y", "z"};

        if (t != 0) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < v.length; j++) {
                    if (v[j].equalsIgnoreCase(Character.toString(s.charAt(i)))) {
                        cont--;
                    }
                }
            }

            if (t == cont) {
                return true;
            }
        }
        return false;
    }
}
