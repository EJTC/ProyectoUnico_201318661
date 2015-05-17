package proyecto_unico_2015;

@SuppressWarnings("serial")
public class interfaz_201318661 extends javax.swing.JFrame {
	 public interfaz_201318661() {
	        initComponents();
	    }

	    @SuppressWarnings({ "unchecked", "rawtypes" })
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        jDialog1 = new javax.swing.JDialog();
	        label1 = new java.awt.Label();
	        agregar = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        select = new javax.swing.JList();
	        ver = new javax.swing.JButton();
	        jLabel2 = new javax.swing.JLabel();
	        jScrollPane3 = new javax.swing.JScrollPane();
	        panel = new javax.swing.JTextArea();
	        editar = new javax.swing.JButton();

	        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
	        jDialog1.getContentPane().setLayout(jDialog1Layout);
	        jDialog1Layout.setHorizontalGroup(
	            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 400, Short.MAX_VALUE)
	        );
	        jDialog1Layout.setVerticalGroup(
	            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 300, Short.MAX_VALUE)
	        );

	        label1.setText("label1");

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
	        setResizable(false);

	        agregar.setText("Agregar");
	        agregar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                agregarActionPerformed(evt);
	            }
	        });

	        select.setModel(new javax.swing.AbstractListModel() {
	            String[] strings = { "Venta", "Empleado", "Producto", "Cliente" };
	            public int getSize() { return strings.length; }
	            public Object getElementAt(int i) { return strings[i]; }
	        });
	        select.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
	        select.setToolTipText("");
	        select.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	        select.setSelectionBackground(new java.awt.Color(102, 255, 102));
	        jScrollPane1.setViewportView(select);

	        ver.setText("Ver");
	        ver.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                verActionPerformed(evt);
	            }
	        });

	        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
	        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_1.png"))); // NOI18N

	        panel.setEditable(false);
	        panel.setColumns(20);
	        panel.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
	        panel.setRows(5);
	        panel.setText("Los reportes seran mostrados aqui.");
	        jScrollPane3.setViewportView(panel);

	        editar.setText("Editar");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addContainerGap()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
	                                    .addComponent(editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                    .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                                .addGap(0, 0, Short.MAX_VALUE))
	                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(0, 10, Short.MAX_VALUE)
	                        .addComponent(jLabel2)))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(jLabel2)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(agregar)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(editar)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(ver))
	                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        pack();
	    }// </editor-fold>                        

	    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        int opcion = select.getSelectedIndex();
	        agregarVenta_201318661 mostrarVenta = new agregarVenta_201318661();
	        agregarCliente_201318661 mostrarCliente = new agregarCliente_201318661();
	        agregarProducto_201318661 mostrarProducto = new agregarProducto_201318661();
	        agregarEmpleado_201318661 mostrarEmpleado = new agregarEmpleado_201318661();
	        
	        
	        switch(opcion){
	            case 0:
	                mostrarVenta.setVisible(true);
	                break;
	                
	            case 1:
	                mostrarEmpleado.setVisible(true);
	                break;
	                    
	            case 2:
	                mostrarProducto.setVisible(true);
	                break;
	                
	            case 3:
	                mostrarCliente.setVisible(true);
	                break;   
	        }
	            
	                
	    }                                       

	    private void verActionPerformed(java.awt.event.ActionEvent evt) {                                    
	        panel.setText("Hola mundo desde Java");
	    }                                   

	    
	    public static void main(String args[]) {
	        
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(interfaz_201318661.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(interfaz_201318661.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(interfaz_201318661.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(interfaz_201318661.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new interfaz_201318661().setVisible(true);
	            }
	        });
	    }
	                      
	    private javax.swing.JButton agregar;
	    private javax.swing.JButton editar;
	    private javax.swing.JDialog jDialog1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JScrollPane jScrollPane3;
	    private java.awt.Label label1;
	    private javax.swing.JTextArea panel;
	    @SuppressWarnings("rawtypes")
		private javax.swing.JList select;
	    private javax.swing.JButton ver;

}
