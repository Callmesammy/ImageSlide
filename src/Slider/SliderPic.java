/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Slider;

import java.awt.Component;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author user
 */
public class SliderPic extends JLayeredPane {

   private final JPanel panel;
    private final Animator animate;
    private final MigLayout layout;
    private Component componentShow;
    private Component componentOut;
    private  int slider;
    private boolean selected;
    
    public SliderPic() {
        initComponents();
        layout = new MigLayout("inset 0");
        panel = new JPanel();
        TimingTarget target = new TimingTargetAdapter(
        );
        
        animate = new Animator(1000, target);
        animate.setResolution(0);
        animate.setAcceleration(0.5f);
        animate.setDeceleration(0.5f);
        panel.setLayout(layout);
        setLayout(new MigLayout("fill, inset 0", "[fill, center]", "3[fill]3"));
        add(panel, " w 100%");
        
    }

public void getSliide(Component ...com){
    if (com.length >= 2) {
        for(Component coms: com){
            coms.setVisible(false);
            panel.add(coms, "pos 0 0 0 0");
        }
        if (panel.getComponentCount() > 0) {
            componentShow = panel.getComponent(0);
            componentShow.setVisible(true);
            layout.setComponentConstraints(componentShow, "pos 0 0 100% 100%");
        }
    }
}
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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
