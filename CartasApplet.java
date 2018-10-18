
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
public class CartasApplet extends javax.swing.JApplet {
     
    Random random=new Random();
    ArrayList cartas=new ArrayList();
    
    Carta b1=new Carta(cartas,"basto",1);
    Carta b2=new Carta(cartas,"basto",2);
    Carta b3=new Carta(cartas,"basto",3);
    Carta b4=new Carta(cartas,"basto",4);
    Carta b5=new Carta(cartas,"basto",5);
    Carta b6=new Carta(cartas,"basto",6);
    Carta b7=new Carta(cartas,"basto",7);
    Carta b8=new Carta(cartas,"basto",8);
    Carta b9=new Carta(cartas,"basto",9);
    Carta b10=new Carta(cartas,"basto",10);
    Carta b11=new Carta(cartas,"basto",11);
    Carta b12=new Carta(cartas,"basto",12);
    
    Carta o1=new Carta(cartas,"oro",1);
    Carta o2=new Carta(cartas,"oro",2);
    Carta o3=new Carta(cartas,"oro",3);
    Carta o4=new Carta(cartas,"oro",4);
    Carta o5=new Carta(cartas,"oro",5);
    Carta o6=new Carta(cartas,"oro",6);
    Carta o7=new Carta(cartas,"oro",7);
    Carta o8=new Carta(cartas,"oro",8);
    Carta o9=new Carta(cartas,"oro",9);
    Carta o10=new Carta(cartas,"oro",10);
    Carta o11=new Carta(cartas,"oro",11);
    Carta o12=new Carta(cartas,"oro",12);
    
    Carta e1=new Carta(cartas,"espada",1);
    Carta e2=new Carta(cartas,"espada",2);
    Carta e3=new Carta(cartas,"espada",3);
    Carta e4=new Carta(cartas,"espada",4);
    Carta e5=new Carta(cartas,"espada",5);
    Carta e6=new Carta(cartas,"espada",6);
    Carta e7=new Carta(cartas,"espada",7);
    Carta e8=new Carta(cartas,"espada",8);
    Carta e9=new Carta(cartas,"espada",9);
    Carta e10=new Carta(cartas,"espada",10);
    Carta e11=new Carta(cartas,"espada",11);
    Carta e12=new Carta(cartas,"espada",12);
    
    Carta c1=new Carta(cartas,"copa",1);
    Carta c2=new Carta(cartas,"copa",2);
    Carta c3=new Carta(cartas,"copa",3);
    Carta c4=new Carta(cartas,"copa",4);
    Carta c5=new Carta(cartas,"copa",5);
    Carta c6=new Carta(cartas,"copa",6);
    Carta c7=new Carta(cartas,"copa",7);
    Carta c8=new Carta(cartas,"copa",8);
    Carta c9=new Carta(cartas,"copa",9);
    Carta c10=new Carta(cartas,"copa",10);
    Carta c11=new Carta(cartas,"copa",11);
    Carta c12=new Carta(cartas,"copa",12);
    
    private void initComponents1() {

        mesa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        presente = new javax.swing.JPanel();
        presente1 = new javax.swing.JPanel();

        setMinimumSize(new java.awt.Dimension(800, 645));
        setPreferredSize(new java.awt.Dimension(800, 645));
        
        mesa.setLayout(new java.awt.GridLayout(2, 1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Nueva Tirada");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 110, 20));

        area.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 260));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Pregunta");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 110, 20));

        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 100, -1));

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 80, 20));

        mesa.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        presente.setBackground(new java.awt.Color(51, 51, 255));
        presente.setLayout(new java.awt.GridLayout(1, 10));
        jPanel2.add(presente);

        presente1.setBackground(new java.awt.Color(51, 51, 255));
        presente1.setLayout(new java.awt.GridLayout(1, 10));
        jPanel2.add(presente1);

        mesa.add(jPanel2);

        getContentPane().add(mesa, java.awt.BorderLayout.CENTER);

    }// </editor-fold>                        

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    presente.removeAll();
    presente1.removeAll();
         
       for(int i=0;i<cartas.size();i++)
       {Carta c=(Carta)cartas.get(i);
        int a=(int)(random.nextFloat()*10);
        boolean aux=(a==0||a==2||a==4||a==6||a==8||a==10);
       c.derecha=aux;
       String aux1="";
       if (c.grupo.equals("oro")) aux1=" (4)";
       if (c.grupo.equals("espada")) aux1=" (3)";
        if (c.grupo.equals("copa")) aux1=" (2)";
    
     
       if (c.derecha())
             try { 
                 c.label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+c.numero+aux1+".jpg")));
       } catch (Exception ex) {ex.printStackTrace();} 
       else try {
           c.label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+c.numero+aux1+".jpg")));
       } catch (Exception ex) {ex.printStackTrace();}
       
        }      
