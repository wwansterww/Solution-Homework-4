public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        String maxPlayers = configManager.getConfig("maxPlayers");
        System.out.println("maxPlayers: " + maxPlayers);
        configManager.printAllConfigs();
    }
}