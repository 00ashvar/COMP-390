import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RideshareApp extends JFrame {

    // card names (keys for different screens)
    private static final String LOGIN = "login";
    private static final String HOME  = "home";
    private static final String BOOK  = "book";
    private static final String PROF  = "profile";
    private static final String HIST  = "history";

    // CardLayout and container
    private final CardLayout c1 = new CardLayout();
    private final JPanel cards = new JPanel(c1);

    public RideshareApp() {
        setTitle("Rideshare App"); // should we come up with a fun name?
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);

        // build each page, within their own methods (see GeeksforGeeks tutorial, jp1, jp2 ...)
        JPanel loginPage = buildLoginPage();
        JPanel homePage = buildHomePage();
        JPanel bookPage = buildBookingPage();
        JPanel profPage = buildProfilePage();
        JPanel histPage = buildHistoryPage();

        // add pages to CardLayout with our keys (see GeeksforGeeks tutorial "1", "2" ... cards)
        cards.add(loginPage, LOGIN);
        cards.add(homePage, HOME);
        cards.add(bookPage, BOOK);
        cards.add(profPage, PROF);
        cards.add(histPage, HIST);

        setContentPane(cards);

        c1.show(cards, LOGIN);

    }

    private JPanel buildLoginPage() {
        return null;
    }

    private JPanel buildHomePage() {
        return null;
    }

    private JPanel buildBookingPage() {
        return null;
    }

    /**
     * Builds the main Profile Page panel with nested layouts for perfect alignment.
     */
    JPanel buildProfilePage() {

        // --- FINAL ALIGNMENT WRAPPER ---
        // Ensures the whole form block is pushed to the left edge of the window.
        JPanel JP_final_aligner = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));

        // --- OUTER FORM CONTAINER ---
        JPanel JP_page_container = new JPanel();
        JP_page_container.setLayout(new BoxLayout(JP_page_container, BoxLayout.Y_AXIS));
        JP_page_container.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Add padding around the entire form for better aesthetics
        JP_page_container.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // --- FIELD ROWS ---
        JPanel nameFiels = createFieldRow("Full Name:", new JTextField(15));
        JPanel emailFiels = createFieldRow("Email:", new JTextField(15));
        JPanel phonoFiels = createFieldRow("Phone Number:", new JTextField(15));
        JPanel licenseFiels = createFieldRow("Driver's License:", new JTextField(15));
        JPanel DOBFiels = createFieldRow("Date of Birth:", new JTextField(15));

        // --- ADDRESS GROUP CONTAINER ---
        JPanel JP_address_grp = new JPanel();
        JP_address_grp.setLayout(new BoxLayout(JP_address_grp, BoxLayout.Y_AXIS));
        JP_address_grp.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Define the Titled Border for the address group.
        // We will remove the Etched border for a cleaner look.
        Border groupBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1), // Simple line border
                "Address Details" // Title of the group
        );
        JP_address_grp.setBorder(groupBorder);

        // The TitledBorder adds padding. We need to match this padding
        // inside the address group to keep text fields aligned.

        JPanel streetFiels = createFieldRow("Street Address:", new JTextField(15));
        JPanel cityFiels = createFieldRow("City:", new JTextField(15));
        JPanel stateFiels = createFieldRow("State:", new JTextField(15));
        JPanel countryFiels = createFieldRow("Country:", new JTextField(15));
        JPanel zipFiels = createFieldRow("Zip Code:", new JTextField(15));


        // --- ASSEMBLE THE PAGE ---

        // Add non-address fields directly to the main container
        JP_page_container.add(nameFiels);
        JP_page_container.add(emailFiels);
        JP_page_container.add(phonoFiels);
        JP_page_container.add(licenseFiels);
        JP_page_container.add(DOBFiels);

        // Add a vertical strut for space
        JP_page_container.add(Box.createVerticalStrut(25));

        // Add the Address fields to the group container
        JP_address_grp.add(streetFiels);
        JP_address_grp.add(cityFiels);
        JP_address_grp.add(stateFiels);
        JP_address_grp.add(countryFiels);
        JP_address_grp.add(zipFiels);

        // Add the completed group to the main container
        JP_page_container.add(JP_address_grp);

        // Add a Save button
        JButton saveButton = new JButton("Save Profile");

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(saveButton);
        buttonPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

        JP_page_container.add(Box.createVerticalStrut(20));
        JP_page_container.add(buttonPanel);

        // Add glue to push components to the top
        JP_page_container.add(Box.createVerticalGlue());

        // Add the fully constructed form to the FlowLayout wrapper
        JP_final_aligner.add(JP_page_container);

        // Return the final wrapper
        return JP_final_aligner;
    }

    /**
     * Utility method to create a consistent field row (Label + TextField).
     */
    private JPanel createFieldRow(String labelText, JTextField textField) {
        JPanel rowPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel(labelText);

        // Set the fixed width for the label to ensure columnar alignment
        label.setPreferredSize(new Dimension(150, label.getPreferredSize().height));

        // Add horizontal strut (padding)
        rowPanel.add(label, BorderLayout.WEST);

        rowPanel.add(textField, BorderLayout.CENTER);

        rowPanel.setMaximumSize(rowPanel.getPreferredSize());

        return rowPanel;
    }

    private JPanel buildHistoryPage() {
        return null;
    }

    public static void main(String[] args) {
        String schemaFile = "schema.sql";
        String databaseURL = "jdbc:sqlite:rideshare.db";

        // establish connection through jdbc (.jar file in lib)
        // if no such database is found it will create locally for you, otherwise connect to db
        try (Connection c = DriverManager.getConnection(databaseURL);
             Statement s = c.createStatement()) {
            // Read the entire schema.sql file into a String
            String sql = Files.readString(Paths.get(schemaFile));
            // Execute each statement separated by semicolons
            for (String statement : sql.split(";")) {
                String trimmed = statement.trim();
                if (!trimmed.isEmpty()) {
                    s.execute(trimmed + ";");
                }
            }

            System.out.println("Schema loaded successfully!");
        } catch (Exception e) {
            System.out.println("Error loading schema: " + e.getMessage());
        }

        RideshareApp app = new RideshareApp();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}