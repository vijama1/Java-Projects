import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import java.io.*;
import java.util.*;
class editor extends WindowAdapter implements ActionListener
{
	Frame f;
	TextArea t1;
	MenuBar mb;
	Menu m1,m2,m3,m4;
	MenuItem nw,opn,sve,sveas,ext,find,fr,fnt,increase,decrease;
	Window w;
	FileDialog fd1,fd3;
	String btn,str,listelements;
	FileInputStream fis1,fis2;
	String filename="Untitled",path,sopen="";
	FileOutputStream fosopen,fossave;
	Label lfind,lreplace;
	TextField tfind,treplace;
	Button bfind,breplace,breplaceall,bexit;
	Panel pfr,pn1,pn2;
	PrintWriter outStream;
	int ch,cp,start,end;
	Dialog d1,d3,d4,d5,d6;
	Button b4,b5,b6;
	Label ln;
	String s2;
	String vsave=null;
	File fouts;
	BufferedInputStream bis;
	String temp=null;
	Dialog dex;
	Button bex;Label lex;
    StringBuffer sb;

	public editor()
	{
		f=new Frame(filename);
		f.setSize(1500,1500);
		f.addWindowListener(this);
		//f.addWindowListener(e1);
		dex=new Dialog(f);
		dex.setSize(300,150);

					//dex.addWindowListener(this);
					dex.setLayout(new GridLayout(2,0));
					//pn1=new Panel();
					//pn2=new Panel();
					bex=new Button("Ok");
					lex=new Label("Exception Found");
					dex.add(lex);
					dex.add(bex);
		mb=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		m3=new Menu("Format");
		m4=new Menu("Font Size");
		nw=new MenuItem("New");
		opn=new MenuItem("Open");
		sve=new MenuItem("Save");
		ext=new MenuItem("Exit");
		sveas=new MenuItem("Save As");
		find=new MenuItem("Find");
		fr=new MenuItem("Find and Replace");
		fnt=new MenuItem("Font");
		increase=new MenuItem("Increase");
		decrease=new MenuItem("Decrease");
		nw.addActionListener(this);
		opn.addActionListener(this);
		sve.addActionListener(this);
		ext.addActionListener(this);
		sveas.addActionListener(this);
		find.addActionListener(this);
		fr.addActionListener(this);
		fnt.addActionListener(this);
		increase.addActionListener(this);
		decrease.addActionListener(this);
		m1.add(nw);
		m1.add(opn);
		m1.add(sve);
		m1.add(sveas);
		m1.addSeparator();
		m1.add(ext);
		m2.add(find);
		m2.add(fr);
		m3.add(fnt);
		m4.add(increase);
		m4.add(decrease);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		f.setMenuBar(mb);
		t1=new TextArea();
		Font f1=new Font("Calibri",Font.BOLD+Font.ITALIC,12);
		t1.setFont(f1);
		f.add(t1);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		if(e.getSource()==nw)
			{
				//System.out.print("Hello");
				s2=t1.getText();
				if(t1.getText().equals(""))
				{
					t1.setText("");
				}
				else
				{
					if(f.getTitle()=="Untitled")
					{
					d1=new Dialog(f);
					d1.setSize(300,150);

					d1.addWindowListener(this);
					d1.setLayout(new GridLayout(2,0));
					pn1=new Panel();
					pn2=new Panel();
					b4=new Button("Yes");
					b4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae3)
						{
							if(vsave==null)
							{
								try{
									fd3=new FileDialog(f,"Save",FileDialog.SAVE);
									f.setTitle(fd3.getName());
									d1.setVisible(false);
									fd3.setVisible(true);
									fouts=new File(fd3.getFile());
									//f.setTitle(fd3.getFile());
									if(!fouts.exists())
									{
										//System.out.print("Hello");
										fouts.createNewFile();
									}
									fossave=new FileOutputStream(fd3.getDirectory()+fouts);
									fossave.write(t1.getText().getBytes());
									temp=t1.getText();
									f.setTitle("Untitled");
									}
									catch(Exception e2)
									{
										System.out.print(e2.getMessage());
									}
									vsave=t1.getText();
									//
									t1.setText("");
									vsave=null;
							}
							else
							{
								try
								{
								System.out.print("sveot");
								fossave=new FileOutputStream(fd3.getDirectory()+fouts);
								fossave.write(t1.getText().getBytes());
								}
								catch(Exception e3)
								{
									System.out.print(e3.getMessage());
								}
								vsave=null;
								d1.setVisible(false);
								temp=t1.getText();
								t1.setText("");
							}
						}
					});
					b5=new Button("No");
					b5.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae1)
						{
							d1.setVisible(false);
							f.setTitle("Untitled");
							t1.setText("");
							temp=t1.getText();
							vsave=null;
						}
					});
					b6=new Button("Cancel");
					b6.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							d1.setVisible(false);
							f.setTitle("Untitled");
							temp=t1.getText();
						}
					});
					ln=new Label("Do you want to save the changes?");
					pn1.add(ln);
					pn2.add(b4);
					pn2.add(b5);
					pn2.add(b6);
					d1.add(pn1);
					d1.add(pn2);
					d1.setVisible(true);

				}
				else
				{
					if(temp.equals(t1.getText()))
					{
						t1.setText("");
						f.setTitle("Untitled");
						temp=t1.getText();
					}
					else
					{
					d1=new Dialog(f);
					d1.setSize(300,150);
					//d1.setVisible(true);
					d1.addWindowListener(this);
					d1.setLayout(new GridLayout(2,0));
					pn1=new Panel();
					pn2=new Panel();
					b4=new Button("Yes");
					b4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae3)
						{
							try{
						fossave=new FileOutputStream(fd3.getDirectory()+fouts);
						fossave.write(t1.getText().getBytes());

							}

							catch(Exception e)
							{
								System.out.print(e.getMessage());
							}
							d1.setVisible(false);
							t1.setText("");
							temp=t1.getText();
						f.setTitle("Untitled");
						}

					});
					b5=new Button("No");
					b5.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae1)
						{
							d1.setVisible(false);
							f.setTitle("Untitled");
							t1.setText("");
							temp=t1.getText();

						}
					});
					b6=new Button("Cancel");
					b6.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							d1.setVisible(false);
							f.setTitle("Untitled");
							temp=t1.getText();
						}
					});
					ln=new Label("Do you want to save?");
					pn1.add(ln);
					pn2.add(b4);
					pn2.add(b5);
					pn2.add(b6);
					d1.add(pn1);
					d1.add(pn2);
					d1.setVisible(true);
				}
				}
				}
			}

		if(e.getSource()==opn)
		{
			try
			{
			//s2=t1.getText();
            //
            sb=t1.getText();
				if(t1.getText().equals(""))
				{
					//System.out.println("open inside");
					fd1=new FileDialog(f,"Open",FileDialog.LOAD);
					fd1.setVisible(true);
					f.setTitle(fd1.getFile());
					//d1.setVisible(true);
					path = fd1.getDirectory();
					filename = fd1.getFile();
					fis1=new FileInputStream(path+"\\"+filename);
					bis=new BufferedInputStream(fis1);
					//fosopen=new FileOutputStream(sopen);
					//System.out.print("Name::"+filename);

					while((ch=bis.read())!=-1)
					{
						//fosopen.write(ch);
						//System.out.println("open");
						t1.appendText((char)ch+"");
					}
					//vsave=t1.getText();
					temp=t1.getText();

					//System.out.println(vsave);
					bis.close();
					fosopen.close();

				}

				else if(t1.getText().equals(temp))
				{
					//System.out.println("open inside");

					fd1=new FileDialog(f,"Open",FileDialog.LOAD);
					fd1.setVisible(true);
					//d1.setVisible(true);
					path = fd1.getDirectory();
					filename = fd1.getFile();
					f.setTitle(fd1.getFile());
					fis1=new FileInputStream(path+"\\"+filename);
					bis=new BufferedInputStream(fis1);
					t1.setText("");
					//fosopen=new FileOutputStream(sopen);
					//System.out.print("Name::"+filename);
					while((ch=bis.read())!=-1)
					{
						//fosopen.write(ch);
						//System.out.println("open");
						t1.appendText((char)ch+"");
					}
					vsave=t1.getText();
					temp=t1.getText();
					//System.out.println(vsave);
					bis.close();
					fosopen.close();

				}
				else
				{System.out.println(vsave);
					d1=new Dialog(f);
					d1.setSize(300,150);
					d1.setLayout(new GridLayout(2,0));
					pn1=new Panel();
					pn2=new Panel();
					b4=new Button("Yes");
					b4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae3)
						{
							if(f.getTitle().equals("Untitled"))
							{
								try{
									fd3=new FileDialog(f,"Save",FileDialog.SAVE);
									d1.setVisible(false);
									fd3.setVisible(true);
									fouts=new File(fd3.getFile());
									f.setTitle(fd3.getFile());
									if(!fouts.exists())
									{
										//System.out.print("Hello");
										fouts.createNewFile();
									}
									fossave=new FileOutputStream(fd3.getDirectory()+fouts);
									fossave.write(t1.getText().getBytes());


									//vsave=t1.getText();
									//
									//System.out.println("open inside");
									fd1=new FileDialog(f,"Open",FileDialog.LOAD);
									fd1.setVisible(true);
									//d1.setVisible(true);
									path = fd1.getDirectory();
									filename = fd1.getFile();
									f.setTitle(fd1.getFile());
									fis1=new FileInputStream(path+"\\"+filename);
									bis=new BufferedInputStream(fis1);
									//fosopen=new FileOutputStream(sopen);
									//System.out.print("Name::"+filename);
									while((ch=bis.read())!=-1)
									{
										//fosopen.write(ch);
										//System.out.println("open");
										t1.appendText((char)ch+"");
									}
									bis.close();
									fosopen.close();
									vsave=null;
									temp=t1.getText();
								}
								catch(Exception e2)
									{
										System.out.print(e2.getMessage());
									}
							}
							else
							{
								try
								{
								d1.setVisible(false);
								System.out.print("sveot");
								fossave=new FileOutputStream(fd1.getDirectory()+fd1.getFile());
								fossave.write(t1.getText().getBytes());
								vsave=null;
								d1.setVisible(false);
								t1.setText("");
								fd1=new FileDialog(f,"Open",FileDialog.LOAD);
									fd1.setVisible(true);
									//d1.setVisible(true);
									path = fd1.getDirectory();
									filename = fd1.getFile();
									f.setTitle(fd1.getFile());
									fis1=new FileInputStream(path+"\\"+filename);
									bis=new BufferedInputStream(fis1);
									//fosopen=new FileOutputStream(sopen);
									//System.out.print("Name::"+filename);
									while((ch=bis.read())!=-1)
									{
										//fosopen.write(ch);
										//System.out.println("open");
										t1.appendText((char)ch+"");
									}
									bis.close();
									fosopen.close();
									temp=t1.getText();
								}
								catch(Exception e3)
								{
									System.out.print(e3.getMessage());
								}
							}
						}
					});
					b5=new Button("No");

					b5.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae1)
						{
							try
					{
							d1.setVisible(false);
							fd1=new FileDialog(f,"Open",FileDialog.LOAD);
									fd1.setVisible(true);
									//d1.setVisible(true);
									path = fd1.getDirectory();
									filename = fd1.getFile();
									f.setTitle(fd1.getFile());
									fis1=new FileInputStream(path+filename);
									bis=new BufferedInputStream(fis1);
									//fosopen=new FileOutputStream(sopen);
									//System.out.print("Name::"+filename);
									t1.setText("");
									while((ch=bis.read())!=-1)
									{
										//fosopen.write(ch);
										//System.out.println("open");
										t1.appendText((char)ch+"");
									}
									temp=t1.getText();
									bis.close();

									fosopen.close();

									vsave=null;
					}
					catch(Exception ee1)
					{
						System.out.print(ee1.getMessage());
					}
						}

					});


					b6=new Button("Cancel");
					b6.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							d1.setVisible(false);
						}
					});
					ln=new Label("Do you want to save?");
					pn1.add(ln);
					pn2.add(b4);
					pn2.add(b5);
					pn2.add(b6);
					d1.add(pn1);
					d1.add(pn2);
					d1.setVisible(true);

				}



			//System.out.print(sopen);
		}
		catch(Exception ee)
		{
			System.out.print(ee.getMessage());
		}
		}
		if(e.getSource()==fr)
		{
			d3=new Dialog(f);
			d3.setSize(500,500);
			d3.addWindowListener(new WindowAdapter()	{	public void windowClosing(WindowEvent e)	{ d3.setVisible(false);}});
			//d3.addWindowListener(this);
			d3.setLayout(new GridBagLayout());
			lfind=new Label("Find");
			GridBagConstraints gbc=new GridBagConstraints();
			gbc.gridx=0;	gbc.gridy=0;
			gbc.gridwidth=1;	gbc.gridheight=1;
			gbc.ipadx=10;	gbc.ipady=10;
			Insets i=new Insets(2,50,3,60);
			gbc.insets=i;
			gbc.fill=GridBagConstraints.HORIZONTAL;
			gbc.anchor=GridBagConstraints.NORTH;
			gbc.weightx=1.0;	gbc.weighty=1.0;
			d3.add(lfind,gbc);
			tfind=new TextField();
			gbc.gridy=1;
			gbc.weightx=1.0;	gbc.weighty=1.0;
			d3.add(tfind,gbc);
			lreplace=new Label("Replace");
			gbc.gridy=2;
			gbc.weightx=1.0;	gbc.weighty=1.0;
			d3.add(lreplace,gbc);
			treplace=new TextField();
			gbc.gridy=3;
			gbc.weightx=1.0;	gbc.weighty=1.0;
			d3.add(treplace,gbc);
			pfr=new Panel();
			Button bfind=new Button("Find");

			bfind.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae2)
				{
					try{
					start=t1.getCaretPosition()+t1.getSelectedText().length();
					end=0;
					String value1=t1.getText();
					int count1=0;
					value1=value1.replaceAll("\r\n","\n");
					t1.setText(value1);
					Pattern p1=Pattern.compile(tfind.getText());
					Matcher m1=p1.matcher(value1);
					System.out.print(temp);
					if(m1.find(start))
					{
						//System.out.println("if1 ");
						start=m1.start();
						end=m1.end();
						//count++;
						//System.out.println(m.start()+" "+m.end()+" ");
						f.toFront();
						t1.select(start,end);
						//System.out.println(m.end());
						//cp=end;
					}
					//if(m.find(end))
					else
					{
						//System.out.println("if2  ");
						start=m1.start();
						end=m1.end();
					}

					//System.out.println(m.start()+" "+m.end()+" "+cp);

					}
					catch(Exception e4)
					{
						System.out.print(e4.getMessage());
					}

				}
			});
			Button breplace=new Button("Replace Next");
			breplace.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae3)
								{


			if(!(t1.getSelectedText().equals(tfind.getText())))
			{
				try{
					start=t1.getCaretPosition()+t1.getSelectedText().length();
					end=0;
					String value1=t1.getText();
					int count1=0;
					//value.replaceAll("/n",null);
					//value.replaceAll("/r",null);
					Pattern p1=Pattern.compile(tfind.getText());
					Matcher m1=p1.matcher(value1);
					if(m1.find(start))
					{
						//System.out.println("if1 ");
						start=m1.start();
						end=m1.end();
						//count++;
						//System.out.println(m.start()+" "+m.end()+" ");
						f.toFront();
						t1.select(start,end);
						//System.out.println(m.end());
						//cp=end;
					}
					//if(m.find(end))
					else
					{
						//System.out.println("if2  ");
						start=m1.start();
						end=m1.end();
					}

					//System.out.println(m.start()+" "+m.end()+" "+cp);

					}
					catch(Exception e4)
					{
						System.out.print(e4.getMessage());
					}
			}
			else if(t1.getSelectedText().equals(tfind.getText()))
				t1.replaceText(treplace.getText(), start, end);



				}
			});
			Button breplaceall=new Button("Replace All");
			breplaceall.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae4)
				{
					String valuefrr1=t1.getText();
					String result1=null;
					Pattern prr1=Pattern.compile(tfind.getText());
					Matcher mfrr1=prr1.matcher(valuefrr1);
					if(mfrr1.find())
					{
						//System.out.print("Hello"+treplace.getText());
						result1=mfrr1.replaceAll(treplace.getText());
						t1.setText(result1+" ");
					}
				}
			});
			Button bexit=new Button("Exit");
			bexit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae5)
				{
					d3.setVisible(false);
				}
			});
			pfr.setLayout(new GridLayout(0,4));
			pfr.add(bfind);
			pfr.add(breplace);
			pfr.add(breplaceall);
			pfr.add(bexit);
			gbc.gridy=4;
			gbc.weightx=1.0;	gbc.weighty=1.0;
			d3.add(pfr,gbc);
			d3.setVisible(true);
		}

		if(e.getSource()==sveas)
		{
			try
			{
				fd3=new FileDialog(f,"Open",FileDialog.SAVE);
				fd3.setVisible(true);
				fouts=new File(fd3.getFile());
				f.setTitle(fd3.getFile());
				if(!fouts.exists())
				{
					//System.out.print("Hello");
					fouts.createNewFile();
				}
				fossave=new FileOutputStream(fd3.getDirectory()+fouts);
				fossave.write(t1.getText().getBytes());
			}
			catch(Exception e2)
			{
				System.out.print(e2.getMessage());
			}
			vsave=t1.getText();
		}

		if(e.getSource()==sve)
			{
				String fdir=path;
				String ffile=filename;
				//System.out.print(f.getTitle());
				//f.setTitle(fd1.getFile());
				//System.out.print("sve");
				if(f.getTitle().equals("Untitled"))
				{
					System.out.print("svein");
					try
					{
						fd3=new FileDialog(f,"Save",FileDialog.SAVE);
						fd3.setVisible(true);
						fdir=fd3.getDirectory();
						ffile=fd3.getFile();
						fouts=new File(fd3.getFile());
						f.setTitle(fd3.getFile());
						if(!fouts.exists())
						{
							//System.out.print("Hello");
							fouts.createNewFile();
						}
						fossave=new FileOutputStream(fd3.getDirectory()+fouts);
						fossave.write(t1.getText().getBytes());
						temp=t1.getText();
					}
					catch(Exception e2)
					{
					System.out.print(e2.getMessage());
					}
					vsave=t1.getText();
				}
				else
				{
					//temp=t1.getText();
					//System.out.print(t1.getText());
					System.out.print("sveot");
					fossave=new FileOutputStream(fdir+ffile);
					fossave.write(t1.getText().getBytes());
					temp=t1.getText();
				}
			}
		}
		catch(Exception e1)
		{
			System.out.print(e1.getMessage());
		}

		if(e.getSource()==ext)
		{
			//temp=t1.getText();
			//vsave=t1.getText();
			String test=null;
			int flag=1;
			if(flag==1)
			{
				test=t1.getText();
				flag++;
			}

			//System.out.print("Hlo save");
			if(t1.getText().equals(""))
			{
			System.exit(0);
			}
			else if(t1.getText().equals(temp))
				{
					System.out.println("open inside");
					temp=t1.getText();
					System.exit(0);
					vsave=t1.getText();
					temp=t1.getText();

				}
				else
				{
					System.out.println("exit");
					d1=new Dialog(f);
					d1.setSize(300,150);
					d1.setLayout(new GridLayout(2,0));
					pn1=new Panel();
					pn2=new Panel();
					b4=new Button("Yes");
					b4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae3)
						{
							if(f.getTitle().equals("Untitled"))
							{
								try{
									System.out.print("Hello");
									fd3=new FileDialog(f,"Save",FileDialog.SAVE);
									d1.setVisible(false);
									fd3.setVisible(true);
									fouts=new File(fd3.getFile());
									f.setTitle(fd3.getFile());
									if(!fouts.exists())
									{
										//System.out.print("Hello");
										fouts.createNewFile();
									}
									fossave=new FileOutputStream(fd3.getDirectory()+fouts);
									fossave.write(t1.getText().getBytes());
									vsave=null;
									temp=t1.getText();
									System.exit(0);
								}
								catch(Exception e2)
									{
										System.out.print(e2.getMessage());
									}
							}
							else
							{
								try
								{
									System.out.print("Hello code");
								d1.setVisible(false);
								System.out.print("sveot");
								fossave=new FileOutputStream(fd1.getDirectory()+fd1.getFile());
								fossave.write(t1.getText().getBytes());
								vsave=null;
								d1.setVisible(false);
								t1.setText("");
									path = fd1.getDirectory();
									filename = fd1.getFile();
									f.setTitle(fd1.getFile());
									temp=t1.getText();
								}
								catch(Exception e3)
								{
									System.out.print(e3.getMessage());
								}
								System.exit(0);
							}
						}
					});

					b5=new Button("No");

					b5.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae1)
						{
							try
							{
									d1.setVisible(false);
									temp=t1.getText();
									System.exit(0);
							}
							catch(Exception ee1)
							{
								System.out.print(ee1.getMessage());
							}
						}
					});


					b6=new Button("Cancel");
					b6.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							d1.setVisible(false);
						}
					});
					ln=new Label("Do you want to save?");
					pn1.add(ln);
					pn2.add(b4);
					pn2.add(b5);
					pn2.add(b6);
					d1.add(pn1);
					d1.add(pn2);
					d1.setVisible(true);

				}

		}


		if(e.getSource()==find)
		{
			d4=new Dialog(f);
			d4.setSize(500,500);
			//d4.addWindowListener(this);
			d4.addWindowListener(new WindowAdapter()	{	public void windowClosing(WindowEvent e)	{ d4.setVisible(false);}});
			d4.setLayout(new GridBagLayout());
			Label lfind1=new Label("Find");
			GridBagConstraints gbc1=new GridBagConstraints();
			gbc1.gridx=0;	gbc1.gridy=0;
			gbc1.gridwidth=1;	gbc1.gridheight=1;
			gbc1.ipadx=10;	gbc1.ipady=10;
			Insets i1=new Insets(2,50,3,60);
			gbc1.insets=i1;
			gbc1.fill=GridBagConstraints.HORIZONTAL;
			gbc1.anchor=GridBagConstraints.NORTH;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d4.add(lfind1,gbc1);
			TextField tfind1=new TextField();
			gbc1.gridx=1;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d4.add(tfind1,gbc1);
			Panel pfr1=new Panel();
			Button bfind1=new Button("Find");
			bfind1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae1)
				{
					try{
						start=0;
					start=t1.getCaretPosition()+t1.getSelectedText().length();
					end=0;
					String value=t1.getText();
					int count=0;
					value=value.replaceAll("\r\n","\n");
					t1.setText(value);
					/*value.replaceAll("/n",null);
					value.replaceAll("/r",null);*/
					Pattern p=Pattern.compile(tfind1.getText());
					Matcher m=p.matcher(value);

					if(m.find(start))
					{
						//System.out.println("if1 ");
						start=m.start();
						end=m.end();
						//count++;
						//System.out.println(m.start()+" "+m.end()+" ");
						f.toFront();
						t1.select(start,end);
						//System.out.println(m.end());
						//cp=end;

					}
					//if(m.find(end))
					/*else
					{
						//System.out.println("if2  ");
						start=m.start();
						end=m.end();
						f.toFront();
						t1.select(start,end);
					}
					*/
					//System.out.println(m.start()+" "+m.end()+" "+cp);

					}
					catch(Exception e4)
					{
						System.out.print(e4.getMessage());
					}
				}
			});
			Button bexit=new Button("Exit");
			bexit.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae1)
				{
					d4.setVisible(false);
					d4.dispose();
				}
			});
			pfr1.setLayout(new GridLayout(0,2));
			pfr1.add(bfind1);
			pfr1.add(bexit);
			gbc1.gridy=4;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d4.add(pfr1,gbc1);
			d4.setVisible(true);


		}
		if(e.getSource()==fnt)
		{
			d5=new Dialog(f);
			d5.setSize(500,500);
			//d4.addWindowListener(this);
			d5.addWindowListener(new WindowAdapter()	{	public void windowClosing(WindowEvent e)	{ d5.setVisible(false);}});
			d5.setLayout(new GridBagLayout());
			ArrayList lfont=new ArrayList();
			GridBagConstraints gbc1=new GridBagConstraints();
			gbc1.gridx=0;	gbc1.gridy=0;
			gbc1.gridwidth=1;	gbc1.gridheight=1;
			gbc1.ipadx=10;	gbc1.ipady=10;
			Insets i1=new Insets(2,50,3,60);
			gbc1.insets=i1;
			gbc1.fill=GridBagConstraints.HORIZONTAL;
			gbc1.anchor=GridBagConstraints.NORTH;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			//d5.add(lfont,gbc1);
			d5.setVisible(true);

		}
		if(e.getSource()==increase)
		{
			d6=new Dialog(f);
			d6.setSize(500,500);
			//d4.addWindowListener(this);
			d6.addWindowListener(new WindowAdapter()	{	public void windowClosing(WindowEvent e)	{ d6.setVisible(false);}});
			d6.setLayout(new GridBagLayout());
			ArrayList lfont=new ArrayList();
			GridBagConstraints gbc1=new GridBagConstraints();
			gbc1.gridx=0;	gbc1.gridy=0;
			gbc1.gridwidth=1;	gbc1.gridheight=1;
			gbc1.ipadx=10;	gbc1.ipady=10;
			Insets i1=new Insets(2,50,3,60);
			gbc1.insets=i1;
			gbc1.fill=GridBagConstraints.HORIZONTAL;
			gbc1.anchor=GridBagConstraints.NORTH;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d6.setVisible(true);

			//System.out.print("Inside Increase");
			//t1.setText("Inside Increase");

		}
		if(e.getSource()==decrease)
		{
			d6=new Dialog(f);
			d6.setSize(500,500);
			//d4.addWindowListener(this);
			d6.addWindowListener(new WindowAdapter()	{	public void windowClosing(WindowEvent e)	{ d6.setVisible(false);}});
			d6.setLayout(new GridBagLayout());
			Label decrease=new Label("Decrease");
			GridBagConstraints gbc1=new GridBagConstraints();
			gbc1.gridx=0;	gbc1.gridy=0;
			gbc1.gridwidth=1;	gbc1.gridheight=1;
			gbc1.ipadx=10;	gbc1.ipady=10;
			Insets i1=new Insets(2,50,3,60);
			gbc1.insets=i1;
			gbc1.fill=GridBagConstraints.HORIZONTAL;
			gbc1.anchor=GridBagConstraints.NORTH;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d6.add(decrease,gbc1);
			TextField new_size=new TextField();
			gbc1.gridx=1;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d6.add(new_size,gbc1);
			Panel pfr1=new Panel();
			Button bdecrease=new Button("Decrease");
			bdecrease.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae2)
				{
					start=t1.getCaretPosition()+t1.getSelectedText().length();
					String outcome=t1.getText();
					//outcome.setSize(new_size.getText());
					t1.setText(outcome);
					//System.out.print(start);
				}
			});
			pfr1.setLayout(new GridLayout(0,2));
			pfr1.add(bdecrease);
			//pfr1.add(bexit);
			gbc1.gridy=4;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d6.add(pfr1,gbc1);
			d6.setVisible(true);
			//System.out.print("Inside Increase");
			//t1.setText("Inside Increase");
		}

		if(e.getSource()==increase)
		{
			Dialog d7=new Dialog(f);
			d7.setSize(500,500);
			//d4.addWindowListener(this);
			d7.addWindowListener(new WindowAdapter()	{	public void windowClosing(WindowEvent e)	{ d7.setVisible(false);}});
			d7.setLayout(new GridBagLayout());
			Label decrease=new Label("Increase");
			GridBagConstraints gbc1=new GridBagConstraints();
			gbc1.gridx=0;	gbc1.gridy=0;
			gbc1.gridwidth=1;	gbc1.gridheight=1;
			gbc1.ipadx=10;	gbc1.ipady=10;
			Insets i1=new Insets(2,50,3,60);
			gbc1.insets=i1;
			gbc1.fill=GridBagConstraints.HORIZONTAL;
			gbc1.anchor=GridBagConstraints.NORTH;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d7.add(decrease,gbc1);
			TextField new_size=new TextField();

			gbc1.gridx=1;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d7.add(new_size,gbc1);
			Panel pfr1=new Panel();
			Button bdecrease=new Button("Increase");
			bdecrease.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae2)
				{
					int te;
					te=Integer.parseInt(new_size.getText());
					start=t1.getCaretPosition()+t1.getSelectedText().length();
					String outcome=t1.getText();
					//outcome.setSize(new_size.getText());
					t1.setFont(new Font("Serif",Font.PLAIN,te));
					//System.out.print(start);
				}
			});
			pfr1.setLayout(new GridLayout(0,2));
			pfr1.add(bdecrease);
			//pfr1.add(bexit);
			gbc1.gridy=4;
			gbc1.weightx=1.0;	gbc1.weighty=1.0;
			d7.add(pfr1,gbc1);
			d7.setVisible(true);
			//System.out.print("Inside Increase");
			//t1.setText("Inside Increase");
		}



	}
	public void windowClosing(WindowEvent e)
	{
		if(t1.getText().equals(""))
		{
		w=e.getWindow();
		w.setVisible(false);
		w.dispose();
		}
		else if(t1.getText().equals(temp))
				{
					System.out.println("open inside");
					temp=t1.getText();
					w=e.getWindow();
					w.setVisible(false);
					w.dispose();
					vsave=t1.getText();
					temp=t1.getText();

				}
				else
				{
					//System.out.println("exit");
					d1=new Dialog(f);
					d1.setSize(300,150);
					d1.setLayout(new GridLayout(2,0));
					pn1=new Panel();
					pn2=new Panel();
					b4=new Button("Yes");
					b4.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae3)
						{
							if(f.getTitle().equals("Untitled"))
							{
								try{
									System.out.print("Hello");
									fd3=new FileDialog(f,"Save",FileDialog.SAVE);
									d1.setVisible(false);
									fd3.setVisible(true);
									fouts=new File(fd3.getFile());
									f.setTitle(fd3.getFile());
									if(!fouts.exists())
									{
										//System.out.print("Hello");
										fouts.createNewFile();
									}
									fossave=new FileOutputStream(fd3.getDirectory()+fouts);
									fossave.write(t1.getText().getBytes());
									vsave=null;
									temp=t1.getText();
									w=e.getWindow();
									w.setVisible(false);
									w.dispose();

								}
								catch(Exception e2)
									{
										System.out.print(e2.getMessage());
									}
							}
							else
							{
								try
								{
									System.out.print("Hello code");
								d1.setVisible(false);
								System.out.print("sveot");
								fossave=new FileOutputStream(fd1.getDirectory()+fd1.getFile());
								fossave.write(t1.getText().getBytes());
								vsave=null;
								d1.setVisible(false);
								t1.setText("");
									path = fd1.getDirectory();
									filename = fd1.getFile();
									f.setTitle(fd1.getFile());
									temp=t1.getText();
								}
								catch(Exception e3)
								{
									System.out.print(e3.getMessage());
								}
								w=e.getWindow();
								w.setVisible(false);
								w.dispose();
							}
						}
					});

					b5=new Button("No");

					b5.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae1)
						{
							try
							{
									d1.setVisible(false);
									temp=t1.getText();
									w=e.getWindow();
									w.setVisible(false);
									w.dispose();
							}
							catch(Exception ee1)
							{
								System.out.print(ee1.getMessage());
							}
						}
					});


					b6=new Button("Cancel");
					b6.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent ae)
						{
							d1.setVisible(false);
						}
					});
					ln=new Label("Do you want to save?");
					pn1.add(ln);
					pn2.add(b4);
					pn2.add(b5);
					pn2.add(b6);
					d1.add(pn1);
					d1.add(pn2);
					d1.setVisible(true);

				}
	}
	public static void main(String args[])
	{
		editor e1=new editor();

	}
}