///////////////////////////////////////////////
        p=new ArrayList();
          
        while(p.size()<10)
        {int x=(int)(cartas.size()*random.nextFloat());
        Carta c =(Carta)cartas.get(x);
        if (!p.contains(c)){ presente.add(c.label); p.add(c);}
        }
        
        while(p.size()<16)
        {int x=(int)(cartas.size()*random.nextFloat());
        Carta c= (Carta)cartas.get(x);
        if (!p.contains(c)) {presente1.add(c.label); p.add(c);}
        }
        ////////////////////////////////////////////////// 
         presente.repaint();
         presente1.repaint();
         mesa.repaint();
       
         mesa.validate();
         lectura(p);
         
     aux="";
     for(int i=0;i<p.size();i++)
     {Carta c=(Carta)p.get(i);
     aux+="\n"+c.significado()+"\n";
     
     }
     area.setText(aux);
     
        // TODO add your handling code here:
       
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

    presente.removeAll();
    presente1.removeAll();
         
       for(int i=0;i<cartas.size();i++)
       {Carta c=(Carta)cartas.get(i);
        int a=(int)(random.nextFloat()*10);
        boolean aux=(a==0||a==2||a==4||a==6||a==8||a==10);
       c.derecha=aux;
       String aux1="";
       if (c.grupo.equals("oro")) aux1=" (4)";
       if (c.grupo.equals("espada")) aux1=" (3)";
        if (c.grupo.equals("copa")) aux1=" (2)";
    
     
       if (c.derecha())
             try { 
                 c.label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+c.numero+aux1+".jpg")));
       } catch (Exception ex) {ex.printStackTrace();} 
       else try {
           c.label.setIcon(new javax.swing.ImageIcon(new URL("http://www.cartas.22web.org/"+c.numero+aux1+".jpg")));
       } catch (Exception ex) {ex.printStackTrace(); }
       
        }       
        
///////////////////////////////////////////////
        p=new ArrayList();
          
        while(p.size()<10)
        {int x=(int)(cartas.size()*random.nextFloat());
        Carta c =(Carta)cartas.get(x);
        if (!p.contains(c)){ presente.add(c.label); p.add(c);}
        }
        
        while(p.size()<13)
        {int x=(int)(cartas.size()*random.nextFloat());
        Carta c= (Carta)cartas.get(x);
        if (!p.contains(c)) {presente1.add(c.label); p.add(c);}
        }
        ////////////////////////////////////////////////// 
         presente.repaint();
         presente1.repaint();
         mesa.repaint();
       
         mesa.validate();
         lectura(p);
         
     aux="";
     int contador=0;
     boolean asdeoros=false;
     
     for(int i=0;i<p.size();i++)
     {Carta c=(Carta)p.get(i);
     if (c.grupo.equals("oro")||c.grupo.equals("copa")) contador++;
      aux+="\n"+c.significado()+"\n";
     if (c.grupo.equals("oro")&&c.numero==1) asdeoros=true;
     }
     
     String aux1="";
     if (contador>6||asdeoros) aux1="SI" ;
     else aux1="NO";
     
     aux="La respuesta a tu pregunta es "+aux1+"\n"+aux;
     area.setText(aux);
    
