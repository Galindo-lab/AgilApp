/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finalpoo2023;

import com.formdev.flatlaf.FlatIntelliJLaf;
import com.mycompany.agileutils.Proyect;
import com.mycompany.agileutils.Task;
import com.mycompany.agileutils.Team;
import com.mycompany.agileutils.TeamMember;
import com.mycompany.agileutils.UserHistory;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ERICK
 * @author Galindo
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    Proyect proyect;

    public MainMenu() {
        initComponents();
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/org/icons8-add-48.png")));

        proyect = new Proyect("", "");

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jFileChooser1 = new javax.swing.JFileChooser();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelTask = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        addTask = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        taskEdit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButton1 = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        taskTable = new javax.swing.JTable();
        panelTeams = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        newteam = new javax.swing.JButton();
        deleteteam = new javax.swing.JButton();
        teamEdit = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane3 = new javax.swing.JScrollPane();
        teamsTable = new javax.swing.JTable();
        panelMembers = new javax.swing.JPanel();
        jToolBar3 = new javax.swing.JToolBar();
        newmember = new javax.swing.JButton();
        deletemember = new javax.swing.JButton();
        membersEdit = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane4 = new javax.swing.JScrollPane();
        membersTable = new javax.swing.JTable();
        PanelUserHistory = new javax.swing.JPanel();
        jToolBar4 = new javax.swing.JToolBar();
        newStory = new javax.swing.JButton();
        deleteStory = new javax.swing.JButton();
        storyEdit = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jScrollPane5 = new javax.swing.JScrollPane();
        storyTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuItemSave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("mySCRUM");
        setIconImage(getIconImage());

        jToolBar1.setRollover(true);
        jToolBar1.setFloatable(false);
        jToolBar1.setBorderPainted(false);
        jToolBar1.setPreferredSize(new java.awt.Dimension(221, 74));
        jToolBar1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jToolBar1ComponentAdded(evt);
            }
        });

        addTask.setText("Add");
        addTask.setFocusable(false);
        addTask.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addTask.setPreferredSize(new java.awt.Dimension(70, 24));
        addTask.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskActionPerformed(evt);
            }
        });
        jToolBar1.add(addTask);

        jButton2.setText("Delete");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(70, 24));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        taskEdit.setText("Edit");
        taskEdit.setFocusable(false);
        taskEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        taskEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        taskEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskEditActionPerformed(evt);
            }
        });
        jToolBar1.add(taskEdit);
        jToolBar1.add(jSeparator2);

        jButton1.setText("Asign");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(70, 24));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(filler1);

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Task", "Duration (Days)", "Team Member", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taskTable.setFocusable(false);
        taskTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(taskTable);

        javax.swing.GroupLayout panelTaskLayout = new javax.swing.GroupLayout(panelTask);
        panelTask.setLayout(panelTaskLayout);
        panelTaskLayout.setHorizontalGroup(
            panelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelTaskLayout.setVerticalGroup(
            panelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tasks", panelTask);

        jToolBar2.setRollover(true);
        jToolBar2.setFloatable(false);
        jToolBar2.setBorderPainted(false);
        jToolBar2.setMaximumSize(new java.awt.Dimension(133, 28));
        jToolBar2.setMinimumSize(new java.awt.Dimension(133, 28));
        jToolBar2.setPreferredSize(new java.awt.Dimension(133, 28));

        newteam.setText("New");
        newteam.setFocusable(false);
        newteam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newteam.setMinimumSize(new java.awt.Dimension(70, 70));
        newteam.setPreferredSize(new java.awt.Dimension(70, 24));
        newteam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newteamActionPerformed(evt);
            }
        });
        jToolBar2.add(newteam);

        deleteteam.setText("Delete");
        deleteteam.setFocusable(false);
        deleteteam.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteteam.setPreferredSize(new java.awt.Dimension(70, 24));
        deleteteam.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteteam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteteamActionPerformed(evt);
            }
        });
        jToolBar2.add(deleteteam);

        teamEdit.setText("Edit");
        teamEdit.setFocusable(false);
        teamEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        teamEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        teamEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamEditActionPerformed(evt);
            }
        });
        jToolBar2.add(teamEdit);
        jToolBar2.add(filler2);

        teamsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name Team", "ScrumMaster"
            }
        ));
        teamsTable.setFocusable(false);
        teamsTable.setRequestFocusEnabled(false);
        teamsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(teamsTable);

        javax.swing.GroupLayout panelTeamsLayout = new javax.swing.GroupLayout(panelTeams);
        panelTeams.setLayout(panelTeamsLayout);
        panelTeamsLayout.setHorizontalGroup(
            panelTeamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        panelTeamsLayout.setVerticalGroup(
            panelTeamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTeamsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Teams", panelTeams);

        jToolBar3.setRollover(true);
        jToolBar3.setFloatable(false);
        jToolBar3.setBorderPainted(false);
        jToolBar3.setMaximumSize(new java.awt.Dimension(133, 28));
        jToolBar3.setMinimumSize(new java.awt.Dimension(133, 28));
        jToolBar3.setPreferredSize(new java.awt.Dimension(133, 28));

        newmember.setText("New");
        newmember.setFocusable(false);
        newmember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newmember.setPreferredSize(new java.awt.Dimension(70, 24));
        newmember.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmemberActionPerformed(evt);
            }
        });
        jToolBar3.add(newmember);

        deletemember.setText("Delete");
        deletemember.setFocusable(false);
        deletemember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deletemember.setPreferredSize(new java.awt.Dimension(70, 24));
        deletemember.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deletemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletememberActionPerformed(evt);
            }
        });
        jToolBar3.add(deletemember);

        membersEdit.setText("Edit");
        membersEdit.setFocusable(false);
        membersEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        membersEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        membersEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersEditActionPerformed(evt);
            }
        });
        jToolBar3.add(membersEdit);
        jToolBar3.add(filler3);

        membersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Team"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        membersTable.setFocusable(false);
        jScrollPane4.setViewportView(membersTable);
        if (membersTable.getColumnModel().getColumnCount() > 0) {
            membersTable.getColumnModel().getColumn(3).setHeaderValue("Team");
        }

        javax.swing.GroupLayout panelMembersLayout = new javax.swing.GroupLayout(panelMembers);
        panelMembers.setLayout(panelMembersLayout);
        panelMembersLayout.setHorizontalGroup(
            panelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        panelMembersLayout.setVerticalGroup(
            panelMembersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMembersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Members", panelMembers);

        jToolBar4.setRollover(true);
        jToolBar4.setBorderPainted(false);
        jToolBar4.setMaximumSize(new java.awt.Dimension(133, 28));
        jToolBar4.setMinimumSize(new java.awt.Dimension(133, 28));
        jToolBar4.setPreferredSize(new java.awt.Dimension(133, 28));

        newStory.setText("New");
        newStory.setFocusable(false);
        newStory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        newStory.setPreferredSize(new java.awt.Dimension(70, 24));
        newStory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        newStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStoryActionPerformed(evt);
            }
        });
        jToolBar4.add(newStory);

        deleteStory.setText("Delete");
        deleteStory.setFocusable(false);
        deleteStory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteStory.setPreferredSize(new java.awt.Dimension(70, 24));
        deleteStory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteStory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStoryActionPerformed(evt);
            }
        });
        jToolBar4.add(deleteStory);

        storyEdit.setText("Edit");
        storyEdit.setFocusable(false);
        storyEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        storyEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        storyEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyEditActionPerformed(evt);
            }
        });
        jToolBar4.add(storyEdit);
        jToolBar4.add(filler4);

        storyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Aceptation Criteria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        storyTable.setFocusable(false);
        jScrollPane5.setViewportView(storyTable);

        javax.swing.GroupLayout PanelUserHistoryLayout = new javax.swing.GroupLayout(PanelUserHistory);
        PanelUserHistory.setLayout(PanelUserHistoryLayout);
        PanelUserHistoryLayout.setHorizontalGroup(
            PanelUserHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        PanelUserHistoryLayout.setVerticalGroup(
            PanelUserHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUserHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("User Story", PanelUserHistory);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Load ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuItemSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemSave.setText("Save");
        MenuItemSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSaveActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemSave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        // Crear el selector de archivos
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileFilter(new FileNameExtensionFilter("Archivos de MS Project (*.mpx)", "mpx"));

        if (selectorArchivos.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            // Mostrar el selector de archivos
            return;
        }

        // Verificar si la extensión del archivo es .mpp
        File archivoSeleccionado = selectorArchivos.getSelectedFile();

        if (!archivoSeleccionado.getName().toLowerCase().endsWith(".mpx")) {
            // Si no, mostrar mensaje de error al usuario
            JOptionPane.showMessageDialog(this, "Seleccione un archivo .mpx", "Error de archivo", JOptionPane.ERROR_MESSAGE);

            return;
        }

        // cargar el modelo
        proyect = new Proyect(archivoSeleccionado.getName(), "undefined");
        proyect.load(archivoSeleccionado.toPath().toString());
        this.setTitle(proyect.getName());

        // poblar las tablas
        this.reloadTaskTable();
        this.reloadTeamsTables();
        this.reloadMembersTables();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jToolBar1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jToolBar1ComponentAdded

    }//GEN-LAST:event_jToolBar1ComponentAdded

    private void newmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmemberActionPerformed
        MemberForm d2 = new MemberForm(this, true);
        d2.setLocationRelativeTo(this);

        // cargar los nombres de los equipos
        for (Team teami : proyect.teams) {
            d2.addTeam(teami.getName());
        }

        d2.setVisible(true);

        if (d2.getMember() == null || !d2.isValueCaptured()) {
            return;
        }

        this.proyect.getTeam(d2.getTeam()).addMember(d2.getMember());
        this.reloadMembersTables();
    }//GEN-LAST:event_newmemberActionPerformed

    private void MenuItemSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSaveActionPerformed
        // Crear el selector de archivos
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        selectorArchivos.setFileFilter(new FileNameExtensionFilter("Archivos de MS Project (*.mpx)", "mpx"));

        if (selectorArchivos.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            // Mostrar el selector de archivos
            return;
        }

        // Verificar si la extensión del archivo es .mpp
        File archivoSeleccionado = selectorArchivos.getSelectedFile();
        System.out.println(archivoSeleccionado.getAbsolutePath());

        int write = JOptionPane.YES_OPTION;
        if (archivoSeleccionado.exists()) {
            write = JOptionPane.showConfirmDialog(this, "Overwrite file?", "Overwrite", JOptionPane.YES_NO_OPTION);
        }

        if (write == JOptionPane.YES_OPTION) {
            proyect.export(archivoSeleccionado.getAbsolutePath());
            System.out.println(proyect.getFile().getPath());
        }

        //aaa
    }//GEN-LAST:event_MenuItemSaveActionPerformed

    private void newteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newteamActionPerformed
        TeamForm d1 = new TeamForm(this, true);
        d1.setLocationRelativeTo(this);
        d1.setVisible(true);

        System.out.println(d1.getTeamName());
        proyect.teams.add(d1.getTeam());
        this.reloadTeamsTables();
    }//GEN-LAST:event_newteamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.taskTable.getSelectedRow() == -1) {
            return;
        }

        //proyect.taskboard.get(this.taskTable.getSelectedRow()).setTeamMember(teamMember);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteteamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteteamActionPerformed

        if (this.teamsTable.getSelectedRow() == -1) {
            return;
        }

        this.proyect.teams.remove(this.teamsTable.getSelectedRow());

        this.reloadTeamsTables();
        this.reloadMembersTables();

    }//GEN-LAST:event_deleteteamActionPerformed

    private void deletememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletememberActionPerformed

        if (this.membersTable.getSelectedRow() == -1) {
            return;
        }

        var row = this.membersTable.getSelectedRow();
        var team = (String) this.membersTable.getModel().getValueAt(row, 3);
        var name = (String) this.membersTable.getModel().getValueAt(row, 1);

        proyect.getTeam(team).removeMember(name);

        this.reloadMembersTables();
    }//GEN-LAST:event_deletememberActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println(this.taskTable.getSelectedRow());

        if (this.taskTable.getSelectedRow() == -1) {
            return;
        }

        this.proyect.taskboard.remove(this.taskTable.getSelectedRow());
        this.reloadTaskTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskActionPerformed
        TaskDialog td = new TaskDialog(this, true);
        td.setLocationRelativeTo(this);
        td.setVisible(true);

        if (!td.isValueCaptured()) {
            return;
        }

        System.out.println(td.getTask());
        this.proyect.taskboard.add(td.getTask());
        this.reloadTaskTable();
    }//GEN-LAST:event_addTaskActionPerformed

    private void taskEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskEditActionPerformed
        int selectedRow = taskTable.getSelectedRow();

        if (selectedRow != -1) {
            TaskDialog td = new TaskDialog(this, true);
            td.setLocationRelativeTo(this);

            String taskName = taskTable.getValueAt(selectedRow, 1).toString();
            td.setTaskName(taskName);
            int taskID = (int) taskTable.getValueAt(selectedRow, 0);
            td.setTaskID(taskID);

            Date startDate = (Date) taskTable.getValueAt(selectedRow, 3);
            Instant startInstant = startDate.toInstant();
            LocalDate startDateLocal = startInstant.atZone(ZoneId.systemDefault()).toLocalDate();
            td.setStartDate(startDateLocal);

            Date endDate = (Date) taskTable.getValueAt(selectedRow, 4);
            Instant endInstant = endDate.toInstant();
            LocalDate endDateLocal = endInstant.atZone(ZoneId.systemDefault()).toLocalDate();
            td.setEndDate(endDateLocal);

            td.setVisible(true);

            if (!td.isValueCaptured()) {
                return;
            }

            // Actualizar los valores de la tabla con los valores editados
            Task editedTask = td.getTask();
            proyect.taskboard.updateTask(editedTask);

            this.reloadTaskTable();
        }
    }//GEN-LAST:event_taskEditActionPerformed

    private void teamEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamEditActionPerformed
        if (this.teamsTable.getSelectedRow() != -1) {
            TeamForm d1 = new TeamForm(this, true);
            d1.setLocationRelativeTo(this);

            d1.setName(teamsTable.getValueAt(teamsTable.getSelectedRow(), 0).toString());
            d1.setScrummaster(teamsTable.getValueAt(teamsTable.getSelectedRow(), 1).toString());

            d1.setVisible(true);

            String updatedName = d1.getTeamName();
            String updatedScrumMaster = d1.getScrumMaster();
            int teamIndex = this.teamsTable.getSelectedRow();

            Team team = proyect.teams.get(teamIndex);
            team.setName(updatedName);
            //team.setScrumMaster(updatedScrumMaster);

            this.reloadTeamsTables();
            this.reloadMembersTables();

        }
    }//GEN-LAST:event_teamEditActionPerformed

    private void membersEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersEditActionPerformed
        if (membersTable.getSelectedRow() != -1) {
            MemberForm memberForm = new MemberForm(this, true);
            memberForm.setLocationRelativeTo(this);

            // Obtener los valores de la fila seleccionada en la tabla
            int selectedRow = membersTable.getSelectedRow();
            String id = membersTable.getValueAt(selectedRow, 0).toString();
            String name = membersTable.getValueAt(selectedRow, 1).toString();
            String email = membersTable.getValueAt(selectedRow, 2).toString();
            String team = membersTable.getValueAt(selectedRow, 3).toString();

            for (Team teami : proyect.teams) {
                memberForm.addTeam(teami.getName());
            }
            // Pasar los valores al formulario de edición
            memberForm.setID(id);
            memberForm.setName(name);
            memberForm.setEmail(email);

            memberForm.setVisible(true);
            if (memberForm.isValueCaptured()) {
                String updatedName = memberForm.getName();
                String updatedID = memberForm.getID();
                String updatedEmail = memberForm.getEmail();
                String updatedTeam = memberForm.getTeams();

                // Obtener el equipo correspondiente en tu sistema
                Team teamObject = proyect.getTeam(updatedTeam);
                if (teamObject != null) {
                    // Actualizar el miembro correspondiente en el equipo
                    teamObject.updateMember(updatedID, updatedName, updatedEmail);

                    // Vuelve a cargar los miembros en la tabla
                    this.reloadMembersTables();
                } else {
                    System.out.println("El equipo no existe");
                }
            }
        }

    }//GEN-LAST:event_membersEditActionPerformed

    private void newStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStoryActionPerformed
        UserStoryForm d1 = new UserStoryForm(this, true);
        d1.setLocationRelativeTo(this);
        d1.setVisible(true);

        
        proyect.stories.add(d1.getHistory());
        this.reloadHistoryTables();
    }//GEN-LAST:event_newStoryActionPerformed

    private void deleteStoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStoryActionPerformed
        if (this.storyTable.getSelectedRow() == -1) {
            return;
        }

        this.proyect.stories.remove(this.storyTable.getSelectedRow());
        this.reloadHistoryTables();
    }//GEN-LAST:event_deleteStoryActionPerformed

    private void storyEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyEditActionPerformed
        if (this.storyTable.getSelectedRow() != -1) {
            UserStoryForm d1 = new UserStoryForm(this, true);
            d1.setLocationRelativeTo(this);

            d1.setHistoryName(storyTable.getValueAt(storyTable.getSelectedRow(), 0).toString());
            d1.setHistoryDescription(storyTable.getValueAt(storyTable.getSelectedRow(), 1).toString());
            d1.setHistoryCriteria(storyTable.getValueAt(storyTable.getSelectedRow(), 2).toString());

            d1.setVisible(true);

            String updatedName = d1.getHistoryName();
            String updatedDescription = d1.getHistoryDescription();
            String updatedCriteria = d1.getHistoryCriteria();

            if (updatedName != null && updatedDescription != null && updatedCriteria != null) {
                int selectedRow = this.storyTable.getSelectedRow();
                UserHistory selectedHistory = proyect.stories.get(selectedRow);

                // Actualizar los datos en el objeto UserHistory
                selectedHistory.setTitle(updatedName);
                selectedHistory.setDescription(updatedDescription);
                selectedHistory.setAceptationCriteria(updatedCriteria);

                // Actualizar la tabla a través de la clase proyect
                proyect.updateStory(selectedRow, updatedName, updatedDescription, updatedCriteria);

                // Volver a cargar la tabla
                this.reloadHistoryTables();
            }
        }
    }//GEN-LAST:event_storyEditActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }

        //</editor-fold>

        /* Create and display the form */
        MainMenu main = new MainMenu();

        StartDialog sd = new StartDialog(main, true);
        sd.setLocationRelativeTo(main);
        sd.setVisible(true);

        java.awt.EventQueue.invokeLater(() -> {
            main.setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemSave;
    private javax.swing.JPanel PanelUserHistory;
    private javax.swing.JButton addTask;
    private javax.swing.JButton deleteStory;
    private javax.swing.JButton deletemember;
    private javax.swing.JButton deleteteam;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JButton membersEdit;
    private javax.swing.JTable membersTable;
    private javax.swing.JButton newStory;
    private javax.swing.JButton newmember;
    private javax.swing.JButton newteam;
    private javax.swing.JPanel panelMembers;
    private javax.swing.JPanel panelTask;
    private javax.swing.JPanel panelTeams;
    private javax.swing.JButton storyEdit;
    private javax.swing.JTable storyTable;
    private javax.swing.JButton taskEdit;
    private javax.swing.JTable taskTable;
    private javax.swing.JButton teamEdit;
    private javax.swing.JTable teamsTable;
    // End of variables declaration//GEN-END:variables

    public void reloadTeamsTables() {
        var teamsModel = (DefaultTableModel) this.teamsTable.getModel();
        teamsModel.setRowCount(0);
        for (int i = 0; i < proyect.teams.size(); i++) {
            var foo = proyect.teams.get(i);
            teamsModel.addRow(new Object[]{
                foo.getName(),
                "SCRUM MASTER"
            });
        }
    }

    public void reloadTaskTable() {
        var taskModel = (DefaultTableModel) this.taskTable.getModel();
        taskModel.setRowCount(0);

        for (int i = 0; i < proyect.taskboard.size(); i++) {
            var foo = proyect.taskboard.get(i);

            String teamMemberName = "";
            if (foo.getTeamMember() != null) {
                teamMemberName = foo.getTeamMember().getName();
            }

            taskModel.addRow(new Object[]{
                foo.getId(),
                foo.getName(),
                foo.getDurationDays(),
                teamMemberName,
                foo.getStart(),
                foo.getEnd()
            });
        }
    }

    public void reloadMembersTables() {

        var membersModel = (DefaultTableModel) this.membersTable.getModel();
        membersModel.setRowCount(0);

        for (int i = 0; i < proyect.teams.size(); i++) {
            Team team = proyect.teams.get(i);

            for (int j = 0; j < team.size(); j++) {
                var foo = team.getMemberByIndex(j);

                membersModel.addRow(new Object[]{
                    foo.getId(),
                    foo.getName(),
                    foo.getEmail(),
                    team.getName()
                });
            }
        }
    }
    public void reloadHistoryTables() {

        var storyModel = (DefaultTableModel) this.storyTable.getModel();
        storyModel.setRowCount(0);
        for (int i = 0; i < proyect.stories.size(); i++) {
            var foo = proyect.stories.get(i);
            storyModel.addRow(new Object[]{
                foo.getTitle(),
                foo.getDescription(),
                foo.getAceptationCriteria()
            });
        }
    }

}
