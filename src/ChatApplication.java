import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatApplication {
    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Offline Chat Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        // Chat display area
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false); // Read-only
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));

        // Scroll pane for chat area
        JScrollPane scrollPane = new JScrollPane(chatArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Input field and Send button
        JTextField inputField = new JTextField(30); // Message input
        JButton sendButton = new JButton("Send");   // Send button

        // Panel for input and button
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputField);
        inputPanel.add(sendButton);
        frame.add(inputPanel, BorderLayout.SOUTH);

        // Alternating user
        final String[] currentUser = {"User1"};

        // Send button action
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText().trim();
                if (!message.isEmpty()) {
                    chatArea.append(currentUser[0] + ": " + message + "\n");
                    inputField.setText(""); // Clear input field

                    // Toggle between users
                    currentUser[0] = currentUser[0].equals("User1") ? "User2" : "User1";
                }
            }
        });

        // Allow pressing Enter to send the message
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendButton.doClick();
            }
        });

        // Finalize and display
        frame.setVisible(true);
    }
}