// TODO add your handling code here:
    }                                        

    ArrayList p;
    String aux="";			
    
    public void lectura(ArrayList lec){
    String consultante=jTextField1.getText();
    
        for (int i=0;i<lec.size();i++)
         {Carta c=(Carta)lec.get(i);
          int alrrededor=0;
         if (i-1<0) alrrededor=i+1;
         else alrrededor=i-1;
         Carta aux=(Carta)lec.get(alrrededor);
         
         
    if (c.grupo=="basto"){if (c.numero==1){
                                  String temp="As de Bastos: Lejania;";
                                  if (c.derecha)temp+="Esta carta habla de sucesos a largo plazo para ti "+consultante+" o en sitios lejanos;" +
                         "Puede indicar un largo viaje, relaciones con el extranjero u otras culturas;" +
                         "Puede tratarse de asuntos que necesitan mucho tiempo para desarollarse, por ejemplo estudios o proyectos que se inician y que darán resultados mas adelante;" +
                         "Se aconseja prevision y calma";
                                  else temp+="Las cosas no se mueven, las viajes no salen, aparecen asuntos o personas del pasado que no nos agradan ";
                                  
                                  c.setSignificado(temp);
                                                          
                                   }
                                if (c.numero==2){
                                 String temp="Dos de Bastos : Cercania;";
temp+="Esta carta nos habla de viajes cortos, escapadas de un fin de semana, conversaciones con vecinos, amigos o hermanos... en fin, alegrias que nos ayudan a seguier adelante;" +
"Nos dice que debemos buscar la felicidad en la cercania, no en lo lejano;"+
"En el amor anuncia un flirteo o puede que debemos renovar nuestra relacion"+
"Si estamos algo deprimidos, nos transmite un mensaje de esperanza para saber que las cosas no siempre seran tan tristes"; 
                                c.setSignificado(temp);
                                }
                                if (c.numero==3){
                               String temp="Tres de Bastos : Fraternidad y amor universal;";

  temp+="Es una carta muy bonita que habla de amor universal entre todas las personas;"+
  "Las personas representadas por estas cartas tienen una vision muy espiritual de la vida y"+
  "estan concientes que todos somos hermanos, sientiendo un amor profundo para todos los seres;"+
  "Indica una relacion muy profunda, puede que incluso el sexo no tenga ninguna importancia";
                                c.setSignificado(temp);
                                }
                                if (c.numero==4){
                                 String temp="Cuatro de Bastos : Resistencia";

               if (c.derecha()) temp+="Esta carta otorga al las personas energia, inteligencia, resistencia, vigor fisico y estabilidad emocional para conseguier todo lo que quiere;"+
"En el plano amoroso indica relaciones largas y solidas, quizas algo pesadas;"+
"La salud es excelente. La situacion financiera y profesional es estable.";
               else {temp+="Puede que las situaciones se estanquen y perduren mas de lo que se desea, llegando a ser agobiante";}

               c.setSignificado(temp);
                                }
                                if (c.numero==5){
                               String temp="Cinco de Bastos : Sabiduria;";
 temp+= "Esta carta hace referencia a conocimientos: los que hemos adquirido por estudios y los que hemos obtenidos por las experiencias en la vida;"+
"Indica una persona con una buena formacion academica o con mucha experiencia en la vida; Conoce bien su cuerpo y tiene buena salud;"+
"Se deberian estudiar y analizar los proyectos";
                            
                                c.setSignificado(temp);
                              }

                                if (c.numero==6){
                               String temp="Seis de Bastos : Abatimiento;";

temp+="Esta carta es una de las mas negativas de toda la baraja;"+
"Indica una situacion de depresion, tristeza y falta de ganas de seguir adelante;"+
"Tu estado de animo "+consultante+" esta por el suelo y sera muy dificil de salir de esta situacion "+
"si no se cambia la actitud. Tenemos que luchar contra estos sentimientos y pensamientos negativos;"+
"Sera muy dificil de progresar con cualquier proyecto de futuro porque los sentimientos te paralizan;";
                               
if (aux.grupo=="oro") temp+="la razon de este desastre emocional: asuntos finacieros ";
if (aux.grupo=="bastos") temp+="la razon de este desastre emocional: fracasos profecionales ";
if (aux.grupo=="espada") temp+="la razon de este desastre emocional: problemas de salud ";
if (aux.grupo=="copa") temp+="la razon de este desastre emocional: problemas de pareja o familia ";
               
                                c.setSignificado(temp);
                                }

                                if (c.numero==7){
                                String temp="Siete de Bastos: Mundo laboral";

temp+="Esta carta se relaciona con la profesion y el mundo laboral en general;"+
"Indica que posibilidades de ascenso tiene, si le gusta lo que hace y hasta que grado se entrega;"+ 
"es una persona muy responsable que cumple con sus obligaciones;";
   
                               c.setSignificado(temp);
                                }

                                if (c.numero==8){
                                String temp="Ocho de Bastos: Dependencias;";
temp+="Esta carta hace referencia a alguna forma de dependencia. Puede ser una dependencia "+
       "a la pareja o familia en una relacion insana donde una pareja tiene atada a la otra;"+
       " En asuntos del trabajo puede indicar un empleo que no da oportunidad de ascenso y que"+
       " se encuentra en un punto muerto;";
        
        if (aux.grupo=="espada")temp+="Se refiere a dependencias como alcohol y drogas o malos habitos;";
        if (aux.grupo=="oro") temp+="Se refiere a dependencias a las cosas materiales;";
        if (aux.grupo=="basto") temp+="Se refiere a dependencias relacionadas con el trabajo;";
        if (aux.grupo=="copa") temp+="Se refiere a dependencias relacionadas con la pareja o el amor;";
        temp+=" En todo caso indica una persona debil, controlada por otras personas o las circumstancias."+
              " Debe aprender autocontrol y confianza en si mismo ";
                              
                               c.setSignificado(temp);
                                }
                               
                                if (c.numero==9){
                                String temp="Nueve de Bastos: Satisfacciones;";
temp+="Con esta carta podemos estar tranquilos ya que experimentamos satisfacciones en las cosas que hacemos;";
     if (aux.grupo=="espada")temp+="Indica buena salud;";
        if (aux.grupo=="oro") temp+="Indica una situación finaciera estable;";
        if (aux.grupo=="basto") temp+="Indica un empleo o negocio prospero;";
        if (aux.grupo=="copa") temp+="Indica un empleo o negocio prospero;";
        
                                c.setSignificado(temp);
                                }
                                
                                if (c.numero==10){
                                String temp="Sota de Bastos: Dama de la Pasion;";
temp+="Una mujer de pelo oscuro y de tez morena con una personalidad energica, apasionada, impulsiva, "+
        "carismatica, creativa y segura de si misma, quizas de signo Aries, Leo o Sagitario;"+
        "En el plano material puede indicar que gasta dinero de manera impulsiva sin tener que "+
        "preocuparse mucho ya que sabe conseguir lo que quiere. El el tema amoroso puede indicar "+
        "relaciones algo movidas o celos por culpa de esta mujer. En el trabajo tendremos la suficiente "+
"energia y carisma para prosperar. La salud en general es buena, solo puede haber molestias por demasiado temperamento";


                                c.setSignificado(temp);
                                }
                                if (c.numero==11){
                                String temp="Caballo de Bastos: Caballero carismatico;";
 temp+="Una persona de tez morena, pelo oscuro con cuerpo atletico. Tiene un caracter energico, "+
       "con nobles ideales, afectuosa y orgullosa; Puede que sea de un signo de fuego como Leo, Aries o Sagitario;"+
       "Pero no tiene porque ser un varon; Es una persona activa, masculina y muy decidida;"+
       "goza de carisma y liderazgo. Indica una relacion fuerte y apacionada;";
       
                                c.setSignificado(temp);
                                }
                                if (c.numero==12){
                                String temp="Rey de Bastos: Autoridad de la Experiencia;";

temp+="Una persona con mucha experiencia, emprendedora, energica, carismatica con dotes de mando,"+
        "muy segura de si mismo que consigue cualquier meta; Puede que sea una persona mayor o de un signo "+
        "de fuego como Leo, Aries o Sagitario; ";
        
        if (aux.grupo=="espada")temp+="puede que este preocupado por enfermedades de la edad; ";
        if (aux.grupo=="oro") temp+="puede que este preocupado por una situacion financiera poco estable;";
        if (aux.grupo=="basto") temp+="puede que este preocupado por ambiciones profesionales quizas no satisfechas.";
        if (aux.grupo=="copa") temp+="puede que este preocupado por temas sentimentales";
        
                                 c.setSignificado(temp);
                                }
                              }
         if (c.grupo=="oro"){if (c.numero==1){
                                  String temp="As de Oros: Triunfos;";
temp+="Esta carta es la mejor de toda la baraja. Anuncia exito y felicidad en todos los asuntos;"+
consultante+" Inicia una etapa de prosperidad y cualquier proyecto que empezemos ahora tendra exito;"+
" Incluso si la tirada es mala en general, con esta carta involucrada, siempre levantaremos la cabeza; ";

        if (aux.grupo=="espada") temp+="Anuncia un gran triunfo sobre enfermedades ; ";
        if (aux.grupo=="oro") temp+="Anuncia un gran triunfo en una situacion financiera poco estable;";
        if (aux.grupo=="basto") temp+="Anuncia un gran triunfo con ambiciones profesionales quizas no satisfechas.";
        if (aux.grupo=="copa") temp+="Anuncia un gran triunfo sobre en asutos sentimentales";
        
         
 if (!c.derecha())temp+=" El exito y la fortuna seran aun mayores que se puede imaginar;";

                                   c.setSignificado(temp);
                                  }
                                if (c.numero==2){
                                  String temp="Dos de Oros: Celos;" ;
temp+="las rivalidades o competencia de una tercera persona que puede traer problemas tanto en el plano"+
        " economico de los negocios como en el afectivo; por lo que se recomienda mantener una actitud de alerta;"+
       consultante+ " ,Momento poco propicio para nuevas iniciativas o proyectos. Augura la llegada de un mensaje,"+
        "carta o de otro tipo. Se presagia momentos de intensa emocion seguidos de escasa claridad y agitacion;";
        
       if (c.derecha()) temp+=" Es posible que ,"+consultante+" recibas algun aporte economico de poca envergadura;";
       else temp+=" Es posible que ,"+consultante+" las deudas, cheques o pagare pueden complicarlo todo de forma pasajera; ";
       
                                c.setSignificado(temp);
                                }
                                
                                if (c.numero==3){
                                  String temp="Tres de Oros: Fortuna;"; 
 if (c.derecha) temp+=consultante +" llega la fecundidad entendida tanto como para el inicio de un emprendimiento exitoso;"+
      " como para un potencial embarazo; Gran capacidad en las ideas que estan en la etapa propicia "+
      " para reafirmarlas en la realidad. Habilidad en los negocios, poder, reconocimiento y generosidad "+
      " impulsan a los proyectos a una pronta concrecion. ";
 else temp+=consultante+" la frivolidad, mediocridad y falta de madurez en algunos actos te traeran complicaciones por falta de reflexion;";
              
                                  c.setSignificado(temp);
                                }
                                if (c.numero==4){
                                 String temp="Cuatro de Oros: Bienestar;"; 

temp+="la prosperidad y la llegada del exito, especialmente en todo lo referido a lo laboral y los negocios;"+
        " Augura inversiones con optimos resultados y beneficios, asi como un desmedido amor por el dinero que"+
        " puede convertirse "+consultante+" en avaricia con tus allegados. Presagia la llegada de un obsequio, regalo o"+
        "prestamo que generara mas seguridad para enfrentar las complicaciones que pudieran avecinarse;";

if (!c.derecha()) temp+=" puede anunciar desordenes importantes, soluciones que no llegan, problemas con la ley que pueden culminar incluso en un arresto;";

                                  
                                 c.setSignificado(temp);
                                }
                                if (c.numero==5){
                      String temp="Cinco de Oros: Resoluciones; ";   
                                    
   if (c.derecha()) temp+="Se anuncia alegria, celebraciones y reconocimientos. Como el numero 5 esta relacionado con el karma;"+
      " se concreta un compromiso afectivo que sera determinante para tu vida "+consultante+"; "+
      "Representa el descubrimiento de un vinculo afectivo de significacion;"+
      " pudiendo ser un amor de esos que no se olvidan. Esta carta tambien indica una reunion positiva "+
      "o el lugar donde se desarrollan actividades concretas te beneficiaran";
   else temp+="Se presagian desavenencias en la relacion de pareja, libertinaje, discusiones y hasta perdida economica;";
   
                                 c.setSignificado(temp);
                                }
                                if (c.numero==6){
                                  String temp="Seis de Oros: Dificultades;"; 
if (c.derecha()) temp+="Si bien esta carta representa las dificultades, tambien augura que se resolveran por si mismas,"+
       " siendo los obstaculos muy faciles de vencer. Pronostica obstaculos para alcanzar las metas proyectadas "+
       " en el plano economico que rapidamente se sortean aumentando las ganancias esperadas, acontecimientos "+
       " positivos se avecinan en tu vida "+consultante+ "sensibilizandote y devolviendote generosidad y "+
       "bondad;";
else temp+="Se anuncia codicia, una racha de mala suerte, envidias y celos que pueden enturbiar el buen desarrollo futuro;";


                                  c.setSignificado(temp);
                                }
                                if (c.numero==7){
                                  String temp="Siete de Oros: Gratificaciones;"; 

if  (c.derecha())temp+="Intuision para saber utilizar sus recursos para alcanzar los propositos deseados;"+
      " El exito no se demorara en llegar, aunque sucedera con esfuerzo y con trabajo sacrificado;"+
      "puede indicar la llegada de un dinero imprevisto o una herencia inesperada;";
else   temp+="Indica cierta inseguridad frente a los proyectos futuros, miedo e inestabilidad espiritual;"+
        "pudiendo tambien anunciar una actitud irreflexiva y precipitada frente a las inversiones;"+
        "Impaciencia, arrepentimiento y aprehension;"; 

                                  
                                  c.setSignificado(temp);
                                }
                                if (c.numero==8){
                                  String temp="Ocho de Oros: Reflexion;" ;
                                  
if (c.derecha()) temp+="llega un periodo en el que existen desacuerdos, inestabilidades y un ambiente hostil en el hogar"+
      " que requiere de la maxima reflexion para poder restablecer el equilibrio y la armonia perdida;"+
      " Representa el aprendizaje, la habilidad para adquirir conocimientos o descubrir capacidades "+
      " propias que hasta el momento permanecian ocultas. Anuncia el reparto equitativo de dinero, "+
      " una herencia, propiedad o negocio;";
else temp+="indica importantes ganancias producto de la usura, avaricia, celos y una desilusion pronta a llegar;";


                                  
                                   c.setSignificado(temp);
                                }
                                if (c.numero==9){
                                  String temp="Nueve de Oros: Inestabilidad;";
if (c.derecha())temp+="posibilidad de cambios en el ambito laboral, comercial y sentimental. Indica que en un pasado cercano "+
      " existieron problemas que no se resolvieron, y ahora regresan para ser diligenciados, de una buena vez "+
      " y para siempre. Se augura exitos y conquistas en todos los ambitos;";
else temp+="anuncia mentiras, infidelidades, la perdida de una amistad muy apreciada, sorpresas desagradables y promesas no cumplidas;"; 

                                  c.setSignificado(temp);
                                }
                                if (c.numero==10){
                                      String temp="Sota de Oros: Sensatez y seguridad;";
if (c.derecha())temp+="Una mujer blanca, de cabello rubio o entrecano, generalmente joven, de una muy buena posicion economica "+
      " pero descontrolada a la hora de gastar dinero, generosa, apasionada, leal, pero idealista e imaginativa "+
      " como pocas. Es una persona capaz de brindar una profunda amistad, que se deleita enfrentando desafios "+
      " porque se sabe con la capacidad y fuerza necesaria para sortear situaciones de inseguridad y desagradables,"+
      " que llegaran a buen puerto con certeza. Es deseable contarla entre las amistades, porque de enemiga, "+
      " sus amenazas facilmente se concretan en hechos, ya que tiene poca consideracion por aquellos a quienes "+
      " no aprecia;";
else temp+="Se anuncia grandezas de todo tipo, seguida de despilfarros. Es tambien portadora de buenas noticias;";
                                      
                                      c.setSignificado(temp);
                                
                                }
                                if (c.numero==11){
                                  String temp="Caballero de Oros: Caballero del orden;";

if (c.derecha()) temp+="Esta carta representa a un hombre de mediana edad, de cabellera rubia o entrecana, de temperamento"+
      " amigable, inteligente, rebelde y curioso. Personifica a un joven maduro con fuerte ambicion material"+
      " que esta en perfectas condiciones para conseguir el exito en aquellas empresas en las que participa o "+
      " proyecta obtener en un futuro cercano. Simboliza la habilidad en los negocios, los progresos economicos "+
      " y la riqueza que se conquista a partir del propio esfuerzo, madurez y responsabilidad. Anuncia la llegada "+
      " de un buen amigo muy bien predispuesto a colaborar en la superacion de obstáculos. Presagia un posible viaje,"+
      " noticias favorables y buenas perspectivas;";

else temp+="augura celos y pasiones que se desatan en el terreno sentimental y que afectaran el equilibrio emocional "+
        "del que hasta el momento disfrutabas "+consultante;
                                  
                                  c.setSignificado(temp);
                                }
                                if (c.numero==12){
                                  String temp="Rey de Oros: Autoridad de la cima ";
temp+="un hombre mayor, de tez blanca y cabellera rubia o canosa; que disfruta de una solida posicion economica, "+
      "con una enorme capacidad y habilidad para seguir varios negocios a la vez; personifica la experiencia, "+
      "inteligencia y aptitud típica de un banquero, un agente de bolsa o un millonario;"+
      "Anuncia el resultado exitoso de tus esfuerzos y proyectos "+consultante+ ", pudiendo existir para esos "+
      "logros la colaboracion de alguna persona que la vida le cruza especialmente para dicho fin; "+
      "ya que se trata de una de las cartas mas favorables de la baraja en todos los ambitos de la vida. ";
      
if(!c.derecha()) temp+="Se presagia una buena cosecha material, solo que la misma se hara efectiva por medio de la avaricia y ciertas corruptelas; se descubriran antiguos vicios inconfesables que saldran a la luz sorprendiendo tu ingenuidad "+consultante; 
                                  
                                   c.setSignificado(temp);
                                }
                              }
         if (c.grupo=="espada"){if (c.numero==1){
                                    String temp="As de Espadas: Compromisos legales;";

 temp+="Tramites legales y burocraticos que seran importantes para ti "+consultante;

        if (aux.grupo=="espada") temp+="relacionados con temas de enfermedad;";
        if (aux.grupo=="oro") temp+="relacionados con temas financieros y monetarios";
        if (aux.grupo=="basto") temp+="relacionados con temas de extranjeria o profesionales;";
        if (aux.grupo=="copa") temp+="relacionados con la familia o pareja;";
        
 if (!c.derecha()) temp+=" Hay que tener cuidado de no ser victima de una estafa. Problemas con la burocracia y contratos son muy probables;"; 

                                    
                                    c.setSignificado(temp);
                                     }
                                if (c.numero==2){
                                   String temp="Dos de Espadas: Sorpresa;";
temp+="representa la dualidad de su simbologia; La sorpresa a la que hace referencia, "+
      "tiene que ver con el apoyo incondicional y la fidelidad de los amigos, que inesperadamente "+
       "acudiran a socorrernos; O bien, con la enemistad de conocidos que presentandose de improviso "+
       " nos acarrean consecuencias en situaciones no pensadas; La imagen de las dos espadas desenvainadas "+
       " y cruzadas, nos advierte sobre una lucha que desgasta la mente provocando un intenso dolor "+
       " y muchas lagrimas;";
        
if (!c.derecha()) temp+="muestra una posible traicion, alguien con dos caras que intentara lastimarnos por venganza;";
        
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==3){
                                    String temp="Tres de Espadas: Sucesos a largo plazo;" ;
temp+="Si es dificil que dos personas en lucha, lleguen a algun acuerdo; mucho mas lo es, "+
"cuando un tercero tambien antepone sus demandas; Aqui se auguran conflictos importantes con "+
" personas del entorno cercano; Simboliza el miedo frente a los enemigos, repercutiendo negativamente "+
" inclusive en tu ambito afectivo y sentimental "+consultante+"; Como representa el distanciamiento "+
" doloroso con alguien a quien queremos mucho, es posible que ese alguien parta lejos de nosotros; ";

if(!c.derecha()) temp+="el presagio es aun mas negativo, ya que puede llegarse hasta la locura; "; 
                                    
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==4){

                                    String temp="Cuatro de Espadas: Baches y mala salud;";
if (c.derecha()) 
    temp+="Estos baches estan referidos no solo a tu tranquilidad y paz "+consultante+", te veras inmerso "+
      " en situaciones de traiciones, intrigas, dificultades, estafas y discusiones que debera evitar; "+
      " sino que tambien se refieren a su salud, ya que presagia el padecimiento de una enfermedad "+
      " que le llevara al aislamiento, soledad y retiro. Pudiendo tratarse tambien de un exilio obligado; "+
      " a veces simboliza el desierto y la muerte;";

else temp+="augura una gran fuerza interior, tranquilidad de espiritu y claridad de pensamientos "+
        " para salir adelante airosamente y afrontar el futuro;"; 
                                    
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==5){
                                    String temp="Cinco de Espadas: Separaciones y cambios; "; 
if (c.derecha())temp+="Cuidado "+consultante+" con amenazas y obstáculos. Representa la preocupacion y los remordimientos "+
      "que te acechan; la necesidad de saldar algunos aspectos negativos del karma, por lo tanto, "+
      "presagia un disgusto importante o un fuerte enfrentamiento. Muestra adversarios que estan dispuestos "+
      " a presentar batalla, junto con el peligro de ser derrotados con infamias y deshonores. "+
      " Se recomienda controlar los pensamientos, que pudiendo volverse contradictorios, advierten "+
      " el estancamiento en una dificil situacion;";
        
else temp+="augura desolacion, desgracias y posible luto; "; 

                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==6){
                                    String temp="Seis de Espadas: Debilidad y achaques ;";
temp+="Esta carta representa el conflicto, la posibilidad de herir a otros, tanto como ser herido;"+
      "Aqui dependes de terceras personas que son de vital importancia para marcar el camino que se debera "+
      "tomar en la accion; En el aspecto mental, se recomienda estar alerta a las propias limitaciones, "+
      " evitando proyectar las culpas y deficiencias en personas del ambiente cercano; "+
      " Imposibilidad temporal de llevar a cabo una relacion sentimental duradera y estable; "+
      " Presagia viajes con contratiempos y proyectos nuevos que se estancan sin vislumbrar la solucion "+
      " al enredo; Se recomienda paciencia, el exito se hara esperar un poco mas, pero llegara;"; 

                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==7){
                                    String temp="Siete de Espadas: Sucesos a corto plazo"; 
temp+="Esta carta representa un motivo de esperanza, algun acontecimiento o persona nos genera un atisbo "+
       " de confianza en nosotros mismos que nos permite vislumbrar un futuro mejor;"+
       " Se debera tener en cuenta que lo antes mencionado nos dara una sobrecarga de aceleracion energetica;"+
       " que si bien infunde la fuerza necesaria para salir adelante, a veces impide el correcto control "+
       " de la razon sobre las emociones; Observar sentimientos de temor, egoismo y celos, que hostigan "+
       " el alma y vuelven a las relaciones demasiado conflictivas; Augura, ademas de la llegada de cierta "+
       " esperanza, el ingreso de algo de dinero. Presagia que se avecinan tiempos mejores ;";
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==8){
                                    String temp="Ocho de Espadas: Constancia"; 
if (c.derecha()) temp+="la posibilidad de superar los problemas con calma y perseverancia; Hay un periodo de crisis "+
       " que esta llegando a su fin; en donde se pueden recibir criticas, calumnias y algunas malas noticias;"+
       " cuestiones que generaran confusion e intensos deseos de alejarse de la rutina y de estas situaciones "+
        " angustiantes. Augura un viaje inesperado, algunos incidentes y oposiciones; aunque todo esto con "+
        " posibilidades de superar las situaciones de crisis; ";
else temp+="Se presagian obstaculos y oposiciones;";
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==9){
                                    String temp="Nueve de Espadas: Sucesos a peor;";
temp+="Se Auguran sufrimientos y preocupacion por la persona amada; esta misma ansiedad puede estar "+
        "dirigida a generar conflictos, desesperacion y temores; Representa nuestra propia inseguridad,"+
        " timidez o moral; ademas de temores fundados por la dificultad misma del periodo por el cual"+
        " se esta atravesando; Son posibles y factibles los peligros inminentes, el contraer algun tipo de "+
        " enfermedad, los problemas de adiccion o algun otro tipo de intoxicaciones. La promesa de esta carta"+
        " es la transformacion y el aprendizaje generadores de la energia necesaria para superar este "+
        "transito de complicaciones;"; 
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==10){
                                    String temp="Sota de Espadas: Dama del pensamiento";
if (c.derecha()) temp+="una mujer de cabello oscuro, morena, mulata o negra, generalmente joven, con mucha firmeza en "+
      " su postura y arrogancia en su gesto de tomar la espada; De caracter agresivo y resuelto, no se "+
      " permite equivocaciones porque no descansa si no ve sus proyectos orientados. Ambiciosa, perceptiva,"+
      " capaz de descubrir y entender conocimientos que para otros permanecen ocultos; Simboliza una " +
      " pareja invalorable por la contencion que siempre esta dispuesta a dar y la claridad de sus consejos;"+
      " puede representar tambien a una viuda o una enemiga capaz de generar las mas absurdas intrigas;" ;
        else temp+="anuncia cualquier tipo de imprevistos y sorpresas, incluso importantes ganancias economicas;";
                
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==11){
                                    String temp="Caballero de Espadas: Caballero de las ideas;";
temp+="Es la imagen del caballero de la fortaleza, el valor, la resistencia y a veces tambien la destruccion;"+
      " Generalmente es el defensor de las causas justas y se dispone a asumir riesgos si se supone victima "+
      " de injusticias; Es el personaje ideal, siempre y cuando sea nuestro aliado para ayudarnos a encontrar "+
      " una salida en tiempos complicados; Esta carta muestra un conflicto, alguna disputa que debe "+
      " entenderse y encararse con total decision; Esta mala noticia se puede recibir como un mensaje "+
      " o puede llegar de la mano de una mujer; Se recomienda observar a las nuevas amistades, que si "+
      " bien las hay solidas, algunas pueden resultar traicioneras;";
                                    
                                    c.setSignificado(temp);
                                }
                                if (c.numero==12){
                                    String temp="Rey de Espadas: Autoridad de la iniciativa";

if (c.derecha())temp+="Esta carta representa a un hombre de pelo oscuro o negro, algo canoso; "+
      " de gran inteligencia y caracter firme; Puede tratarse de un ejecutivo o alguien que "+
      " ocupe un cargo de importancia; Esta carta puede pronosticar problemas con la justicia, "+
      " papeles de curso legal administrativo con el potencial riesgo de perder algo que por derecho "+
      " propio le corresponde al consultante; Esta Autoridad de la iniciativa, cuando se ha decidido, "+
      " no deja de insistir hasta ver sus planes marchando favorablemente;";
        
else temp+="puede augurar soledad, enfermedad o separacion a quien ha conocido la felicidad y se encuentra "+
           "atravesando una etapa en declive;" ;
                                    
                            
                                    c.setSignificado(temp);
                                
                                }
         }
         if (c.grupo=="copa"){if (c.numero==1){
                                    String temp="As de Copas: El Nido";
if (c.derecha()) temp+="Es una carta muy buena en el ambito familiar. Muy beneficiosa si estamos pensando en crear una familia,"+
      " comprar una casa o iniciar un negocio familiar ya que tendremos suerte en estos asuntos;"+
      "Anuncia bienestar y felicidad en el hogar y con la familia. Tambien el ambito profesional se vera "+
      " beneficiado con asociaciones exitosas;";
else temp+="indica mudanzas, cambio de vivienda o traspaso de negocio;";
                                    
                                    c.setSignificado(temp);
                                }
                                if (c.numero==2){
                                    String temp="Dos de Copas: Fecundidad;";
temp+="se relaciona con los hijos y la creatividad que son 2 cosas muy similares ya que es algo que sale "+
      " de nosotros. Se relaciona con la casa 5 de la Astrologia;";

if (aux.numero==10||aux.numero==11)temp+="se puede tratar de la llegada de un hijo o asuntos relacionados"+
                                          " con los hijos;";

 if (aux.grupo=="basto") temp+="Se refiere a la capicidad creadora en el trabajo;";
  if (aux.grupo=="oro") temp+="Se refiere a gastos o ingresos por nuestras creaciones, sobre todo si se "+
                              " trata de un artista...  ";
                                    
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==3){
                                    String temp="Tres de Copas: Mensajes;";

temp+="Esta carta nos avisa que pronto recibiremos una noticia nueva e inesperada;";

        if (aux.grupo=="oro")temp+="las noticias tratan de dinero e ingresos o gastos,";
        if (aux.grupo=="copa")temp+="son noticias de un familiar,";
        if (aux.grupo=="basto") temp+="son noticias de personas que viven lejos o de trabajo, "+
                                      "contratos ascensos o despidos;";
        if (aux.grupo=="espada")temp+="las noticias son relacionadas con la salud;";
        
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==4){
                                    String temp="Cuatro de Copas: Instintos";
temp+="Esta carta de refiere sobre todo al sexo y las relaciones intimas; Es ahi donde damos rienda suelta"+
       " a nuestros instintos; Tambien incluye nuestros complejos y lado mas salvaje;"+
       "la relacion esta dominada por el sexo; Puede indicar frivolidad y aventuras sexuales;";
       
if (aux.grupo=="espada")temp+="puede referirse a problemas en el aparato reproductivo o a la hora de hacer el sexo; ";
if (aux.grupo=="oro"||aux.grupo=="basto") temp+="puede indicar que las finanzas o el trabajo tienen que ver con actividades no muy legales;";
                                    
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==5){
                                    String temp="Cinco de Copas: Celebracion";
temp+="Esta es una de las mejores cartas que nos puede salir; Anuncia un periodo de alegria, celebraciones "+
      "y optimismo; Anuncia la marcha de algun problema, y podemos estar seguros que saldra "+
      " bien;";
if (aux.numero==10||aux.numero==11||aux.numero==12)
    temp+="seras el centro de la atencion y recibriras reconocimiento por todos.";
if (aux.grupo=="copa")temp+="puede tratarse de celebraciones como matrimonio o nacimiento de un hijo o "+
                           "cualquier otra fiesta de familia;";
if (aux.grupo=="basto")temp+="se trata de asuntos laborales como ascensos o ganancias por los negocios;";
if (aux.grupo=="oro")temp+="habra razones para alegrarse sobre la venta de una casa u otros ingresos de dinero,";
if (aux.grupo=="espada")temp+="puede que una larga dolencia desaparezca"; 

                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==6){
                                    String temp="Seis de Copas: Melancolia";
temp+= consultante +"estas en un estado de tristeza que te impide  seguir adelante. La tristeza esta producida "+
" por malos recuerdos o experiencias en el pasado, miedos o otros problemas emocionales y pensamientos negativos;"+
"Si no cambias de actitud e intentas ser mas optimista sera dificil que la situacion cambie al positivo ";

if (aux.grupo=="copa")temp+="puede tratarse de problemas emocionales y en el amor ";
if (aux.grupo=="basto")temp+="se trata de preocupaciones por asuntos laborales o los negocios;";
if (aux.grupo=="oro")temp+="puede tratarse de procupaciones  por algun dinero,";
if (aux.grupo=="espada")temp+="puede tratarse de procupaciones por salud"; 

                                   c.setSignificado(temp);
                                
                                }
                                if (c.numero==7){
                                    String temp="Siete de Copas: Plenitud ";
temp+="nos avisa de un periodo lleno de satisfaccion donde nuestros deseos mas profundos se cumpliran;"+
        "Probablemente hemos trabajado mucho para que se cumplan y al fin podemos recojer los frutos "+
        "de nuestro esfuerzo; puede tratarse de felicidad con la pareja o en caso de no tener pareja que "+
        " se encuentra el amor. Puede que "+consultante+" ,obtengas recompensas en el trabajo o que encuentres"+
        " un empleo si no lo tienes. Te sientes con vitalidad y salud;"; 
                                    
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==8){
                                    String temp="Ocho de Copas: Buenas Influencias";
temp+="Esta cartas nos indica que quedaremos beneficiados por algun contacto, alguna persona "+
      " o relacion influyente; Puede que se trata de un fiel amigo que "+
      " nos apoye o un jefe que nos promociona; Como un regalo del cielo vamos a dar con la persona "+
      " adecuada en el momento justo; En el amor tenemos la pareja perfecta que comparte nuestra vida social;"+
      " Nuestra salud se puede ver beneficiada por encontrar el medico adecuado;"; 
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==9){
                                    String temp="Nueve de Copas: Desapego y Entrega";
temp+="Esta carta nos habla de una persona altruista que se entrega a los demas sin intereses propios;"+
      " Esta persona se entrega a una causa sin tener motivacion economica;"+
      " La carta nos recuerda que todo lo que sembramos antes o despues vuelve hacia nosotros. "+
      " Si queremos encontrar el amor, primero debemos dar amor; Si ayudamos a otras personas, recibiremos "+
      " ayuda en el momento que nos hace falta; Indica una relacion sin otros intereses que el amor;"+
      " En el trabajo puede que se efectuen labores beneficas o que se hagan donaciones";

                                    
                                    c.setSignificado(temp);
                                }
                                if (c.numero==10){
                                    String temp="Sota de Copas: Dama romántica";
temp+="una mujer de tez palida, rasgos hermosos, ojos profundos, normalmente claros, y pelo cobrizo;"+
      " Puede que es del signo Piscis, Cancer o Escorpio; Su caracter es romantico, sensible, amoroso,"+ 
      " creativo y haria cualquier cosa por un ideal; En temas de dinero siempre tendra lo suficiente "+
      " por ser una persona tan amable y ilusionada; lo mismo se aplica para el trabajo donde destaca "+
      " por su creatividad. Indica que esta persona necesita el amor para vivir y que no puede estar "+
      " sin pareja o sin sentirse querido; Tambien se relaciona con la medicina alternativa y enfermedades "+
      " producidas por las emociones;"; 

                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==11){
                                    String temp="Caballo de Copas: Caballero andante";
temp+="Esta carta representa a un hombre de tez clara, ojos liquidos y pelo claro. "+
      " Su caracter es idealista y romantico ; tiene altos ideales por los que lucha sin ambiciones materiales;"+
      " Es como el caballero andante de las leyendas que lucha por las damas, los mas debiles o su rey;"+
      " Puede que sea del signo Escorpio, Cancer o Piscis ; No tiene que tratarse exclusivamente de un hombre;"+
      "tambien puede ser una mujer; Indica una relacion de pareja muy profunda donde cada uno se entrega "+
      " al maximo; Si el consultante no tiene pareja, esta buscando una relacion romantica con una persona "+
      " a quien se puede entregar completamente; En el trabajo intenta ganar lo suficiente para cuidar de los "+
      " suyos sin tener demasiada ambicion; Los asuntos materiales no suelen ser muy importante;"+
      " Puede que tenga dotes para la curacion;";

                                    
                                    
                                    c.setSignificado(temp);
                                
                                }
                                if (c.numero==12){
                                    String temp="Rey de Copas: Autoridad de las Ideas";
temp+="Nos indica que tenemos que ver con una persona o situacion que esta en el pais de la imaginacion, ·"+
      " algo inalcanzable; Se trata de una persona demasiada idealista, a las que le gusta imaginarse "+
      " situaciones y que tiene dificultades por no estar con los pies en el suelo; Se refiere a una persona"+
      " que haria cualquier locura para encontrar o mantener una pareja. En el trabajo y dinero indica el "+
      " deseo de progresar, aunque las utopias e ideales impiden que los proyectos se materializen ;"+
      " La salud depende de gran parte del estado de animo en que se encuentre"; 
                                    
                                    c.setSignificado(temp);
                                
                                }
                     }
         
                }
         
         
    
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify                     
    private javax.swing.JEditorPane area;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mesa;
    private javax.swing.JPanel presente;
    private javax.swing.JPanel presente1;
    // End of variables declaration                   




    /**
     * Initializes the applet CartasApplet
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(CartasApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartasApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartasApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartasApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                   // initComponents();
                    initComponents1();  
                    
                  }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
