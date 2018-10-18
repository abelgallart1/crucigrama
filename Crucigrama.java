/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crucigrama;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;
import javax.swing.JTextField;
import java.util.Timer;

/**
 *
 * @author abel
 */
public class Crucigrama extends javax.swing.JFrame {

    /**
     * Creates new form Crucigrama
     */
       int l=0;  String [][]tabla;
       Timer timer=new Timer();

       String []letras ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o",
                       "p","q","r","s","t","u","v","w","x","y","z"};
      
       Hashtable diccionario=new Hashtable();
       ArrayList DICCIONARIO=new ArrayList();
       public FileDialog fd=new FileDialog(this,"",FileDialog.LOAD);
       Random random=new Random();
          
       ArrayList Da=new ArrayList();
       ArrayList Db=new ArrayList();
       ArrayList Dc=new ArrayList();
       ArrayList Dd=new ArrayList();
       ArrayList De=new ArrayList();
       ArrayList Df=new ArrayList();
       ArrayList Dg=new ArrayList();
       ArrayList Dh=new ArrayList();
       ArrayList Di=new ArrayList();
       ArrayList Dj=new ArrayList();
       ArrayList Dk=new ArrayList();
       ArrayList Dl=new ArrayList();
       ArrayList Dm=new ArrayList();
       ArrayList Dn=new ArrayList();
       ArrayList Dñ=new ArrayList();
       ArrayList Do=new ArrayList();
       ArrayList Dp=new ArrayList();
       ArrayList Dq=new ArrayList();
       ArrayList Dr=new ArrayList();
       ArrayList Ds=new ArrayList();
       ArrayList Dt=new ArrayList();
       ArrayList Du=new ArrayList();
       ArrayList Dv=new ArrayList();
       ArrayList Dw=new ArrayList();
       ArrayList Dx=new ArrayList();
       ArrayList Dy=new ArrayList();
       ArrayList Dz=new ArrayList();
       
    
    public Crucigrama() {
        initComponents();
        this.setTitle("Crucigrama");
        Scanner scanner=null;
        while(scanner==null){
          try { 
            javax.swing.JOptionPane.showMessageDialog(null,"Cargue el diccionario"
                                            ,"Cargar",javax.swing.JOptionPane.OK_OPTION);   
            
                               
            fd.setVisible(true);
            scanner = new Scanner(new BufferedReader(new FileReader(fd.getDirectory()+fd.getFile())));
        } catch (Exception ex) {ex.printStackTrace();}}
        
          
              
              
         while (scanner.hasNextLine()) {
          String aux = scanner.nextLine();
          aux=aux.replaceAll("ó", "o");
          aux=aux.replaceAll("á","a");
          aux=aux.replaceAll("é","e");
          aux=aux.replaceAll("í","i");
          aux=aux.replaceAll("ú","u");
          aux=aux.replaceAll("�","ñ");
          aux=aux.replace("-", " ");
          
         
          if (!aux.equals(""))   
              
            {
               String[] arr = aux.split(". ",2);
               String  aux1=""; 
                
              for(int i=1;i<arr.length;i++) aux1+=arr[i];
              arr[0]=arr[0].replace("1", "");
              arr[0]=arr[0].replace("2", "");    
              arr[0]=arr[0].replace(" ", "");
              if (arr.length!=0) diccionario.put(arr[0], aux1);
              
            }
        
        }
         
         Enumeration en=diccionario.keys();
         
         while(en.hasMoreElements()){
             String aux=(String)en.nextElement();
         if (aux.startsWith("a")) Da.add(aux);
         if (aux.startsWith("b")) Db.add(aux);             
         if (aux.startsWith("c")) Dc.add(aux);             
         if (aux.startsWith("d")) Dd.add(aux);             
         if (aux.startsWith("e")) De.add(aux);             
         if (aux.startsWith("f")) Df.add(aux);             
         if (aux.startsWith("g")) Dg.add(aux);             
         if (aux.startsWith("h")) Dh.add(aux);             
         if (aux.startsWith("i")) Di.add(aux);             
         if (aux.startsWith("j")) Dj.add(aux);             
         if (aux.startsWith("k")) Dk.add(aux);             
         if (aux.startsWith("l")) Dl.add(aux);             
         if (aux.startsWith("m")) Dm.add(aux);             
         if (aux.startsWith("n")) Dn.add(aux);             
         if (aux.startsWith("ñ")) Dñ.add(aux);             
         if (aux.startsWith("o")) Do.add(aux);             
         if (aux.startsWith("p")) Dp.add(aux);             
         if (aux.startsWith("q")) Dq.add(aux);             
         if (aux.startsWith("r")) Dr.add(aux);             
         if (aux.startsWith("s")) Ds.add(aux);             
         if (aux.startsWith("t")) Dt.add(aux);             
         if (aux.startsWith("u")) Du.add(aux);             
         if (aux.startsWith("v")) Dv.add(aux);             
         if (aux.startsWith("w")) Dw.add(aux);             
         if (aux.startsWith("x")) Dx.add(aux);             
         if (aux.startsWith("y")) Dy.add(aux);             
         if (aux.startsWith("z")) Dz.add(aux);             
         
         
         
         }
         
         
         DICCIONARIO.add(Da);
         DICCIONARIO.add(Db);
         DICCIONARIO.add(Dc);
         DICCIONARIO.add(Dd);
         DICCIONARIO.add(De);
         DICCIONARIO.add(Df);
         DICCIONARIO.add(Dg);
         DICCIONARIO.add(Dh);
         DICCIONARIO.add(Di);
         DICCIONARIO.add(Dj);
         DICCIONARIO.add(Dk);
         DICCIONARIO.add(Dl);
         DICCIONARIO.add(Dm);
         DICCIONARIO.add(Dn);
         DICCIONARIO.add(Dñ);
         DICCIONARIO.add(Do);
         DICCIONARIO.add(Dp);
         DICCIONARIO.add(Dq);
         DICCIONARIO.add(Dr);
         DICCIONARIO.add(Ds);
         DICCIONARIO.add(Dt);
         DICCIONARIO.add(Du);
         DICCIONARIO.add(Dv);
         DICCIONARIO.add(Dw);
         DICCIONARIO.add(Dx);
         DICCIONARIO.add(Dy);
         DICCIONARIO.add(Dz);
         
      
         this.setLocationRelativeTo(fd);
       
    }
 
       
