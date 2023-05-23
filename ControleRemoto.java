
package interface01;
//Clayton Martins  da Silva.
import javax.swing.JOptionPane;

public class ControleRemoto implements Controlador{
    private boolean ligado;
    private int volume;
    
   ControleRemoto() {
       this.ligado = true;
       this.volume = 50;
   }

    public boolean isLigado() {
        return ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void ligar() {
        if(this.isLigado() == true){
               JOptionPane.showMessageDialog(null, "Está ligado!");
        } else{
            this.setLigado(true);
        }
    }
    @Override
    public void desligar() {
        if(this.isLigado() == false){
               JOptionPane.showMessageDialog(null, "Está desligado!");
        } else{
            this.setLigado(false);
        }   
    }
   
}
