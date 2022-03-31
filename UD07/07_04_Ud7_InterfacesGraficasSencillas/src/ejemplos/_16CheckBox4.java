package src.ejemplos;

// Alberto Carrera - Febrero 2020
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class _16CheckBox4 extends JFrame implements ChangeListener{
    private JCheckBox check1,check2,check3;
    private JTextField resultado;
    private JLabel euros;
    public _16CheckBox4() {
        setLayout(null);
        check1=new JCheckBox("Apartamento");
        check1.setBounds(10,10,150,30);
        add(check1);
        check1.addChangeListener(this);
        check2=new JCheckBox("Garaje");
        check2.setBounds(10,50,150,30);      
        add(check2);
        check2.addChangeListener(this);
        check3=new JCheckBox("Trastero");
        check3.setBounds(10,90,150,30);        
        add(check3); 
        check3.addChangeListener(this);
        resultado =new JTextField(6);
        resultado.setBounds(175,50,100,20);
        //resultado.setEditable(false);
        add(resultado);
        euros = new JLabel("€");
        euros.setBounds(280, 50,10,10);
        add(euros);
    }
    
   
    public static void main(String[] ar) {
    	_16CheckBox4 formulario1=new _16CheckBox4();
        formulario1.setBounds(0,0,350,230);
        formulario1.setTitle("Alquiler mensual");
        formulario1.setVisible(true);
    }

	@Override
	public void stateChanged(ChangeEvent arg0) {
		int total=0;
        if (check1.isSelected()==true) {
            total=total+450;
        }
        if (check2.isSelected()==true) {
        	total=total+120;
        }
        if (check3.isSelected()==true) {
        	total=total+15;
        }
        resultado.setText(Integer.toString(total));
		
	} 	
}