public void busca(int l){
  
   String aux=""; 
  
   
        while(aux.length()<l ){ArrayList arraux=((ArrayList)(DICCIONARIO.get((int)(DICCIONARIO.size()*random.nextFloat()))));
                               aux+=((String)(arraux.get((int)(arraux.size()*random.nextFloat()))))+"$";
                                if (aux.length()>l) aux="";
                              }
              
         tabla=new String[l][l];
         for(int f=0;f<l;f++) for(int c=0;c<l;c++) tabla[f][c]=" ";
             
         for(int i=0;i<aux.length();i++) tabla[0][i]=aux.charAt(i)+"";
                        
     for(int i=0;i<l;i+=6){
            
                    String s=(String)tabla[0][i];
                    String aux2="";
                    
                     
        while(aux2.length()!=l){
                          
                     do {aux2="";
                         if (s.equals("a")) aux2=""+Da.get((int)(Da.size()*random.nextFloat()));
                         else if (s.equals("b")) aux2=""+Db.get((int)(Db.size()*random.nextFloat()));
                         else if (s.equals("c")) aux2=""+Dc.get((int)(Dc.size()*random.nextFloat()));
                         else if (s.equals("d")) aux2=""+Dd.get((int)(Dd.size()*random.nextFloat()));
                         else if (s.equals("e")) aux2=""+De.get((int)(De.size()*random.nextFloat()));
                         else if (s.equals("f")) aux2=""+Df.get((int)(Df.size()*random.nextFloat()));
                         else if (s.equals("g")) aux2=""+Dg.get((int)(Dg.size()*random.nextFloat()));
                         else if (s.equals("h")) aux2=""+Dh.get((int)(Dh.size()*random.nextFloat()));
                         else if (s.equals("i")) aux2=""+Di.get((int)(Di.size()*random.nextFloat()));
                         else if (s.equals("j")) aux2=""+Dj.get((int)(Dj.size()*random.nextFloat()));
                         else if (s.equals("k")) aux2=""+Dk.get((int)(Dk.size()*random.nextFloat()));
                         else if (s.equals("l")) aux2=""+Dl.get((int)(Dl.size()*random.nextFloat()));
                         else if (s.equals("m")) aux2=""+Dm.get((int)(Dm.size()*random.nextFloat()));
                         else if (s.equals("n")) aux2=""+Dn.get((int)(Dn.size()*random.nextFloat()));
                         else if (s.equals("ñ")) aux2=""+Dñ.get((int)(Dñ.size()*random.nextFloat()));
                         else if (s.equals("o")) aux2=""+Do.get((int)(Do.size()*random.nextFloat()));
                         else if (s.equals("p")) aux2=""+Dp.get((int)(Dp.size()*random.nextFloat()));
                         else if (s.equals("q")) aux2=""+Dq.get((int)(Dq.size()*random.nextFloat()));
                         else if (s.equals("r")) aux2=""+Dr.get((int)(Dr.size()*random.nextFloat()));
                         else if (s.equals("s")) aux2=""+Ds.get((int)(Ds.size()*random.nextFloat()));
                         else if (s.equals("t")) aux2=""+Dt.get((int)(Dt.size()*random.nextFloat()));
                         else if (s.equals("u")) aux2=""+Du.get((int)(Du.size()*random.nextFloat()));
                         else if (s.equals("v")) aux2=""+Dv.get((int)(Dv.size()*random.nextFloat()));
                         else if (s.equals("w")) aux2=""+Dw.get((int)(Dw.size()*random.nextFloat()));
                         else if (s.equals("x")) aux2=""+Dx.get((int)(Dx.size()*random.nextFloat()));
                         else if (s.equals("y")) aux2=""+Dy.get((int)(Dy.size()*random.nextFloat()));
                         else if (s.equals("z")) aux2=""+Dz.get((int)(Dz.size()*random.nextFloat()));
                         aux2+="*";
                                           
                         } while(aux2.length()>=l&&!s.equals(" "));
                         
                  
                 int ran=(int)(10*random.nextFloat());
                         
                 if (ran==0||ran==2||ran==4)  aux2+=" ";
                 else if (ran==1||ran==3||ran==5) aux2+="  ";
                 
                 String aux3="";                        
                         
                                             
                 while (aux2.length()+aux3.length()<l){
                         ArrayList arraux=((ArrayList)(DICCIONARIO.get((int)(DICCIONARIO.size()*random.nextFloat()))));
                         String aux6=((String)(arraux.get((int)(arraux.size()*random.nextFloat()))));

                         if (aux6.length()==1) aux6=" ";
                         
                         int ran1=(int)(10*random.nextFloat());
                         if (ran1==0||ran1==2||ran1==4)  aux3+="$"+aux6+"*";
                         else  aux3+="$"+aux6+"* ";
                          }
                         aux2+=aux3;
                             
        }
                      
        for(int x=0;x<l;x++) tabla[x][i]=aux2.charAt(x)+"";
    }      //vertircal

  
     /////////////////////////////////////////////////////////
    
    for(int i=2;i<l;i+=2){
            
                    String s=(String)tabla[i][0];
                    String aux2="";
                    
                     
        while(aux2.length()!=l){
                          
                     do {aux2="";
                         if (s.equals("a")) aux2=""+Da.get((int)(Da.size()*random.nextFloat()))+"*";
                         else if (s.equals("b")) aux2=""+Db.get((int)(Db.size()*random.nextFloat()))+"*";
                         else if (s.equals("c")) aux2=""+Dc.get((int)(Dc.size()*random.nextFloat()))+"*";
                         else if (s.equals("d")) aux2=""+Dd.get((int)(Dd.size()*random.nextFloat()))+"*";
                         else if (s.equals("e")) aux2=""+De.get((int)(De.size()*random.nextFloat()))+"*";
                         else if (s.equals("f")) aux2=""+Df.get((int)(Df.size()*random.nextFloat()))+"*";
                         else if (s.equals("g")) aux2=""+Dg.get((int)(Dg.size()*random.nextFloat()))+"*";
                         else if (s.equals("h")) aux2=""+Dh.get((int)(Dh.size()*random.nextFloat()))+"*";
                         else if (s.equals("i")) aux2=""+Di.get((int)(Di.size()*random.nextFloat()))+"*";
                         else if (s.equals("j")) aux2=""+Dj.get((int)(Dj.size()*random.nextFloat()))+"*";
                         else if (s.equals("k")) aux2=""+Dk.get((int)(Dk.size()*random.nextFloat()))+"*";
                         else if (s.equals("l")) aux2=""+Dl.get((int)(Dl.size()*random.nextFloat()))+"*";
                         else if (s.equals("m")) aux2=""+Dm.get((int)(Dm.size()*random.nextFloat()))+"*";
                         else if (s.equals("n")) aux2=""+Dn.get((int)(Dn.size()*random.nextFloat()))+"*";
                         else if (s.equals("ñ")) aux2=""+Dñ.get((int)(Dñ.size()*random.nextFloat()))+"*";
                         else if (s.equals("o")) aux2=""+Do.get((int)(Do.size()*random.nextFloat()))+"*";
                         else if (s.equals("p")) aux2=""+Dp.get((int)(Dp.size()*random.nextFloat()))+"*";
                         else if (s.equals("q")) aux2=""+Dq.get((int)(Dq.size()*random.nextFloat()))+"*";
                         else if (s.equals("r")) aux2=""+Dr.get((int)(Dr.size()*random.nextFloat()))+"*";
                         else if (s.equals("s")) aux2=""+Ds.get((int)(Ds.size()*random.nextFloat()))+"*";
                         else if (s.equals("t")) aux2=""+Dt.get((int)(Dt.size()*random.nextFloat()))+"*";
                         else if (s.equals("u")) aux2=""+Du.get((int)(Du.size()*random.nextFloat()))+"*";
                         else if (s.equals("v")) aux2=""+Dv.get((int)(Dv.size()*random.nextFloat()))+"*";
                         else if (s.equals("w")) aux2=""+Dw.get((int)(Dw.size()*random.nextFloat()))+"*";
                         else if (s.equals("x")) aux2=""+Dx.get((int)(Dx.size()*random.nextFloat()))+"*";
                         else if (s.equals("y")) aux2=""+Dy.get((int)(Dy.size()*random.nextFloat()))+"*";
                         else if (s.equals("z")) aux2=""+Dz.get((int)(Dz.size()*random.nextFloat()))+"*";
                         else if (s.equals("$")) aux2="";
                         else if (s.equals("*")) aux2="*";
                                          
                         } while(aux2.length()>=l&&!s.equals(" "));
                         
                         int ran=(int)(10*random.nextFloat());
                         
                    if (ran==0||ran==2||ran==4)  aux2+=" ";
                    else if (ran==1||ran==3||ran==5) aux2+="  ";                            
                    String aux3="";                        
                         
                                            
                 while (aux2.length()+aux3.length()<l){
                         
                     ArrayList arraux=((ArrayList)(DICCIONARIO.get((int)(DICCIONARIO.size()*random.nextFloat()))));
                         
                         int ran1=(int)(10*random.nextFloat());
                         String aux6=((String)(arraux.get((int)(arraux.size()*random.nextFloat()))));
                         
                         
                              if (ran1==0||ran1==2||ran1==4)  aux3+="$"+aux6+"*";
                               else  if(ran1==1||ran1==3||ran1==5) aux3+="$"+aux6+"* ";
                              else   aux3+="$"+aux6+"*  ";
                                                
                         }
                     
                 aux2+=aux3;
                             
       
    if (aux2.length()==l){                 
       for(int x=0;x<l;x++) 
        {  String aux5="";
             for(int p=0;p<aux2.length();p++)
               {  if (aux2.charAt(p)!=' ') aux5+=aux2.charAt(p)+"";
                  else aux5+=tabla[i][p];
               }            
          
           aux2=aux5; 
          if (!tabla[i][x].equals(aux2.charAt(x)+"")&&!tabla[i][x].equals(" ")) {aux2="";break;}
        }
      }      
   }//while
  
    for(int x=0;x<l;x++) tabla[i][x]=aux2.charAt(x)+"";
        System.err.println(aux2);
    }     //horizontal
    


     /////////////////////////////////////////////////////////      
      
    String [][]tablaX=new String[l+1][l+1];
     
    for(int f=0;f<l+1;f++) for(int c=0;c<l+1;c++) tablaX[f][c]=" ";
     
    for(int f=0;f<l;f++) for(int c=0;c<l;c++) tablaX[f+1][c+1]=tabla[f][c];
    
    tabla=tablaX;
     
    for(int i=1;i<l;i+=6) if (!tabla[1][i].equals(" ")&&!tabla[1][i].equals("*")&&
                                                       !tabla[1][i].equals("$")) tabla[0][i]="$";
    for(int i=1;i<l;i+=2) if (!tabla[i][1].equals(" ")&&!tabla[i][1].equals("*")&&
                                                        !tabla[i][1].equals("$")) tabla[i][0]="$";
    if (l>16){
         try { 
               ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream((fd.getDirectory()+"tabla"+l+""+tabla.hashCode())));
               out.writeObject(tabla);
              } catch (Exception ex) {ex.printStackTrace();}
        }
    
}    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JEditorPane();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(6, 6));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 770));

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        jButton2.setText("Cargar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 10, 70, -1));

        area.setEditable(false);
        jScrollPane1.setViewportView(area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 500, 750));

        jSlider1.setMaximum(15);
        jSlider1.setMinimum(4);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setToolTipText("");
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 130, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 30, 20));

        jButton3.setLabel("Resolver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        l=jSlider1.getValue();       
        timer.cancel();
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.GridLayout(l, l)); 
       
        jPanel1.setSize(l*30,l*30);
       
        busca(l);
        
    int cont=1;            
    for(int f=0;f<l;f++)
    for(int c=0;c<l;c++) { JTextField tf=new JTextField(" ");
                           jPanel1.add(tf);
                           if (tabla[f][c].equals("*"))   {tabla[f][c]=" ";
                                                           }                    
                            if (tabla[f][c].equals(" ")
                                    || tabla[f][c].equals("$")
                                    )   {tf.setEnabled(false);}
                            
                             else{tf.addKeyListener(new java.awt.event.KeyAdapter() {
                                  public void keyPressed(java.awt.event.KeyEvent evt) {
                                  jTextFieldKeyPressed(evt,tf);}});
    
                           
                             tf.addMouseListener(new java.awt.event.MouseAdapter() {
                                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                                  jTextFieldMouseClicked(evt,tf);}}); 
                          
                           
                               }

                            
                            if (tabla[f][c].equals("$")) {
                                                          tf.setText(cont+"");
                                                          tf.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
                                                          tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                                          cont++;
                                                         } 
    
    
                            }

        jPanel1.validate();
        this.validate();
        
         
        String text="Horizontal:\n";
        
        for (int f=1;f<l;f+=2)
        {String aux=""; 
            for(int c=0;c<l;c++)
            {if (tabla[f][c].equals("$")||f==1){aux=""; if (f!=1) while(tabla[f][c].equals("$")) c++;
                              
                              String contH=((JTextField)jPanel1.getComponent(f*l+c-1)).getText();
                              
                               while(c<l&&(!tabla[f][c].equals(" ")&&!tabla[f][c].equals("$")))
                              {aux+=tabla[f][c];c++;}
                              if (!aux.equals("")) { 
                                  text+=contH+" "+aux+" ."+aux+diccionario.get(aux)+"\n\n";
                                                   }
                                }
                
            
            }
       
        }
       
        text+="\n"+"Vertical:\n";
        
        for (int f=1;f<l;f+=6)
        {String aux=""; 
            for(int c=0;c<l;c++)
            {if (tabla[c][f].equals("$")){aux=""; while(tabla[c][f].equals("$")) c++;
                               String contV=((JTextField)jPanel1.getComponent((c-1)*l+f)).getText();
                               while(c<l&&(!tabla[c][f].equals(" ")&&!tabla[c][f].equals("$")))
                              {aux+=tabla[c][f];c++;}
                              if (!aux.equals("")){text+=contV+" "+aux+" ."+aux+diccionario.get(aux)+"\n\n";
                                                  }
                                }
            }
         
        }
        
        area.setText(text);
     
     timer=new Timer();
           
     TimerTask timerTask = new TimerTask() {
         
         
         public void run() { 
                             for(int f=1;f<l;f++)                         
                                 for(int c=1;c<l;c++)
                                   if(!tabla[f][c].equals(((JTextField)jPanel1.getComponent(f*l+c)).getText())
                                           &&
                                      !((JTextField)jPanel1.getComponent(f*l+c)).getText().equals(" ")
                                     )
                                           ((JTextField)jPanel1.getComponent(f*l+c)).setBackground(Color.red);
                                   else{ 
                                       
                                       if (jPanel1.getComponent(f*l+c).getBackground().equals(Color.red))
                                          jPanel1.getComponent(f*l+c).setBackground(Color.white);
                                          
                                          jPanel1.getComponent(f*l+c).setBackground(                                               
                                                  jPanel1.getComponent(f*l+c).getBackground());
                                          
                                        }  
                              
                              boolean correcto=true;                                  
                             for(int f=0;f<l;f++)for(int c=0;c<l;c++)
                              if (!tabla[f][c].equals("$")&&
                                      !((JTextField)jPanel1.getComponent(f*l+c)).getText().equals(tabla[f][c]))
                              correcto=false;
                                                          
                             if (correcto){
                                 javax.swing.JOptionPane.showMessageDialog(null,"Has completado el crucigrama"
                                            ,"Fin del juego",javax.swing.JOptionPane.OK_OPTION);   
            
                             
                             java.awt.Component []comp=jPanel1.getComponents();
                             for(int i=0;i<comp.length;i++)
                                if(comp[i].isEnabled()) ((JTextField)comp[i]).setText(" ");
                             }
                             
               } 


                        
                                                           // Aquí el código que queremos ejecutar. 
                                      };

     
 
     timer.scheduleAtFixedRate(timerTask, 0,100);
        
                

               // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   
    fd.setVisible(true);
        
    try { 
         ObjectInputStream in=new ObjectInputStream(new FileInputStream((fd.getDirectory()+fd.getFile())));
         tabla=(String[][])in.readObject();
        } catch (Exception ex) {ex.printStackTrace();}
               
         l=tabla.length-1;       
        jLabel1.setText(l+"");
        timer.cancel();
        jPanel1.removeAll();
        jPanel1.setLayout(new java.awt.GridLayout(l, l)); 
       
        jPanel1.setSize(l*30,l*30);
          
    int cont=1; 
    
    for(int f=0;f<l;f++)
    for(int c=0;c<l;c++) { JTextField tf=new JTextField(" ");
                           jPanel1.add(tf);
                                                                        
                           if (tabla[f][c].equals("*"))   {tabla[f][c]=" ";
                                                          }
                           if (tabla[f][c].equals(" ")
                                    || tabla[f][c].equals("$")
                                    )   {tf.setEnabled(false);}
                          
                           
                           else{tf.addKeyListener(new java.awt.event.KeyAdapter() {
                                  public void keyPressed(java.awt.event.KeyEvent evt) {
                                  jTextFieldKeyPressed(evt,tf);}});
    
                           
                             tf.addMouseListener(new java.awt.event.MouseAdapter() {
                                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                                  jTextFieldMouseClicked(evt,tf);}}); 
                          
                           
                               }
                           
                           
                           if (tabla[f][c].equals("$")) {
                                                          tf.setText(cont+"");
                                                          tf.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
                                                          tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
                                                          cont++;
                                                         } 
    
                            }

        jPanel1.validate();
        this.validate();
        
        String text="Horizontal:\n";
        
        for (int f=1;f<l;f+=2)
        {String aux=""; 
            for(int c=0;c<l;c++)
            {if (tabla[f][c].equals("$")||f==1){aux=""; if (f!=1) while(tabla[f][c].equals("$")) c++;
                              
                              String contH=((JTextField)jPanel1.getComponent(f*l+c-1)).getText();
                              
                               while(c<l&&(!tabla[f][c].equals(" ")&&!tabla[f][c].equals("$")))
                              {aux+=tabla[f][c];c++;}
                              if (!aux.equals("")) { 
                                  text+=contH+" "+aux+" ."+aux+diccionario.get(aux)+"\n\n";
                                                   }
                                }
                
            
            }
       
        }
       
        text+="\n"+"Vertical:\n";
        
        for (int f=1;f<l;f+=6)
        {String aux=""; 
            for(int c=0;c<l;c++)
            {if (tabla[c][f].equals("$")){aux=""; while(tabla[c][f].equals("$")) c++;
                               String contV=((JTextField)jPanel1.getComponent((c-1)*l+f)).getText();
                               while(c<l&&(!tabla[c][f].equals(" ")&&!tabla[c][f].equals("$")))
                              {aux+=tabla[c][f];c++;}
                              if (!aux.equals("")){text+=contV+" "+aux+" ."+aux+diccionario.get(aux)+"\n\n";
                                                  }
                                }
            }
         
        }
        
        area.setText(text);
     
     timer=new Timer();
           
     TimerTask timerTask = new TimerTask() {
         
         
         public void run() { 
                             for(int f=1;f<l;f++)                         
                                 for(int c=1;c<l;c++)
                                   if(!tabla[f][c].equals(((JTextField)jPanel1.getComponent(f*l+c)).getText())
                                           &&
                                      !((JTextField)jPanel1.getComponent(f*l+c)).getText().equals(" ")
                                     )
                                           ((JTextField)jPanel1.getComponent(f*l+c)).setBackground(Color.red);
                                   else{ 
                                       
                                       if (jPanel1.getComponent(f*l+c).getBackground().equals(Color.red))
                                          jPanel1.getComponent(f*l+c).setBackground(Color.white);
                                          
                                          jPanel1.getComponent(f*l+c).setBackground(                                               
                                                  jPanel1.getComponent(f*l+c).getBackground());
                                          
                                        }  
                              
                              boolean correcto=true;                                  
                             for(int f=0;f<l;f++)for(int c=0;c<l;c++)
                              if (!tabla[f][c].equals("$")&&
                                      !((JTextField)jPanel1.getComponent(f*l+c)).getText().equals(tabla[f][c]))
                              correcto=false;
                                                          
                             if (correcto){
                                 javax.swing.JOptionPane.showMessageDialog(null,"Has completado el crucigrama"
                                            ,"Fin del juego",javax.swing.JOptionPane.OK_OPTION);   
            
                             
                             java.awt.Component []comp=jPanel1.getComponents();
                             for(int i=0;i<comp.length;i++)
                                if(comp[i].isEnabled()) ((JTextField)comp[i]).setText(" ");
                             }
                             
               } 


                        
                                                           // Aquí el código que queremos ejecutar. 
                                      };

     
 
     timer.scheduleAtFixedRate(timerTask, 0,100);
        
                
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
            jLabel1.setText(jSlider1.getValue()+"");
