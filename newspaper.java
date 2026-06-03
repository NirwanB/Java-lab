import javax.swing.*;
import java.awt.*;

class NewspaperTemplate {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Newspaper Template");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);
        frame.setLocationRelativeTo(null);
        
        // Main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.WHITE);
        
        // Header Section
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.BLACK, 2),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        
        JLabel titleLabel = new JLabel("THE DAILY NEWS", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
        
        JLabel dateLabel = new JLabel("June 1, 2026 | Kathmandu, Nepal | Price: Rs. 25", SwingConstants.CENTER);
        dateLabel.setFont(new Font("Times New Roman", Font.ITALIC, 12));
        
        headerPanel.add(titleLabel, BorderLayout.CENTER);
        headerPanel.add(dateLabel, BorderLayout.SOUTH);
        
        // Navigation Bar
        JPanel navPanel = new JPanel();
        navPanel.setBackground(new Color(50, 50, 50));
        navPanel.setForeground(Color.WHITE);
        navPanel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        String[] navItems = {"Home", "Politics", "Business", "Sports", "Entertainment", "Opinion"};
        for (String item : navItems) {
            JLabel navLabel = new JLabel(item);
            navLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            navLabel.setForeground(Color.WHITE);
            navLabel.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 15));
            navPanel.add(navLabel);
        }
        
        // Main Content Area with 2-column layout
        JPanel contentPanel = new JPanel(new GridLayout(1, 2, 10, 0));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Left Column (Main Article)
        JPanel leftColumn = new JPanel();
        leftColumn.setLayout(new BoxLayout(leftColumn, BoxLayout.Y_AXIS));
        
        JLabel mainHeadline = new JLabel("Nepal Announces New Economic Reform Package");
        mainHeadline.setFont(new Font("Times New Roman", Font.BOLD, 24));
        mainHeadline.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel mainImage = new JLabel(" [MAIN NEWS IMAGE] ", SwingConstants.CENTER);
        mainImage.setFont(new Font("Arial", Font.ITALIC, 14));
        mainImage.setBackground(new Color(200, 200, 200));
        mainImage.setOpaque(true);
        mainImage.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        mainImage.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainImage.setPreferredSize(new Dimension(350, 200));
        
        JTextArea mainArticle = new JTextArea(
            "In a groundbreaking announcement today, the Government of Nepal revealed " +
            "a comprehensive economic reform package aimed at boosting growth and " +
            "stability. The package includes measures for infrastructure development, " +
            "tax reform, and support for small and medium enterprises. Prime Minister " +
            "emphasized that these reforms will create thousands of jobs and strengthen " +
            "the nation's economic foundation. The reforms are expected to be implemented " +
            "starting next month, with full impact visible within two years."
        );
        mainArticle.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        mainArticle.setLineWrap(true);
        mainArticle.setWrapStyleWord(true);
        mainArticle.setEditable(false);
        mainArticle.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainArticle.setBackground(Color.WHITE);
        
        leftColumn.add(mainHeadline);
        leftColumn.add(Box.createVerticalStrut(10));
        leftColumn.add(mainImage);
        leftColumn.add(Box.createVerticalStrut(10));
        leftColumn.add(new JScrollPane(mainArticle));
        
        // Right Column (Sidebar Articles)
        JPanel rightColumn = new JPanel();
        rightColumn.setLayout(new BoxLayout(rightColumn, BoxLayout.Y_AXIS));
        
        JLabel sidebarHeadline1 = new JLabel("Sports: Nepal Wins Cricket Series");
        sidebarHeadline1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        sidebarHeadline1.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JTextArea sidebarArticle1 = new JTextArea(
            "The Nepalese cricket team secured a historic victory in the regional " +
            "cricket series, defeating their opponents in a thrilling final match."
        );
        sidebarArticle1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        sidebarArticle1.setLineWrap(true);
        sidebarArticle1.setWrapStyleWord(true);
        sidebarArticle1.setEditable(false);
        sidebarArticle1.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebarArticle1.setBackground(Color.WHITE);
        sidebarArticle1.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        
        JLabel sidebarHeadline2 = new JLabel("Business: Stock Market Reaches New High");
        sidebarHeadline2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        sidebarHeadline2.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebarHeadline2.setBorder(BorderFactory.createEmptyBorder(15, 0, 5, 0));
        
        JTextArea sidebarArticle2 = new JTextArea(
            "The Kathmandu Stock Exchange reached an all-time high today, driven by " +
            "strong performance in banking and hydropower sectors. Analysts predict " +
            "continued growth in the coming months."
        );
        sidebarArticle2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        sidebarArticle2.setLineWrap(true);
        sidebarArticle2.setWrapStyleWord(true);
        sidebarArticle2.setEditable(false);
        sidebarArticle2.setAlignmentX(Component.LEFT_ALIGNMENT);
        sidebarArticle2.setBackground(Color.WHITE);
        sidebarArticle2.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        
        rightColumn.add(sidebarHeadline1);
        rightColumn.add(Box.createVerticalStrut(5));
        rightColumn.add(new JScrollPane(sidebarArticle1));
        rightColumn.add(Box.createVerticalStrut(10));
        rightColumn.add(sidebarHeadline2);
        rightColumn.add(Box.createVerticalStrut(5));
        rightColumn.add(new JScrollPane(sidebarArticle2));
        
        contentPanel.add(leftColumn);
        contentPanel.add(rightColumn);
        
        // Footer
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(240, 240, 240));
        footerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        footerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel footerText = new JLabel(
            " © 2026 The Daily News | Kathmandu, Nepal | Contact: info@dailynews.com.np | www.dailynews.com.np"
        );
        footerText.setFont(new Font("Arial", Font.ITALIC, 10));
        footerPanel.add(footerText);
        
        // Assemble the frame
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(navPanel, BorderLayout.CENTER);
        
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(contentPanel, BorderLayout.CENTER);
        centerPanel.add(footerPanel, BorderLayout.SOUTH);
        
        mainPanel.add(centerPanel, BorderLayout.SOUTH);
        
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
    }
}