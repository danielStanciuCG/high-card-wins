package daniel.stanciu.highcardwins.gui;

import com.sun.jmx.snmp.tasks.Task;
import daniel.stanciu.highcardwins.gameplay.Game;
import daniel.stanciu.highcardwins.cards.Card;


import javax.swing.*;
import java.awt.*;

public class MainWindow {
    private String title;

    private JPanel mainPanel;
    private JPanel westPanel;
    private JLabel youLabel;
    private JLabel cpuLabel;
    private JPanel southPanel;
    private JPanel eastPanel;
    private JPanel northPanel;
    private JToolBar toolBar;
    private JButton newGameButton;
    private JButton exitButton;
    private JLabel playerScore;
    private JLabel cpuScore;
    private JLabel playerCardLabel;
    private JLabel cpuCardLabel;
    private JPanel middlePanel;
    private JButton drawCardButton;
    private JTextField cardsRemainingLabel;
    private int cardsRemaining;
    private Game game;


    public MainWindow(String title) {
        this.title = title;
        drawCardButton.setEnabled(false);

        //NEW GAME ACTION LISTENER
        newGameButton.addActionListener(e -> {

            drawCardButton.setEnabled(true);
            game = new Game();

            cardsRemaining = 26;
            cardsRemainingLabel.setText("Cards remaining: " + cardsRemaining);

            playerCardLabel.setIcon(new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/back.png")));
            cpuCardLabel.setIcon(new ImageIcon(getClass().getResource("/daniel/stanciu/highcardwins/cards/images/back.png")));
            playerScore.setText("0");
            cpuScore.setText("0");
        });

        //DRAW ACTION LISTENER
        drawCardButton.addActionListener(e -> {
            cardsRemainingLabel.setText("Cards remaining: " + --cardsRemaining);
            if(cardsRemaining < 0) {
                cardsRemainingLabel.setText("Game over");
            }
            try {
                playerCardLabel.setIcon(game.getP1Card().getCardFace());
                cpuCardLabel.setIcon(game.getCpuCard().getCardFace());
                game.awardPoint();
                playerScore.setText(Integer.toString(game.getPlayerScore()));
                cpuScore.setText(Integer.toString(game.getCpuScore()));
            } catch (ArrayIndexOutOfBoundsException ee) {
                drawCardButton.setEnabled(false);
                if (game.getPlayerScore() > game.getCpuScore()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Congratulations, YOU WON!",
                            "Game Over",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                } else if (game.getPlayerScore() == game.getCpuScore()) {
                    JOptionPane.showMessageDialog(
                            null,
                            "It's a TIE!",
                            "Game Over",
                            JOptionPane.INFORMATION_MESSAGE
                    );

                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Unlucky, YOU LOST!",
                            "Game Over",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                }
            }
        });

        //EXIT ACTION LISTENER
        exitButton.addActionListener(e -> {
            System.exit(0);
        });


        createFrame();

    }

    private void createFrame() {
        JFrame frame = new JFrame(title);
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        //MAKE SURE "setVisible" IS THE LAST STATEMENT IN THIS METHOD
        frame.setVisible(true);
    }

}