// TODO add your handling code here:
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 
        java.awt.Component []comp=jPanel1.getComponents();
        for(int i=0;i<comp.length;i++) 
            if (comp[i].isEnabled())   ((JTextField)comp[i]).setText(tabla[i/l][i%l]);

    }//GEN-LAST:event_jButton3ActionPerformed
    
     boolean hor=true;
     
      private void jTextFieldMouseClicked(java.awt.event.MouseEvent evt, JTextField tf) {                                         
       int index=0;
       hor=!hor;
       
       java.awt.Component []comp=jPanel1.getComponents();
       for(int i=0;i<comp.length;i++) { comp[i].setBackground(Color.white);
                                       if (comp[i].equals(tf)) {index=i; comp[i].setFocusable(true);}
                                       else comp[i].setFocusable(false);
                                        }
       
       if (index+1<comp.length&&index-1>0&&hor
               &&
               (comp[index+1].isEnabled()||comp[index-1].isEnabled()))
       {  
           while(index<comp.length&&comp[index].isEnabled()){comp[index].setFocusable(true);
                                          comp[index].setBackground(Color.yellow);index++;}
           index--;
           while(index>0&&comp[index].isEnabled()){comp[index].setFocusable(true);
                                          comp[index].setBackground(Color.yellow); index--;}
            return;
       }
      
       if (index+l<comp.length&&index-l>0&&!hor
               &&
               (comp[index+l].isEnabled()||comp[index-l].isEnabled()))
       {  
           while(index<comp.length&&comp[index].isEnabled()){comp[index].setFocusable(true);
                                          comp[index].setBackground(Color.yellow);index+=l;}
           index-=l;
           while(index>0&&comp[index].isEnabled()){comp[index].setFocusable(true);
                                          comp[index].setBackground(Color.yellow); index-=l;}
        }
      
       

    // TODO add your handling code here:
    }                                        



    private void jTextFieldKeyPressed(java.awt.event.KeyEvent evt, JTextField tf) {                                       
       tf.setSelectionStart(0);tf.setText("");
       tf.transferFocus();
       int index=0;
       java.awt.Component []comp=jPanel1.getComponents();
       for(int i=0;i<comp.length;i++)  if (comp[i].equals(tf)) index=i;
     
       if (index+1<comp.length&&
               !comp[index+1].isFocusable()&&hor) for(int i=0;i<comp.length;i++) comp[i].setBackground(Color.white);
       if (index+l<comp.length&&
               !comp[index+l].isFocusable()&&!hor) for(int i=0;i<comp.length;i++) comp[i].setBackground(Color.white);
            
       // TODO add your handling code here:
    }                                      
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Crucigrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crucigrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crucigrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crucigrama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crucigrama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

}
